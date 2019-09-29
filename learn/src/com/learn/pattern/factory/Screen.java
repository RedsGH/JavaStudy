package com.learn.pattern.factory;

public interface Screen {

    void size();

    class Screen5 implements Screen {

        @Override
        public void size() {
        	System.out.println("5");//5寸
        }
    }

    class Screen6 implements Screen {

        @Override
        public void size() {
        	System.out.println("6");//6寸
        }
    }
}
