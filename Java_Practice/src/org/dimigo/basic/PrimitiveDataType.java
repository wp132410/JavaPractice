/**
 * << 첫번째 수행평가 과제 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일지 : 2015년 3월 13일
 * @author : Pengpark
 * @version	1.0
 */

package org.dimigo.basic;

public class PrimitiveDataType {
	
	public static void main(String[] args) {
		
		String name = "아이유";
		boolean ismale = false;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.printf("이름 : %s\n", name);
		
		if(ismale)
			System.out.println("성별 : 남자");
		else
			System.out.println("성별 : 여자");
		
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodType + "형");
		
		
		
		
	}
}
