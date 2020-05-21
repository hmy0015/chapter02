package com.javaex.ex01;

public class GoodApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods(); // 객체 생성 & 레퍼런스 변수(camera) 생성
		
		camera.name = "Nikon"; // 인스턴스 변수에 값 입력
		camera.price = 400000; // 인스턴스 변수에 값 입력
		
		System.out.println(camera.name);
		System.out.println(camera.price);
	}
}
