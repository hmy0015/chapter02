package com.javaex.ex05;

public class Point {
	int x, y;
	
	public void setPoint(int xPoint, int yPoint) {
		x = xPoint;
		y = yPoint;
	}
	
	public int getPointX() {
		return x;
	}
	public int getPointY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점 [x = " + x + ", y = " + y + "]을(를) 그렸습니다.");
	}
}
