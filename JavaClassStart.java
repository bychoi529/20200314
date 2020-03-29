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


//1.회원등록
public void registration() {
System.out.println("회원등록 페이지");
System.out.print("ID : ");
String id = sc.next();

if (searchBank(id) != null) {
for (;;) {
System.out.println("이미 사용중인 ID입니다.");
System.out.println("다시 입력해주세요.");
System.out.print("ID : ");
id = sc.next();

if(searchBank(id)==null) {
break;
}
}
}
while (true) {
System.out.print("비밀번호 : ");
String password = sc.next();
System.out.print("비밀번호 확인 : ");
String password2 = sc.next();
if (password.equals(password2)) {
long account = 0l;
arrBank[BankIndex++] = new Bank(id, password, account);
System.out.println("회원가입을 축하드립니다!");
break;
} else {
System.out.println("비밀번호 확인 오류입니다.");
System.out.println("재입력해주세요.");
}
}
}

//2.로그인
public Bank logIn() {

System.out.println("로그인 페이지");
System.out.print("ID : ");
String inputID = sc.next();

Bank info = searchBank(inputID);

if (info == null) {
System.out.println("회원정보가 없습니다. 회원가입을 해주세요.");
return null;
}
System.out.print("비밀번호 : ");
String inputPassword = sc.next();
if(!info.password.equals(inputPassword)) {
System.out.println("비밀번호가 일치하지 않습니다.");
return null;
}
System.out.println("로그인성공!");
return info;
}

//2-1. 회원 조회
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

//입금
public void deposit() {
Bank info = logIn();
if (info == null) {
System.out.println("이전 화면으로 돌아갑니다.");
return;
} else {

System.out.print("현금을 넣어주세요.");
money = sc.nextLong();
info.account = info.account + money;
System.out.println(String.format("현재 계좌 잔액은 %d 원 입니다.\n", info.account));
}
}

//출금
public void withdraw() {
Bank info = logIn();
if (info == null) {
System.out.println("이전 화면으로 돌아갑니다.");
return;
} else {
System.out.print(String.format("현재 계좌 잔액은 %d 원 입니다.\n출금할 금액을 입력하세요.\n", info.account));
money = sc.nextLong();

if (info.account < money) {
System.out.println("잔액이 부족합니다.");
} else {
info.account = info.account - money;
System.out.println(String.format("현재 계좌 잔액은 %d 원 입니다.\n", info.account));
}
}
}


//잔액조희
public void checkBalance() {
Bank info = logIn();
if (info == null) {
System.out.println("이전 화면으로 돌아갑니다.");
return;
} else {

System.out.println(String.format("현재 계좌 잔액은 %d 원 입니다.\n", info.account));
}
}


//3.작업
public void BankManager() {
String inputString = "";

while (!inputString.equals("4")) {
System.out.println("원하시는 업무를 선택하세요.");
System.out.println("0.계정등록 1.입금 2.출금 3.잔액조회 4.종료");
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
System.out.println("안녕히 가십시오.");
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
