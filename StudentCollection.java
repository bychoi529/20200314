//학생성적 관리 프로그램.
//학생객체를 만들어  국,영,수 순위,평균순위 입력받아 출력하는 프로그램 만드시오.
package com.human.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
	
	@Override
	public int compareTo(Student other) {
		int returnValue=0;
		if(this.avg()==other.avg()){
			returnValue=0;
		}else if(this.avg()>other.avg()) {
			returnValue=-1;
		}else {
			returnValue=1;
		}
		return returnValue;
	}
	public int kor=0;
	public int eng=0;
	public int mat=0;
	public String name="";
	
	public Student() {}
	public Student(String name,int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public double avg() {
		return (kor+eng+mat)/3;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + mat;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (mat != other.mat)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
}


public class StudentCollection {

	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();
		sList.add(new Student("a",90,70,60));
		sList.add(new Student("b",80,90,40));
		sList.add(new Student("c",70,80,80));
		sList.add(new Student("d",60,60,95));
		
		System.out.println("평균정렬");
		Collections.sort(sList);
		for(Student st:sList) {
			System.out.println(st);
		}
		System.out.println("국어정렬"); //익명클래스 이용
		Collections.sort(sList,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int returnValue=0;
				if(o1.kor>o2.kor) {
					returnValue=-1;
				}else if(o1.kor<o2.kor) {
					returnValue=1;
				}else {
					returnValue=0;
				}
				return returnValue;
			}
			
		});
		for(Student st:sList) {
			System.out.println(st);
		}
		System.out.println("영어정렬"); //익명클래스 이용
		Collections.sort(sList,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int returnValue=0;
				if(o1.eng>o2.eng) {
					returnValue=-1;
				}else if(o1.eng<o2.eng) {
					returnValue=1;
				}else {
					returnValue=0;
				}
				return returnValue;
				
			}
			
		});
		for(Student st:sList) {
			System.out.println(st);
		}
		System.out.println("수학정렬"); //람다식 이용
		Collections.sort(sList,(a,b)->{
			int returnValue=0;
			if(((Student)a).mat<((Student)b).mat){
				returnValue=1;
			}else if(((Student)a).mat>((Student)b).mat){
				returnValue=-1;
			}
			return returnValue;
		});
		for(Student st:sList) {
			System.out.println(st);
		}
	
	}

}
