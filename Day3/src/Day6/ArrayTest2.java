package Day6;

public class ArrayTest2 {

	public static void main(String[] args) {
		//�迭 5ĭ¥���� ������ �ش�.
		//�迭 ���� ���� ������������ �����Ѵ�.
		int[] a = {5,4,6,2,7}; //a�迭 {5,4,3,2,1}�� �������.
		int temp =0; //trmp��� ������ ������ �����
		
		
		for( int i= 0 ; i<a.length-1 ; i++) { //for�� ( i��� ������ ���� 0 '; i�� 4�����۳� (��) ; i1����)  
			for(int v= i+1 ; v<a.length ; v++) {
				if(a[i]>a[v]) {
					temp = a[i];
					a[i]= a[v];
					a[v]= temp;
					
				}
			}
		}
		
		for( int i= 0 ; i<a.length ; i++) {
			System.out.print(a[i] + " ");
				
		}
	}
}
