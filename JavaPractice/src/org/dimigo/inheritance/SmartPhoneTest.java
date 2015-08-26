package org.dimigo.inheritance;

public class SmartPhoneTest {
	
		public static void main(String[] args) { 
				SmartPhone[] phones = {
						 new IPhone("iPhone6", "애플", 700000),
						 new Galaxy("갤럭시S6", "삼성", 650000)
				};
				
				
				for (SmartPhone s : phones) {
						System.out.println(s.toString());
						s.turnOn();
						s.pay();
						s.useSpecialFunction(s);
						s.turnOff();
						
						System.out.println();
				}
			
		}
}
