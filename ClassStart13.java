//오버라이드 Override
package com.human.ex;
class Animal{
	
	public static void displayName(Animal a) {  //동물의 이름을 찍는 메소드. line126
		a.getName();
		a.move();
	}
//	public static void displayName(Human a) {   //다형성이므로 써줄 필요없다.
//		a.getName();
//		a.move();
//	}
//	public static void displayName(Tiger a) {  
//		a.getName();
//		a.move();
//	}
//	public static void displayName(Eagle a) {  
//		a.getName();
//		a.move();
//	}
	
	public String name;
	public Animal(String name) {
		this.name = name;
	}
	public void getName() {
		System.out.println(name);
	}
	public void eat() {
		System.out.println("먹는다.");
	}
	public void move() {
		System.out.println("움직인다.");
	}
	
}
class Human extends Animal{
	public Human(String name) {
		super(name);	
	}
	@Override                               //@ :어노테이션 . 자바에서는 컴파일러 주석역할.  Spring에서는 @로 프로그래밍함.
	public void move() {
		System.out.println("걷는다.");     //Override(재정의) : 움직인다->걷는다 로 '재정의'함. 
	}
	//새로운 메소드를 넣어보자
	public void read() {
		System.out.println("책을 읽는다.");
	}
}
class Tiger extends Animal{
	public Tiger(String name) {
		super(name);
	}
	public void move() {
		System.out.println("네발로 어슬렁거린다.");
	}
	public void hunting() {
		System.out.println("사냥한다.");
	}
}
class Eagle extends Animal{
	public Eagle(String name) {
		super(name);
	}
	public void move() {
		System.out.println("날아다닌다.");
	}
}
public class ClassStart13 {

	public static void main(String[] args) {
	Animal a=new Animal("cat1");
	a.getName();
	a.eat();
	a.move();
	
	
	Human h=new Human("human1");
	h.getName();
	h.eat();
	h.move();
	
	Tiger t=new Tiger("tiger1");
	t.getName();
	t.move();
	System.out.println("=======");

	// 다형성  : 부모에 자식을 넣을 수 있다. 
	// 사람,호랑이,독수리를 하나의 배열에 넣어서 출력해보자.

	Animal a1=new Animal("강아지"); //원래 가능
	Animal a2=new Human("홍길동");  //얘도 가능 (부모 클래스에 자식을 넣을 수 있으므로)
	Animal a3=new Tiger("호랑이");
	Animal a4=new Eagle("독수리");
	
	a1.getName();
	a1.eat();
	a1.move();                //new Animal 일경우 세가지만 출력가능.
	//((Human)a1).read();    // 형변환해도 불가. 재정의 되지 않으면 부모통해 출력할수 없다. 
	
	System.out.println("=======");
	
	a2.getName();
	a2.eat();
	a2.move(); // "핵심" : animal.move()는 Animal 클래스 이지만 '움직인다'가 아닌 자식의'걷는다'로 찍힘. 
	((Human)a2).read(); //형변환해야 가능함. : 책을 읽는다.
	
	System.out.println("=======");
	//====중요====
	//Overload : 메소드 이름은 같은데 매개변수가 다른 메소드 
	//Override : 상속을 통해 재정의된 메소드
	
	//부모클래스에 자식클래스를 넣은 인스턴스
	//기본적으로 부모에 있는 메소드나 필드에 접근한다. 
	//예외적으로 override된 메소드는 자식 메소드가 출력된다. (line 105)
	//자식에 있는 메소드를 실행시킬 수 없다. 실행시키고 싶으면 형변환
	
	//human,tiger,eagle 클래스들을 하나의 배열에 넣어서 처리하는 방법. => 다 형 성
	
	Animal arr[]=new Animal[4];
	arr[0]=a1;arr[1]=a2;arr[2]=a3;arr[3]=a4;  //line91
	for(Animal ani:arr) {
		ani.move();
	}
	System.out.println("=======");
	//동물을 매개변수로 받아서 name을 출력하는 함수를 만들자.
    
	
	Animal.displayName(a1);
	Animal.displayName(a2);
	Animal.displayName(a3);
	Animal.displayName(a4);
	
	//상속받은 여부를 알아보기 위한 연산자 instanceof
	System.out.println(a1 instanceof Animal); //true; Animal클래스이냐? 
	
	System.out.println(a1 instanceof Human); //false;
	System.out.println(a2 instanceof Human); //true
	System.out.println(a3 instanceof Human); //f
	System.out.println(a4 instanceof Human); //f
	
	
	
	
	
	
	
	}

}
