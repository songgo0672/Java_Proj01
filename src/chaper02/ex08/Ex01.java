package chaper02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스캐너를 등록 하고 , 
		// 	어머님이름, 아버님 이름, 형제이름, 자신이름
		//	어머님나이, 아버님 나이, 형제나이, 자신나이
		
		//콘솔에서 인풋 받은 이름은 모두 출력
		// 나이의 합계와 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		
		String name1;
		String name2;
		String name3;
		String name4;
		int a;
		int b;
		int c;
		int d;
	
		
		System.out.println("어머님 이름을 입력하세요>>>");
		name1 = sc.next();
		System.out.println("아버님 이름을 입력하세요>>>");
		name2 = sc.next();
		System.out.println("형제 이름을 입력하세요>>>");
		name3 = sc.next();
		System.out.println("자신의 이름을 입력하세요>>>");
		name4 = sc.next();
		System.out.println("어머님 나이를 입력하세요>>>");
		a = sc.nextInt();
		System.out.println("아버님 나이를 입력하세요>>>");
		b = sc.nextInt();
		System.out.println("형제 나이를 입력하세요>>>");
		c = sc.nextInt();
		System.out.println("자신의 나이를 입력하세요>>>");
		d = sc.nextInt();
		
		int sum ; 
			sum = a+b+c+d;
		double avg ;
			avg = sum/4.0;
			
		System.out.println("===============");
		System.out.println("당신의 이름은 "+name4+" 이고");
		System.out.println("가족 나이합은 "+sum +" 이며");
		System.out.println("가족 평균나이는 "+avg+" 입니다");
		
			
		

	}

}
