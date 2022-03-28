package org.comstudy21.day13;

import java.io.IOException;
import java.util.Scanner;

public class Day13Ex01Homework {
	//�迭 �ʵ� ����
	final int MAX = 5;
	String[] name, grade;
	int[] kor, eng, mat, total, rank;
//	int[] eng;
//	int[] mat;
//	int[] total;
	double[] avg;
//	String[] grade; // A+, B+�� ���� ��Ȳ�� ���� �� �ֱ⿡ char���ٴ� String
//	int[] rank;
	int top; // 0��°���� �Է� �ޱ�
	Scanner scan;
	
	
	public Day13Ex01Homework() { 
		// 2. Default ������ : ��� �ʵ� �ʱ�ȭ �� ����
		name = new String[MAX];
		kor = new int[MAX];
		eng = new int[MAX];
		mat = new int[MAX];
		total = new int[MAX];
		avg = new double[MAX];
		grade = new String[MAX]; // A+, B+�� ���� ��Ȳ�� ���� �� �ֱ⿡ char���ٴ� String
		rank = new int[MAX];
		scan = new Scanner(System.in);
		top = 0; // 0��°���� �Է� �ޱ�
		
		// �׽�Ʈ�� �ʱⰪ ����
		inputData("KIM", 65, 95, 100);
		inputData("LEE", 100, 100, 100);
		inputData("PARK", 85, 95, 100);
		inputData("KANG", 100, 100, 90);
		
		// 3. ��Ʈ�ѷ� �ݺ� ���� : ��Ʈ�ѷ����� ���Ḧ �����ϸ� false�� ��ȯ��.
		boolean isGo = true;
		while(isGo) {
			isGo = controller();
		}
		// 4. ���� �� �������� ����.
		System.out.println("���α׷� ���� : �ȳ��� ������");
	}
	
	public int menu() {
		int no = 0;
		System.out.println("1)INPUT 2)OUTPUT 3)SEARCH 4)MODIFY 5)DELETE 6)END");
		System.out.print("Choice : ");
		no = scan.nextInt();
		return no;
	}
	
	public void print(String str) {
		System.out.print(str);
	}
	
	public void println(String str) {
		System.out.println(str);
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
		print(message);
		int score = getNum();
		while(score < 0 || score > 100) {
			print("0~100 ���� �ٽ� �Է�: ");
			score = getNum();
		}
		return score;
	}
	
	public String mkGrade(double avg) {
		String grade = "F";
		if(avg >= 90) {
			grade = "A";
		} else if(avg >= 80) {
			grade = "B";
		} else if(avg >= 70) {
			grade = "C";
		} else if(avg >= 60) {
			grade = "D";
		}
		int c = (int) avg % 10;
		if(avg >= 60 && c > 7 || avg == 100) {
			grade += "+";
		} else if(avg >= 60 && c <= 3) {
			grade += "-";
		}
		return grade;
	}
	
	public void setRank() {
		for(int i = 0; i < top; i++) {
			rank[i] = 1;
			for(int j = 0; j < top; j++) {
				if(avg[i]< avg[j]) {
					rank[i]++;
				}
			}
		}
	}
	
	public void calc(int index) {
		// ����, ���, ����, ��� ���
		total[index] = kor[index] + eng[index] + mat[index];
		avg[index] = total[index] / (double)3;
		grade[index] = mkGrade(avg[index]);
		
	}
	
	public void inputData(String n, int k, int e, int m) {
		name[top] = n;
		kor[top] = k;
		eng[top] = e;
		mat[top] = m;
	}
	
