package a20220307;

import java.util.Scanner;

public class part1 {

	public static void main(String[] args) {
		//�Է� ������ ������ ���� ��� �Ķ����� ����� ī��Ʈ �ؾ��� ī��Ʈ�� ���� ����� ���� ���� ��� �Դ��� ���Ե�� �Դ��� ǥ�� ���̵��°� ǥ��
		//10�� �Է¹��� ��� ����
		Scanner sc =new Scanner(System.in);
	    int count = 0; //�Է� Ƚ�� ī��Ʈ
	    int b_cnt = 0; //�Ķ��� ī��Ʈ
	    int r_cnt = 0; //������ ī��Ʈ
	    int y_cnt = 0; //����� ī��Ʈ
	    
	    while(count<10){ //ī��Ʈ Ƚ���� 10���ɋ� ���� �ݺ�
	    	System.out.println("���ڸ� �Է��� �ּ���(1 = ������ , 2 = �Ķ��� , 3 = �����)");
	    	int num =0;
	        num = sc.nextInt();
	   	    if (num ==1) {
	 	    	r_cnt++;
	 	    	count++;
		    }else if (num ==2) {
		    	b_cnt++;
		    	count++;
		    }else if (num == 3) {
		    	y_cnt++;
		    	count++;
		    }else {
		    	System.out.println("�߸� �Է� �ƾ��");
		}
	  }
	    System.out.println("�� " + count + "�� �Է� �߽��ϴ�." + "  ������ = " + r_cnt + "��" + "  ����� = " + y_cnt + "��" + "  �Ķ��� = "+ b_cnt + "��" );
	    if (r_cnt > y_cnt && r_cnt > y_cnt ) {
 	    	System.out.println("�������� ���� �����ϴ�.");
	    }else if (r_cnt > y_cnt && r_cnt > y_cnt ) {
	    	System.out.println("�Ķ����� ���� �����ϴ�."); 	
	    }else  {
	    	System.out.println("������� ���� �����ϴ�.");	
	    }
	    /*�ִ밪 ���ϴ� �� 
	     *a=1/ b=2/ c=3 : 1.�� ���� ���Ѵ� a �� b
	     *          2.ū ���� ������ ���� ���Ѵ�. b �� c
	     *          3.ū ���� �ִ밪�̴�.  
	     *if(a > b){ 
	     *if(a > c){ a�� ���ϸ���
	     *}else if (b > c){ b�� ���ϸ���
	     *}else{ c�� ���ϸ���           
	     */
	    
  }
}
