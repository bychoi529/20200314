//	Map

package com.human.ex;

import java.util.HashMap;
import java.util.Iterator;

public class Map {

	public static void main(String[] args) {
		//선언
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		//삽입 put
		hm.put("삼십",30);  //key value
		hm.put("십",10);
		hm.put("사십",40);
		hm.put("오십",50);
		
		//순회 : keySet을 부모로 가지고, key가 출력됨
		System.out.println(hm.keySet());  //[오십, 삼십, 사십, 십]
		
		for(String key:hm.keySet()) {
			System.out.println(key);   //오십, 삼십, 사십, 십
		}
		
		//제거 remove :key값을 넣어줌
		hm.remove("사십");
		
		//iterator
		Iterator<String> keys=hm.keySet().iterator(); //import
		while(keys.hasNext()) {
			String key=keys.next();
			System.out.println(String.format("key:%s value:%d", key,hm.get(key)));
		}// 형태, key, value
			 // key:오십 value:50
			 //key:삼십 value:30
			 //key:십 value:10
			
		//값변경  replace
		hm.replace("이십",200);
		for(String key:hm.keySet()) {
			System.out.println(String.format("key:%s value:%d", key,hm.get(key))); 
		}
		
		System.out.println("사이즈"+hm.size()); //사이즈 3
		
		
		
		
	}

}
