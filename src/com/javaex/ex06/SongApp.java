package com.javaex.ex06;

public class SongApp {
	public static void main(String[] args) {
		Song songInfo = new Song();
		
		songInfo.setInfo("아이유", "좋은날", "Real", "2010", 3, "이민수");
		songInfo.showInfo();

	}
}
