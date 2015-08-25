package org.dimigo.inheritance;

public class IPhone extends SmartPhone{
		IPhone() {}
		IPhone(String model, String company, int price) {
			super(model, company, price);
		}
		
		public void pay() {
				System.out.print("애플 페이로");
				super.pay();
		}
		
		public void useAirDrop() {
				System.out.println("AirDrop 기능을 사용합니다");
		}	
}
