package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		//이름을 입력해 주세요
		System.out.println("이름을 입력해 주세요");
		
		//이름:
		System.out.print("이름: ");
		
		//이름 작성
		String name=sc.nextLine();
		
		//나이를 입력해 주세요
		System.out.println("나이를 입력해 주세요");
		
		//나이:
		System.out.print("나이: ");
		
		//나이 작성
		int age=sc.nextInt();
		
		//키를 입력해 주세요
		System.out.println("키를 입력해 주세요");
		
		//키:
		System.out.print("키: ");
		
		//키 작성
		double height=sc.nextDouble();
		
		//당신의 이름은 () 나이는 () 키는 () 입니다.
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 키는 "+height+" 입니다.");
		
		sc.close();

	}

}
