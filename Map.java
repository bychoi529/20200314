//	Map

package com.human.ex;

import java.util.HashMap;
import java.util.Iterator;

public class Map {

	public static void main(String[] args) {
		//����
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		//���� put
		hm.put("���",30);  //key value
		hm.put("��",10);
		hm.put("���",40);
		hm.put("����",50);
		
		//��ȸ : keySet�� �θ�� ������, key�� ��µ�
		System.out.println(hm.keySet());  //[����, ���, ���, ��]
		
		for(String key:hm.keySet()) {
			System.out.println(key);   //����, ���, ���, ��
		}
		
		//���� remove :key���� �־���
		hm.remove("���");
		
		//iterator
		Iterator<String> keys=hm.keySet().iterator(); //import
		while(keys.hasNext()) {
			String key=keys.next();
			System.out.println(String.format("key:%s value:%d", key,hm.get(key)));
		}// ����, key, value
			 // key:���� value:50
			 //key:��� value:30
			 //key:�� value:10
			
		//������  replace
		hm.replace("�̽�",200);
		for(String key:hm.keySet()) {
			System.out.println(String.format("key:%s value:%d", key,hm.get(key))); 
		}
		
		System.out.println("������"+hm.size()); //������ 3
		
		
		
		
	}

}
