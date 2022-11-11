package chatper03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// <문제> 스캐너로 정수 값을 인풋 받고 인풋 받은 정수값이 홀수 이면 "홀수"
			// 인풋값이 짝수이면 "짝수" 라고 출력
			// <<삼항 연산자를 사용>>
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요>>>");
		int a = sc.nextInt();
		System.out.println(a + (a%2==0  ?"짝수":"홀수"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
