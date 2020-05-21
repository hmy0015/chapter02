package com.javaex.ex07;

public class Goods {
	private String name;
	private int price;

	public Goods() {
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Goods(String name) {
		this.name = name;
	}

	public Goods(int price) {
		this.price = price;
	}

	// name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// price
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [name = " + name + ", price = " + price + "]";
	}
	
}
