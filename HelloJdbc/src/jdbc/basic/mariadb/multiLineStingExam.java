package jdbc.basic.mariadb;

public class multiLineStingExam {
	
	public static void main(String[] args) {
		String multiLineString =
				"""
				안녕하세요
					안녕하세요
						안녕하세요
				""";
		System.out.println(multiLineString);
		String  htmlString =
				"<h1>" +
			    "     안녕하세요  " +			
				"</h1>" +
			    "</p>" +
				"   여기는 문단입니다. " +
			    "</p>";
		System.out.println(htmlString);
		
		String SmartHtmlString =
				"""
				<h1>
					안녕하세요
				</h1>
				<p>
					여기는 문단입니다.	
				</p>		
			    """;
		System.out.println(SmartHtmlString);
		
		//String.join() 함수를 이용한 멀티문자열 처리
		String joinString = String.join("\n", "안녕하세요",
					"	안녕하세요",
					"		안녕하세요");
		System.out.println(joinString);
	}
}
