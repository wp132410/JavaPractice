package org.dimigo.thread;

public class Race {
	
		public static void main(String[] arsg) {
			
				System.out.println("main start");
				Thread r1 = new Runner("홍길동");
				Thread r2 = new Runner("홍길순");
				
				r1.start();
				r2.start();
				
				System.out.println("main end");
		}

}
