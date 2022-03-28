package org.comstudy21.day13;

import java.io.IOException;
import java.util.Scanner;

public class Day13Ex01Homework {
	//배열 필드 생성
	final int MAX = 5;
	String[] name, grade;
	int[] kor, eng, mat, total, rank;
//	int[] eng;
//	int[] mat;
//	int[] total;
	double[] avg;
//	String[] grade; // A+, B+과 같은 상황이 생길 수 있기에 char보다는 String
//	int[] rank;
	int top; // 0번째부터 입력 받기
	Scanner scan;
	
	
	public Day13Ex01Homework() { 
		// 2. Default 생성자 : 멤버 필드 초기화 및 실행
		name = new String[MAX];
		kor = new int[MAX];
		eng = new int[MAX];
		mat = new int[MAX];
		total = new int[MAX];
		avg = new double[MAX];
		grade = new String[MAX]; // A+, B+과 같은 상황이 생길 수 있기에 char보다는 String
		rank = new int[MAX];
		scan = new Scanner(System.in);
		top = 0; // 0번째부터 입력 받기
		
		// 테스트용 초기값 설정
		inputData("KIM", 65, 95, 100);
		inputData("LEE", 100, 100, 100);
		inputData("PARK", 85, 95, 100);
		inputData("KANG", 100, 100, 90);
		
		// 3. 컨트롤러 반복 실행 : 컨트롤러에서 종료를 선택하면 false가 반환됨.
		boolean isGo = true;
		while(isGo) {
			isGo = controller();
		}
		// 4. 종료 후 보여지는 문장.
		System.out.println("프로그램 종료 : 안녕히 가세요");
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
			print("0~100 사이 다시 입력: ");
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
		// 총점, 평균, 학점, 등수 계산
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
		// top번지의 배열에 데이터를 입력 받는다.
		// 성명, 국어, 영어, 수학 점수를 입력 받아서 총점, 평균, 학점, 등수를 계산한다.
		// top 증가
		// top이 MAX보다 크거나 같으면 더 이상 입력 불가능.
		if (top >= MAX) {
			println("경고 : 더 이상 입력 불가능");
			return; // 여기서 함수를 끝낸다. 아랫 부분 실행 안 함.
		}
		print("성명 : ");
		String n = scan.next();
		int k = getIntScore("국어점수 : ");
		int e = getIntScore("영어점수 : ");
		int m = getIntScore("수학점수 : ");
		
//		print("국어 : ");
//		kor[top] = scan.nextInt();
//		print("수학 : ");
//		mat[top] = scan.nextInt();
//		print("영어 : ");
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
//		// 입력이 끝나면 top을 증가하고
//		top++;
//		// top 증가 후 등수 계산
//		setRank();
		// 2번 이상 사용되기 때문에 함수로 분리하였다.
		inputData(n, k, e, m);
	}
	
	public boolean hasData() {
		if(top <= 0) {
			println("경고 : 내용이 없습니다!");
			return false;
		}
		return true;
	}
	
	public void output() {
		System.out.println("::: OUTPUT :::");
		// 각각 배열의 요소 값을 한 행씩 출력한다.
		// System.out.printf() 활용한다.
		if(!hasData()) return;
		System.out.printf("성명\t국어\t영어\t수학\t총점\t평균\t학점\t등수\n");
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
	      print("검색 이름 입력: ");
	      String sName = scan.next();
	      for(int i=0; i<top; i++) {
	         if(sName.equals(name[i])) {
	            searchIndex[searCnt++] = i;
	         }
	      }
	      if(searCnt == 0) {
	         println("검색 결과 없음");
	         return;
	      }
	      System.out.printf("번호\t성명\t국어\t영어\t수학\t총점\t평균\t학점\t등수\n");
	      for(int i=0; i<searCnt; i++) {
	         int idx = searchIndex[i];
	         System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\n", 
	               idx,name[idx],kor[idx],eng[idx],mat[idx],total[idx],avg[idx],grade[idx],rank[idx]);
	      }
	}
		// 1. 이름으로 검색
		// 2. 동명이인 처리
		// 3. 검색 목록(기존 output() 기능활용)
		// 4. 검색 결과 index를 저장하는 배열을 만든다.
	

	public void modify() {
		System.out.println("::: MODIFY :::");
		// 1. search한다.
		findByName();
		// 2. 수정 index를 선택한다.
		print("수정 내용의 번호 입력: ");
		int mIndex = getNum();
		// 3. 입력한 index가 search 결과에 있는지 확인한다.
		// 4. 결과가 있다면 새 정보 입력
		// 5. 정보를 갱신한다.
		
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
		default : System.out.println("경고 : 해당 메뉴 없음.");
		}
		
		return isOk;
	}
	
	public static void main(String[] args) {
		// 1. 시작 : 생성자를 이용한 객체 생성
		new Day13Ex01Homework();
	}
}
