package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리 연산자
		//&& and 연산자 - 깐깐 => 하나라도 false 있으면 무조건 false
		System.out.println(true&&true); //t
		System.out.println(true&&false); //f
		System.out.println(false&&true); //f
		System.out.println(false&&false); //f
		
		System.out.println("----------------------------------");
		
		//|| or 연산자 - 널널 => 하나라도 true 있으면 무조건 true
		System.out.println(true||true); //t
		System.out.println(true||false); //t
		System.out.println(false||true); //t
		System.out.println(false||false); //f
		
		System.out.println("------------------------------------");
		
		//응용
		int a=5;
		int b=7;
		System.out.println(a>b&&a<b); //f && t => f
		System.out.println(a>b&&a>b); //f && f => f
		System.out.println(a>b||a<b); //f || t => t
		System.out.println(a>b&&a<b||a<b); //f && t || t => t - &&부터 계산
		System.out.println(a<b||a>b||a>b); //t || f || t => t - ||가 2개 있는 경우, 앞에서 계산한 값이 그대로 답이기에 뒤에는 굳이 계산하지 않음
		
		System.out.println("------------------------------------");
		
		System.out.println(!(a<b)); //a>b => f
		System.out.println(!(a>b)); //a<b => t
		System.out.println(!(a>b)||(a<b)); //a<b || a<b => t

	}

}
