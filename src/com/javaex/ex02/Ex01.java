package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int i=12345;
		double d=3.14;
		char c='한';
		
		String str="안녕하세요";
		String name="고다솜";
		String hello="굿모닝";
		
		System.out.println(i);
		System.out.println(12345); //한번만 사용할 경우 직접 쳐도 무방
		
		System.out.println(str);
		System.out.println("안녕하세요"); //ln 붙으면 다음 출력 시 줄 바꿈
		
		System.out.print(name); //print만 쓸 경우 출력 값 옆에 커서가 있음
		System.out.println(str);
		
		System.out.println("-----------------------------");
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("-------------------------------");
		
		System.out.println(3.2+4.6);
		System.out.println(hello+hello);
		
		//출력 : 고다솜굿모닝굿모닝
		System.out.println(name+hello+hello);
		//출력 : 고다솜 굿모닝 굿모닝 - 띄어쓰기 => (추측) hello에 대입한 것을 "굿모닝"에서 " 굿모닝"으로 변경? - 가능
		System.out.println(name+" "+hello+" "+hello); //공백도 문자
		System.out.println(name+"님 "+hello+hello);
		//출력 : 제 이름은 고다솜 입니다
		System.out.println("제 "+"이름은 "+name+" 입니다.");
		
		System.out.println("----------------------------------------");
		
		System.out.println(i+i); //숫자 더해진 값
		System.err.println(d+d); //숫자 더해진 값
		System.out.println(i+d); //정수가 실수로 바뀌어서 계산
		
		System.out.println(c+c); //(예상) 한한 -> (출력) 숫자 => +를 사용할 경우 숫자(문자열)로 인식하여 연산
		//'한한'으로 출력하고 싶다면?
		String s="한";
		System.out.println(s+s);
		
		System.out.println(name+i); //숫자로 연산
		System.out.println(name+i+d); //앞에서부터 해석 => 전체를 문자열로 인식
		System.out.println(i+d); //이름만 빠지겠지? (X) - 원래 대입한 숫자끼리 더해져 출력
		
		System.out.println("-------------------------------------------------");
		//출력 : 안녕"하"세요
		System.out.println("안녕\"하\"세요"); //"" 문자열의 시작과 끝을 알려주는 기호 -> 중복 사용 불가능 -> \" 사용
		//출력 : 안녕\하\세요
		System.out.println("안녕\\하\\세요");
		//출력 : 안녕 (줄 바꿈) 하세요
		System.out.println("안녕\n하세요"); //'안녕'과 '하세요'를 각각 써도 됨
		//출력 : 안녕	하세요
		System.out.println("안녕\t하세요");
		
		
	}

}
