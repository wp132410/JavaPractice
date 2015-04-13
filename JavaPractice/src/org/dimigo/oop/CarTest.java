/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 *		|_ CarTest
 * 1. 	개  요 	:
 * 2. 	작성일 	:  2015. 4. 10.
 * </pre>
 * @author 	: 	pengpark
 *  @version		: 	1.0
 *
 */
public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.setCompany("현대자동차");
		c1.setModel("제네시스");
		c1.setColor("검정색");
		c1.setMaxSpeed(225);
		c1.setPrice(50000000);
		
		c2.setCompany("LOTUS");
		c2.setModel("Elan");
		c2.setColor("노란색");
		c2.setMaxSpeed(228);
		c2.setPrice(26160000);
		
		c3.setCompany("삼성자동차");
		c3.setModel("SM7");
		c3.setColor("회색");
		c3.setMaxSpeed(200);
		c3.setPrice(38000000);
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + c1.getCompany());
		System.out.println("모델명 : " + c1.getModel());
		System.out.println("색상 : " + c1.getColor());
		System.out.println("최대속도 : " + c1.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", c1.getPrice()) + "원");
		
		System.out.println();
		
		System.out.println("제조사명 : " + c2.getCompany());
		System.out.println("모델명 : " + c2.getModel());
		System.out.println("색상 : " + c2.getColor());
		System.out.println("최대속도 : " + c2.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", c2.getPrice()) + "원");
		
		System.out.println();
		
		System.out.println("제조사명 : " + c3.getCompany());
		System.out.println("모델명 : " + c3.getModel());
		System.out.println("색상 : " + c3.getColor());
		System.out.println("최대속도 : " + c3.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", c3.getPrice()) + "원");
	}
	
}
