package com.learn.JZ_offer.jvm.model;

public class StackLeakByThread {
    public static void main(String[] args) {
        while (true){
            new Thread() {
                public void run(){
                    while (true){

                    }
                }
            }.start();
        }
    }
}
