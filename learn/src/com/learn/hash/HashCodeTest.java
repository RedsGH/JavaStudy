package com.learn.hash;

import com.learn.hash.Student;

public class HashCodeTest {

    public static void main(String[] args) {

        /**
         * 测试各个类型的hashCode()　都是使用一个整数映射
         */
        int a = 42;
        System.out.println(((Integer)a).hashCode());

        int b = -42;
        System.out.println(((Integer)b).hashCode());

        double c = 3.1415926;
        System.out.println(((Double)c).hashCode());

        String d = "zxzx";
        System.out.println(d.hashCode());

        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println();



        /**
            (1)如果没有重写　Object中的hashCode，那么下面的student和student2是不同的,hashCode按照地址比较
            (2)如果按照自己重写的　hashCode，那么下面的student和student2是相同的

         　　由于不能仅仅只按照hashCode来比较两个对象是否相同，所以就有重写equals方法
            自己写的hashCode只是计算hash函数的值，但是产生hash冲突的时候(虽然hash函数值相等)，还是要比较是否相等

         */
        Student student = new Student(3, 2, "xinxin", "zheng");
        System.out.println(student.hashCode());

        Student student2 = new Student(3, 2, "xinxin", "zheng");
        System.out.println(student2.hashCode());

        System.out.println(student.hashCode() == student2.hashCode()); //true
        System.out.println(student == student2); //false

    }
}