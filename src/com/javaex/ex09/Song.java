package com.javaex.ex09;

public class Song {
	private String artist, title, album, year, composer;
	private int track;
	
	// 디폴트 생성자
	public Song() {
	}
	
	// 정보를 한 번에 입력받는 생성자	
	public Song(String artist, String title, String album, String year, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.composer = composer;
	}
	
	public Song(String artist, String title, String album, String year, String composer, int track) {
		this(artist, title, album, year, composer);
		this.track = track;
	}
	
	// artist
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

	// title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	// album
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}

	// year
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}

	// composer
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}

	// track
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}

	// 테스트용 출력
	@Override
	public String toString() {
		return "# 테스트 [artist = " + artist + ", title = " + title + ", album = " + album + ","
				+ " year = " + year + ", " + "composer = " + composer + ", track = " + track + "]";
	}
	
	// 일반 메소드
	public void showInfo() {
		System.out.println(artist + ", " + title + "(" + album + ", " + year + ", " + track + "번 트랙, "+ composer + " 작곡)");
	}

}
