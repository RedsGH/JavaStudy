package com.learn.Construtor;

public class crTest {

    public static void main(String[] args){

        cr cr = new cr(); // 如果cr类里写了有参构造方法，没写无参构造方法，则将报错
        System.out.println(cr.getA());
        System.out.println(cr.getB());
        System.out.println(cr.isC());
        System.out.println(cr.getD());
        System.out.println(cr.getE());
        System.out.println(cr.getF());
        System.out.println("-----------------------");
        cr cr1 = new cr(1);
        System.out.println(cr1.getA());
        System.out.println(cr1.getB());
        System.out.println(cr1.getE());
        System.out.println(cr.getF());
    }
}
