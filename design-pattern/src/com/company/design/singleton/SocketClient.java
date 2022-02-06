package com.company.design.singleton;

public class SocketClient {

    // 1. default 생성잘을 private으로 막고
    // static으로 getInstalce를 만들어준다.
    // 자신의 개체가 null인 경우 생성자를 new
    // null이 아닌 경우 그대로 return 한다.

    private static SocketClient socketClient=null;

    // SingleTon은 기본 생성자를 Private으로 제한해야 한다.
    private SocketClient(){};

    // getInstance method를 제공해야 한다.
    // 생성되지 않았다면 생성
    public static SocketClient getInstalce(){
        if(socketClient ==null){
            socketClient=new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }

}
