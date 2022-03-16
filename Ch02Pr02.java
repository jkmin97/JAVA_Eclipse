package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Pr02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>>");
		int answer = scan.nextInt();
		
		if (answer == 3 || answer == 4 || answer == 5) {
			System.out.print("봄");
		} else if (answer == 6 || answer == 7 || answer == 8) {
			System.out.print("여름");
		} else if (answer == 9 || answer == 10 || answer == 11) {
			System.out.print("가을");
		} else if (answer == 12 || answer == 1 || answer == 2) {
			System.out.print("겨울");
		} else {
			System.out.print("잘못 입력");
		}
		scan.close();
	}

}
