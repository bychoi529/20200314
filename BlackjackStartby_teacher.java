package com.human.ex;
import java.util.*;
public class BlackjackStartby_teacher {

	
	 public static int deckIndex=0;//다음사용할 카드 인덱스
	 //p1
	 public static int p1Deck[]=new int[10];//p1의 카드목록
	 public static int p1Index=0;//p1카드 목록에 인덱스
	 public static boolean p1Flag=true;//사용자가 카드를 받을것인지
	 //p2
	 public static int p2Deck[]=new int[10];//p1의 카드목록
	 public static int p2Index=0;//p1카드 목록에 인덱스
	 public static boolean p2Flag=true;//사용자가 카드를 받을것인지
	 
	 public static Scanner sc=new Scanner(System.in);
	 public static int deck[]=new int[52];
	 public static void playGame() {
		 createDeck();
		  mixDeck();
		  for(int i=0;i<10;i++) {
		   getP1Card();
		   if(getSum(p1Deck,p1Index)>21) {
			   break;
		   }
		   getP2Card();
		   if(getSum(p2Deck,p2Index)>21) {
			   break;
		   }
		   if(p1Flag==false&&p2Flag==false) {
			   System.out.println("두 플레이어가 카드 수령을 중지하였습니다.");
			   break;
		   }
		   gameDisplay();
		  }
		  System.out.println("------------------");
		  gameDisplay();
		  System.out.println(whoIsWin());
	 }
	 public static String whoIsWin() {
	  int p1=getSum(p1Deck,p1Index);
	  int p2=getSum(p2Deck,p2Index);
	  String playState="";
	  if(p1>21) {//먼저 카드받은 p1이 짐
	   playState="p2승리";   
	  }else if(p2>21) {
	   playState="p1승리";
	  }else if(p1>p2) {
	   playState="p1승리";
	  }else if(p1==p2) {
	   playState="무승부";
	  }else {
	   playState="p2승리";   
	  }
	  return playState;
	 }
	 
	 public static int getSum(int[] deck,int index ) {
	  int sum=0;
	  for(int i=0;i<index;i++) {//a=1 j,q,k=10
	   int score=0;
	   score=deck[i]%13+1;
	   if(score>10) {
	    score=10;
	   }   
	   sum=sum+score;
	  }//a를 11로 처리 기준은 21이다. 
	  //a를 11로 바꿨을때 21을 넘어가면 바꾸지 않는다.
	  //21를 넘어가지 않으면 바꿔준다.
	  for(int i=0;i<index;i++) {
	   if(deck[i]%13==0) {
	    if(sum+10<=21) {
	     sum=sum+10;
	    }
	   }
	  }
	  
	  return sum;  
	 }
	 public static void gameDisplay() {
	  System.out.println(">>카드 현황");
	  deckDisplay(p1Deck,p1Index,"P1");
	  System.out.println("p1총점>>"+getSum(p1Deck,p1Index));
	  deckDisplay(p2Deck,p2Index,"P2");
	  System.out.println("p2총점>>"+getSum(p2Deck,p2Index));
	 }
	 public static void deckDisplay(int deck[],int index,String title) {
	  String cardShape[]= {"스페이드","클로버","다이아","하트"};
	  String cardNumber[]= {"A","2","3","4","5","6"
	    ,"7","8","9","10","J","Q","K"};
	  System.out.print(title+":");
	  for(int i=0;i<index;i++){
	   //카드모양 종류 0~3
	   int cardSIndex=deck[i]/cardNumber.length;
	   System.out.print(cardShape[cardSIndex]);
	   //카드숫자 종류 0~12
	   int cardNIndex=deck[i]%cardNumber.length;
	   System.out.print(cardNumber[cardNIndex]+",");   

	  }
	  System.out.println();
	 }
	 public static void deckDisplay(int deck[],int index) {
	  String cardShape[]= {"스페이드","클로버","다이아","하트"};
	  String cardNumber[]= {"A","2","3","4","5","6"
	    ,"7","8","9","10","J","Q","K"};
	  //System.out.print("p1: ");
	  for(int i=0;i<index;i++){
	   //카드모양 종류 0~3
	   int cardSIndex=deck[i]/cardNumber.length;
	   System.out.print(cardShape[cardSIndex]);
	   //카드숫자 종류 0~12
	   int cardNIndex=deck[i]%cardNumber.length;
	   System.out.print(cardNumber[cardNIndex]+",");   

	  }
	 }
	 public static void deckDisplay() {
	  String cardShape[]= {"스페이드","클로버","다이아","하트"};
	  String cardNumber[]= {"A","2","3","4","5","6"
	    ,"7","8","9","10","J","Q","K"};
	  System.out.print("p1: ");
	  for(int i=0;i<p1Index;i++){
	   //카드모양 종류 0~3
	   int cardSIndex=p1Deck[i]/cardNumber.length;
	   System.out.print(cardShape[cardSIndex]);
	   //카드숫자 종류 0~12
	   int cardNIndex=p1Deck[i]%cardNumber.length;
	   System.out.print(cardNumber[cardNIndex]+",");   

	  }
	 }
	 
	 
	 public static void getP2Card() {
	  if(p2Flag) {
	   System.out.println("P2님,카드 받겠습니까? 0=no,1=yes");
	   if(sc.nextLine().equals("0")) {
	    p2Flag=false;
	   }
	   if(p2Flag) {//카드 받는 작업
	    p2Deck[p2Index]=deck[deckIndex];
	    deckIndex++;
	    p2Index++;    
	   }
	  } 
	 }
	 public static void getP1Card() {
	  if(p1Flag) {
	   System.out.println("P1님,카드 받겠습니까? 0=no,1=yes");
	   if(sc.nextLine().equals("0")) {
	    p1Flag=false;
	   }
	   if(p1Flag) {//카드 받는 작업
	    p1Deck[p1Index]=deck[deckIndex];
	    deckIndex++;
	    p1Index++;    
	   }
	  } 
	 }
	 public static void mixDeck() {
	  Random rd=new Random();
	  int rand;
	  int temp;
	  
	  for(int i=0;i<10000;i++) {
	   rand=rd.nextInt(52);
	   temp=deck[0];
	   deck[0]=deck[rand];
	   deck[rand]=temp;
	  }
	  
	 }
	 public static void createDeck() {
	  for(int i=0;i<52;i++) {
	   deck[i]=i;
	  }
	 }
	public static void main(String[] args) {
		  playGame();
		  
		  // playGame이라는 메소드 만들어서 함수로 만들고 메인함수는 한줄만 나오게 했다. 
		  
//		  createDeck();
//		  mixDeck();
//		  for(int i=0;i<10;i++) {
//		   getP1Card();
//		   if(getSum(p1Deck,p1Index)>21) {
//			   break;
//		   }
//		   getP2Card();
//		   if(getSum(p2Deck,p2Index)>21) {
//			   break;
//		   }
//		   if(p1Flag==false&&p2Flag==false) {
//			   System.out.println("두 플레이어가 카드 수령을 중지하였습니다.");
//			   break;
//		   }
//		   gameDisplay();
//		  }
//		  System.out.println("------------------");
//		  gameDisplay();
//		  System.out.println(whoIsWin());
	}

}
