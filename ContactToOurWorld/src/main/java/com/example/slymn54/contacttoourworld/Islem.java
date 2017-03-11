package com.example.slymn54.contacttoourworld;

/**
 * Created by slymn54 on 10.8.2016.
 */

public class Islem {
    private String islem;
    private String secondIslem;

    public Islem(String secondIslem, String islem) {
        this.secondIslem = secondIslem;
        this.islem = islem;
    }

    public String getIslem() {
        return islem;
    }

    public void setIslem(String islem) {
        this.islem = islem;
    }
    public String getSecondIslem() {
        return secondIslem;
    }

    public void setSecondIslem(String secondIslem) {
        this.secondIslem = secondIslem;
    }
}
