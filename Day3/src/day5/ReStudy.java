package day5;


public class ReStudy {

	
	public static void main(String[] args) {
		//1.���� ���� 
		//�ڷ��� + �����̸�(������ �ǹ��ִ� �ܾ��)
		/* : Ŭ��
		// ; ����Ŭ��
		// ���,���̽� {   } ����ǥ��
		// ���Ŷ [  ]
		���� �ּ� */
		
		int score; //������ ����
		boolean tf = 10 <8; //��, ������ ��Ÿ���� ������
		double xx = 10.2; //�Ǽ� ������ float ���� ��Ȯ���� ����
	    char xxx = 'a'; //�����ϳ� �Է� ''��� �� ����� ����
	    
		
		//2. ���Կ�����
		
		score = 10;
		
		//3. ��¹�
		System.out.println("score = " + score++);
		System.out.println("score = " + score); // ù��°�� score ���������ڰ� ���Ǿ �ι�° �� ���� score +1 ���� ��µȴ�
	
		System.out.println("score = " + score); //ctrl+spacebar. �ý��۾� �ƿ��̶�� ���� ����Ʈ�Ѵ�. 
		
		//4.if��
		int c = 7; 
		if( c%2 == 0 ) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�");
		}
	    //5.else if
	    int num =1;
	    if (num ==1) {System.out.println("����"); //���࿡ num�� 1�̸� ����
	    }else if (num ==2) {System.out.println("����"); //���࿡ num�� 2�̸� ����
	    }else if (num == 3) {System.out.println("��"); //���࿡ num�� 3�̸� ��
	    }else {System.out.println("�߸� �Է� �ƾ��"); //��� �ƴϸ� �߸� �Է� �ƾ��
	    }
	     //6.switch case��
	    int num1 = 1;   
	    switch (num1){ //���ǽľ� �Լ��� �ش��ϴ� ���̽��� ������ �� ���̽��� �����Ų��.
	    	   case 1 : System.out.println("����"); //num1�� case 1�� �ش� case 1 ���� ����Ѵ�. break; �� ����� �´� ���� ���� �� �Ʒ� ���̽����� ���� ��Ű�� �ʴ´�.
	    	   break;
	    	   case 2 : System.out.println("����");
	    	   break;
	    	   case 3 : System.out.println("��");
	    	   break;
	    	   default : System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
	       }
	    //switch case�� ź���� ��Ÿ����
	    int num2 = 9;
	    
	    switch (num2) {
	    case 1 : System.out.println(num2 + "�� ź���� = " + "������");
 	       break;
	    case 2: System.out.println(num2 + "�� ź���� = " + "�ڼ���");
 	       break;
	    case 3: System.out.println(num2 + "�� ź���� = " + "����");
 	       break;
	    case 4: System.out.println(num2 + "�� ź���� = " + "�ݰ���");
 	       break;
	    case 5: System.out.println(num2 + "�� ź���� = " + "���");
 	       break;
	    case 6: System.out.println(num2 + "�� ź���� = " + "����");
 	       break;
	    case 7: System.out.println(num2 + "�� ź���� = " + "ȫ��");
 	       break;
	    case 8: System.out.println(num2 + "�� ź���� = " + "������");
 	       break;
	    case 9: System.out.println(num2 + "�� ź���� = " + "û��");
 	       break;
	    case 10: System.out.println(num2 + "�� ź���� = " + "�ܹ鼮");
 	       break;
	    case 11: System.out.println(num2 + "�� ź���� = " + "Ȳ��");
 	       break;
	    case 12: System.out.println(num2 + "�� ź���� = " + "��Ű��");
 	       break;
 	    default : System.out.println("1 ~ 12 �߿� �Է��� �ּ���");
        }
	    
	    //6.while��
	    //System.out.println("hello~~");�� �ݺ� �ϰ���� 10�� ��� 
	    int n = 0;
	    while (n < 10) {  //while ���� n�� 10���� ������ �̶�� ������ ���� �ɶ����� �ݺ��Ѵ�. 
	    	System.out.println("hello~~");
	    	n++; //n�� 1�������Ѵ�.
	    }
	    //7.for��
	    for (int m = 0 ; m <10 ; m++) { //�ݺ��� ������ ���ǰ��� ���ش�.; �ݺ����� ���� �Է��Ѵ�.; �������� �ش�
	    	System.out.println("hello~~"); // �ι�° ������ �����Ǹ� false�϶� ���� �ݺ��Ѵ�.
	    }
	    
	}
}

