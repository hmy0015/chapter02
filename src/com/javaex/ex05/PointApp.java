package com.javaex.ex05;

public class PointApp {
	public static void main(String[] args) {
		Point point1 = new Point();
		Point point2 = new Point();
		
		point1.setPoint(5, 5);
		point2.setPoint(10, 23);

		point1.draw();
		point2.draw();
	}
}
