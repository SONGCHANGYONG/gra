package a20220309;

import java.util.Arrays;

public class ArrayTest05 {
	
	public static void main(String[] args) {
		//10�� �л� ������ ���� �� ���(������ ����)
		//���� �� �ִ밪�� �ּҰ� ����(���� ������ ����)
		//������ ������� �����Ѵ�.
		int [] st = {4,5,6,7,8,9,1,2,3};
		
	    int temp = 0;
	    int i =0;
		
			
			for (i = 0 ; i<st.length-1 ; i++) {
				for (int a = i+1; a<st.length ; a++ ) {
					if (st[i] < st[a]) {
						temp = st[i];
						st[i] = st[a];
						st[a] = temp;
						
					}
				}
			}
			
		
			for (i = 0 ; i<st.length-1 ; i++) {
		System.out.println(st[i]);
	}}
}
