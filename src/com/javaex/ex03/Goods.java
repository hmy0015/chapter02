package com.javaex.ex03;

public class Goods {
	private String name;
	private int price;

	public void setGoods(String goodsName, int goodsPrice) {
		name = goodsName;
		price = goodsPrice;
	}
	
	public String getGoodsName() {
		return name;
	}
	public int getGoodsPrice() {
		return price;
	}
}
