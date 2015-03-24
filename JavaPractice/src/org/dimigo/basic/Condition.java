package org.dimigo.basic;

public class Condition {
	
	public static void main(String[] args) {
		int bus = 850; // 버스
		int small_car = 300; // 경차
		int others = 600; // 그 외
		int price = 0;	
		
		int dis = 20;
		String name = "그 외";
		
		switch(name) {
		case "고속버스" :
			if(dis >= 0 && dis <= 10) {
				price = 850;
			}
			else if(dis <= 20) {
				price = 1150;
			}
			else
				price = 1450;
			break;
		case "경차" :
			if(dis >= 0 && dis <= 10) {
				price = 300;
			}
			else if(dis <= 20) {
				price = 500;
			}
			else
				price = 700;
			break;
		case "그 외" :
			if(dis >= 0 && dis <= 10) {
				price = 600;
			}
			else if(dis <= 20) {
				price = 800;
			}
			else
				price = 1000;
			break;
		default :
			System.out.println("이름을 정확히 입력해주세요.");
			return;
		}
		
		
		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println("거리 : " + dis + "km");
		System.out.println("차종 : " + name);
		System.out.println("통행료 : " + price);
		
	}
}
