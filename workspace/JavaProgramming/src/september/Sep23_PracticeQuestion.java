package september;
import java.util.Scanner;

class Song {
	String composer;
	String title, artist, album;
	int year, track;

	public Song(String composer, String title, String artist, String album, int year, int track) {
		this.composer = composer;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
		this.track = track;
	}

	public Song() {
	}

	public void show() {
		System.out.println("Album : " + album);
		System.out.println("Artist : " + artist);
		System.out.println("Composer : " + composer);
		System.out.println("Title : " + title);
		System.out.println("Track : " + track);
		System.out.println("Year : " + year);
	}
}

public class Sep23_PracticeQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Song[] songArray = new Song[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("songArray 배열의 " + i + "번째 Song 객체 정보 입력");
			System.out.print("Composer >> ");
			String composer = sc.nextLine();
			System.out.print("Title >> ");
			String title = sc.nextLine();
			System.out.print("Artist >> ");
			String artist = sc.nextLine();
			System.out.print("Album >> ");
			String album = sc.nextLine();
			System.out.print("Year >> ");
			int year = sc.nextInt();
			System.out.print("Track >> ");
			int track = sc.nextInt();
			songArray[i] = new Song(composer, title, artist, album, year, track);
			sc.skip("[\\r\\n]+");
		}

		sc.close();
	}
}
