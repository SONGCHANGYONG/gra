package a0314;

import java.util.Scanner;

public class DiceGame {
	
    int userGuess; //사용자가 생각한 주사위값을 기억하는 변수
    int diceFace;
	public void startPlaying() {
		RollDice(); //컴퓨터가 난수로 주사위값을 준비
        //컴퓨터가 생각 할 시간
		while(userGuess != diceFace) {
        userGuess = getUserInput("예상값을 입력해주세요"); //사용자로부터 주사위 예상값 입력
		                                             //사람이 생각 할 시간        
		CheckUserGuess(); //사용자의 예상값이 컴퓨터 난수값과 같은지 비교
		}
	}
	
	private int getUserInput(String msg) { 
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
		//리턴된 값을 userGuess에 저장
	
	}
	
	private void RollDice() { 
		//컴퓨터는 1~6까지 난수 생성
		diceFace = (int)(Math.random() * 6) +1;  //math.random은 0.0부터 1.0사이의 난수를 만듬 int 를붙여 소수점을 버려 0~5까지만들고 +1 을붙여 1~6까지로 만듬
                                                 //       (0.001..    0.9999..)*6을해 (0.00..1*6=0.00....6 = 0  0.999*6 =5.99999..=5)	
	} 
	
	private void CheckUserGuess() {
		if (userGuess == diceFace) {
			System.out.println("맞았습니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
	
	} 

	
}
