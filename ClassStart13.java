//�������̵� Override
package com.human.ex;
class Animal{
	
	public static void displayName(Animal a) {  //������ �̸��� ��� �޼ҵ�. line126
		a.getName();
		a.move();
	}
//	public static void displayName(Human a) {   //�������̹Ƿ� ���� �ʿ����.
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
		System.out.println("�Դ´�.");
	}
	public void move() {
		System.out.println("�����δ�.");
	}
	
}
class Human extends Animal{
	public Human(String name) {
		super(name);	
	}
	@Override                               //@ :������̼� . �ڹٿ����� �����Ϸ� �ּ�����.  Spring������ @�� ���α׷�����.
	public void move() {
		System.out.println("�ȴ´�.");     //Override(������) : �����δ�->�ȴ´� �� '������'��. 
	}
	//���ο� �޼ҵ带 �־��
	public void read() {
		System.out.println("å�� �д´�.");
	}
}
class Tiger extends Animal{
	public Tiger(String name) {
		super(name);
	}
	public void move() {
		System.out.println("�׹߷� ����Ÿ���.");
	}
	public void hunting() {
		System.out.println("����Ѵ�.");
	}
}
class Eagle extends Animal{
	public Eagle(String name) {
		super(name);
	}
	public void move() {
		System.out.println("���ƴٴѴ�.");
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

	// ������  : �θ� �ڽ��� ���� �� �ִ�. 
	// ���,ȣ����,�������� �ϳ��� �迭�� �־ ����غ���.

	Animal a1=new Animal("������"); //���� ����
	Animal a2=new Human("ȫ�浿");  //�굵 ���� (�θ� Ŭ������ �ڽ��� ���� �� �����Ƿ�)
	Animal a3=new Tiger("ȣ����");
	Animal a4=new Eagle("������");
	
	a1.getName();
	a1.eat();
	a1.move();                //new Animal �ϰ�� �������� ��°���.
	//((Human)a1).read();    // ����ȯ�ص� �Ұ�. ������ ���� ������ �θ����� ����Ҽ� ����. 
	
	System.out.println("=======");
	
	a2.getName();
	a2.eat();
	a2.move(); // "�ٽ�" : animal.move()�� Animal Ŭ���� ������ '�����δ�'�� �ƴ� �ڽ���'�ȴ´�'�� ����. 
	((Human)a2).read(); //����ȯ�ؾ� ������. : å�� �д´�.
	
	System.out.println("=======");
	//====�߿�====
	//Overload : �޼ҵ� �̸��� ������ �Ű������� �ٸ� �޼ҵ� 
	//Override : ����� ���� �����ǵ� �޼ҵ�
	
	//�θ�Ŭ������ �ڽ�Ŭ������ ���� �ν��Ͻ�
	//�⺻������ �θ� �ִ� �޼ҵ峪 �ʵ忡 �����Ѵ�. 
	//���������� override�� �޼ҵ�� �ڽ� �޼ҵ尡 ��µȴ�. (line 105)
	//�ڽĿ� �ִ� �޼ҵ带 �����ų �� ����. �����Ű�� ������ ����ȯ
	
	//human,tiger,eagle Ŭ�������� �ϳ��� �迭�� �־ ó���ϴ� ���. => �� �� ��
	
	Animal arr[]=new Animal[4];
	arr[0]=a1;arr[1]=a2;arr[2]=a3;arr[3]=a4;  //line91
	for(Animal ani:arr) {
		ani.move();
	}
	System.out.println("=======");
	//������ �Ű������� �޾Ƽ� name�� ����ϴ� �Լ��� ������.
    
	
	Animal.displayName(a1);
	Animal.displayName(a2);
	Animal.displayName(a3);
	Animal.displayName(a4);
	
	//��ӹ��� ���θ� �˾ƺ��� ���� ������ instanceof
	System.out.println(a1 instanceof Animal); //true; AnimalŬ�����̳�? 
	
	System.out.println(a1 instanceof Human); //false;
	System.out.println(a2 instanceof Human); //true
	System.out.println(a3 instanceof Human); //f
	System.out.println(a4 instanceof Human); //f
	
	
	
	
	
	
	
	}

}
