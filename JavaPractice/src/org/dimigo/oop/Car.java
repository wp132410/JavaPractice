/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 *		|_ Car
 * 1. 	개  요 	:
 * 2. 	작성일 	:  2015. 4. 10.
 * </pre>
 * @author 	: 	pengpark
 *  @version		: 	1.0
 *
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCompany(String newCompany) {
		company = newCompany;
	}
	
	public void setModel(String newModel) {
		model = newModel;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setMaxSpeed(int new_maxSpeed) {
		maxSpeed = new_maxSpeed;
	}
	
	public void setPrice(int new_Price) {
		price = new_Price;
	}
	
}
