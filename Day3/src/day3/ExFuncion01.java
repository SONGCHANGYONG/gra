package day3;

public class ExFuncion01 { //day3��Ű���ȿ� �ִ� class ExFucion01
	
	static int f1() {    //���� (����޼ҵ�)���� �����ְ� �Լ��տ� static�� �ٿ��ش�
	
		return  10;      //f1�� 10���� �����ش�	
	}
	
	static int f2() {    
		
		return 50 + f1(); //f2�� 50+f1���� �����ش�.
	}
	
	static int f3() { 
		
		return 100 + f2();//f3�� 100+f2 ���� ������ �����ش�
	}
	
	static void f4() {
		System.out.println("���� f4");
	}
	

	public static void main(String[] args) {
	
		int result = f3();  //���� �޼ҵ� �� result��� ����������� ����� f3���� �����Ѵ�.
		                    //result�� ���������� �� ����� �׷��� int(������ ����)�� ��
		
		System.out.println(result);
		
		f4();  //�����ڵ�
	}

}
/*1Ŭ������ �����ΰ�?
 * -�Ӽ��� ������� �����Ǿ��ֵ�.
 * -�Ӽ��� ��������� �߰�, (
 * -����� ��� �޼���� �ߴ�. (public class ExFuncion01��public static void main(String[] args) �ɹ��޼ҵ�, ������ ���θ޼ҵ�)
 * 2.�޼���� �����ΰ�?
 * -��ȯ�ڷ��� + �޼����̸� + () + {}
 * -main�޼��尡 f3�޼��带 ȣ���Ѵٴ� ���� �ڵ�� ǥ���� �� �ֳ�?
 * -f4���� �����Ų��.
 */
