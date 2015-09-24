package org.dimigo.collection;

import java.util.ArrayList;

public class MelonChart {
	
	public static void main(String[] args) {
		 ArrayList<Music> music = new ArrayList<Music>();
		 music.add(new Music("바람이나 좀 쐐", "개리"));
		 music.add(new Music("보통연애", "박경"));
		 music.add(new Music("취향저격", "iKON"));
		
		 System.out.println("- << 멜론 챠트 >> -");
		 printList(music);
		 
		 System.out.println();
		 System.out.println("- << 2위 곡 추가 >> -");
		 music.add(1, new Music("레옹", "이유갓지"));
		 printList(music);
		 
		 System.out.println();
		 System.out.println("- << 3위 곡 변경 >> -");
		 music.set(2, new Music("맙소사", "황태지"));
		 printList(music);
		 
		 System.out.println();
		 System.out.println("- << 4위곡 삭제 >> -");
		 music.remove(3);
		 printList(music);
		 
		 System.out.println();
		 System.out.println("- << 전체 리스트 삭제 >> -");
		 music.clear();
		 printList(music);
		 
	}
	
	public static void printList(ArrayList<Music> list) {
		for(Music m : list) {
			System.out.println(m.toString());
		}
	}

}
