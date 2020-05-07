package com.human.ex;

interface Inter1{
	 public void z();
	}
interface Inter2{
	 public void z(int a);
	}
interface Inter3{
	 public void z(int a,int b);
	}

	public class Lambda {

	 public static void main(String[] args) {
	  /*
	   기존 메소드 작성
	   반환타입  메소드이름(매개변수){
	    메소드 내용
	   }
	   람다식  - 반환타입 없음 메소드이름 없음
	   (매개변수)->{
	    메소드 내용
	   }
	   int sum(int a,int b){
	    return a+b; 
	   }
	   (a,b)->{
	    return a+b;
	   }
	   
	   반환값이 있는 경우 return, {},; 생략가능
	   (a,b)->a+b
	   
	   일력 값이 1개이고 타입을 추론할 수 있는경우
	   () 도 생략 가능
	   a->a+1
	   public int add(int a){
	    return a+1;
	   }
	   */
	  Inter1 a=()->System.out.println("Inter1");        //Inter1
	  a.z();
	  Inter2 b=b1->System.out.println("Inter2"+b1);     //Inter210
	  b.z(10);
	  Inter2 b2=(b1)->{
	   System.out.println("Inter2"+b1);                //Inter211
	  };
	  b2.z(11);
	  Inter3 b3=(a1,b1)->{
	   int x=a1+b1;
	   System.out.println(x);
	  };
	  b3.z(11, 21);                                    //32
	  
	  
	  


	 }

	}





