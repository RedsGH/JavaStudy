package com.learn.pattern.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo03();
	}
	public static void demo01() {
		//目标对象
        UserDao target = new IUserDao();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy1 proxy = new UserDaoProxy1(target);

        proxy.save();//执行的是代理的方法
	}
	public static void demo02() {
		//目标对象
		UserDao target = new IUserDao();
		// 【原始的类型 class cn.itcast.b_dynamic.UserDao】
        System.out.println(target.getClass());
        
        //给目标对象创建代理对象
        UserDao proxy = (UserDao) new ProxyFactory2(target).getProxyInstance();
     
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
	}
	public static void demo03() {
		
		IUserDao target = new IUserDao();
		IUserDao proxy = (IUserDao) new ProxyFactory3(target).getProxyInstance();
		proxy.save();
		target.save();
	}
}
