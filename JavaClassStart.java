package com.human.ex;
class Bank{
public String id;
public String password;
public long account = 0l;
public Bank() {}
public Bank(String id, String password, long account) {
this.id = id;
this.password = password;
this.account = account;
}


}
class MyBank{

public static java.util.Scanner sc = new java.util.Scanner(System.in);
long money = 0l;
public Bank [] arrBank = new Bank[100];
public static int BankIndex=0;


//1.ȸ�����
public void registration() {
System.out.println("ȸ����� ������");
System.out.print("ID : ");
String id = sc.next();

if (searchBank(id) != null) {
for (;;) {
System.out.println("�̹� ������� ID�Դϴ�.");
System.out.println("�ٽ� �Է����ּ���.");
System.out.print("ID : ");
id = sc.next();

if(searchBank(id)==null) {
break;
}
}
}
while (true) {
System.out.print("��й�ȣ : ");
String password = sc.next();
System.out.print("��й�ȣ Ȯ�� : ");
String password2 = sc.next();
if (password.equals(password2)) {
long account = 0l;
arrBank[BankIndex++] = new Bank(id, password, account);
System.out.println("ȸ�������� ���ϵ帳�ϴ�!");
break;
} else {
System.out.println("��й�ȣ Ȯ�� �����Դϴ�.");
System.out.println("���Է����ּ���.");
}
}
}

//2.�α���
public Bank logIn() {

System.out.println("�α��� ������");
System.out.print("ID : ");
String inputID = sc.next();

Bank info = searchBank(inputID);

if (info == null) {
System.out.println("ȸ�������� �����ϴ�. ȸ�������� ���ּ���.");
return null;
}
System.out.print("��й�ȣ : ");
String inputPassword = sc.next();
if(!info.password.equals(inputPassword)) {
System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
return null;
}
System.out.println("�α��μ���!");
return info;
}

//2-1. ȸ�� ��ȸ
public Bank searchBank(String id) {
Bank result = null;
for (int i=0;i<BankIndex;i++) {
if(arrBank[i].id.equals(id)) {
result = arrBank[i];
break;
}
}
return result;
}

//�Ա�
public void deposit() {
Bank info = logIn();
if (info == null) {
System.out.println("���� ȭ������ ���ư��ϴ�.");
return;
} else {

System.out.print("������ �־��ּ���.");
money = sc.nextLong();
info.account = info.account + money;
System.out.println(String.format("���� ���� �ܾ��� %d �� �Դϴ�.\n", info.account));
}
}

//���
public void withdraw() {
Bank info = logIn();
if (info == null) {
System.out.println("���� ȭ������ ���ư��ϴ�.");
return;
} else {
System.out.print(String.format("���� ���� �ܾ��� %d �� �Դϴ�.\n����� �ݾ��� �Է��ϼ���.\n", info.account));
money = sc.nextLong();

if (info.account < money) {
System.out.println("�ܾ��� �����մϴ�.");
} else {
info.account = info.account - money;
System.out.println(String.format("���� ���� �ܾ��� %d �� �Դϴ�.\n", info.account));
}
}
}


//�ܾ�����
public void checkBalance() {
Bank info = logIn();
if (info == null) {
System.out.println("���� ȭ������ ���ư��ϴ�.");
return;
} else {

System.out.println(String.format("���� ���� �ܾ��� %d �� �Դϴ�.\n", info.account));
}
}


//3.�۾�
public void BankManager() {
String inputString = "";

while (!inputString.equals("4")) {
System.out.println("���Ͻô� ������ �����ϼ���.");
System.out.println("0.������� 1.�Ա� 2.��� 3.�ܾ���ȸ 4.����");
inputString = sc.next();

switch (inputString) {
case "0":
registration();
break;
case "1":
deposit();
break;
case "2":
withdraw();
break;
case "3":
checkBalance();
break;
case "4":
System.out.println("�ȳ��� ���ʽÿ�.");
break;
}
}
}
}

public class JavaClassStart {

	public static void main(String[] args) {
		MyBank m1 = new MyBank();
		m1.BankManager();
		

	}

}
