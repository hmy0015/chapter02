package com.javaex.ex07;

public class GoodsApp {
	public static void main(String[] args) {
		Goods g1 = new Goods();
		g1.setName("aaaa");
		g1.setPrice(20000);
		System.out.println(g1.toString());
		
		Goods g2 = new Goods("bbbb", 40000);
		System.out.println(g2.toString());
		
		Goods g3 = new Goods("cccc");
		System.out.println(g3.toString());
		
		g3.setPrice(5000);
		System.out.println(g3.toString());
	}
}
