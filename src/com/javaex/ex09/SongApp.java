package com.javaex.ex09;

public class SongApp {
	public static void main(String[] args) {
		// 디폴트 생성자 이용해서 인스턴스 생성
		Song song1 = new Song(); // 디폴트 생성자
		song1.setArtist("아이유");
		song1.setTitle("좋은날");
		song1.setAlbum("Real");
		song1.setYear("2010");
		song1.setComposer("이민수");
		song1.setTrack(3);
		System.out.println(song1.toString()); // 테스트 출력
		song1.showInfo(); // 출력
		
		System.out.println(); // 줄바꿈
		
		// 정보를 한 번에 입력받는 생성자
		Song song2 = new Song("아이유", "좋은날", "Real", "2010", "이민수", 3);
		System.out.println(song2.toString()); // 테스트 출력
		song2.showInfo(); // 출력

	}
}
