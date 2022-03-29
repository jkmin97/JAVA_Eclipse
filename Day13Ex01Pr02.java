package org.comstudy21.day13;

import java.io.IOException;
import java.util.Scanner;

public class Day13Ex01Pr02 {
	// �迭 �ʵ� ����
	final int MAX = 5;
	String[] name, grade;
	int[] kor, eng, mat, score, avg, rank;
	int top;
	Scanner scan = new Scanner(System.in);
	
	public Day13Ex01Pr02() {
		name = new String[MAX];
		kor = new int[MAX];
		eng = new int[MAX];
		mat = new int[MAX];
		score = new int[MAX];
		avg = new int[MAX];
		grade = new String[MAX];
		rank = new int[MAX];
		top = 0;
		
		boolean keepGo = true;
		while(keepGo) {
			keepGo = controller();
		}
		System.out.println("���α׷� ���� : �ȳ��� ������");
	}
	
	
	
	public int menu() {
		int answer = 0;
		System.out.println("1)INPUT 2)OUTPUT 3)SEARCH 4)MODIFY 5)DELETE 6)END");
		System.out.print("Choice : ");
		answer  = scan.nextInt();
		return answer;
	}
	
//	public void print(String str) {
//		System.out.print(str);
//	}
//	
//	public void println(String str) {
//		System.out.println(str);
//	}
//	���� �ٽ� ���� �ٽ� �����ϱ�.****************
	
	public void inputData(String n, int k, int e, int m) {
		name[top] = n;
		kor[top] = k;
		eng[top] = e;
		mat[top] = m;
	}
	
	public int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while((ch = System.in.read())!='\n') {
				if(ch >= '0' && ch <= '9') {
					num = num * 10 + ch -'0';
				}
		}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		return num;
	}
	
	public int getIntScore(String message) {
		System.out.print(message);
		int score = getNum();
		while(score < 0 || score > 100) {
			System.out.print("0~100 ���� �ٽ� �Է�: ");
			score = getNum();
		}
		return score;
	}
	
	public void input() {
		System.out.println("::: INPUT :::");
		if(top >= MAX) {
			System.out.println("��� : �� �̻� �Է� �Ұ���");
			return;
		}
		System.out.print("���� : ");
		String n = scan.next();
		int k = getIntScore("�������� : ");
		int e = getIntScore("�������� : ");
		int m = getIntScore("�������� : ");
		inputData(n, k, e, m);
	}
	
	public boolean hasData() {
		if(top <= 0) {
			System.out.println("��� : ������ �����ϴ�!");
			return false;
		}
		return true;
	}
	
	public void output() {
		System.out.println("::: OUTPUT :::");
		if(!hasData()) return;
		System.out.printf("����\t����\t����\t����\t����\t���\t����\t���\n");
		for(int i = 0; i < top; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\n", 
					name[i], kor[i], eng[i], mat[i], score[i], avg[i], 
					grade[i], rank[i]);
		}
	}
	
	public void findByName() {
		if(!hasData()) return;
	      searchIndex = new int[top];
	      searCnt = 0;
	      System.out.print("�˻� �̸� �Է�: ");
	      String sName = scan.next();
	      for(int i=0; i<top; i++) {
	         if(sName.equals(name[i])) {
	            searchIndex[searCnt++] = i;
	         }
	      }
	      if(searCnt == 0) {
	         System.out.println("�˻� ��� ����");
	         return;
	      }
	      System.out.printf("��ȣ\t����\t����\t����\t����\t����\t���\t����\t���\n");
	      for(int i=0; i<searCnt; i++) {
	         int idx = searchIndex[i];
	         System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\n", 
	               idx,name[idx],kor[idx],eng[idx],mat[idx],score[idx],avg[idx],grade[idx],rank[idx]);
	      }
	}
	
	int[] searchIndex;
	int searCnt;
	public void search() {
		System.out.println("::: SEARCH :::");
		findByName();
	}
	
	public void modify() {
		System.out.println("::: MODIFY :::");
		findByName();
		System.out.print("���� ������ ��ȣ �Է�: ");
		int mIndex = getNum();
	}
	
	public void delete() {
		
	}
	
	public boolean controller() {
		boolean keepGo = true;
		int answer = menu();
		switch(answer) {
		case 1: input(); break;
		case 2: output(); break;
		case 3: search(); break;
		case 4: modify(); break;
		case 5: delete(); break;
		case 6: 
			System.out.println("::: END :::");
			keepGo = false;
			break;
			default : System.out.println("��� : �ش� �޴��� ����.");
		}
		return keepGo;
	}
	
	public static void main(String[] args) {
		new Day13Ex01Pr02();
		
	}

}
