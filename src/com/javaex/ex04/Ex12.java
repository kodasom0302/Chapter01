package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		
		for (int no=1; no<=20; no++) {
			if (no%2==0 || no%3==0) {
				continue;
			} else {
				System.out.println(no);
			}
		}

	}

}
/*
for (int i=1; i<20; i++)
	if (i%2==0 || i%3==0) {
		continue;
	}
	System.out.println(i);
*/
/*
for (int i=1; i<20; i++)
	if (i%2==0 || i%3==0) {
	
	} else {
		System.out.println(i);
	}
*/
/*
for (int i=1; i<20; i++) {
	if (!(i%2==0||i%3==0)) {
		System.out.println(i);
	}
}
*/