package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02game {
	String name = "가위바위보 게임";
	// 상수를 선언한다.
	final String 가위 = "가위", 바위= "바위", 보= "보";
	Scanner scan = new Scanner(System.in);
	public Ch02game() {
		// 개발자가 직접 만들어준 default(기본) 생성자
		// 생성자 - 객체의 멤버를 초기화하는 역할 
		// 객체 생성시 자동으로 호출(new 사용시 자동으로 호출).
		// TDD - 테스트 주도 개발
		//System.out.println("디폴트 생성자 호출");
		// 객체의 멤버이므로 static을 사용하지 않은 멤버도 호출 가능하다.
		String user1Name = "철수";
		String user2Name = "영희";
		System.out.println("::: " + name + " :::");
		System.out.print(user1Name + " >> ");
		String user1 = scan.next();
		System.out.print(user2Name + " >> ");
		String user2 = scan.next();
		// 가위바위보 비교
		switch(user1) {
		case 가위 :
			switch(user2) {
			case 바위 : System.out.println(user2Name+"가 이겼다");
				break;
			case 보 : System.out.println(user1Name+"가 이겼다");
			}
			break;
		case 바위 : 
			switch(user2 ) {
			case 가위 : System.out.println(user1Name+"가 이겼다");
			break;
			case 보 : System.out.println(user2Name +"가 이겼다");
			}
			break;
		case 보 :
			switch(user2) {
			case 바위 : System.out.println(user1Name+"가 이겼다");
			break;
			case 가위 : System.out.println(user2Name+"가 이겼다");
			}
		}
		if (user1.equals(user2)) System.out.println("비겼다");
	}

	public static void main(String[] args) {
		// Ch02game 클래스의 객체 생성 - 생성자가 자동 호출
		// main에 작성하지 않고 Constructor에 구현한다.
		new Ch02game(); // <-- 클래스의 생성자를 호출(객체 생성)

	}

}

// 정수 나누기 정수의 결과는 무조건 정수.
// 조건 연산자 = 삼항 연산자