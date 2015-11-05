package org.dimigo.thread;

public class Race2 {
	
		public static void main(String[] arsg) {
			
				System.out.println("main start");
				Thread r1 = new Thread(new Runner2("홍길동"));
				Thread r2 = new Thread(new Runner2("홍길순"));
				
				
				r1.start();
				r2.start();
				
				System.out.println("main end");
		}

}
