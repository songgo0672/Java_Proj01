package chatper03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <실습 문제>
		// 정수 2개를 Scanner 로 인풋 받고 두 값이 같으면 true 를 출력 다르면 false 출력
		// 이름 2개를 Scanner 로 인풋 받고 두 값이 같으면 true 를 다르면 false를 출력
			// 등가연산자 사용.
			// 기본자료형 : ==
		//참조 자료형 : aName.eqauls(bName)
		int a ;
		int b ;
		String aName;
		String bName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a를 입력하세요>>>");
		a = sc.nextInt();
		System.out.println("정수 b를 입력하세요>>>");
		b = sc.nextInt();
	
		System.out.println("aName을 입력하세요>>>");
		aName = sc.next();
		System.out.println("bName을 입력하세요>>>");
		bName = sc.next();
		
		System.out.println("기본자료형 : " + (a == b));
		System.out.println("참조자료형 : " + aName.equals(bName));
		
		
	}

}
