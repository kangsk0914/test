package com.bean;

public class EchoBean {
	
	int num;
	String name;
	// constructor injection
	public EchoBean(int n,String name) {
		System.out.println("(int n,String name)" + n);
		name = "na";
		name = "n";
		num = n;
	}
	public EchoBean(int n) {
		super();
		System.out.println("EchoBean 생성자");
	}

	public EchoBean() {
		super();
		System.out.println("EchoBean 생성자");
	}
	public String sayEcho(String mesg){
		return "Hello"+mesg;
	}
	

}
