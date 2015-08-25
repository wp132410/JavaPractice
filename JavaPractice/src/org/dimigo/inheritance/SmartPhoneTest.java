package org.dimigo.inheritance;

public class SmartPhoneTest {
	
		public static void main(String[] args) { 
				SmartPhone Iphone = new IPhone("iPhone6", "애플", 700000);
				SmartPhone Galaxy = new Galaxy("갤럭시S6", "삼성", 650000);
				
				
				System.out.println(Iphone.toString());
				Iphone.turnOn();
				Iphone.pay();
				Iphone.useSpecialFunction(Iphone);
				Iphone.turnOff();
				
				System.out.println();
				System.out.println(Galaxy.toString());
				Galaxy.turnOn();
				Galaxy.pay();
				Galaxy.useSpecialFunction(Galaxy);
				Galaxy.turnOff();
		}
}
