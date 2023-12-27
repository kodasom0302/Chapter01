package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		//break 없애서 줄인 버전
		Scanner sc=new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month=sc.nextInt();
		
		switch (month) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
			
		case 2:
			System.out.println("28일");
			break;
			
		}
		
		sc.close();

	}

}
