package a20220304;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		//문자와 ,숫자를 입력하면 문자가 입력한숫자만큼 출력됨
		Scanner sc = new Scanner(System.in);
		int a = 0;
		String q = null;
		String b = null;
		

		while(true) {
			System.out.println("반복할 문자를 입력 해 주세요.");
			q = sc.nextLine();
			System.out.println("반복 횟수를 입력 해 주세요.");
			a = sc.nextInt();
			
		for (int i = 0 ; i < a ; i++) {
			System.out.print(q);
		}
		     System.out.println();	
		     System.out.println("게임을 다시 진행 하시겠습니까?(y/ n)");
			 
		     sc.nextLine();
		     b =sc.nextLine();
			if(b.equals ("y")) {
				
			}else if (b.equals ("n")){
				break;
			}else {
				System.out.println("y/n을 입력해주세요");
			}
			
		
		}
		
	}
}
