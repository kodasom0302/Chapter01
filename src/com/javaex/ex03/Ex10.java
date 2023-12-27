package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("과목번호: ");
		int code=sc.nextInt();
		
		switch (code) {
		case 1:
			System.out.println("R101호");
			break;
			
		case 2:
			System.out.println("R202호");
			break;
			
		case 3:
			System.out.println("R303호");
			break;
			
		case 4: 
			System.out.println("R404호");
			break;
			
		default:
			System.out.println("상담원에게 문의하세요");
			break;
		}
		
		sc.close();

	}

}

//Scanner로 받을 때 char은 불가능 -> String 사용(nextLine)
//기본 자료형 중 변수 설정 불가능한 거 : boolean float double long
//String 사용시 == 같다는 뜻이 아님 - if 조건문에서 사용 불가능 - 기본 자료형 8가지 외 같다고 표현할 때 equals 사용