package org.dimigo.inheritance;

public class Circle extends Figure {
		private int radius;
		
		Circle(int radius) {
			this.radius = radius;
		}
		
		Circle(int centerX, int centerY, int radius) {
			super(centerX, centerY);
			this.radius = radius;
		}
		
		protected double calcArea() {
				return radius * radius * Math.PI;
		}
		
		protected void printCenter() {
			System.out.print("원 ");
			super.printCenter();
		}
}
