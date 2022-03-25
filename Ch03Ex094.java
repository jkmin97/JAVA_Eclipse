package org.comstudy21.day12.Ex09;

import java.util.Scanner;

public class Ch03Ex094 {
   public static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
      int[][] arr = new int[4][4];
      int[][] qArr = new int[4][4];
      
      for(int i=0; i<qArr.length; i++) {
         for(int j=0; j<qArr[i].length; j++) {
            qArr[i][j] = i*4+j+1;
         }
      }
      
      for(int i=0; i<16; ) {
         int row = (int)(Math.random()*4);
         int col = (int)(Math.random()*4);
         if(arr[row][col] == 0) {
            arr[row][col] = i%8+65;
            i++;
         }
      }
      
      // 출력
      for(int i=0; i<4; i++) {
         for(int j=0; j<4; j++) {
            System.out.print((char)arr[i][j]+"\t");
         }
         System.out.println();
      }
      
      // 5초 후에 숨기기
      System.out.println("3초후에 게임 시작");
      int cnt=0;
      while(true) {
         try {
            Thread.sleep(100);
         } catch (InterruptedException e) {
         } // 인터럽트(일시 정지)
         System.out.print(">");
         cnt++;
         if(cnt>=30) break;
      }
      
      int count=0;
      while(true) {
         System.out.println("\n------------------------");
         for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
               if(qArr[i][j] >= 65) {
                  System.out.printf("%c\t", (char)qArr[i][j]);
               } else {
                  System.out.print(qArr[i][j] + "\t");
               }
            }
            System.out.println();
         }
         System.out.print("선택1:");
         int choice1 = scan.nextInt();
         int saveCh = 0, saveRow = 0, saveCol = 0;
         for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
               if(choice1 == qArr[i][j]) {
                  saveCh = arr[i][j];
                  saveRow = i;
                  saveCol = j;
               }
               if(choice1 == qArr[i][j] || qArr[i][j] >= 'A') {
                  System.out.printf("%c", (char)arr[i][j]);
               }else {
                  System.out.printf("%d", qArr[i][j]);
               }
               System.out.print("\t");
            }
            System.out.println();
         }
         System.out.print("선택2:");
         int choice2 = scan.nextInt();
         int saveCh2 = 0, saveRow2 = 0, saveCol2 = 0;
         for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
               if(choice2==qArr[i][j]) {
                  saveCh2 = arr[i][j];
                  saveRow2 = i;
                  saveCol2 = j;
               }
               if(choice1==qArr[i][j] || choice2==qArr[i][j] || qArr[i][j] >= 65) {
                  System.out.printf("%c", (char)arr[i][j]);
               }else {
                  System.out.printf("%d", qArr[i][j]);
               }
               System.out.print("\t");
            }
            System.out.println();
         }
         
         System.out.println(saveCh + ", " + saveCh2);
         if(saveCh == saveCh2) {
            System.out.println("맞췄다! - " + count);
            qArr[saveRow][saveCol] = saveCh;
            qArr[saveRow2][saveCol2] = saveCh;
            count++;
            if(count == 8) break;
         } else {
            System.out.println("틀렸다!");
         }
         // 다시 입력 받도록 반복한다.
      } // end of while
      System.out.println("게임 종료!");      
   }
}

// 주말 과제2 : 성적 출력 프로그램 만들기
/*
----- 성적 관리 프로그램 -----
1) Input 2) Output 3) Search 4) Modify 5) Delete 6) End
Choice : 1
성명 : 홍길동
국어점수 : 80점
영어점수 : 80점
수학점수 : 80점
--- 입력 완료 ---
1) Input 2) Output 3) Search 4) Modify 5) Delete 6) End
Choice : 2
성명 국어 영어 수학 총점 평균 학점 등수
홍길동	80	80	80	240	80.0	B	1
--- 출력 완료 ---
1) Input 2) Output 3) Search 4) Modify 5) Delete 6) End
Choice : 1
성명 : 김길동
국어점수 : 80점
영어점수 : 80점
수학점수 : 80점
--- 입력 완료 ---
1) Input 2) Output 3) Search 4) Modify 5) Delete 6) End
Choice : 3
검색 할 이름 : 홍길동
성명 국어 영어 수학 총점 평균 학점 등수
홍길동	80	80	80	240	80.0	B	1
--- 출력 완료 ---
*/