package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//팁_Scanner 코드 작성 후 수식 쓰면 close 잊을 수 있으니 먼저 쓰고 그 사이 공간에 작성
		Scanner sc=new Scanner(System.in);
		
		//안내 - 이름을 입력해 주세요
		System.out.println("이름을 입력해 주세요");
		
		//이름 - 이름:
		System.out.print("이름:");
		
		//이름 입력받기 = 변수
		String name=sc.nextLine();
		
		//결과 - 당신의 이름은 (변수) 입니다.
		System.out.println("당신의 이름은 "+name+" 입니다.");
		
		sc.close();
		
	}

}
