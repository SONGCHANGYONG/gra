package a0321;

public class MusicApp {

	public static void main(String[] args) {
		//음악을 재생할 뮤직플레이어 생성
		Musicplayer mPlayer = new Musicplayer();
		
		//현재등록된 뮤직 플레이어의 곡 갯수얻기
		System.out.println(mPlayer.getMusicCount() + "곡 목록");
		
		//뮤직을 재생합니다.
		//순차적인재생
		for (int i = 0; i < mPlayer.getMusicCount(); i++) {
			mPlayer.musicList[i].playMusic();
		}
		
		//랜덤재생
		System.out.println("랜덤 플레이");
		for(int i =0; i < 5; i++) {
			int random = (int) (Math.random() *5);
			mPlayer.musicList[random].playMusic();
		}

	}

}
