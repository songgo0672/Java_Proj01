package chaper02.ex07;

public class Operation_DataType {

	public static void main(String[] args) {
		// 같은 자료형 간의 연산 vs 다른 자료형 간의 연산
		
		//1. 같은 자료형 간의 연산
		int value1 = 3+5;   //8
		int value2 = 8/5 ;	//1        int/int = int
		
		System.out.println(value1);
		System.out.println(value2);
		
		float data1 = 3.0f + 5.0f ;
		System.out.println(data1);
		
		double data2 = 8.0 / 5.0 ;
		System.out.println(data2);    // 1.6   실수 / 실수 = 실수
		
		double data3 = 8/5 ;  		//int/int = int double로 업캐스팅되어 실수0을 포함(1.0)
		System.out.println(data3);
		
		double data4 = 8/5.0 ;    //1.6     정수/실수 = 실수
		System.out.println(data4);	//정수 8이 double 형으로 업캐스팅 되어 연산
		
		double data5 = 8.0/5 ;			//	실수/정수 = 실수
		System.out.println(data5);
		
		//주의 : 평균을 계산 할때 double 형으로 해야된다. int 시에 소수점이 다날아감.
		
		System.out.println("===================");
		//2. 다른 자료형 간의 연산 (작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산)
		
		// int data5 =(int) 5 +(int) 3.5;  //오류 발생 
		double data6 = 5 + 3.5 ;  // 8
		
		int data7 = 5 + (int)3.5; //
		
		int data8 = (int) (5 + 3.5);
				
		double data9 = 5/2.0 ; // 2.5
		
		System.out.println(data9);
		
		double data10 = 5/2;
		System.out.println(data10);
		
		System.out.println("===========================");
		
		int data11 = 50;
		double data12 = 33.33;
		
		//업캐스팅 : data11 (int) ==> data11 (double)
		System.out.println(data11 + data12);  //50 이라는 int가 double로 바뀜 정수에서 실수 낮은자료형이 높은자료형으로 따라감.
		//업캐스팅 : data11 (int) ==> data12 (double)
		System.out.println(data11 / data12);  //
		//다운캐스팅 : data12 (double) ==> data12 (int)
		System.out.println(data11 / (int)data12);
		
		
		//<문제>
		// 국어 : 90, 수학 : 88, 영어: 77 , 음악 : 90, 과학: 99
		// 각 과목의 점수를 int의 변수를 만들어서 저장후 : 합계(sum) , 평균 (avg) 값을 출력
		int kor =90;
		int math =88;
		int eng =77;
		int music =90;
		int sience =99;
		
		int sum = kor + math + eng + music +sience;
		double avg = sum /5.0 ;
		
		System.out.println("합계는 : " + sum);
		System.out.println("평균은 : " + avg);
		
		
		
		
	}

}
