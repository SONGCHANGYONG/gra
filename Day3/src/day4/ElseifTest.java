package day4;

public class ElseifTest {

	public static void main(String[] args) {
		// ���� 80�� �̻��̸� A, 60�� �̻��̸� B, 60�� �̸��̸� C
		
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
