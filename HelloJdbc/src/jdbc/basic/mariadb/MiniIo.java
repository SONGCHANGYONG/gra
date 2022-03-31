package jdbc.basic.mariadb;

public class MiniIo {
	public static void p(String msg) {
		System.out.print(msg);
	}
	public static void pl(String msg) {
		System.out.print(msg +"\n");
	}
	// 출력 형식 1개에 변수 1개 포맷스트링
	public static void pf(String format, String msg) {
		System.out.printf(format, msg);
	}
	public static void pf(String format, int msg) {
		System.out.printf(format, msg);
	}

}
