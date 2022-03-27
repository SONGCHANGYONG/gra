package Day6;

public class ArrayTest2 {

	public static void main(String[] args) {
		//배열 5칸짜리를 만들어값을 준다.
		//배열 안의 수를 오름차순으로 정렬한다.
		int[] a = {5,4,6,2,7}; //a배열 {5,4,3,2,1}을 만들었다.
		int temp =0; //trmp라는 정수형 변수를 만들다
		
		
		for( int i= 0 ; i<a.length-1 ; i++) { //for문 ( i라는 정수형 변수 0 '; i가 4보다작냐 (참) ; i1증가)  
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
