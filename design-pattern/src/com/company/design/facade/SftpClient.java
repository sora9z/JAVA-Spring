package com.company.design.facade;

public class SftpClient {
    // 1. 모든 의종성을 가져온다
    private Ftp ftp;
    private Reader reader;
    private Writer writer;

    // 생성자에서 다 받는다
    public SftpClient(Ftp ftp, Reader reader,Writer writwe){
        this.ftp=ftp;
        this.reader=reader;
        this.writer=writwe;
    }

    // Overloading

    public SftpClient(String host,int port,String path,String fileName){
        this.ftp=new Ftp(host,port,path);
        this.reader=new Reader(fileName);
        this.writer=new Writer(fileName);
    }

    public void connect(){
        ftp.connect();
        ftp.moveDirectory();
        writer.fileDisconenct();
        reader.fileDisconnect();
    }

    public void disConnect(){
        writer.fileDisconenct();
        reader.fileDisconnect();
        ftp.disConnect();
    }

    public void read(){
        reader.fileRead();
    }

    public void write(){
        writer.write();
    }



}
