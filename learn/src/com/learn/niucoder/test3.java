package com.learn.niucoder;

/**
 * 测试构造函数
 */
class Demo {
    class Super{
        int flag = 1;

        Super(){
            test();
        }
        void test(){
            System.out.println("Super.test() flag="+flag);
        }
    }
    class Sub extends Super{
        Sub(int i){
            flag = i;
            System.out.println("Sub.Sub()flag="+flag);
        }
        void test(){
            System.out.println("Sub.test()flag="+flag);
        }
    }
}
public class test3{

    public static void main(String[] args) {  new Demo().new Sub(5);
    }
}
