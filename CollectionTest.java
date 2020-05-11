//ArrayList 
//객체들을 삽입 삭제 조회 할수 있는 컨테이너 클래스이다.
//배열의 길이 제한 단점을 극복할수 있다. 
package com.human.ex;

import java.util.ArrayList; //import 필요. (마우스 hover)
import java.util.Collections;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		
		//1.선언
		ArrayList<Integer> arrList=new ArrayList<Integer>(); //generic통해 자료형 int로 한정
		//Wrapper class : 본 자료형(primitive data types)에 대한 클래스 표현 (면접질문 가능)
	
		//2.추가
		arrList.add(40);
		arrList.add(30); 
		arrList.add(20); 
		arrList.add(10); 
		
		//3.get(인덱스)으로 확인
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));  // 40 30 20 10 
		}
//		
//		//4. remove:값 삭제
//		
//		//인덱스를 이용해 30을 지워보자
//		arrList.remove(1);             //Integer 30 이 리턴
//		System.out.println(arrList);  // [40,20,10]
//		
//		for(int i:arrList) {
//			System.out.println(i);  // 40 20 10
//		}
//		
//		//인덱스가 아닌 데이터값으로 10 삭제
//		arrList.remove((Integer)10);  //true 리턴
//		for(int i:arrList) {
//			System.out.println(i);  // 40 20 
//		}
		
		//5.정렬
		Collections.sort(arrList);  //import 
		Iterator<Integer> iter = arrList.iterator(); //import
		while(iter.hasNext()) {                 //다음 데이터가 있는지 여부 확인. 
			System.out.println(iter.next());    //10 20 30 40 으로 오름차순 정렬됨.
		}
		//index of :찾는 데이터의 위치 리턴
		int index=arrList.indexOf((Integer)10); 
		System.out.println(index);  //0 
		index=arrList.indexOf(10); 
		System.out.println(index);  //0 .동일. BOXING (자동 형변환) 됨. 
		
		//contains : 찾는 데이터의 존재 유무
		System.out.println(arrList.contains(10));  //true
		System.out.println(arrList.contains(50));  //false
		
		
		
		
	}

}
