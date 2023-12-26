package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//증감 연산자
		int b=10;
		
		System.out.println(b);
		System.out.println(b++); //b 값 출력 -> ++ 하나 올리기
		System.out.println(b); //b 바뀌었는지 확인
		
		System.out.println(b--); //b 출력 -> 하나 내리기
		System.out.println(b); //b 바뀌었는지 확인
		
		System.out.println(b);
		System.out.println(b++);
		System.out.println(b++);
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		System.out.println("---------------------------------");
		
		int no=10;
		
		System.out.println(++no + 3);
		
		System.out.println(no-- + 3); //+3 먼저 -> 출력 -> -- (-- 원본 바꾸는 거니까 13-1이 아닌 10-1)
		System.out.println(no); //no 바뀌었는지 확인
		
		++no; //no+1
		++no; //no+1
		System.out.println(no); //바뀐 no 확인
		
		no++; //no+1
		++no; //no+1
		System.out.println(no); //바뀐 no 확인
		
		
	}

}
