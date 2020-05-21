package com.javaex.ex12;

public class TVApp {
	public static void main(String[] args) {
		TV tv = new TV(7, 20, false); // 7번 채널, 볼륨 20, 전원 꺼짐
		
		tv.status();
		
		System.out.println();
		
		tv.power(true); // 전원 켜짐
		tv.volume(100); // 볼륨 지정
		tv.channel(220); // 채널 지정
		tv.status();
		
		tv.volume(true); // 볼륨 조정
		tv.channel(true); // 채널 조정
		tv.status();

		System.out.println();
		tv.power(false); // 전원 꺼짐
		tv.status();
	}
}
