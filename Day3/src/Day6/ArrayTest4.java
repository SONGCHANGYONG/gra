package Day6;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] s = {0, 0, 0, 6, 0, 6, 6, 0, 0, 0 };
		//배열안 0과6의 갯수를 카운트 해라
		int z_cnt=0;
		int s_cnt=0;
		
		for(int i = 0 ; i < s.length ; i++) {
			if (s[i] == 0) {
				z_cnt++;
			}else if(s[i] == 6 ){
				s_cnt++;
			}
		}
		System.out.println("s 배열 안 0의 갯수는 " + z_cnt + " 6의 갯수는" + s_cnt + "입니다.");

	}

}
