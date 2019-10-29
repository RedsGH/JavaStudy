package com.learn.Construtor;

/**
 *  初始化方法运行顺序
 *    1.赋值默认值
 *    2.按声明次序顺序执行初始化语句和初始化块
 *    3.一个构造器第一行调用了另一个构造器，则执行另一个构造器主体
 *    4.执行这个构造器的主体
 *
 *    TODO 静态初始化块和构造块哪个先执行
 */
public class cr {
    private int a; // 默认值 0
    private String b; // 默认值 null
    private boolean c; // 默认值 false
    private int d = D(); // 调用静态方法赋值

    /**
     *     只要构造类的实例，构造块就会执行
     *     构造块建议放在前面
     *
     */
    {
        e = "初始化块赋值";
    }
    private String e = "初始化块赋值，按顺序初始化"; // 初始化块赋值

    //  所以的静态初始化语句和静态初始化块依照类定义的顺序去执行，就是按从上到下的顺序执行
    static {
        f = "静态初始化块赋值";
    }
    private static String f = "静态初始化块赋值，按顺序初始化"; // 静态初始化块赋值

    /**
     *  如果有多个方法有相同名字、不同参数，便产生了重载。
     *  返回类型不是方法签名的一部分，也就是说不能有相同的方法签名，不同的返回类型。  方法签名（名字，参数）
     *  所有方法都可以重载，包括构造方法。
     *
     *  仅当类没有提供任何构造方法时，系统才会提供默认的无参构造器
     */

    public cr(){
        // 赋值默认值
    }
    public cr(int a){
        //System.out.println("this,super要写在第一行，否则报错");
        this(a, "调用另一个构造方法");
        System.out.println("执行了第一个构造器");
    }
    public cr(int a, String b){
        this.a = a;
        this.b = b;
        System.out.println("执行了第二个构造器");
    }
    public cr(int a, int b, int c){

    }

    public int getA() {
        return a;
    }


    public void setA(int a) {

        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public boolean isC() {
        return c;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public static String getF() {
        return f;
    }

    public static void setF(String f) {
        cr.f = f;
    }

    public static int D(){
        int i = 100;
        return i;
    }
}
