package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		//안내 - 이름을 입력해 주세요
		System.out.println("이름을 입력해 주세요");
		
		//이름 - 이름:
		System.out.print("이름: ");
		
		//이름 입력
		String name=sc.nextLine();
		
		//안내 - 나이를 입력해 주세요
		System.out.println("나이를 입력해 주세요");
		
		//나이 - 나이:
		System.out.print("나이: ");
		
		//나이 입력
		int age=sc.nextInt();
		
		//결과 - 당신의 이름은 () 나이는 () 입니다.
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 입니다.");
		
		sc.close();

	}

}
