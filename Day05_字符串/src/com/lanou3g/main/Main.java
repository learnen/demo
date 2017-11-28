package com.lanou3g.main;

import test.Student;

public class Main {
	
	public static void main(String[] args) {
		Student stu = new Student();
		
		//smile是pulic修饰的
		//所以哪里都可以使用
		stu.smile();
		
		//cry是private修饰的
		//所以在Student类外面找不到
//		stu.cry();
		
		//angry是protected 修饰的
		//所以在test包外面，找不到
		//这就叫同包可用
		//因为main所在的包，与Student这个类
		//所在的不是同一个包，所以不可用	
//		stu.angry();
		
		
		//sad方法生命中，没有权限修饰词
		//表示默认的，只有同包下可以使用
//		stu.sad()
		
	}
	
}
