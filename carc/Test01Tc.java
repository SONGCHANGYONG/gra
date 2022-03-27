package carc;

import java.util.Arrays;
import java.util.Scanner;

public class Test01Tc {
	// != <-- 다르다 연산자

	public static void main(String[] args) {
		// 학생 3명의 국어성적을 입력받아 총합과 평균을 구하여라
		Scanner sc = new Scanner(System.in);// 오른쪽에있는 값을 쓰려면 왼쪽에 동일한 변수가있어야한다 sc = new Scanner --> 우측과 동일하게 좌특에도 선언 되어야함
											// -->Scanner sc = new Scanner 를 써야한다

		int 국어성적[];
		int 총점수 = 0;
		float 평균 = 0;
		final int 학생수 = 3;

		// 반복문으로 처리 할수 있지않을까
		국어성적 = new int[학생수];
		for (int i = 0; i < 학생수; i++) {
			p("국어성적을 입력 해 주세요");
			국어성적[i] = sc.nextInt();
			총점수 = 총점수 + 국어성적[i];// 결과를 담을 변수 = 변수에 담길 계산식
			평균 = 총점수 / 학생수;
		}

		String str = "국어성적의 총합은 ";
		for (int i = 0; i < 학생수; i++) {
			// 인덱스 i가 (학생수 -1) == (배열의 마지막 인덱스) 이면
			str = str + 국어성적[i];
			if (i != (학생수 - 1)) {
				str = str + " + ";
			}

		}
		pl(str);
		System.out.println("국어성적의 총 점수 = " + 총점수 + "\n국어성적의 평균 = " + 평균); // \n = 다음줄
		System.out.println(Arrays.toString(국어성적)); // Array.toString() ()안 배열명 = 배열속에 있는 값을 전부 출력한다/

	}

	public static void p(String msg) {
		System.out.print(msg);
	}

	public static void pl(String msg) {
		System.out.println(msg);
	}

}

//"NSERT INTO" + "MEMBER" +  "( name, age, address, memo, tel)"
//               "values"     ("황진이", 18, "개성", "가인", "없음");
/*
 * =="NSERT INTO" + "MEMBER" + "( name, age, address, memo, tel)" + "values"
 * ("황진이", 18, "개성", "가인", "없음"); 메세지 라이브러리 사용시 ==NSERT INTO" + "MEMBER" +
 * "( name, age, address, memo, tel)" + "values" ({},{},{},{},{},{});
 */
