package day4;

import java.util.Random;
import java.util.Scanner;

public class Ass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("������������ �����ϼ��� ����=(1) ����=(2) ��=(3)>>");
		//1 = ���� 2 = ���� 3 = ��
		int com = rd.nextInt(3)+1;
		int user = sc.nextInt();
		
		
		while(true){
			
		
		if(com == user ) {
			System.out.println("�����ϴ�.");
		}
		else {
			if( com == 1 ) {
				if( user == 2) {
					System.out.println("user win");
			}
			else {
				System.out.println("user lose");
			}
        }
				else {
					if( com == 2 ) {
						if(user == 1) {
							System.out.println("com win");
						}
						else {
							System.out.println("user win");
						}
					}
					else {
						if(com ==3 ) {
							if(user == 1) {
							System.out.println("user win");
						    }
						else {
							System.out.println("com win");
						}
					}
				}
          }
		}	    
		
		
		String answer = null;
		answer = sc.nextLine();
	 	System.out.println("����Ͻðڽ��ϱ� (y,n)");
	    if(answer .equals ("y") || answer.equals("Y") ) {
	    }
	    else{
	    	if(answer .equals("n") || answer .equals("N")) {
	    		System.out.println("������������ �����ϼ��� ����=(1) ����=(2) ��=(3)>>");
	    		break;
	    	}
	    	else {
	    		System.out.println("y or n �� �����Ͻÿ�.");
	    	}
	    }	
     }
		
		
		

}
}
