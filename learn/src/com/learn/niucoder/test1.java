package com.learn.niucoder;

/**
 * 局部变量名和成员变量名
 * 重名测试
 */
public class test1 {

    private int a = 1;
    public void test(){
        int a = 2;
        System.out.println("局部变量a = " + a);
        System.out.println("成员变量a = " + this.a);
    }
    public static void main(String[] args){
        new test1().test();

        String 世界 = "我的世界";
        System.out.println(世界);

        int i=5;
        int s=i++ + ++i + i-- + --i;
        System.out.println(s);
    }
    //一个类可以有多个main方法
    public void main(){

    }
}
