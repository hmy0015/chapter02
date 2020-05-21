package com.javaex.ex08;

public class PointApp {
	public static void main(String[] args) {
		// 디폴트 생성자 이용해서 인스턴스 생성
		Point point1 = new Point(); // 디폴트 생성자
		point1.setX(15); // x값 입력
		point1.setY(20); // y값 입력
		System.out.println(point1.toString()); // 테스트 출력
		point1.draw(); // 출력
		
		System.out.println(); // 줄바꿈
		
		// x, y 같이 세팅하는 생성자 이용
		Point point2 = new Point(5, 30);
		System.out.println(point2.toString());
		point2.draw();

	}
}
