package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Ex06 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int number = scan.nextInt();
		
		int i = number % 10; // 1의 자리
		int j = number / 10; // 10의 자리
		
		System.out.print("박수");
		if(i%3 == 0) {
			System.out.print("짝");
		}
		if(j%3 == 0) {
			System.out.print("짝");
		}

	}

}
