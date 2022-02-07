package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.SftpClient;
import com.company.design.facade.Writer;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;
import com.company.design.strategy.*;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {


        System.out.println("-------------------SingleTon Pattern------------------");
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aclient = aClazz.getSocketClient();
        SocketClient bclient = bClazz.getSocketClient();

        System.out.println("두 개의 객첵다 동일한가?");
        System.out.println(aclient.equals(bclient));


        System.out.println("-------------------Adapter Pattern------------------");
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        // connect(cleaner);  // connect는 110v용 이기 떄문에 불가능 -> 이런 경우 어댑터가 필요

        Electronic110V adapter = new SocketAdaptor((cleaner));
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdaptor(airConditioner);
        connect(airAdapter);

        System.out.println("-------------------Proxy Pattern------------------");
        // cache 전 Code : 매번 browser를 호출한다.
        Browser browser1 = new Browser("www.naver.com");
        browser1.show();
        browser1.show();
        browser1.show();


        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();

        // 동시성 문데 ?
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        System.out.println("-------------------AOP Pattern------------------");
        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("begore");
                    start.set(System.currentTimeMillis());

                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );
        aopBrowser.show();
        System.out.println("Loading time : " + end.get());

        // 두 번째는 cache를 사용하으모 0초 걸림
        aopBrowser.show();
        System.out.println("Loading time : " + end.get());

        System.out.println("-------------------Decorator Pattern------------------");
        // 기본 아우디를 넘겨서 기본 아우디 가격에 더한다.
        // Decorator를 통해서 기본 뼈대는 건드리지 않고 부가적인 첨가를 하면서 속성을 변환시키는 것
        ICar audi = new Audi(1000);
        audi.showPrice();

        // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();
        // a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();
        // a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();


        System.out.println("-------------------Observer Pattern------------------");
        Button button=new Button("버튼");
        // listener 달기
        // 익명 클래스로 전달 받아서 넣기
        button.addListener(new IButtonListener(){
           @Override
            public void clickEvent(String event) {
               System.out.println(event);
            }
        });

        button.click("message transfer : click1");
        button.click("message transfer : click2");
        button.click("message transfer : click3");
        button.click("message transfer : click4");

        System.out.println("-------------------Facade Pattern------------------");
        // 자기가 갖고있는 class에 대해서 기능에 대해 명확하게 알아야 한다.
        // 여러 개의 객체를 합쳐서 특정한 기능을 만들 때 사용하기도 한다.
        // FTP도 closoe와 connec이 필요하고 Writer, Reader도 close와 connect이 필요하다.
        // facade라는 interface를 두고 connect,read,wirte라는 기능을 통해서 안에 있는 기능들에 접근 하도록 할 수 있다.

        // 아래의 경우 개별적으로 만들어서 진행을 한 형태
        Ftp ftpClient=new Ftp("www.naver.com",22,"/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer=new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader=new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconenct();
        ftpClient.disConnect();

        // Facade 사용

        SftpClient sftpClient= new SftpClient("www.foo.com",22,"/home/etc","text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();


        System.out.println("-------------------Strategy Pattern------------------");
        // 1. 전략 메서드를 갖는 전략 객체
        // 2. 전략 객체를 사용하는 Context (encoder)
        // 3. 전랙 객체를 생성해서 Context에 주입하는 Client (main에 작성함)
        // normal로 인코딩 할 것 인지 , Base64로 할 것인지 , 암호화를 할 것 인지 의 전략을 수정하여 결과를 동일하게 얻을 수 있음
        Encoder encoder=new Encoder();

        // base64
        EncodingStrategy base64=new Base64Strategy();

        // Normal
        EncodingStrategy normal=new NormalStrategy();

        String message="Hello Sora";

        encoder.setEncodingStrategy(base64);
        String base64Rresult=encoder.getMessage(message);
        System.out.println(base64Rresult);

        encoder.setEncodingStrategy(normal);
        String normalResult=encoder.getMessage(message);
        System.out.println(normalResult);

// 전략만 수정하여 결과를 얻어낼 수 있다.

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult=encoder.getMessage(message);
        System.out.println(appendResult);

    }






    // 콘센트 : main자체가 static 이므로 이 메서드 자체도 static 이여야 한다.
   public static void connect(Electronic110V electronic110v){
        // 110V만 받을 수 있는 콘센트
        electronic110v.powerOn();
   }
}
