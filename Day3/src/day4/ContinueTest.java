package day4;

import java.util.Random;
import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl + shift + o
		Random rd = new Random();
		System.out.println("���� ���� ��(����=1 ������=2 ��=3) >>");
		//������ �ѹ� ���� �� �Ŀ� ����Ұ��� ��������Ѵ�.
		//yes�� �����ϸ� ����ϰԵǰ� no �� �����ϸ� �ߴ��ؾ���.
		//�������������� �İ� ����ڸ� �غ�
		//������������ ���ڷ� ǥ�� ����1, ����2, ��3
		int win_cnt =0;
		int lose_cnt = 0;
		int drow_cnt = 0;
		int com = sc.nextInt(3)+1;
	

	    int user =sc.nextInt();
	    int count = 0;  //Ƚ���� �����ϴ� ����
	    
	    
		String answer = null;
		while(true) {
			
			count = rd.nextInt(3)+1;  //Ƚ���� �����ϴ� ����
		    count = count +1;
			com = sc.nextInt(3)+1;
		    user = sc.nextInt();
		    //������������ �� �� Ƚ�� �������Ѿ���.  ����� count �������� 1��ŭ ����
		    

		    //�ºθ� �Ǻ� �ؾ���
		    //���� ���º� ���� ó��
		    
		    if(com == user) {
		    	 System.out.println("���º�.");
		    	 drow_cnt++;
		    }
		    else{
		    	//���� ������ ������ ����ڴ� ���� �Ǵ� ���� ����츦 ó���ؾ���
		    	if(com == 1) {
		    		if(user == 2) {
		    			//����ڰ� ������ ������
		    			 System.out.println("user win.");
		    			 win_cnt++;
		    		}
		    		else {
		    			//����ڰ� ���� ����� �����̱�
		    			 System.out.println("com win.");
		    			 lose_cnt++;
		    		}
		    	}
		    	else {
		    		//���� ������ ���������
		    		if (com ==2) {
		    			//����ڴ� ������ ���� �� �������� ó�� �������
		    			if(user == 1 ) {
		    				 System.out.println("com win.");
		    				 lose_cnt++;
		    			}
		    			else {
		    				//����ڰ� ���� ����� ����ڰ� �̱�
		    				 System.out.println("user win.");
		    				 win_cnt++;
		    			}
		    			
		    		}
		    		else {
		    			//���� ó���ϸ��
		    			if( com == 3) {
		    				if( user == 1)
		    					 System.out.println("user win.");
		    				win_cnt++;
		    			 	
		    			}
		    			else {
		    				 System.out.println("com win.");
		    				 lose_cnt++;
		    			}
		    			}
		    		}
		    	}
		    
			
			System.out.print("������ ��� �Ͻðڽ��ϱ�?(y/n)");
			answer = sc. nextLine();
			
			 if(answer.equals("y") || answer.equals("Y")) { 
				 if(answer.equals("n") ||answer.equals("N")) {
					 System.out.println("�����մϴ�.");
					 break;
				 }
				 else {
					 System.out.println("y or n �� �����Ͻÿ�.");
				 }
			 }	 
		  }
	System.out.println(count + "��" + win_cnt + "��" + lose_cnt + "��" + drow_cnt + "��" );

		}

}
	


