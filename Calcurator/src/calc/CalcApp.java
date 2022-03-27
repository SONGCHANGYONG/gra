package calc;

//실제 메인 실행함수를 가지고 앱을 실행하는 시작점
public class CalcApp {

	public static void main(String[] args) {
	/*	
		Simplecalcurator sc = new Simplecalcurator();
		
		//계산에 쓸 재료 변수준비
		int x = 100;
		int y = 200;
		Integer z = sc.add(x, y);
				
		System.out.println(x + " + " + y + " = " + z );
		
		Integer a = sc.sub(x, y);
				
		System.out.println(x + " - " + y + " = " + a );
	*/
		
		MultiCalc mc = new MultiCalc();
		
		int i = 100;
		int j = 300;
		int k = mc.add(i, j);
		System.out.println(i + "+" + j + "=" + k);
		
		//MultiCalc의 곱하기 메소드 호출
		k = mc.mul(i, j);
		System.out.println(i + "*" + j + "=" + k);
		
		divCalc dc = new divCalc();
		
		k = dc.div(j, i);
		System.out.println(j + "/" + i + "=" + k);
		k = dc.sub(i, j);
		System.out.println(i + "-" + j + "=" + k);
	

	}

}
