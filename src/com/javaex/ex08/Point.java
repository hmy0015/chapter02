package com.javaex.ex08;

public class Point {
	private int x, y;

	// 디폴트 생성자
	public Point() {
		super();
	}

	// x, y 같이 세팅하는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// x
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	// y
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	// 테스트용 출력
	@Override
	public String toString() {
		return "테스트 [x = " + x + ", y = " + y + "]";
	}
	
	// 일반 메소드
	public void draw() {
		System.out.println("점 x = " + x + ", 점 y = " + y);
	}
}
