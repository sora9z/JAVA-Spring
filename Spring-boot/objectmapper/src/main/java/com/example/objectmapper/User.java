package com.example.objectmapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String name;
    private int age;
    @JsonProperty("phone_number")
    private String phoneNumber;

    public User(String name, int age,String phoneNumber){
        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
    }

    public User(){
        this.name=null;
        this.age=0;
        this.phoneNumber=null;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 특정 메서드 get을 붙이는 경우 -> Object mapper에서 사용할 경우 get을 붙여주면 안됨. 애러
//    public User getDefaultUser(){
//        return new User("default",0);
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
