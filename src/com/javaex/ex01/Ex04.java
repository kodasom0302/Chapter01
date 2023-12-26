package com.javaex.ex01;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//증감 연산자
		int a=7; //int a; a=7;과 같은 명령
		
		System.out.println(a);
		System.out.println(++a); //++ : a를 하나 올려라 -> 하나 올리기, 출력 2가지 일을 해야 하는데 ++ 먼저 함(가장 먼저)
		System.out.println(a); //++을 사용할 경우 원본(a)을 바꿈
		
		System.out.println(--a); //-- : a를 하나 줄여라 -> -- 먼저, 그리고 출력
		System.out.println(a);
		
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(--a);
		System.out.println(a);
		
	}

}
