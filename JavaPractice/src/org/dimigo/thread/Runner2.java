package org.dimigo.thread;

public class Runner2 implements Runnable {
		private String name;
		public Runner2(String name) {
				this.name = name;
		}
		
		@Override
		public void run() {
				int race = 100;
				int min = 10;
				System.out.println(name + "출발");
	
					try {
						while(race >= 0) {
							System.out.println(name + " " + race + " 미터");
							race -= min;
							
							if (race == 0) {
								System.out.println(name + "골인");
								break;
							}
							
							Thread.sleep(1000);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
}
		
