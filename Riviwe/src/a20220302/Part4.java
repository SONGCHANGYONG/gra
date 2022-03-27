package a20220302;
//정수 두개를 반환하는 함수 minus를 만드시오.
//minus 함수는 두개의 정수를 입력받습니다.
//main()에서 minus 함수에 10, 3을 입역하여 그 결과를 result 변수에 담아
//화면(콘솔)에 출력하는 코드를 작성하시오.
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
