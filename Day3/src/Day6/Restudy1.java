package Day6;

import java.util.Scanner;

public class Restudy1 {

	public static void main(String[] args) {
		// �����¼��� 10���ִ�. ����ȵ��¼��� 0���� ǥ�� , �����ϰ���� �¼���ȣ �Է��� �ϸ� ���ڸ��� ����� ���ڸ��� �ƴϸ� �̹̿���� �ٽ� �������ּ��� ���Ḧ���ϸ� -1
		// ���� ��Ȳ�� �������� �����˸� 1�� �ٲ�����
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int[] sit = new int[10];
		
		int v = sit[i];
		
		
		System.out.println(" �¼���ȣ : 1 2 3 4 5 6 7 8 9 10 ");
		System.out.println("----------------------------------");
		System.out.println(" ������Ȳ : 0 0 0 0 0 0 0 0 0 0 ");
		System.out.println("----------------------------------");
		System.out.println("������ �¼� ��ȣ�� �Է� ���ּ���.>>");
		
		for ( i= 0 ; i < sit.length ; i++ ) {
			sit[i]=0;
		}
		
		
	    switch(sc.nextInt()) {	
		    case 1: 
				if(v == 0) {
					sit[0]=1;
					System.out.println(sit[0]+"�� �¼��� ������ �Ǿ����ϴ�.");
				}else{
					System.out.println("�̹� ����� �¼��Դϴ�,");
				}
				break;
			case 2:
				if(v==0) {
					sit[1]=1;
					System.out.println((sit[1]+1)+"�� �¼��� ������ �Ǿ����ϴ�.");
				}else{
					System.out.println("�̹� ����� �¼��Դϴ�,");
				}
				break;
			case 3:
				if(sit[2]==0) {
					sit[2]=1;
					System.out.println((sit[2]+1)+"�� �¼��� ������ �Ǿ����ϴ�.");
				}else{
					System.out.println("�̹� ����� �¼��Դϴ�,");
				}
				break;
			case 4:
				if(sit[3]==0) {
					sit[3]=1;
					System.out.println((sit[3]+1)+"�� �¼��� ������ �Ǿ����ϴ�.");
				}else{
					System.out.println("�̹� ����� �¼��Դϴ�,");
				}
				break;
			case 5:
				if(sit[4]==0) {
					sit[4]=1;
					System.out.println((sit[4]+1)+"�� �¼��� ������ �Ǿ����ϴ�.");
				}else{
					System.out.println("�̹� ����� �¼��Դϴ�,");
				}
				break;
			case 6:
				if(sit[5]==0) {
					sit[5]=1;
					System.out.println((sit[5]+1)+"�� �¼��� ������ �Ǿ����ϴ�.");
				}else{
					System.out.println("�̹� ����� �¼��Դϴ�,");
				}
				break;
			case 7:
				if(sit[6]==0) {
					sit[6]=1;
					System.out.println((sit[6]+1)+"�� �¼��� ������ �Ǿ����ϴ�.");
				}else{
					System.out.println("�̹� ����� �¼��Դϴ�,");
				}
			    break;
			case 8:
				if(sit[i]==0) {
					sit[7]=7;
					System.out.println((sit[7]+1)+"�� �¼��� ������ �Ǿ����ϴ�.");
				}else{
					System.out.println("�̹� ����� �¼��Դϴ�,");
				}
			    break;
			case 9:
				if(sit[i]==0) {
					sit[8]=8;
					System.out.println((sit[8]+1)+"�� �¼��� ������ �Ǿ����ϴ�.");
				}else{
					System.out.println("�̹� ����� �¼��Դϴ�,");
				}
			    break;
			case 10:
				if(sit[9]==0) {
					sit[9]=1;
					System.out.println((sit[9]+1)+"�� �¼��� ������ �Ǿ����ϴ�.");
				}else{
					System.out.println("�̹� ����� �¼��Դϴ�,");
				}
			    break;
			
						
		}
		System.out.println(" �¼���ȣ : 1 2 3 4 5 6 7 8 9 10 ");
		System.out.println("----------------------------------");
		System.out.println(" ������Ȳ : " + sit[0]+ " "+ sit[1]+" "+ sit[2]+" "+ sit[3]+" "+ sit[4]+" "+ sit[5]+" "+ sit[6]+" "+ sit[7]+" "+ sit[8]+" "+ sit[9]);
		System.out.println("----------------------------------");
		}
		
		
}
