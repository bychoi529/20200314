//ArrayList 
//��ü���� ���� ���� ��ȸ �Ҽ� �ִ� �����̳� Ŭ�����̴�.
//�迭�� ���� ���� ������ �غ��Ҽ� �ִ�. 
package com.human.ex;

import java.util.ArrayList; //import �ʿ�. (���콺 hover)
import java.util.Collections;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		
		//1.����
		ArrayList<Integer> arrList=new ArrayList<Integer>(); //generic���� �ڷ��� int�� ����
		//Wrapper class : �� �ڷ���(primitive data types)�� ���� Ŭ���� ǥ�� (�������� ����)
	
		//2.�߰�
		arrList.add(40);
		arrList.add(30); 
		arrList.add(20); 
		arrList.add(10); 
		
		//3.get(�ε���)���� Ȯ��
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));  // 40 30 20 10 
		}
//		
//		//4. remove:�� ����
//		
//		//�ε����� �̿��� 30�� ��������
//		arrList.remove(1);             //Integer 30 �� ����
//		System.out.println(arrList);  // [40,20,10]
//		
//		for(int i:arrList) {
//			System.out.println(i);  // 40 20 10
//		}
//		
//		//�ε����� �ƴ� �����Ͱ����� 10 ����
//		arrList.remove((Integer)10);  //true ����
//		for(int i:arrList) {
//			System.out.println(i);  // 40 20 
//		}
		
		//5.����
		Collections.sort(arrList);  //import 
		Iterator<Integer> iter = arrList.iterator(); //import
		while(iter.hasNext()) {                 //���� �����Ͱ� �ִ��� ���� Ȯ��. 
			System.out.println(iter.next());    //10 20 30 40 ���� �������� ���ĵ�.
		}
		//index of :ã�� �������� ��ġ ����
		int index=arrList.indexOf((Integer)10); 
		System.out.println(index);  //0 
		index=arrList.indexOf(10); 
		System.out.println(index);  //0 .����. BOXING (�ڵ� ����ȯ) ��. 
		
		//contains : ã�� �������� ���� ����
		System.out.println(arrList.contains(10));  //true
		System.out.println(arrList.contains(50));  //false
		
		
		
		
	}

}
