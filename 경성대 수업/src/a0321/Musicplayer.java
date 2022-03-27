package a0321;

//저장된 뮤직리스트를 동시에 플레이
public class Musicplayer {
	Music[] musicList = new Music[5];
	int size = 0;
	
			
	public Musicplayer() {
		musicList[0] = new Music();
		size++;
		musicList[1] = new Music("산토끼", "미상" , 180);
		size++;
		musicList[2] = new Music("낙하", "악뮤" , 140);
		size++;
		musicList[3] = new Music("운명교향곡", "베토벤", 300);
		size++;
		musicList[4] = new Music("신호등", "이무진", 120);
		size++;
	}
	
	public int getMusicCount() {
		return size;
	}

}
