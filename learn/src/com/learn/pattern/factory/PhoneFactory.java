package com.learn.pattern.factory;

public interface PhoneFactory {

    Cpu getCpu();//使用的cpu

    Screen getScreen();//使用的屏幕
    
    void print();
}