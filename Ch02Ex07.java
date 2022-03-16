package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Ex07 {
Scanner scan = new Scanner(System.in);
	public Ch02Ex07() {
		int x1 = 100, y1 = 100, x2 = 200, y2 = 200;
		int x=0, y=0; //사용자가 x, y 좌표를 입력받으려고 하는 것.
		System.out.print("점(x,y)의 좌표를 입력하시오>>");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if((x>=x1 && x<=x2) && (y>y1 && y<=y2)) {
			System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");
		} else {
			System.out.println("사각형 안에 없습니다.");
		}
	}
	public static void main(String[] args) {
		new Ch02Ex07();

	}

}
