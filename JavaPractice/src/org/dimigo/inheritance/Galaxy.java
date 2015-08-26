package org.dimigo.inheritance;

public class Galaxy extends SmartPhone{
		Galaxy(){}
		Galaxy(String name, String company, int price) {
			super(name, company, price);
		}
		
		public void pay() {
			System.out.print("삼성 페이");
			super.pay();
		}
		
		public void useWirelessCharging() {
			System.out.println("무선 충전 기능을 이용합니다.");
		}
}
