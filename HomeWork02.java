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
		/*	���� 7
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
		/*	���� 6 : ũ���Է�(Ȧ����) 9 -- ���� 5���ϰ� ���� ������ �ϱ�.
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
		/*	���� 5 : ũ���Է�(Ȧ����) : 9
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
		/*	���� 4
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
		/*	���� 3
		 	
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
		/*	���� 2
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
		/*	���� 1
		 	^^^^*	i�� 0�� ��, ���� 4��, �� 1��
		 	^^^**	i�� 1�� ��, ���� 3��, �� 2��
		 	^^***	i�� 2�� ��, ���� 2��, �� 3��
		 	^****	i�� 3�� ��, ���� 1��, �� 4��
		 	*****	i�� 4�� ��, ���� 0��, �� 5��
		 	^****	i�� 5�� ��, ���� 1��, �� 4��
		 	^^***	i�� 6�� ��, ���� 2��, �� 3��
		 	^^^**	i�� 7�� ��, ���� 3��, �� 2��
		 	^^^^*	i�� 8�� ��, ���� 4��, �� 1��
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
	 		*****	j�� 0�� ��, ���� 5��
	 		^****	j�� 1�� ��, ���� 1��, ���� 4��
	 		^^***	j�� 2�� ��, ���� 2��, ���� 3��
	 		^^^**	j�� 3�� ��, ���� 3��, ���� 2��
	 		^^^^*	j�� 4�� ��, ���� 4��, ���� 1��
	 		^^^**	j�� 3�� ��, ���� 3��, ���� 2��
	 		^^***	j�� 2�� ��, ���� 2��, ���� 3��
	 		^****	j�� 1�� ��, ���� 1��, ���� 4��
	 		*****	j�� 0�� ��, ���� 5��
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
		 	*****	j�� 0�� ��, ���� 5��
		 	^****	j�� 1�� ��, ���� 1��, ���� 4��
		 	^^***	j�� 2�� ��, ���� 2��, ���� 3��
		 	^^^**	j�� 3�� ��, ���� 3��, ���� 2��
		 	^^^^*	j�� 4�� ��, ���� 4��, ���� 1��
		 	^^^**	j�� 3�� ��, ���� 3��, ���� 2��
		 	^^***	j�� 2�� ��, ���� 2��, ���� 3��
		 	^****	j�� 1�� ��, ���� 1��, ���� 4��
		 	*****	j�� 0�� ��, ���� 5��
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
		 	*****	j�� 0�� ��, ���� 5.
		 	^****	j�� 1�� ��, ������ 1, ���� 4.
		 	^^***	j�� 2�� ��, ������ 2, ���� 3.
		 	^^^**	j�� 3�� ��, ������ 3, ���� 2.
		 	^^^^*	j�� 4�� ��, ������ 4, ���� 1.
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
