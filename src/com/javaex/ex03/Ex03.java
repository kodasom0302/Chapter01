package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자: ");
		int point=sc.nextInt();
		
		if (point>0) {
			//양수일 때
			System.out.println("양수");
		} else if (point<0) {
			//음수일 때
			System.out.println("음수");
		} else {
			//0일 때
			System.out.println("0입니다.");
		}
		
		sc.close();

	}

}
