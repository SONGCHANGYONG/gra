package day5;

import java.util.Random;
import java.util.Scanner;

public class ArrayText6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String who[] = new String[3];
		   who[0] = "철수가 ";
		   who[1] = "영희가 ";
		   who[2] = "만수가 ";
		   String where[] = new String[3];
		   where[0] = "집에서 ";
		   where[1] = "화장실에서 ";
		   where[2] = "공원에서 ";
		   String what[] = new String[3];
		   what[0] = "공부를 했습니다.";
		   what[1] = "놀았습니다.";
		   what[2] = "잤습니다.";
		   
		   int index = rd.nextInt(3);
		   
		   System.out.println("엔터키를 누르세요");
		   sc.nextLine();
		   System.out.println( who[index] + where[index] +what[index]);
		   
		   

	}

}
