package com.learn.pattern.proxy;

public class UserDaoProxy1 implements UserDao{

	private UserDao target;
	
	public UserDaoProxy1(UserDao target) {
		this.target = target;
	}
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("开始事务");
		target.save();
		System.out.println("结束事务");
	}

	
}
