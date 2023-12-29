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
/*
while (false) => 코드 돌아가는데 출력 X
break - 조건 맞으면 밑에 실행 X => 출력 : 1 2 3
false 변수 설정 - 조건 맞으면 밑에 일 실행하지만 그 다음에 못 들어가게 함 => 출력 : 1 2 3 4
if (flag)
	flag=false
*/