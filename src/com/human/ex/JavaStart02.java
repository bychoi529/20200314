package com.human.ex;

class Cat{
	public int age=0;
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + "]";
	}
	public String name="����";
}

//import java.util.Scanner;

public class JavaStart02 {

	public static void main(String[] args) {
		
//		//12��~2���� �ܿ�, 3��~5���� �� , 6��~8���� ���� 9��~11�� ������ ����غ���. 
//		Scanner sc=new Scanner(System.in);
//		System.out.println("���� �Է��ϼ���");
//		int month=sc.nextInt();
//		switch(month) {
//		case 12:case 1:case 2:							  //���� �������� �����ٸ� ���̽����� ����
//			System.out.println(month+"���� �ܿ��Դϴ�.");
//			System.out.println(month+"���� ���� �����Դϴ�."); //�� ���̽��� ���� ���� �����ɵ� ����
//			break;
//		case 3:case 4:case 5:
//			System.out.println(month+"���� ���Դϴ�.");
//			break;
//		case 6:case 7:case 8:
//			System.out.println(month+"���� �����Դϴ�.");
//			break;
//		}
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("���� �Է��ϼ���");
//		int month1=scan.nextInt();
//		if(month1==12||month1==1||month1==2){
//			System.out.println(month1+"���� �ܿ��Դϴ�.");}
//			else if(month1==3||month1==4||month1==5){
//			System.out.println(month1+"���� ���Դϴ�.");}
//			else if(month1==6||month1==7||month1==8){
//			System.out.println(month1+"���� �����Դϴ�.");}
//			else if(month1==9||month1==10||month1==11){
//			System.out.println(month1+"���� �����Դϴ�.");}
//			else {
//				System.out.println("�߸� �Էµ� �����Դϴ�");
//			}
//		
//		
//		
//		java.util.Random rd=new java.util.Random();
//		int i=rd.nextInt(5);
//		System.out.println(i);
//		
//		
//		
//		int a,b,c,temp;
//		Scanner sc1=new Scanner(System.in);
//		System.out.println("�� ���� �Է����ּ���");
//		a=Integer.parseInt(sc1.nextLine());
//		b=Integer.parseInt(sc1.nextLine());
//		c=Integer.parseInt(sc1.nextLine());
//		if(b>c&&b>a) {
//			temp=a;
//			a=b;
//			b=temp;
//		}
//		if(c>a&&c>b) {
//			temp=a;
//			a=c;
//			c=temp;
//			}
//		
//		if(c>b) {
//			temp=b;
//			b=c;
//			c=temp;
//		}
//		System.out.println();
//		System.out.println(a+">"+b+">"+c);
//	
		
//			System.out.println("������ ���Ǵ�");
//			System.out.format("%6f",27000.);
//			System.out.println("�Դϴ�");
		
//		Scanner sc= new java.util.Scanner(System.in);
//		System.out.println("�� ���� �Է��ϼ���>>");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=0;
//		if(a>b) {
//			}else
//			{c=a;
//			a=b;
//			b=c;
//			}
//			
//		System.out.print(a);
//		System.out.println(b);
//		int i=0;
//		while(i<3) {
//			System.out.println("�ȳ�");
//			i++;
//		}System.out.println("����");
//		
//		String str= new String("�ȳ�");
//		int h=0;
//		for(h=0;h<3;h++) {
//			System.out.println("�ȳ�");
//		} System.out.println("�ȳ���"+ h+"�� ��µ�");
//		
//		int a,sum=0;
//		for(a=0;a<11;a++) {
//			sum+=a;
//		}System.out.printf("1���� 10������ ���� %d�Դϴ�",sum);
//		
//		Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("�����Է�>>");
//		String text=sc.nextLine();
//		String hi=new String("�ȳ�");
//		String bi=new String("�߰�");
//		String gn=new String("����");
//		if(text.equals(hi)) {
//			System.out.println("�ʵ�"+hi);
//		}else if(text.equals(bi)) {
//			System.out.println("�ʵ�"+bi);
//		}else if(text.equals(gn)) {
//			System.out.println("�ʵ�"+gn);
//		}else {
//			System.out.println("�߸��� �Է��Դϴ�");
//		}
//		
//		Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("�����Է�>>");
//		String text1=sc.nextLine();
//		
//			switch(text1){
//			case "�ȳ�":
//				System.out.println("�ʵ� �ȳ�");
//				break;
//			case "����":
//				System.out.println("�ʵ� ����");
//				break;
//			default:
//				System.out.println("�߸��� ���ڿ��Դϴ�");
//			}
				
				
//				Scanner sc=new java.util.Scanner(System.in);
//				int max=Integer.MIN_VALUE;
//				int min=Integer.MAX_VALUE;
//				
//				for(int i=0;i<5;i++) {
//					System.out.println("���� �Է�>>");
//					int input=sc.nextInt();
//					if(input>max) {
//						max=input;
//					}
//					if(input<min) {
//						min=input;
//					}
//				}
//				System.out.println("���� ū��:"+max+"���� ������:"+min);
//		
//		
//		Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("����,����,�� �� �ϳ��� �Է��ϼ���");
//		String userData=sc.nextLine();
//		java.util.Random rd=new java.util.Random();
//		int computerNum=rd.nextInt(3);
//		String winner="";
//		String computerData=" ";
//		switch(userData) {
//		case "����":
//			switch(computerNum) {
//			case 0:
//				computerData="����";
//				winner="���";
//				break;
//			case 1:
//				computerData="����";
//				winner="��ǻ�� ��";
//				break;
//			case 2:
//				computerData="��";
//				winner="�¸��Ͽ����ϴ�!";
//				break;
//			
//			
//			}
//		 case "����":
//			 switch(computerNum) {
//			 case 0:
//				 computerData="����";
//				 winner="�¸��Ͽ����ϴ�!";
//				 break;
//			 case 1:
//				 computerData="����";
//				 winner="���";
//				 break;
//			 case 2:
//				 computerData="��";
//			 	 winner="��ǻ�� ��";
//			 	 break;
//			 default:
//				 System.out.println("�߸��� �Է�");
//				 break;
//			 }
//		 case "��":
//			 switch(computerNum) {
//			 case 0:
//				 computerData="����";
//				 winner="��ǻ�ͽ�";
//				 break;
//			 case 1:
//				 computerData="����";
//				 winner="�¸��Ͽ����ϴ�!";
//				 break;
//			 case 3:
//				 computerData="��";
//				 winner="���";
//				 break;
//		     default:
//		    	 System.out.println("�߸��� �Է�");
//		    	 break;
//			 }
//			
//		}
//		    System.out.println("��:"+userData);
//			System.out.println("��ǻ��:"+computerData);
//			System.out.println("����:"+winner);
		
		//���� ������ �̿��� �μ� ���ϴ� ���α׷� ����. 
//		Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("�� ���� �Է��ϼ���");
//		int a,b;
//		int temp=0;
//		a=sc.nextInt();
//		b=sc.nextInt();
//		temp=(a>b)? a:b;
//		System.out.println(temp);
//		
//		
//		boolean b=true;
//		boolean b1=false;
//		boolean []bArray=new boolean[4];
//		bArray[0]=false;
//		bArray[1]=b1;
//		bArray[2]=bArray[0];
//		bArray[3]=true;
//		
//		System.out.println(Arrays.toString(bArray));
		
		Cat cat1=new Cat();
		cat1.name="��1";
//		cat1.age=18;
//		Cat cat2=cat1;
//		cat2.name="��2";
//		cat2.age=19;
//		Cat cat3=new Cat();
//		cat3.name="��3";
//		cat3.age=20;
//		Cat cArr[]=new Cat[3];
//		cArr[0]=new Cat();
//		cArr[0].age=11;
//		cArr[0].name="��1";
//		cArr[1]=cat1;
//		cArr[2]=cat2;
//		System.out.println(Arrays.toString(cArr));
		
		
		
	}
		
	}


