package org.dimigo.basic;

public class Condition {
	
	public static void main(String[] args) {
		int bus = 850; // 버스
		int small_car = 300; // 경차
		int others = 600; // 그 외
		int add_price_bus = 300;
		int add_price = 200;
		int price = 0;	
		
		int dis = 20;
		String name = "고속버스";
		
		switch(name) {
		case "고속버스" :
			if(dis >= 0 && dis <= 10) {
				price = bus;
			}
			else if(dis <= 20) {
				price = bus + add_price_bus;
			}
			else
				price = bus + (add_price_bus)*2;
			break;
		case "경차" :
			if(dis >= 0 && dis <= 10) {
				price = small_car;
			}
			else if(dis <= 20) {
				price = small_car + add_price;
			}
			else
				price = small_car + (add_price)*2;
			break;
		case "그 외" :
			if(dis >= 0 && dis <= 10) {
				price = others;
			}
			else if(dis <= 20) {
				price = others + add_price;
			}
			else
				price = others + (add_price)*2;
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
