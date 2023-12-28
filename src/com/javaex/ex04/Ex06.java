package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i=1; i<=10; i++) {
			sum=sum+i;
			System.out.println(i+"까지의 합은 "+sum);
		}
		
		System.out.println("1부터 10까지의 정수의 합은 "+sum+" 입니다.");

	}

}
//"i까지의 합은 sum"도 반복되는 문구이기 때문에 for문에 포함
/*
i<=10 변경 - 결과 출력의 숫자도 바꿔줘야 됨 => 새로운 변수로 설정
int max=100;
i<=max
"1부터 "+max+"까지의 정수의 합은 "+sum+" 입니다."
*/