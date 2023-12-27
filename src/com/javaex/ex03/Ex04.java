package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time=sc.nextInt();
		
		if (time<=8) {
			System.out.println("임금은 "+time*10000+"원 입니다.");
		} else {
			System.out.println("임금은 "+(8*10000+(time-8)*12000)+"원 입니다.");
		}
		
		sc.close();

	}

}

/* 더 간편한 방법
int worktime=sc.nextInt();
int salary;

if (worktime<9) {
	salary=worktime*10000;
} else {
	salary=8*10000+(worktime-8)*12000;
}

System.out.println("임금은 "+salary+"원 입니다.");
*/