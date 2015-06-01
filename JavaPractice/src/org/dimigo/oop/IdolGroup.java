/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 *		|_ IdolGroup
 * 1. 	개  요 	:
 * 2. 	작성일 	:  2015. 6. 1.
 * </pre>
 * @author 	: 	pengpark
 *  @version		: 	1.0
 *
 */
public class IdolGroup {
	
		public static void main(String[] args) {
				String[] idolGroup = new String[] {
						"빅뱅", "2NE1", "걸스데이"
				};
				
				String[][] members = {
						{"GD", "태양", "대성", "탑", "승리"} ,
						{"CL", "산다라박", "박봄", "민지"},
						{"유리", "해리", "소진", "민아"}
				};
				
				for(int i=0; i<idolGroup.length; i++) {
					System.out.println("<< " + idolGroup[i] + "맴버 >>" );
					for(int j=0; j<members[i].length; j++) {
						System.out.println(members[i][j]);
					}
					System.out.println();
				}
		}

}
