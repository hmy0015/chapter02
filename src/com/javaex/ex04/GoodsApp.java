package com.javaex.ex04;
public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		Goods laptop = new Goods();
		Goods cup = new Goods();
		
		camera.setGoods("니콘", 400000);
		laptop.setGoods("LG그램", 900000);
		cup.setGoods("머그컵", 2000);
		
		camera.showInfo();
		laptop.showInfo();
		cup.showInfo();
	}
}
