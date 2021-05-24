package com.qa.junitexample;

public class MathMethod {

	public MathMethod() {
		System.out.println(div(10, 4));
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mult(int a,int b) {
		return a*b;
	}
	public static float div(float a,float b) {
		return a/b;
	}
	public static int mod(int a,int b) {
		return a%b;
	}
	
	
}
