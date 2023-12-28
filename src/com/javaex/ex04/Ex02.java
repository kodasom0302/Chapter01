package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		int num=sc.nextInt();
		int i=1;
		
		while (i<=9) {
			System.out.println(num + " * " + i + " = " + num * i);	//여기서 i++을 하면 홀수만 출력
			
			i++;
		}
		
		sc.close();
		
	}

}

//i를 0으로 고정해야 해서 이용하지 못하는 경우 - 새로운 변수 설정
//i=0; i<9인 경우 - 결과값 출력할 때 i+1 하면 됨