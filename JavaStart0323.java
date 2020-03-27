package com.human.ex;
import java.util.*;
class Bank{
	public int choice;
	public int input;
	public int output;
	public int account=0;
	public Scanner sc=new Scanner(System.in);
	
	public Bank() {}
	public Bank(int input) {
		this.input=input;
		this.output=output;
		
	}
	public void menuSelect() {
		{
	    	choice=0;
			while(choice!=4) {
			System.out.println("메뉴를 선택해주세요. 1입금 2출금 3조회 4종료");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("입금할 금액을 입력해주세요");
				input=sc.nextInt();
				System.out.println(input+"원이 계좌로 입금되었습니다.");
				account=account+input;
				break;
			case 2:
				System.out.println("출금할 금액을 입력해주세요.");
				output=sc.nextInt();
				if(output>account) {
					System.out.println("잔액이 부족합니다.");
					break;
				}else {   
					System.out.println(output+"원이 계좌에서 출금되었습니다.");
					account=account-output;
				}
				break;
			case 3:
				System.out.println("현재 계좌잔액은"+account+"원입니다.");
				break;
			case 4:
				System.out.println("서비스를 종료합니다.안녕히 가십시오.");
				break;
			default:
				break;
			}
			}		
	}
	
	
}
}

public class JavaStart0323 {
	//은행 프로그램 함수로 만들기 
	
	
	public static void main(String[] args) {
		Bank b=new Bank();
		b.menuSelect();
		
			
			
	
		
		
		}
	}


