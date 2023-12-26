package com.javaex.ex01;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//대입 연산자
		int a=7;
		int b=2;
		
		//산술 연산자
		int val01=a+b;
		System.out.println(val01);
		//단축, 더하기
		System.out.println(a+b);
		//빼기
		System.out.println(a-b);
		//곱하기
		System.out.println(a*b);
		//나누기 - 몫
		System.out.println(a/b);
		//a/b=3.5로 나오지 않는 이유 : 정수만 존재 -> 소수점을 표시하기 위해서는 하나에 double을 붙여줘야 함
		//나누기 - 나머지
		System.out.println(a%b);
		
		System.out.println("------------------------------------");
		//%연산자 자세히
		System.out.println(7/2); //3
		//출력값이 3.5로 나오게 하려면 : double7/2     7/double2     7.0/2
		System.out.println(7.0/2);
		System.out.println(7%2); //1
		System.out.println(7.0%2); //1.0 값 실수형으로 표현
		
		System.out.println("-------------------------------------");
		int var=-3;
		int pVar=+var; //+(-3)=-3
		int mVar=-var; //-(-3)=+3
		System.out.println(pVar);
		System.out.println(mVar);
		
		//팁_계산 순서 헷갈릴 것 같으면 그냥 () 치면 됨
		
		
		}

	}
