package com.human.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MenuSample {
	HashMap map = new HashMap();
    String key = null;
    int value = 0;
    Scanner sc = new Scanner(System.in);
    boolean bool = true;
    int num = 0;
    // map�ȿ� ������ Ȯ���ϱ� ���ؼ� �ݺ��� iterator ����
    Iterator it = map.keySet().iterator();
    
    while(bool) {
        System.out.println("1.�޴� ���");
        System.out.println("2.�޴��� ���� ����");
        System.out.println("3.�� ��");
        System.out.print(">>>");
        num = sc.nextInt();
        switch(num) {
        case 1:
            System.out.print("�޴� �Է� : ");
            // key�� �Է¹ޱ�
            key = sc.next();
            // �ߺ��� key���� �ִ��� Ȯ���ϱ�
            if(map.containsKey(key)==true) {
                System.out.println("�����ϴ� �޴� �Դϴ�.");
            } else {
                System.out.print("���� �Է� : ");
                // value�� �Է¹ޱ�
                value = sc.nextInt();
                // �Է¹��� key�� value���� map�� �߰��ϱ�
                map.put(key, value);
                System.out.println("��� �Ǿ����ϴ�.");    
            }
            break;
            
        case 2:
            // map�� ���������� ���� ���� iterator�� �־��ֱ�
            it = map.keySet().iterator();
            // map�� ���� ����ִ��� Ȯ��
            while(it.hasNext()) {
                // map�� ����ִ� ���� key�� �ֱ�
                key = (String)it.next();
                // key�� key�� �������ִ� value�� ����ϱ�
                System.out.println(key + " : " + map.get(key));
            }
            while(bool) {
                System.out.print("1.����\t" + "2.����\t" + "3.������");
                num = sc.nextInt();
                switch(num) {
                    case 1:
                        System.out.print("���� �޴��̸� �Է� : ");
                        key = sc.next();
                        System.out.print("���� ���� �Է� : ");
                        value = sc.nextInt();
                        System.out.println(map.get(key) + "->" + value);
                        System.out.println("���� �ƽ��ϴ�.!!!");
                        // key�� �������ִ� value�� �����ϱ�
                        map.replace(key, value);
                        break;
                    
                    case 2:
                        // map�� ���������� ���� ���� iterator�� �־��ֱ�
                        it = map.keySet().iterator();
                        // map�� ���� ����ִ��� Ȯ��
                        while(it.hasNext()) {
                            // map�� ����ִ� ���� key�� �ֱ�
                            key = (String)it.next();
                            // key�� key�� �������ִ� value�� ����ϱ�
                            System.out.println(key + " : " + map.get(key));
                        }
                        System.out.print("������ �̸� �Է� : ");
                        key = sc.next();
                        System.out.println(key + "�޴��� ���� �ƽ��ϴ�.");
                        // map�� ������ �ִ� key���� key���� �������ִ� value���� �����ϱ�
                        map.remove(key);
                            break;
                    
                    case 3:
                        bool = false;
                        break;
                    }
                }
                // case 2:�� Ż���ϱ� ���� boole�� false�� �ٲپ��µ�
                // bool�� true�� �ٲ����� ������ ��ü while���� Ż���ϱ� ������
                // bool�� true�� ����
                bool = true;
                break;
        
            case 3:
                // ��ü while���� Ż���ϱ� ���� bool�� false�� ����
                bool = false;
                System.out.println("���� �մϴ�.!!!");
                break;
        }
    }
}

}
