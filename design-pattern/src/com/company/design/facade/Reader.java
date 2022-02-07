package com.company.design.facade;

public class Reader {
    // file 에서 읽어오는 file reader
    private String fileName;

    public Reader(String fileName){
        this.fileName=fileName;
    }

    public void fileConnect(){
        String msg=String.format("READER %s 로 연결 합니다",fileName);
        System.out.println(msg);

    }

    public void fileRead(){

        String msg=String.format("READER %s 의 내용을 읽어 옵니다",fileName);
        System.out.println(msg);

    }

    public void fileDisconnect(){
        String msg=String.format("READER %s 로 연결 종료 합니다",fileName);
        System.out.println(msg);

    }

}
