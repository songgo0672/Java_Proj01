package chapter04.ex01;

public class If_Controll_Statement {

	public static void main(String[] args) {
		// IF 구문 사용하기 (
		//1. type 1 : if (조건) {실행문 : 조건이 참일때 실행; }
			//{}를 생략 가능한데, 생략될 경우 실행문 1개만 적용
		int value1 = 5;
		if (value1 > 3) {
			//조건이 참일때 실행 블락
			System.out.println("실행1");		//조건이 참이므로 실행됨
		}
		//조건이 거짓일때 
		if (value1 < 3) {
			//조건이 참일때 실행 블락
			System.out.println("실행2"); 		//거짓이므로 실행 되지 않는다.
		}
		
		System.out.println("=========={조건이 참일때 실행 부분이 온다}  ,  {} 생략가능 ==============");
			//if 조건에서 실행문이 하나일때 {} 생략 가능
		if (value1 < 3)
			System.out.println("실행3");  //실행문 1개만 { } 가 생략되어서 처리될 수 있다.
			System.out.println("실행4");
			
		System.out.println("===============================");
			
		//2. type 2 : if (조건) { 조건이 참일떄 실행; } else { 조건이 거짓일때 실행;  }
			// 삼항 연산자로 변환
			
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("=====if를 사용해서 출력 ===========");
		if (bool1) {
			//조건이 참일때 실행
			System.out.println("참");
		}else {
			//조건이 거짓일때 실행
			System.out.println("거짓");
		}
		
		System.out.println("==========삼항 연산자를 사용해서 출력===================");
		System.out.println((bool1)? "참" : "거짓");
		
		System.out.println("================if type3==================");
		
		//3. type 3 : 조건이 여러개인 경우 :
		//if (조건1) {조건1이 참 일때 실행} 
		//else if (조건2) {조건 2가 참일때 실행}
		//else if (조건3) {조건 3가 참일때 실행}
		//...
		//...else {조건에 존재하지않는 경우실행}
		int value3 = 85;
		
		if (value3>90) {
			System.out.println("A 학점");
		} else if(value3 >= 80) {
			System.out.println("B 학점");       //해당하는 변수값으로 인해 if 문을 빠져나온다.
		} else if(value3 >=70) {
			System.out.println("C 학점");
		} else if(value3 >=60) {
			System.out.println("D 학점");
		} else {
			//위의 조건이 모두 만족하지않으면 실행
			System.out.println("F 학점");
		}
			
		System.out.println("==============================");
		
		if (value3 >= 70) {				//조건에만 맞다면 바로 실행 후 탈출하기때문에 조건입력을 잘 해야한다.
			System.out.println("C학점");
		}else if (value3 >=80) {
			System.out.println("B학점");
		}else if (value3 >= 90) {
			System.out.println("A학점");
		}else {
			System.out.println("F학점");
		}
		
		System.out.println("======================");
		
		if (value3 >= 60 && value3 <= 70) {
			System.out.println("B학점");
		}else if ( value3 >= 70 && value3 < 80) {
			System.out.println("C학점");
		}else if ( value3 >= 80 && value3 < 90) {
			System.out.println("B학점");
		}else if ( value3 >= 90 && value3 <= 100) {
			System.out.println("A학점");
		}else if ( value3 >= 0 && value3 < 60) {
			System.out.println("F학점");
		}else {
			System.out.println("정확한 점수가 아닙니다. 0 ~ 100까지만 넎어주세요.");
		}
	}
}
