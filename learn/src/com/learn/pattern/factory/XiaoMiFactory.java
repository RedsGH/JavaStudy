package com.learn.pattern.factory;

public class XiaoMiFactory implements PhoneFactory {
    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu825();//高性能处理器
    }

    @Override
    public Screen getScreen() {
        return new Screen.Screen6();//6寸大屏
    }
    @Override
    public void print() {
    	new Cpu.Cpu825().run();
    }
}
