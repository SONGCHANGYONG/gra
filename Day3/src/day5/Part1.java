package day5;

import java.util.Scanner;

public class Part1 {
	

	public static void main(String[] args) {
		//10�� �л� ������ ���� �� ���(������ ����)
		//���� �� �ִ밪�� �ּҰ� ����(���� ������ ����)
		Scanner sc = new Scanner(System.in); 
		int a = 0;
		int sd = 0;
		int total = 0;
		int nn = 0;
		int max = 0;
		int min =100;
	
		
		while(a<10) {
			System.out.println("������ �Է����ּ���." );
			sd = sc.nextInt();
			total = sd + total;
			nn = total/10;
			//���ھ� ���� ���� max �������� ���Ѵ�.
			//�׷��� ū���� max�� ����
		    if(max < sd ) {
		    	max = sd; 
		    		}else if (min > sd) {
		    			min = sd;
		    		}
			a++;
			
			
		}
		System.out.println("�л����� ������ " + total );
		System.out.println("�л����� ����� " + nn );
		System.out.println("�л��� �� �Ұ������� " + max );
		System.out.println("�л��� �� �Ұ������� " + min );
		}
	}


