package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			System.out.println("숫자를 입력하세요");
			int no=sc.nextInt();
			
			if (no==0) {
				System.out.println("종료");
				break;
			}
			
			if (no%3==0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		
		sc.close();

	}

}
//break 쓰면 그 이후 끝내고 탈출 => if문 나누어서 작성 - 완전히 나가버림 = 반복문 끝
//continue 쓰면 그 밑은 작동하지 않음 - 완전 나가는 게 아님 = 반복문 실행