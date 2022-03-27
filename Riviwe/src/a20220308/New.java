package a20220308;

import java.util.Scanner;

public class New {
	

		public static void main(String[] args) {
			// 예약좌석이 10개있다. 예약안된좌석은 0으로 표현 , 예약하고싶은 좌석번호 입력을 하면 빈자리면 예약됨 빈자리가 아니면 이미예약됨 다시 예약해주세요 종료를원하면 -1
			// 예약 현황이 보여야함 예약죄면 1로 바뀌어야함
			Scanner sc = new Scanner(System.in);
			int i = 0;
			int[] sit = new int[10];
			
			
			
			
			System.out.println(" 좌석번호 : 1 2 3 4 5 6 7 8 9 10 ");
			System.out.println("----------------------------------");
			System.out.println(" 예약현황 : 0 0 0 0 0 0 0 0 0 0 ");
			System.out.println("----------------------------------");
			System.out.println("예약할 좌석 번호를 입력 해주세요.>>");
			
			for ( i= 0 ; i < sit.length ; i++ ) {
				sit[i]=0;
			}
			while(true) {
			int a =sc.nextInt();
			if(sit[a-1]==0) {
				sit[a-1] = 1;
				System.out.println("선잭한 좌석이 예약 되었습니다.");
			}else if(sit[a-1]==1) {
				System.out.println("예약이 불가 합니다.");
				System.out.println("다른 좌석을 선택 해 주세요");
			}else {
				break;
			
			}
			System.out.println(" 좌석번호 : 1 2 3 4 5 6 7 8 9 10 ");
			System.out.println("----------------------------------");
			System.out.println(" 예약현황 : " + sit[0]+ " "+ sit[1]+" "+ sit[2]+" "+ sit[3]+" "+ sit[4]+" "+ sit[5]+" "+ sit[6]+" "+ sit[7]+" "+ sit[8]+" "+ sit[9]);
			System.out.println("----------------------------------");
			System.out.println("다른 좌석을 예약 하시겠습니까? (1 = 네 /-1 = 아니요)");
			int b = sc.nextInt();
			if(b==-1) {
				break;
			}else {
				System.out.println("예약할 좌석 번호를 입력 해주세요.>>");
				}
		}
			
			
			}
			
			
	}
