package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i=1; i<=10; i++) {
			sum=sum+i;
		}
		
		System.out.println("1부터 10까지의 정수의 합은 "+sum+" 입니다.");

	}

}
/*
	0+1+2+3+4+5
i		i<=5		sum(=sum+1)
1		1<=5 - T	0+1
2		2<=5 - T	0+1+2
3		3<=5 - T	0+1+2+3
4		4<=5 - T	0+1+2+3+4
5		5<=5 - T	0+1+2+3+4+5
6		6<=5 - F	출력X
*/