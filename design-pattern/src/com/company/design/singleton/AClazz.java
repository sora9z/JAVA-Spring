package com.company.design.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz(){
        this.socketClient=SocketClient.getInstalce();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
