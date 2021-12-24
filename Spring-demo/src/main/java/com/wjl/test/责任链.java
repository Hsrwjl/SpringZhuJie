package com.wjl.test;

public class 责任链 {
	public static void main(String[] args) {
		Handle boss = new Boss();
		Handle big = new BigBoss();
		boss.setHandle(big);
		boss.zeren(11);
	}
}

abstract class Handle{
	
	protected Handle handle;
	
	public void setHandle(Handle handle) {
		this.handle=handle;
	}
	public abstract void zeren(Integer i);
}
class Boss extends Handle{

	@Override
	public void zeren(Integer i) {
		if (i<10) System.out.println("老板处理");
		else handle.zeren(i);
	}
	
}

class BigBoss extends Handle{

	@Override
	public void zeren(Integer i) {
		System.out.println("我处理");
	}
	
}