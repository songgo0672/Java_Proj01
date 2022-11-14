package chapter04.ex05;

public class Do_while_Statement {

	public static void main(String[] args) {
		// do ~ while 문 : 실행문을 조건과 상관없이 한번 실행한다. (처리되고 결과가 트루면 반복)
		// while 문 : 		조건에 만족해야지만 실행 블락을 실행한다.
		
		
		/*
		   while 문 
		   초기식;
		   while(조건){
		   		실행블락;
		   		증감식;
		   	 }
		 */
		
		/*	do while 문
		  초기식 ;
		  do { 
		  	 실행블락 ;
		  	 증감식 ;
		  	 
		  } while(조건) ;
		 */
		
		//1. while 문 
		System.out.println("=============while 문==================");
		int a = 0;
		while (a <0 ) {					//조건이 false이므로 실행 불가
			System.out.println(a + " ");
		}
		
		//2. do while 문
		System.out.println("============do while 문=================");
		a = 0 ;
		do {
			System.out.println(a+ " ");
		}while (a<0);					//조건이 아래에있기떄문에 무조건 실행된 후 조건에 맞춘다.
		
		//3. 반복 횟수가 10회 일 경우 while  문과 do while문 비교
		
		System.out.println("===================================");
		a = 0;
		while( a <10 ) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		System.out.println("== do while 문을 사용해서 10 번 출력");
		
		a = 0 ;
		do {
			System.out.print(a+ " ");
			a++;
			
		}while (a<10);
		

	}

}
