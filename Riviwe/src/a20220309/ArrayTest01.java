package a20220309;


import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// �����¼��� 10���ִ�. ����ȵ��¼��� 0���� ǥ�� , �����ϰ���� �¼���ȣ �Է��� �ϸ� ���ڸ��� ����� ���ڸ��� �ƴϸ� �̹̿���� �ٽ� �������ּ��� ���Ḧ���ϸ� -1
	    // ���� ��Ȳ�� �������� ����ȭ�� 1�� �ٲ�����
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		int i = 0;
		for ( i = 0; i< seat.length ; i++){
			}
		System.out.println("������Ȳ");
		System.out.println("---------------------------");
		System.out.println("�¼���ȣ 1 2 3 4 5 6 7 8 9 10");
		System.out.print("������Ȳ ");
		for ( i = 0; i < seat.length ; i++){
		    System.out.print( seat[i] + " ");
		    }
		System.out.println("\n---------------------------");
		while(true) {
		System.out.print("\n�����Ͻ� �¼� ��ȣ�� �Է� �� �ּ���. ");
		
		int a = sc.nextInt();
		if (a == -1) {
			System.out.println("�����մϴ�. ");
			break;
			}
		
		if (seat[a-1]==0) {
			seat[a-1]=1;
			System.out.println("�����Ͻ� �¼� ������ �Ϸ� �Ǽ̽��ϴ�.");
			}else if(seat[a-1]==1){
				System.out.println("�����Ͻ� �¼��� �̹� ����� �¼��Դϴ�."
						+ "\n�ٸ� �¼���ȣ�� �Է����ּ���");
			}
		
		     if (a == -1) {
				System.out.println("�����մϴ�. ");
				}
		     System.out.println("������Ȳ");
		     System.out.println("\n---------------------------");	
		     System.out.println("�¼���ȣ 1 2 3 4 5 6 7 8 9 10");
				System.out.print("������Ȳ ");
				for ( i = 0; i < seat.length ; i++){
				    System.out.print( seat[i] + " ");
		    }
				System.out.println("\n---------------------------");
		}
	}	
}
	