	public void input() {
		println("::: INPUT :::");
		// top������ �迭�� �����͸� �Է� �޴´�.
		// ����, ����, ����, ���� ������ �Է� �޾Ƽ� ����, ���, ����, ����� ����Ѵ�.
		// top ����
		// top�� MAX���� ũ�ų� ������ �� �̻� �Է� �Ұ���.
		if (top >= MAX) {
			println("��� : �� �̻� �Է� �Ұ���");
			return; // ���⼭ �Լ��� ������. �Ʒ� �κ� ���� �� ��.
		}
		print("���� : ");
		String n = scan.next();
		int k = getIntScore("�������� : ");
		int e = getIntScore("�������� : ");
		int m = getIntScore("�������� : ");
		
//		print("���� : ");
//		kor[top] = scan.nextInt();
//		print("���� : ");
//		mat[top] = scan.nextInt();
//		print("���� : ");
//		eng[top] = scan.nextInt();
//		total[top] = kor[top] + mat[top] + eng[top];
//		avg[top] = total[top]/3;
//		if(avg[top] >= 90) {
//			grade[top] = "A";
//		} else if(avg[top] >= 80 && avg[top] < 90) {
//			grade[top] = "B";
//		} else if(avg[top] >= 70 && avg[top] < 80) {
//			grade[top] = "C";
//		} else if(avg[top] >= 60 && avg[top] < 70) {
//			grade[top] = "D";
//		} else if(avg[top] < 60) {
//			grade[top] = "F";
//		}
//		for(int i = 0; i < avg.length; i++) {
//			for(; ;) {
//				
//			}
//		}
//		calc(top);
//		// �Է��� ������ top�� �����ϰ�
//		top++;
//		// top ���� �� ��� ���
//		setRank();
		// 2�� �̻� ���Ǳ� ������ �Լ��� �и��Ͽ���.
		inputData(n, k, e, m);
	}
	
	public boolean hasData() {
		if(top <= 0) {
			println("��� : ������ �����ϴ�!");
			return false;
		}
		return true;
	}
	
	public void output() {
		System.out.println("::: OUTPUT :::");
		// ���� �迭�� ��� ���� �� �྿ ����Ѵ�.
		// System.out.printf() Ȱ���Ѵ�.
		if(!hasData()) return;
		System.out.printf("����\t����\t����\t����\t����\t���\t����\t���\n");
		for(int i = 0; i < top; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\n", 
					name[i], kor[i], eng[i], mat[i], total[i], avg[i], grade[i], rank[i]);
		}
//		System.out.println(name[top] + "\t" + kor[top] + "\t" + mat[top] + "\t" + eng[top] + 
//				"\t" + total[top] + "\t" + avg[top] + "\t" + grade[top] + "\t" + rank[top]);
		
	}
	
	int[] searchIndex;
	int searCnt;
	public void search() {
		System.out.println("::: SEARCH :::");
		findByName();
	}
		
	public void findByName() {
		if(!hasData()) return;
	      searchIndex = new int[top];
	      searCnt = 0;
	      print("�˻� �̸� �Է�: ");
	      String sName = scan.next();
	      for(int i=0; i<top; i++) {
	         if(sName.equals(name[i])) {
	            searchIndex[searCnt++] = i;
	         }
	      }
	      if(searCnt == 0) {
	         println("�˻� ��� ����");
	         return;
	      }
	      System.out.printf("��ȣ\t����\t����\t����\t����\t����\t���\t����\t���\n");
	      for(int i=0; i<searCnt; i++) {
	         int idx = searchIndex[i];
	         System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\n", 
	               idx,name[idx],kor[idx],eng[idx],mat[idx],total[idx],avg[idx],grade[idx],rank[idx]);
	      }
	}
		// 1. �̸����� �˻�
		// 2. �������� ó��
		// 3. �˻� ���(���� output() ���Ȱ��)
		// 4. �˻� ��� index�� �����ϴ� �迭�� �����.
	

	public void modify() {
		System.out.println("::: MODIFY :::");
		// 1. search�Ѵ�.
		findByName();
		// 2. ���� index�� �����Ѵ�.
		print("���� ������ ��ȣ �Է�: ");
		int mIndex = getNum();
		// 3. �Է��� index�� search ����� �ִ��� Ȯ���Ѵ�.
		// 4. ����� �ִٸ� �� ���� �Է�
		// 5. ������ �����Ѵ�.
		
	}
	
	public void delete() {
		System.out.println("::: DELETE :::");
	}
	
	public boolean controller() {
		boolean isOk = true;
		int no = menu();
		switch (no) {
		case 1 : input(); break;
		case 2 : output(); break;
		case 3 : search(); break;
		case 4 : modify(); break;
		case 5 : delete(); break;
		case 6 : System.out.println("::: END :::");
			isOk = false;
			break;
		default : System.out.println("��� : �ش� �޴� ����.");
		}
		
		return isOk;
	}
	
	public static void main(String[] args) {
		// 1. ���� : �����ڸ� �̿��� ��ü ����
		new Day13Ex01Homework();
	}
}
