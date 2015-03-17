package org.dimigo.basic;

public class Promotion {
	
	public static void main(String[] args) {
		
		long monPrice = 1700000;
		int countPeople = 3;
		int storeNum = 1500;
		
		long yearTotal = monPrice * 12 * countPeople * storeNum; 
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d",monPrice) + "원");
		System.out.println("점포 내 직원수 : " + countPeople + "명");
		System.out.println("점포 수 : " +  String.format("%,d",storeNum) + "개");
		System.out.printf("\n\n");
		System.out.println("연간 인건비 : " + String.format("%,d",yearTotal) + "원");
	}
}