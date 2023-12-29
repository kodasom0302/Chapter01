package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		//가로
		for (int x=1; x<=6; x++) {
			
			//세로
			for (int y=1; y<=6; y++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}

	}

}
/*
줄 바꿈 \n으로 치면 안 되는지

for (int x=1; x<=6; x++) {
			System.out.println("******");
이 코드로 해도 올바르게 출력 되던데 이 방식은 안 되는지
*/