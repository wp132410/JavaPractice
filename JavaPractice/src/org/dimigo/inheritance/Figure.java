package org.dimigo.inheritance;

public class Figure {
	
		private int centerX = 0;
		private int centerY = 0;
		
		Figure() {}
		
		Figure(int centerX, int centerY) {
				this.centerX = centerX;
				this.centerY = centerY;
		}
		
		protected double calcArea() {
			return 0;
		}
		
		protected void printCenter() {
			System.out.println("중심좌표 : " + "(" + centerX + ", " + centerY + ")");
		
		}
	
		protected void moveFigure(int x, int y) {
				centerX += x;
				centerY += y;
		}

}
