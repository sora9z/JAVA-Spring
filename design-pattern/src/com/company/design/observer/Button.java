package com.company.design.observer;

public class Button {
    private String name;
    private IButtonListener buttonListener;

    public Button(String name){
        this.name=name;
    }

    // button에 대한 click
    public void click(String message){
        // message가 잃어나면 listener를 통해 전달해준다.
        buttonListener.clickEvent(message);
    }

    public void addListener(IButtonListener buttonListener){
        this.buttonListener=buttonListener;
    }
}
