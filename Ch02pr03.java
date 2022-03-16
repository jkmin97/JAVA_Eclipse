package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02pr03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		String monthString = "";
		
		
		System.out.print("달을 입력하세요(1~12)");
		int answer = scan.nextInt();
		
		switch(answer) {
		case 1 : monthString = "겨울";
			break;
		case 2 : monthString = "겨울";
			break;
		case 3 : monthString = "봄";
			break;
		case 4 : monthString = "봄";
			break;
		case 5 : monthString = "봄";
			break;
		case 6 : monthString = "여름";
			break;
		case 7 : monthString = "여름";
			break;
		case 8 : monthString = "여름";
			break;
		case 9 : monthString = "가을";
			break;
		case 10 : monthString = "가을";
			break;
		case 11 : monthString = "가을";
			break;
		case 12 : monthString = "겨울";
			break;
		default : monthString = "잘못 입력";
			break;
		} 
		System.out.print(monthString);
		scan.close();
	}

}
