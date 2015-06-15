/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 *		|_ PiggyBank
 * 1. 	개  요 	:
 * 2. 	작성일 	:  2015. 6. 15.
 * </pre>
 * @author 	: 	pengpark
 *  @version		: 	1.0
 *
 */
public class PiggyBank {
		private static int balance;
		
		public static void printMoney(FamilyMember member, int amount) {
				System.out.println(member.getMemberName() + amount + "원" + "넣음");
				System.out.println();
				balance+=amount;
		}
		
		public static void printBalance() {
			System.out.println("돼지저금통 총 금액 : " + balance + "원");
			System.out.println();
		}

}