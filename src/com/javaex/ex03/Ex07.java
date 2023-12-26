package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int p=sc.nextInt();
		//&& || 연산자
		if (p<60) {
			System.out.println("F등급");
		} else if (p>=90) {
			System.out.println("A등급");
		} else if (90>p>69) {
			System.out.println("C등급");
		} else {
			System.out.println("D등급");
		}
		
		sc.close();

	}

}
