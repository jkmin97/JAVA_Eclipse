package org.comstudy21.day08.homework;

public class HomeWork01 {

	public static void main(String[] args) {
		// ex02 다른 방식으로 만들기
		for(int i = 0; i < 9; i++) {
			int size = i <= 4 ? i+1: 9-i;
			for(int j = 0; j < size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void ex02(String[] args) {
		/*  i < 9
		 0	*
		 1	**
		 2	***
		 3	****
		 4	*****
		 5	****
		 6	***
		 7	**
		 8	*
		*/
		int cnt = 1;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
			cnt = i < 4 ? cnt+1: cnt-1;
		}
	}
	
	public static void ex01(String[] args) {
		/* ***** 5-i(0)
		   ****	 5-i(1)
		   ***   5-i(2)
		   **    5-i(3)
		   *     5-i(4)
		*/
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
