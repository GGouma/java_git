class Song {
	String title, artist, country;
	int year;
	
	Song() {}
	
	Song(String title, String artist, String country, int year) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
	
	void show(){
		System.out.println(year + "년" + country + "국적의" + artist + "가 부른" + title);
	}
}

public class CircleMain {

	public static void main(String[] args) {

		
		Song song = new Song("Dancing Queen", "ABBA", "스웨덴", 1978);
		song.show();
	}

}
