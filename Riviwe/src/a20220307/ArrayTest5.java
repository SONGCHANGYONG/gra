package a20220307;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest5 {
	public static void main(String[] args) {
		//배열 3개 짜리를 3개 만듭니다.
		//3가지 배열 에 속해 있는 인덱스를 랜덤으로 하나씩 출력시킵니다.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String[] name = {"철수가","창용이가","광훈이가"};
		String[] where = {"집에서", "화장실에서", "공원에서"};
		String what[] = {"공놀이를 합니다.","게임을 합니다.", "공부를 합니다"};
		
		int a = rd.nextInt(3);
		
		System.out.println(name[a] +" "+ where[a]+ " " + what [a]);
		
		
	}

}
