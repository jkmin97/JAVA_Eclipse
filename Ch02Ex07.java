package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Ex07 {
Scanner scan = new Scanner(System.in);
	public Ch02Ex07() {
		int x1 = 100, y1 = 100, x2 = 200, y2 = 200;
		int x=0, y=0; //����ڰ� x, y ��ǥ�� �Է¹������� �ϴ� ��.
		System.out.print("��(x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if((x>=x1 && x<=x2) && (y>y1 && y<=y2)) {
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
		} else {
			System.out.println("�簢�� �ȿ� �����ϴ�.");
		}
	}
	public static void main(String[] args) {
		new Ch02Ex07();

	}

}
