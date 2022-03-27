package a20220304;

import java.util.Random;
import java.util.Scanner;

public class Part1 {
	
	static int blackbox(int aa){
		Random rd = new Random();
		int rd_num = rd.nextInt(10);	
		int c = 0;
		if( rd_num == aa) {
			c = 0;
			}else if ( rd_num > aa) {
				c = 1;
			}else {
			 c = -1;
			}
		return c;
	}

	public static void main(String[] args) {
		//함수이름 blackbox에 랜덤 수 발생함 내가 스캐너로 입력한 수 와 비교 후 랜덤수가 더크면 1 작으면 -1 같으면 0 blackbox가 리턴 1 큽니다 2 작습니다 3 같습니다. 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int input = sc.nextInt();
		
		int main_result = blackbox(input);
		if (main_result == 0){
			System.out.println("두 수가 같습니다.");
		}else if (main_result == 1) {
			System.out.println("blackbox 수가 더 큽니다.");
		}else {
			System.out.println("blackbox 수가 더 작습니다.");
		}
	
	}

}
