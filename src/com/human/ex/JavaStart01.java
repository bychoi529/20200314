package com.human.ex;

public class JavaStart01 {

	public static void main(String[] args) {
		
			    //�μ����� ���ڸ� �Է¹޾� 1004�̸� '��ȣ�� ����' �ƴϸ� Ʋ��
//				java.util.Scanner sc=new java.util.Scanner(System.in);
//				System.out.println("��ȣ�� �Է��ϼ���");
//				String str=sc.nextLine();
//				int pw=Integer.parseInt(str);
//				if(pw==1004) {
//					System.out.println("��ȣ�� ����");
//				}
//				else {
//					System.out.println("��ȣ�� Ʋ��");
//				}
			
				//�ȳ� "�ʵ� �ȳ�" �߰� "�ʵ� �߰�" ���� "�ʵ� ����" ��� 
				java.util.Scanner scc=new java.util.Scanner(System.in);
				System.out.println("���ڸ� �Է��ϼ���");
				String str1=scc.nextLine();
				String hi=new String("�ȳ�");
				String by=new String("�߰�");
				String gn=new String("����");
				if(str1.equals(hi)){
					System.out.println("�ʵ�"+str1);
				}
				else if(str1.equals(by)) {
					System.out.println("�ʵ�"+str1);
				}
				else if(str1.equals(gn)) {
					System.out.println("�ʵ�"+str1);
				}
				else System.out.println("����");
				
				//�ȳ��� 3�� ����϶�
//				int h=0;
//				String hii=new String("�ȳ�");
//				for(h=0;h<3;h++) {
//					System.out.println(hii);
//				}
//				System.out.println("�ȳ���"+h+"�� ��µǾ����ϴ�.");
//				
				int h=0;
				String str=new String("�ȳ�");
				while(h<3) {
					System.out.println(str);
					h++;
				}
				
				
		}

	}

