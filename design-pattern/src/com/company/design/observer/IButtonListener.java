package com.company.design.observer;

public interface IButtonListener {
    // event를 받을 수 있는 method
    // Button에 대한 클릭이 일어나면 event를 받는다.
    void clickEvent(String event); // listener 부터 event를 전달 받음


}
