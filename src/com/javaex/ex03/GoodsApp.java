package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods(); // 객체 생성
		Goods cup = new Goods(); // 객체 생성
		
		camera.setGoods("니콘", 400000); // 입력 (str, int)
		
		System.out.println(camera.getGoodsName()); // 굿즈네임 호출
		System.out.println(camera.getGoodsPrice()); // 굿즈가격 호출

		cup.setGoods("머그컵", 2000); // 입력 (str, int)
		
		System.out.println(cup.getGoodsName()); // 굿즈네임 호출
		System.out.println(cup.getGoodsPrice()); // 굿즈가격 호출
	}

}
