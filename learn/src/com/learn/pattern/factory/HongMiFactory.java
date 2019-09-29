package com.learn.pattern.factory;

public class HongMiFactory implements PhoneFactory {

    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu650();//高效处理器
    }

    @Override
    public Screen getScreen() {
        return new Screen.Screen5();//小屏手机
    }

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
