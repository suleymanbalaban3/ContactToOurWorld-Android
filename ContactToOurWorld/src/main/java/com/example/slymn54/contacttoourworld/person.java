package com.example.slymn54.contacttoourworld;

import java.io.Serializable;
import java.lang.ref.SoftReference;

/**
 * Created by slymn54 on 21.7.2016.
 */
public class person implements Serializable{
    private String name;
    private String surName;
    private int height;
    private double weight;

    public person() {
        this.name="NAME";
        this.surName="SURNAME";
        this.height=1;
        this.weight=1;
    }
    public person(String name,String surName,int height,double weight) {
        this.name=name;
        this.surName=surName;
        this.height=height;
        this.weight=weight;
    }
    public void setPerson(String name,String surName,int height,double weight) {
        this.name=name;
        this.surName=surName;
        this.height=height;
        this.weight=weight;
    }
    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public int getHeight() {
        return height;
    }
    public  double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return getName()+" Bey Bilgileriniz :\nBoyunuz :"+getHeight()+"\nKilonuz :"+getWeight()
                +"\nBeden kitle endeksiniz : ";
    }
}
