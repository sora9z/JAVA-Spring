package com.company.design.singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz(){
        this.socketClient=SocketClient.getInstalce();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }

}
