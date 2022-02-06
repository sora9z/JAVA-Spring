package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {


        System.out.println("-------------------SingleTon Pattern------------------");
        AClazz aClazz=new AClazz();
        BClazz bClazz=new BClazz();

        SocketClient aclient=aClazz.getSocketClient();
        SocketClient bclient=bClazz.getSocketClient();

        System.out.println("두 개의 객첵다 동일한가?");
        System.out.println(aclient.equals(bclient));




        System.out.println("-------------------Adapter Pattern------------------");
        HairDryer hairDryer=new HairDryer();
        connect(hairDryer);

         Cleaner cleaner=new Cleaner();
        // connect(cleaner);  // connect는 110v용 이기 떄문에 불가능 -> 이런 경우 어댑터가 필요

         Electronic110V adapter=new SocketAdaptor((cleaner));
         connect(adapter);

        AirConditioner airConditioner=new AirConditioner();
        Electronic110V airAdapter=new SocketAdaptor(airConditioner);
        connect(airAdapter);

        System.out.println("-------------------Proxy Pattern------------------");
        // cache 전 Code : 매번 browser를 호출한다.
        Browser browser1=new Browser("www.naver.com");
        browser1.show();
        browser1.show();
        browser1.show();


        IBrowser browser=new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();

        // 동시성 문데 ?
        AtomicLong start=new AtomicLong();
        AtomicLong end=new AtomicLong();

        System.out.println("-------------------AOP Pattern------------------");
        IBrowser aopBrowser=new AopBrowser("www.naver.com",
                ()->{
                        System.out.println("begore");
                        start.set(System.currentTimeMillis());

                },
                ()->{
                    long now=System.currentTimeMillis();
                    end.set(now-start.get());
                }
                );
        aopBrowser.show();
        System.out.println("Loading time : "+end.get());

        // 두 번째는 cache를 사용하으모 0초 걸림
        aopBrowser.show();
        System.out.println("Loading time : "+end.get());


    }
// 콘센트 : main자체가 static 이므로 이 메서드 자체도 static 이여야 한다.
   public static void connect(Electronic110V electronic110v){
        // 110V만 받을 수 있는 콘센트
        electronic110v.powerOn();
   }
}
