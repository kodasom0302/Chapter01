package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//관계 연산자
		int n1=5;
		int n2=3;
		
		boolean result=5<3; //boolean result=n1<n2;
		System.out.println(result); //System.out.println(n1<n2;) - f
		
		System.out.println(n1<n2); //n2가 n1보다 크다 - f
		System.out.println(n1>n2); //n1이 n2보다 크다 - t
		
		System.out.println(n1<=n2); //n2가 n1보다 크거나 같다 - f
		System.out.println(n1>=n2); //n1이 n2보다 크거나 같다 -t
		System.out.println(3>=n2); //3이 n2보다 크거나 같다 - t
		
		System.out.println(n1==n2); //n1과 n2가 같다 - f
		System.out.println(n1!=n2); //n1과 n2가 다르다 - t

	}

}
