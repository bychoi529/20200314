package com.human.ex;
//�ٽ�: collections�� ����Ϸ��� equals�� hashcode�� �������ؾ߸� �Ѵ�. 
//���:���콺�� - source - generate hashcode and equals
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Rectangle implements Comparable<Rectangle>{
	
	@Override
	public int compareTo(Rectangle other) {
		// TODO Auto-generated method stub
		//-1 : ��ȯ�ʿ�  0 :����  1: ��ȯ�ʿ� ����.
		int returnValue=0;
		
		if(this.area()==other.area()) {
			returnValue=0;
		}else if(this.area()>other.area()) {
			returnValue=-1;
		}else if(this.area()<other.area()) {
			returnValue=1;
			//this other ���� ���ؼ� this�� Ŭ�� -1�� ���ϵǸ� �������� ����
			//this other ���� ���ؼ� this�� Ŭ�� 1�� ���ϵǸ� �������� ����
			
		}
		return returnValue;
	}

	public double width,height;
	
	public double area() {
		return width*height;
	}     //area �� �����غ���

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
	

	@Override //equals�� ��������. 
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
			return false;  //���̸� �Ἥ 10*11==11*10 ������ �������Ϸ���. 
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
//Ŭ������ ���� ��
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
		return returnValue;  //��������
	}
}

public class CollectionTest1 {

	public static void main(String[] args) {
		//�츮�� ���� Ŭ������ ������
		//int String �� ���ư�
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
//		System.out.println(arrList);   //������.�ε��� �̿��ϴ� ���
		
		arrList.remove(new Rectangle(12,11));
		for(Rectangle r:arrList) {
			System.out.println(r);     //��������. ��ü �̿��ϴ� ���. ������ ������ؼ� �ٸ� ��ü�� �ν�.=>equals�� ������ ���ְ� ó���ؾ� ��.
		}
		System.out.println("---------------");
		Rectangle rect = new Rectangle(15,15);
		arrList.add(rect);
		arrList.remove(rect);
		for(Rectangle r:arrList) {
			System.out.println(r);     //������.
			System.out.println("--------------------");
	
		}
		//��ü ���� 
		//comepareTo , compare
		//compareTo ==> comparable �������̽� : �Ű����� 1�� vs �ڱ��ڽ� ��
		//compare ==> comparator �������̽� : �Ű����� 2�� ��
		Collections.sort(arrList); //����.� �������� sort�϶�� ���� �Ҹ�Ȯ. (height���� width����)
		
		System.out.println("---------------");
		
		for(Rectangle r:arrList) {
			System.out.println(r);     //������.
		
		}	System.out.println("--------------------"); //�������� ���ĵ�.
		
		//width��  ���� =>�͸�Ŭ���� (Ŭ�����̸� ���°�). ����!
		Collections.sort(arrList,new Comparator<Rectangle>(){ //�͸����� sort
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
		
		Collections.sort(arrList,new RectangleWidthAsc()); //class����� sort
		for(Rectangle r:arrList) {
			System.out.println(r);  
		}
		
		//���ٽ� (���� Ʈ����)
		Collections.sort(arrList,(a,b)->{
			int returnValue=0;
			if(((Rectangle)a).height<((Rectangle)b).height) {
				returnValue=1;
			}else if (((Rectangle)a).height>((Rectangle)b).height) {
				returnValue=-1;
			}
			return returnValue; //height ��������
		});

		for(Rectangle r:arrList) {
			System.out.println(r);}  
	
	}
}

