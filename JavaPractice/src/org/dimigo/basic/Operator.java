package org.dimigo.basic;

public class Operator {
	
	public static void main(String[] args)	{
		
		int a = 9, b = 10;
		
		double h1 = 5.8, h2 = 5.4;
		double sqr = ((a + b) * h1)/2; // 사다리꼴 넓이
		double sqr2 = a * h2; // 평행사변형 넓이
		double max = 0;
		
		String max_name, min_name;
		
		if(sqr > sqr2) {
			max = sqr - sqr2;
			max_name = "사다리꼴";
			min_name = "평행사변형";
			
		}
		else {
			max = sqr2 - sqr;
			max_name = "평행사변형";
			min_name = "사다리꼴";
		}
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + sqr);
		System.out.println("평행사변형 넓이 : " + sqr2);
		System.out.println(max_name + "이 " + min_name + "보다 " + max + "더 큽니다");
		
	}
}
