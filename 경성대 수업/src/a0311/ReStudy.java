package a0311;

import java.util.Arrays;
import java.util.Scanner;

public class ReStudy {
	
    //총점계산 메소드 분리
	public static int 총점계산(int[] 국어성적, int 학생수 ) {//메소드에 리턴값 1개가 필요 void느 리턴값 없음
		int 총점 = 0 ; //지역변수 선언              //메소드() 밖에서 불어올 값들을 입력해준다.
		for (int i = 0; i < 학생수; i++) {
			총점 =총점 +국어성적[i];
		}
		
		return 총점;
	}
	
	//성적 입력 메소드 분리
	public static int[] 성적입력(int 학생수) { //배출할 함수형을 써 주면됨 int[] int형 배열
		
		int[] 국어성적 = new int[학생수]; 
		Scanner sc = new Scanner(System.in);
		국어성적 = new int[학생수];
		
		for (int i = 0; i < 학생수; i++) {
			System.out.println(i+"번, 국어성적을 입력 해 주세요");
			국어성적[i] = sc.nextInt();
		}
		return 국어성적;//대표명만 기입하면됨
	}
	
	public static void 총점과평균_출력(int 국어성적[], int 총점, int 학생수) {//()안에 외부에서 불러올 데이터 값들을 입력해준다.
		float 평균 = 평균계산(총점, 학생수);    //안에서만 쓰면되기때문에 직접 변수선언 float 평균
		                                  //여기서 받은값을 아래의 평균계산으로 넘김  
		String str = "국어성적의 총합은 ";
		for (int i = 0; i < 학생수; i++) {
			// 인덱스 i가 (학생수 -1) == (배열의 마지막 인덱스) 이면
			str = str + 국어성적[i];
			if (i != (학생수 - 1)) {
				str = str + " + ";
			}

		}
		System.out.println(str);
		System.out.println("국어성적의 총 점수 = " + 총점 + "\n국어성적의 평균 = " + 평균); // \n = 다음줄
		
	}
	
	public static float 평균계산(int 총점, int 학생수) {
		float 평균 =총점 /학생수;
		
		return 평균;
	}
	

	public static void main(String[] args) {//메인함수는 안 불러도 실행가능 콜백
		//성적입력 메소드로 분리
		//총점계산
		//국어점수출력()
		
		// static 공용또는 공공의 접근제한자를 사용하는 경우
		int 국어성적[]; //지역변수 main안에서만 사용가능함 
		
		int 총점 = 0;
		float 평균 = 0;
		final int 학생수 = 3;
		
		
		//메인 바깥에 있는 메서드를 쓰려변 불러야함 (콜)
		//메인에서 사용가능하게 하려면 static이 붙어있어야함 객체 static 객체지향 프로그램이 일반으로 바뀜
		//내가 만든 함수도 컨트롤  스페이스 누르면 실행됨 
		국어성적 = 성적입력(학생수); // 국어 성적안에 성력입력값을 넣음 (반환값이 국어성적)
		
		총점 = 총점계산(국어성적, 학생수); //총점에 총점계산메서드를 불러온다
		
		평균 = 평균계산(총점, 학생수);
		
		총점과평균_출력(국어성적, 총점, 학생수);
		
		
		
		//자바반과 웹프론트반은 관련이 없다.
		//자바반에 성적을 낸다.
		//웹프론트앤드 성적을 낸다.
		

	}
	
}
