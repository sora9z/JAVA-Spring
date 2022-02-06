package com.company.design.aop;

import com.company.design.proxy.Html;
import com.company.design.proxy.IBrowser;

public class AopBrowser implements IBrowser {

    private String url;
    private Html html;
    // before, after html loading 시간을 보기 위해
    private Runnable before;
    private Runnable after;

    // constructor
    public AopBrowser(String url,Runnable before,Runnable after){
        this.url=url;
        this.before=before;
        this.after=after;
    }

    @Override
    public Html show() {
        before.run();
        if(html==null){
            this.html=new Html(url);
            System.out.println("AopBrowser html loading from : "+url);
            // method 자체가 빠를 수 있으므로 sleep을 좀 준다.
            try {
                Thread.sleep(1500); // 1.5 s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        after.run();
        System.out.println("AopBrowser html cache : "+url);

        return html;
    }
}
