package org.comstudy21.day08.homework;

public class HomeWork02 {

	public static void HomeWork08(String[] args) {
		/*
		 		*		*
		 	   ***	   ***
		 	  *****	  *****
		 	 ******* *******
		 	*****************
		 */
	}
	
	public static void HoemWork07(String[] args) {
		/*	숙제 7
		 	*********
		 	 *******
		 	  *****
		 	   ***
		 	    *
		 	   ***
		 	  *****
		 	 *******
		 	*********
		 */
	}
	
	public static void HomeWork06(String[] args) {
		/*	숙제 6 : 크기입력(홀수만) 9 -- 숙제 5번하고 같이 찍히게 하기.
		 	*********
		 	**     **
		 	* *   * *
		 	*  * *  *
		 	*   *   *
		 	*  * *  *
		 	* *   * *
		 	**     **
		 	*********
		 */
	}
	
	public static void HomeWork05(String[] args) {
		/*	숙제 5 : 크기입력(홀수만) : 9
		 	*********
		 	*  * *  *
		 	* *   * *
		 	**     **
		 	*       *
		 	**     **
		 	* *   * *
		 	*  * *  *
		 	*********
		 */
	}
	
	public static void test2(String[] args) {
		/*	숙제 4
		 	*********
		 	**** ****
		 	***   ***
		 	**     **
		 	*       *
		 	**     **
		 	***   ***
		 	**** ****
		 	*********       
		 */
		for(int i = 0; i < 9; i++) {
			int size = i < 5 ? 5-i : i-3;
			int size1 = i < 4 ? 4-i : i-3;
			for(int j = 0; j < 5; j++) {
			}
			for(int j = 5; j < 5; j++) {
//				System.out.print(j < size1 ? "*" : " ");
				System.out.printf(j < size ? "*" : " ", j < size1 ? "*" : "^");
			}
			System.out.println();
		}
		for(int i = 0; i < 9; i++) {
			
			
		}
//		System.out.println();
	}
	
	public static void main(String[] args) {
		/*	숙제 3
		 	
		 	^^^^*
		 	^^^***
		 	^^*****
		 	^*******
		 	*********
		 	^*******
		 	^^*****
		 	^^^***
		 	^^^^*
		 	
		 */
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 4-i; j++) {
				System.out.print("^");
			}
			for(int j = 0; j < 9-(2*i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void HomeWork02(String[] args) {
		/*	숙제 2
		 	*********
		 	^*******
		 	^^*****
		 	^^^***
		 	^^^^*
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("^");
			}
			for(int j = 0; j < 9-(2*i); j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	
	public static void ex05(String[] args) {
		/*
		 	^^^^*
		 	^^^***
		 	^^*****
		 	^*******
		 	*********
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4-i; j++) {
				System.out.print("^");
			}
			for(int j = 0; j < (i+1)*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void HomeWork01(String[] args) {
		/*	숙제 1
		 	^^^^*	i가 0일 때, 공백 4개, 별 1개
		 	^^^**	i가 1일 때, 공백 3개, 별 2개
		 	^^***	i가 2일 때, 공백 2개, 별 3개
		 	^****	i가 3일 때, 공백 1개, 별 4개
		 	*****	i가 4일 때, 공백 0개, 별 5개
		 	^****	i가 5일 때, 공백 1개, 별 4개
		 	^^***	i가 6일 때, 공백 2개, 별 3개
		 	^^^**	i가 7일 때, 공백 3개, 별 2개
		 	^^^^*	i가 8일 때, 공백 4개, 별 1개
		 */
		for(int i = 0; i < 9; i++) {
			int size = i < 4 ? 4-i : i-4; 
			for(int j = 0; j < 5; j++) {
				System.out.print(j < size ? "^" : "*");
			}
//			for(int j = 0; j < i+1; j++) {
//				System.out.print("*");
//			}
			System.out.println();
		}
	}
	
	public static void ex04(String[] args) {
		/*
	 		*****	j가 0일 때, 별은 5개
	 		^****	j가 1일 때, 공백 1개, 별은 4개
	 		^^***	j가 2일 때, 공백 2개, 별은 3개
	 		^^^**	j가 3일 때, 공백 3개, 별은 2개
	 		^^^^*	j가 4일 때, 공백 4개, 별은 1개
	 		^^^**	j가 3일 때, 공백 3개, 별은 2개
	 		^^***	j가 2일 때, 공백 2개, 별은 3개
	 		^****	j가 1일 때, 공백 1개, 별은 4개
	 		*****	j가 0일 때, 별은 5개
	 	*/
		for(int row = 0; row < 9; row++) {
			int size = row < 4 ? row : 8 - row;
			for(int col = 0; col < 5; col++) {
				System.out.print(col < size ? "^" : "*");
			}
			System.out.println();
		}
	}
	
	public static void ex03(String[] args) {
		/*
		 	*****	j가 0일 때, 별은 5개
		 	^****	j가 1일 때, 공백 1개, 별은 4개
		 	^^***	j가 2일 때, 공백 2개, 별은 3개
		 	^^^**	j가 3일 때, 공백 3개, 별은 2개
		 	^^^^*	j가 4일 때, 공백 4개, 별은 1개
		 	^^^**	j가 3일 때, 공백 3개, 별은 2개
		 	^^***	j가 2일 때, 공백 2개, 별은 3개
		 	^****	j가 1일 때, 공백 1개, 별은 4개
		 	*****	j가 0일 때, 별은 5개
		 */
		int cntJ = 0;
		int cntK = 5;
		
		for(int i = 1; i <= 9; i++) {
//			System.out.println(cntJ + ", " + cntK);
			for(int j = 1; j <= 5; j++)
				System.out.print(j <= cntJ ? "^" : "*");
//			for(int k = 1; k <= cntK; k++) {
//				System.out.print("*");
//			}
			System.out.println();
			cntJ = i < 5 ? cntJ + 1 : cntJ - 1;
//			cntK = i < 5 ? 5 - i : i - 3;
		}
		
	}
	
	public static void ex02(String[] args) {
		/*
		 	*****	j가 0일 때, 별은 5.
		 	^****	j가 1일 때, 공백은 1, 별은 4.
		 	^^***	j가 2일 때, 공백은 2, 별은 3.
		 	^^^**	j가 3일 때, 공백은 3, 별은 2.
		 	^^^^*	j가 4일 때, 공백은 4, 별은 1.
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 5-i; j++) {
				System.out.print(j < i ? "^" : "*");
			}
//			for(int j = 0; j < 5-i; j++) {
//				System.out.print("*");
//			}
			System.out.println();
		}
	}
	
	public static void ex01(String[] args) {
		/*
		 	^^^^*
		 	^^^**
		 	^^***
		 	^****
		 	*****
		 */
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 4-i + i+1; j++) {
					System.out.print(j < 4-i ? "^" : "*");
				}
				System.out.println();
			}
	}

}
