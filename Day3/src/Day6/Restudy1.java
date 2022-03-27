package Day6;

import java.util.Scanner;

public class Restudy1 {

	public static void main(String[] args) {
		// 예약좌석이 10개있다. 예약안된좌석은 0으로 표현 , 예약하고싶은 좌석번호 입력을 하면 빈자리면 예약됨 빈자리가 아니면 이미예약됨 다시 예약해주세요 종료를원하면 -1
		// 예약 현황이 보여야함 예약죄면 1로 바뀌어야함
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int[] sit = new int[10];
		
		int v = sit[i];
		
		
		System.out.println(" 좌석번호 : 1 2 3 4 5 6 7 8 9 10 ");
		System.out.println("----------------------------------");
		System.out.println(" 예약현황 : 0 0 0 0 0 0 0 0 0 0 ");
		System.out.println("----------------------------------");
		System.out.println("예약할 좌석 번호를 입력 해주세요.>>");
		
		for ( i= 0 ; i < sit.length ; i++ ) {
			sit[i]=0;
		}
		
		
	    switch(sc.nextInt()) {	
		    case 1: 
				if(v == 0) {
					sit[0]=1;
					System.out.println(sit[0]+"번 좌석이 예약이 되었습니다.");
				}else{
					System.out.println("이미 예약된 좌석입니다,");
				}
				break;
			case 2:
				if(v==0) {
					sit[1]=1;
					System.out.println((sit[1]+1)+"번 좌석이 예약이 되었습니다.");
				}else{
					System.out.println("이미 예약된 좌석입니다,");
				}
				break;
			case 3:
				if(sit[2]==0) {
					sit[2]=1;
					System.out.println((sit[2]+1)+"번 좌석이 예약이 되었습니다.");
				}else{
					System.out.println("이미 예약된 좌석입니다,");
				}
				break;
			case 4:
				if(sit[3]==0) {
					sit[3]=1;
					System.out.println((sit[3]+1)+"번 좌석이 예약이 되었습니다.");
				}else{
					System.out.println("이미 예약된 좌석입니다,");
				}
				break;
			case 5:
				if(sit[4]==0) {
					sit[4]=1;
					System.out.println((sit[4]+1)+"번 좌석이 예약이 되었습니다.");
				}else{
					System.out.println("이미 예약된 좌석입니다,");
				}
				break;
			case 6:
				if(sit[5]==0) {
					sit[5]=1;
					System.out.println((sit[5]+1)+"번 좌석이 예약이 되었습니다.");
				}else{
					System.out.println("이미 예약된 좌석입니다,");
				}
				break;
			case 7:
				if(sit[6]==0) {
					sit[6]=1;
					System.out.println((sit[6]+1)+"번 좌석이 예약이 되었습니다.");
				}else{
					System.out.println("이미 예약된 좌석입니다,");
				}
			    break;
			case 8:
				if(sit[i]==0) {
					sit[7]=7;
					System.out.println((sit[7]+1)+"번 좌석이 예약이 되었습니다.");
				}else{
					System.out.println("이미 예약된 좌석입니다,");
				}
			    break;
			case 9:
				if(sit[i]==0) {
					sit[8]=8;
					System.out.println((sit[8]+1)+"번 좌석이 예약이 되었습니다.");
				}else{
					System.out.println("이미 예약된 좌석입니다,");
				}
			    break;
			case 10:
				if(sit[9]==0) {
					sit[9]=1;
					System.out.println((sit[9]+1)+"번 좌석이 예약이 되었습니다.");
				}else{
					System.out.println("이미 예약된 좌석입니다,");
				}
			    break;
			
						
		}
		System.out.println(" 좌석번호 : 1 2 3 4 5 6 7 8 9 10 ");
		System.out.println("----------------------------------");
		System.out.println(" 예약현황 : " + sit[0]+ " "+ sit[1]+" "+ sit[2]+" "+ sit[3]+" "+ sit[4]+" "+ sit[5]+" "+ sit[6]+" "+ sit[7]+" "+ sit[8]+" "+ sit[9]);
		System.out.println("----------------------------------");
		}
		
		
}
