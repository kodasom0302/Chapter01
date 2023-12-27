package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int p=sc.nextInt();
		
		if (p>=90) {
			System.out.println("A등급");
		} else if (79<p&&p<90) {		//><만 사용할 수 없으니 논리 연산자 이용
			System.out.println("B등급");
		} else if (69<p&&p<80) {
			System.out.println("C등급");
		} else if (59<p&&p<70) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		
		sc.close();

	}

}
