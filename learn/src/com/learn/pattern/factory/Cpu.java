package com.learn.pattern.factory;

public interface Cpu {

	void run();

    class Cpu650 implements Cpu {
        @Override
        public void run() {
            System.out.println("650");//625 也厉害
        }
    }

    class Cpu825 implements Cpu {
        @Override
        public void run() {
        	System.out.println("825");//825 处理更强劲
        }
    }

}
