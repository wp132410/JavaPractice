package org.dimigo.collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, ArrayList<Music>> Ballad = new HashMap<String, ArrayList<Music>>();
		Map<String, ArrayList<Music>> Dance = new HashMap<String, ArrayList<Music>>();
		
		ArrayList<Music> BalladMusic = new ArrayList<Music>();
		BalladMusic.add(new Music("내 첫사랑	", "베리굿"));
		BalladMusic.add(new Music("또 다시 사랑	", "임창정"));
		BalladMusic.add(new Music("부산에 가면", "박진영"));
		
		Ballad.put("발라드", BalladMusic);
		
		ArrayList<Music> DanceMusic = new ArrayList<Music>();
		DanceMusic.add(new Music("커피	", "유재환, 김예림"));
		DanceMusic.add(new Music("다 잘될꺼야", "쿨"));
		
		Dance.put("댄스", DanceMusic);
		
		printMap(Ballad);
		printMap(Dance);
		
		
		System.out.println("-------- << 발라드 3위 곡 변경 >> --------");
		BalladMusic.set(2, new Music("지우고 지워도", "차수경"));
		
		printMap(Ballad);
		printMap(Dance);
		
		System.out.println("-------- << 발라드 1위 곡 삭제> --------");
		BalladMusic.remove(0);
		
		printMap(Ballad);
		printMap(Dance);
		
		System.out.println("-------- << 전체 삭제 >> --------");
		
		BalladMusic.clear();
		DanceMusic.clear();
		Ballad.clear();
		Dance.clear();
			
		printMap(Ballad);
		printMap(Dance);
	}
	
	public static void printMap(Map<String, ArrayList<Music>> map) {
		System.out.println(map.keySet());
		
		for (String key : map.keySet()) {
			ArrayList<Music> music = map.get(key);
			if (music.size() != 0) {
				for(int i=0; i<music.size(); i++) {
					System.out.println(music.get(i));
				}
			}
			System.out.println();
		}
		
	}

}
