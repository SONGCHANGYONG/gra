package a0313;

import java.text.MessageFormat;

public class HellowString {

	public static void main(String[] args) {
		
		String s1 = "이제 봄이 가까이 왔어요!";
		String s2 = "빨리 코로나가 종식 되기를.";
		String s3 = "이제 봄이 가까이 왔어요!";
		String s4 = new String("빨리 코로나가 종식 되기를.");
		
		System.out.println("s1 = " + s1 );
		System.out.println("s2 = " + s2 );
		System.out.println("s3 = " + s3 );
		System.out.println("s4 = " + s4 );
		
		String pattern = "{0} == {1} => \n{2}";
		//Object[] vars = {s2, s4, (s2 == s4)}; // == 참조에 의한 비교 이기때문에 false 
		Object[] vars = {s2 , s4, (s2.equals(s4))}; // .equals는 값만 비교하기 떄문에 true
		
		String msg =MessageFormat.format(pattern, vars);
		System.out.println(msg);
	}

}
