package a20220309;


import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// 예약좌석이 10개있다. 예약안된좌석은 0으로 표현 , 예약하고싶은 좌석번호 입력을 하면 빈자리면 예약됨 빈자리가 아니면 이미예약됨 다시 예약해주세요 종료를원하면 -1
	    // 예약 현황이 보여야함 예약화면 1로 바뀌어야함
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		int i = 0;
		for ( i = 0; i< seat.length ; i++){
			}
		System.out.println("예약현황");
		System.out.println("---------------------------");
		System.out.println("좌석번호 1 2 3 4 5 6 7 8 9 10");
		System.out.print("예약현황 ");
		for ( i = 0; i < seat.length ; i++){
		    System.out.print( seat[i] + " ");
		    }
		System.out.println("\n---------------------------");
		while(true) {
		System.out.print("\n예약하실 좌석 번호를 입력 해 주세요. ");
		
		int a = sc.nextInt();
		if (a == -1) {
			System.out.println("종료합니다. ");
			break;
			}
		
		if (seat[a-1]==0) {
			seat[a-1]=1;
			System.out.println("선택하신 좌석 예약이 완료 되셨습니다.");
			}else if(seat[a-1]==1){
				System.out.println("선택하신 좌석은 이미 예약된 좌석입니다."
						+ "\n다른 좌석번호를 입력해주세요");
			}
		
		     if (a == -1) {
				System.out.println("종료합니다. ");
				}
		     System.out.println("예약현황");
		     System.out.println("\n---------------------------");	
		     System.out.println("좌석번호 1 2 3 4 5 6 7 8 9 10");
				System.out.print("예약현황 ");
				for ( i = 0; i < seat.length ; i++){
				    System.out.print( seat[i] + " ");
		    }
				System.out.println("\n---------------------------");
		}
	}	
}
	


