package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02game {
	String name = "���������� ����";
	// ����� �����Ѵ�.
	final String ���� = "����", ����= "����", ��= "��";
	Scanner scan = new Scanner(System.in);
	public Ch02game() {
		// �����ڰ� ���� ������� default(�⺻) ������
		// ������ - ��ü�� ����� �ʱ�ȭ�ϴ� ���� 
		// ��ü ������ �ڵ����� ȣ��(new ���� �ڵ����� ȣ��).
		// TDD - �׽�Ʈ �ֵ� ����
		//System.out.println("����Ʈ ������ ȣ��");
		// ��ü�� ����̹Ƿ� static�� ������� ���� ����� ȣ�� �����ϴ�.
		String user1Name = "ö��";
		String user2Name = "����";
		System.out.println("::: " + name + " :::");
		System.out.print(user1Name + " >> ");
		String user1 = scan.next();
		System.out.print(user2Name + " >> ");
		String user2 = scan.next();
		// ���������� ��
		switch(user1) {
		case ���� :
			switch(user2) {
			case ���� : System.out.println(user2Name+"�� �̰��");
				break;
			case �� : System.out.println(user1Name+"�� �̰��");
			}
			break;
		case ���� : 
			switch(user2 ) {
			case ���� : System.out.println(user1Name+"�� �̰��");
			break;
			case �� : System.out.println(user2Name +"�� �̰��");
			}
			break;
		case �� :
			switch(user2) {
			case ���� : System.out.println(user1Name+"�� �̰��");
			break;
			case ���� : System.out.println(user2Name+"�� �̰��");
			}
		}
		if (user1.equals(user2)) System.out.println("����");
	}

	public static void main(String[] args) {
		// Ch02game Ŭ������ ��ü ���� - �����ڰ� �ڵ� ȣ��
		// main�� �ۼ����� �ʰ� Constructor�� �����Ѵ�.
		new Ch02game(); // <-- Ŭ������ �����ڸ� ȣ��(��ü ����)

	}

}

// ���� ������ ������ ����� ������ ����.
// ���� ������ = ���� ������