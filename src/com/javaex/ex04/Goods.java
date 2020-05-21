package com.javaex.ex04;

public class Goods {
	private String name;
	private int price;
		
	public void setGoods(String goodsName, int goodPrice) {
		name = goodsName;
		price = goodPrice;
	}
	public String getGoodsName() {
		return name;
	}
	public int getGoodsPrice() {
		return price;
	}
	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price + "\n");
	}
	
	/*
	public void setGoods(String goodsName, int goodPrice) {
		name = goodsName;
		price = goodPrice;
		
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price + "\n");
	}	
	*/
}
