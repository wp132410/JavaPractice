/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 *		|_ PiggyBankTest
 * 1. 	개  요 	:
 * 2. 	작성일 	:  2015. 6. 15.
 * </pre>
 * @author 	: 	pengpark
 *  @version		: 	1.0
 *
 */
public class PiggyBankTest {
		public static void main(String[] args) {
				FamilyMember Dad = new FamilyMember("아빠");
				FamilyMember Mom = new FamilyMember("엄마");
				FamilyMember Me = new FamilyMember("나");
				FamilyMember Young = new FamilyMember("동생");
				
				FamilyMember.printMemberCnt();
				System.out.println();
				
				PiggyBank.printMoney(Dad, 10000);
				PiggyBank.printMoney(Mom, 5000);
				PiggyBank.printMoney(Me, 2000);
				PiggyBank.printMoney(Young, 1000);
				
				PiggyBank.printBalance();
				
				PiggyBank.printMoney(Young, 1000);
				
				PiggyBank.printBalance();
				
		}
}
