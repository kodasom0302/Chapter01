package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i;
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		int num=sc.nextInt();
		
		for (i=1; i<=9; i++) {	//i를 1부터 9까지 1씩 증가
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
		sc.close();

	}

}
