package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Pr02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int answer = scan.nextInt();
		
		if (answer == 3 || answer == 4 || answer == 5) {
			System.out.print("��");
		} else if (answer == 6 || answer == 7 || answer == 8) {
			System.out.print("����");
		} else if (answer == 9 || answer == 10 || answer == 11) {
			System.out.print("����");
		} else if (answer == 12 || answer == 1 || answer == 2) {
			System.out.print("�ܿ�");
		} else {
			System.out.print("�߸� �Է�");
		}
		scan.close();
	}

}
