package com.javaex.ex01;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double v01 = 5/4;
		System.out.println(v01);
		//1.25가 나와야 하는데 1이 나올 가능성 많음 ========왜?
		
		double v02 = (double)5/4;
		System.out.println(v02);
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		
		double v04 = (double)5/(double)4;
		System.out.println(v04);
		
		int v99 = 5/(double)4; //===========왜 안 되는지
		
		//소수점 버리겠다
		int v99 = (int)(5/(double)4); //===========왜 안 되는지
		int v99 = (int)(1.25); //===========왜 안 되는지
		System.out.println(v99);
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		//1+1=2
		
		int v06 = (int)(1.3+1.8);
		System.out.println(v06);
		//1.3+1.8=3.1 - 3
		
		//(int)1.3+1.8; 올바르지 않은 형식이지만 굳이 공식대로 계산을 해보자면 1+1.8=2.8
		/*
		int v07 = (int)1.3+1.8; =========왜 안 되는지
		 */
		
		double v07 = (int)1.3+1.8;
		System.out.println(v07);
		//1+1.8=2.8
		
		
		
		/*
		 * final : 값을 고정하겠다
		 * double : 실수형
		 * int : 정수형
		 * char : 문자형 - 한 글자만 쓸 수 있음 / '' 사용
		 * string : 문자 배열 - 여러 글자 가능 / ""사용
		 * boolean : 참, 거짓 - 보통 비교 등 할 때 많이 사용
		 * 형변환 시 양쪽 단위를 똑같이 쓴다
		 * ex)double->int
		 * double var01=5.3
		 * int var02=(int)var01 =====================불가능,, 왜?
		 * 크기가 큰 거에서 작은 걸로 바꾸면 데이터 손실 가능성 있음
		 */
	}

}
