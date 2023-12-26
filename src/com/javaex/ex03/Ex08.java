package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int n=sc.nextInt();
		
		if (n==0) {
			System.out.println("0");
		} else if (n<0) {
			System.out.println("음수");
		} else if (n%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		sc.close();

	}

}
