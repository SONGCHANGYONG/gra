package a20220308;

import java.util.Scanner;

public class New {
	

		public static void main(String[] args) {
			// �����¼��� 10���ִ�. ����ȵ��¼��� 0���� ǥ�� , �����ϰ���� �¼���ȣ �Է��� �ϸ� ���ڸ��� ����� ���ڸ��� �ƴϸ� �̹̿���� �ٽ� �������ּ��� ���Ḧ���ϸ� -1
			// ���� ��Ȳ�� �������� �����˸� 1�� �ٲ�����
			Scanner sc = new Scanner(System.in);
			int i = 0;
			int[] sit = new int[10];
			
			
			
			
			System.out.println(" �¼���ȣ : 1 2 3 4 5 6 7 8 9 10 ");
			System.out.println("----------------------------------");
			System.out.println(" ������Ȳ : 0 0 0 0 0 0 0 0 0 0 ");
			System.out.println("----------------------------------");
			System.out.println("������ �¼� ��ȣ�� �Է� ���ּ���.>>");
			
			for ( i= 0 ; i < sit.length ; i++ ) {
				sit[i]=0;
			}
			while(true) {
			int a =sc.nextInt();
			if(sit[a-1]==0) {
				sit[a-1] = 1;
				System.out.println("������ �¼��� ���� �Ǿ����ϴ�.");
			}else if(sit[a-1]==1) {
				System.out.println("������ �Ұ� �մϴ�.");
				System.out.println("�ٸ� �¼��� ���� �� �ּ���");
			}else {
				break;
			
			}
			System.out.println(" �¼���ȣ : 1 2 3 4 5 6 7 8 9 10 ");
			System.out.println("----------------------------------");
			System.out.println(" ������Ȳ : " + sit[0]+ " "+ sit[1]+" "+ sit[2]+" "+ sit[3]+" "+ sit[4]+" "+ sit[5]+" "+ sit[6]+" "+ sit[7]+" "+ sit[8]+" "+ sit[9]);
			System.out.println("----------------------------------");
			System.out.println("�ٸ� �¼��� ���� �Ͻðڽ��ϱ�? (1 = �� /-1 = �ƴϿ�)");
			int b = sc.nextInt();
			if(b==-1) {
				break;
			}else {
				System.out.println("������ �¼� ��ȣ�� �Է� ���ּ���.>>");
				}
		}
			
			
			}
			
			
	}
