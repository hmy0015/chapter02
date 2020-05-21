package com.javaex.ex06;

public class Song {
	private String artist, title, album, year, composer;
	private int track;
	
	public void setInfo(String artistInfo, String titleInfo, String albumInfo, 
						String yearInfo, int trackInfo, String composerInfo)
	{
		artist = artistInfo;
		title = titleInfo;
		album = albumInfo;
		year = yearInfo;
		track = trackInfo;
		composer = composerInfo;
	}

	public String getArtistInfo() {
		return artist;
	}
	public String getTitleInfo() {
		return title;
	}
	public String getAlbumInfo() {
		return album;
	}
	public String getYearInfo() {
		return year;
	}
	public int getTrackInfo() {
		return track;
	}
	public String getComposerInfo() {
		return composer;
	}
	
	public void showInfo() {
		System.out.println(artist + ", " + title + "(" + album + ", " + year + ", " + track + "번 트랙, "+ composer + " 작곡)");
	}
}
