package com.javaex.ex03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		//if-else문으로 바꾼 버전
		Scanner sc=new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		
		int month=sc.nextInt();
		
		if ((month==4)||(month==6)||(month==9)||(month==11)) {
			System.out.println("30일");
		} else if (month==2) {
			System.out.println("28일");
		} else {
			System.out.println("31일");
		}
		
		sc.close();

	}

}
