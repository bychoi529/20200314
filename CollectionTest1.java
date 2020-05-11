package com.human.ex;
//핵심: collections을 사용하려면 equals랑 hashcode를 재정의해야만 한다. 
//방법:마우스좌 - source - generate hashcode and equals
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Rectangle implements Comparable<Rectangle>{
	
	@Override
	public int compareTo(Rectangle other) {
		// TODO Auto-generated method stub
		//-1 : 교환필요  0 :같음  1: 교환필요 없음.
		int returnValue=0;
		
		if(this.area()==other.area()) {
			returnValue=0;
		}else if(this.area()>other.area()) {
			returnValue=-1;
		}else if(this.area()<other.area()) {
			returnValue=1;
			//this other 서로 비교해서 this가 클때 -1이 리턴되면 내림차순 정렬
			//this other 서로 비교해서 this가 클때 1이 리턴되면 오름차순 정렬
			
		}
		return returnValue;
	}

	public double width,height;
	
	public double area() {
		return width*height;
	}     //area 를 정렬해보자

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	

	@Override //equals를 재정의함. 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
//		if (this.height != other.height)
//			return false;
//		if (this.width != other.width)
		if(this.width*this.height==other.width*other.height) {
			return true;
		}else {
			return false;  //넓이를 써서 10*11==11*10 같음을 재정의하려고. 
		}
		//return true;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
//클래스를 만들어서 비교
class RectangleWidthAsc implements Comparator<Rectangle>{
	@Override
	public int compare(Rectangle arg0,Rectangle arg1) {
		int returnValue=0;
		if(arg0.width>arg1.width) {
			returnValue=1;
		}else if(arg0.width<arg1.width) {
			returnValue=-1;
		}else {
			returnValue=0;
		}
		return returnValue;  //오름차순
	}
}

public class CollectionTest1 {

	public static void main(String[] args) {
		//우리가 만든 클래스의 문제점
		//int String 잘 돌아감
		System.out.println(new Rectangle(10,10));
		
		//add
		ArrayList<Rectangle> arrList = new ArrayList<Rectangle>();
		arrList.add(new Rectangle(10,10));
		arrList.add(new Rectangle(12,11));
		arrList.add(new Rectangle(11,20));
		arrList.add(new Rectangle(12,13));
		arrList.add(new Rectangle(11,12));
		
		//get
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("--------------------");
		
		//remove
//		arrList.remove(1);
//		System.out.println(arrList);   //지워짐.인덱스 이용하는 방법
		
		arrList.remove(new Rectangle(12,11));
		for(Rectangle r:arrList) {
			System.out.println(r);     //안지워짐. 객체 이용하는 방법. 변수에 저장안해서 다른 객체로 인식.=>equals로 재정의 해주고 처리해야 함.
		}
		System.out.println("---------------");
		Rectangle rect = new Rectangle(15,15);
		arrList.add(rect);
		arrList.remove(rect);
		for(Rectangle r:arrList) {
			System.out.println(r);     //지워짐.
			System.out.println("--------------------");
	
		}
		//객체 정렬 
		//comepareTo , compare
		//compareTo ==> comparable 인터페이스 : 매개변수 1개 vs 자기자신 비교
		//compare ==> comparator 인터페이스 : 매개변수 2개 비교
		Collections.sort(arrList); //에러.어떤 기준으로 sort하라는 건지 불명확. (height인지 width인지)
		
		System.out.println("---------------");
		
		for(Rectangle r:arrList) {
			System.out.println(r);     //지워짐.
		
		}	System.out.println("--------------------"); //내림차순 정렬됨.
		
		//width로  정렬 =>익명클래스 (클래스이름 없는것). 권장!
		Collections.sort(arrList,new Comparator<Rectangle>(){ //익명으로 sort
			@Override
			public int compare(Rectangle arg0,Rectangle arg1) {
				int returnValue=0;
				if(arg0.width>arg1.width) {
					returnValue=-1;
				}else if(arg0.width<arg1.width) {
					returnValue=1;
				}else {
					returnValue=0;
				}
				return returnValue;
			}
		
			});
		System.out.println("---------------------");
		
		Collections.sort(arrList,new RectangleWidthAsc()); //class만들어 sort
		for(Rectangle r:arrList) {
			System.out.println(r);  
		}
		
		//람다식 (요즘 트렌드)
		Collections.sort(arrList,(a,b)->{
			int returnValue=0;
			if(((Rectangle)a).height<((Rectangle)b).height) {
				returnValue=1;
			}else if (((Rectangle)a).height>((Rectangle)b).height) {
				returnValue=-1;
			}
			return returnValue; //height 내림차순
		});

		for(Rectangle r:arrList) {
			System.out.println(r);}  
	
	}
}

