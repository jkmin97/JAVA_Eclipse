package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02pr03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		String monthString = "";
		
		
		System.out.print("���� �Է��ϼ���(1~12)");
		int answer = scan.nextInt();
		
		switch(answer) {
		case 1 : monthString = "�ܿ�";
			break;
		case 2 : monthString = "�ܿ�";
			break;
		case 3 : monthString = "��";
			break;
		case 4 : monthString = "��";
			break;
		case 5 : monthString = "��";
			break;
		case 6 : monthString = "����";
			break;
		case 7 : monthString = "����";
			break;
		case 8 : monthString = "����";
			break;
		case 9 : monthString = "����";
			break;
		case 10 : monthString = "����";
			break;
		case 11 : monthString = "����";
			break;
		case 12 : monthString = "�ܿ�";
			break;
		default : monthString = "�߸� �Է�";
			break;
		} 
		System.out.print(monthString);
		scan.close();
	}

}
