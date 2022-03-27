package a20220307;

public class Part2 {

	public static void main(String[] args) {
		//10명 학생 점수의 총점 과 평균(점수는 정수)
	    //점수 중 최대값과 최소값 구함(같은 점수는 없음)
		
		int student[] = new int[10];
		
		student[0] = 11;
		student[1] = 03;
		student[2] = 100;
		student[3] = 62;
		student[4] = 41;
		student[5] = 51;
		student[6] = 77;
		student[7] = 18;
		student[8] = 71;
		student[9] = 91;
		
		int max = 0;
		int min = 100;
		for (int i = 0 ; i<10 ; i++) {
		if (max < student[i] ) {
			max = student[i];
		}else if (min> student[i] ) {
			min = student[i];
		}
		
		}
		System.out.println("최고점수 = " +max);
		System.out.println("최저점수 = " +min);

	}

}
