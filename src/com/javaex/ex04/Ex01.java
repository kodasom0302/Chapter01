package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		
		//초기값 증감식 조건식
		
		int i=0;	//보통 1부터 세는데 개발에서는 0부터 세는 편 - 적응할 것
		
		while (i<5) {
			System.out.println("I like Java"+i);
			
			i++;
		}

	}

}
/*
i	i<5
0	0<5 - T		출력
1	1<5 - T		출력
2	2<5 - T		출력
3	3<5 - T		출력
4	4<5 - T		출력
5	5<5 - F
*/