package com.learn.other;

import java.util.function.Function;

public class NoNameInnerClass {

        public static void main(String[] args){
            //如何调用PersonDemo中的method方法呢？
            PersonDemo pd = new PersonDemo();
            //new Person(){}继承Person类,代表Person的子类对象
            pd.method(new Person(){     //匿名内部类当做参数传递(本质把匿名内部类看做一个对象)
                public void show(){
                    System.out.println("show2");
                }
            });
        }
    }

    //这里写抽象类，接口都行
    abstract class Person{
        public abstract void show();
    }

    class PersonDemo{
        //public void method(Person p){     //多态：Person p = new Student();
    /*
    Person p = new Person(){
        public void show(){
            System.out.println("show");
        }
    }
    */
        public void method(Person p){
            //编译看的是Person里面的show方法
            //运行看的是Student里面的show方法
            p.show();
        }
    }

    class Student extends Person{
        public void show(){
            System.out.println("show1");
        }
    }

