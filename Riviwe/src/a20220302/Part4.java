package a20220302;
//���� �ΰ��� ��ȯ�ϴ� �Լ� minus�� ����ÿ�.
//minus �Լ��� �ΰ��� ������ �Է¹޽��ϴ�.
//main()���� minus �Լ��� 10, 3�� �Կ��Ͽ� �� ����� result ������ ���
//ȭ��(�ܼ�)�� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
public class Part4 {
	static int minus(int n1, int n2) {
		int num1 = n1;
		int num2 = n2;
		int minus = num1 - num2;
		return minus;
		}
    static int mul(int n1, int n2) {
    	return n1 * n2;
    }
    
    static double div (int n1, int n2) {
    	   double d = 0.0;
    	   
    	   return d = (double) n1/ n2;
    }
	public static void main(String[] args) {
		int result = minus(10, 3);
				
			System.out.println(result);	
		
	        result = mul(10, 3);
	    
	         System.out.println(result);
	         
	        
	          System.out.println(div(5,3));	
	}
	

}
