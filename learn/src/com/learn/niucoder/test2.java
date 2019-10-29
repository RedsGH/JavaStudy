package com.learn.niucoder;

/**
 * 数组用equals方法比较
 */
public class test2 {
    static int[] a = {1,2,3,4,5};
    static int[] b = {1,2,3,4,5};
    static int[] c = {1,2,3,4,4};
    public static void main(String[] args){
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equals(c));

        Integer i01 = 59;
        int i02 = 59;
        Integer i03 =Integer.valueOf(59);
        Integer i04 = new Integer(59);
        System.out.println(i01 == i02);// true i02是基本类型，自动拆箱比较值
        System.out.println(i01 == i03);// true i03得到的是i01的引用
        System.out.println(i01 == i04);// false 显式的new，对象地址不一样
        System.out.println(i02 == i03);// true i02是基本类型，自动拆箱比较值
        System.out.println(i02 == i04);// true i02是基本类型，自动拆箱比较值
        System.out.println(i03 == i04);// false 显式的new，对象地址不一样

    }
}
