package com.javaex.ex02;

public class GoodApp {
	public static void main(String[] args) {
		Goods laptop = new Goods();
		Goods cup = new Goods();
		
		laptop.name = "LG그램";
		laptop.price = 900000;
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println("상품이름 : " + laptop.name + " / 가격 : " + laptop.price);
		System.out.println("상품이름 : " + cup.name + " / 가격 : " + cup.price);
		
	}
}
