package a20220302;

public class Part3 {
         //�Լ��� ����
	     //��ȯ�ڷ��� �Լ��̸�() {��ɳ���}
	     //��ȯ�ڷ����� ���� return �ʿ� ex) void ��� int �� ��Ʈ�� �ҼӵǴ� 100, num1, 200, num2 ��� ���̽������ return 200;, return sum
	static int add(int n1, int n2) { //add�� �� ���� ���ϴ� �Լ� ()���� �Է±� return�� ��±�
		int num1 = n1;
		int num3 = n2;
	    int sum = num1 + num3;
	    
	    return sum;	//sum�̶�� �������� �����ش�(��ȯ�Ѵ�)
	                //sum�� add�޼ҵ� ������� �������ִ�
	                // return�� ���̸� =�� �� ����(�Ʒ���  int result = add();)
	}
	
	
	
	public static void main(String[] args) {
	 int result = add(10,4);//add()�Լ��� return���� �ȿ� ��´�.
	  
	 System.out.println(result);
		
		
}
}