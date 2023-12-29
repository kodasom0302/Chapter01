package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		int sum=0;
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		do {
			no=sc.nextInt();
			sum=sum+no;
			System.out.println("합계: "+sum);
		} while (no!=0); //변수 선언 따로 하지 않으면 do에서 생겨난 no기 때문에 오류남
		
		System.out.println("종료");
		sc.close();
		
		/*
		while (true) {
			int no=sc.nextInt();
			if (no==0) {
				System.out.println("종료");
				break;
			} else {
				sum=sum+no;
				System.out.println(sum);
			}
			
			else 안 쓰고 sum=sum+no;
			System.out.println(sum);
			만 써도 됨 - break 때문에 조건 안 맞으면 실행하지 않기 때문
			
			
			
			
			if (no!=0) {
				//더하기
				sum=sum+no;
				System.out.println(sum);
				
			} else {
				System.out.println("종료");
				break;
			}
		}
		*/
		//입력받기
		//no=0이면 종료
		
		//no!=0이면
			//합계 계산
		
		//입력받기

	}

}
