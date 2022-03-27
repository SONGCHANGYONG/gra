package day4;

public class ElseifTest {

	public static void main(String[] args) {
		// 점수 80점 이상이면 A, 60덤 이상이면 B, 60점 미만이면 C
		
		int score = 83;
		char grade;
		if(score >= 80) {
			grade = 'A';
		}
		else if(score >= 60 ) {
			grade ='B';
		}
		else {
			grade = 'C';
		}
		System.out.print(grade);

	}

}
