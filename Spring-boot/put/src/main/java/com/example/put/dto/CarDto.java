package com.example.put.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarDto {

    private String name;
    @JsonProperty("car_number")
    private String catNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatNumber() {
        return catNumber;
    }

    public void setCatNumber(String catNumber) {
        this.catNumber = catNumber;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "name=" + name + "\'" +
                ", catNumber=" + catNumber + "\'" +
                "}";
    }
}
