package a20220307;

public class Part2 {

	public static void main(String[] args) {
		//10�� �л� ������ ���� �� ���(������ ����)
	    //���� �� �ִ밪�� �ּҰ� ����(���� ������ ����)
		
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
		System.out.println("�ְ����� = " +max);
		System.out.println("�������� = " +min);

	}

}
