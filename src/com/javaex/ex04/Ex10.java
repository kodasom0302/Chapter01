package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		
		int no=1;
		
		while (true) {
			if (no%6==0 && no%14==0) {
				System.out.println(no);
				break;
			}
			
			no++;
			
		}

	}

}
//if문 안에 break 쓰면 가장 가까이에 있는 while문의 조건이 맞으면 종료