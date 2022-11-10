package chaper02.ex06;

public class TypeCasting2 {
	
	public static void main(String[] args) {
		//자동 타입 변환 (업캐스팅) vs 수동 타입 변환 (다운캐스팅)
		//1. 자동 타입 변환 (업캐스팅 : 낮은 자료형에서 높은 자료형으로 자동으로 변환)
			//숫자형 자료형에만 해당
			//byte = > short => int => long => float => double
		
		float value1 =3 ; //int => float 으로 업캐스팅 되어 들어감 // 명시하지않아도 자동으로 
		long value2 =5; 	//int => long형으로 자동으로 업데이트
		double value3 =7 ;		//int => double 으로 자동으로 업캐스팅
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		System.out.println("=================");
		
		//2. 수동으로 타입 변환 (다운 캐스팅 : 높은 자료형에서 낮은 자료형으로 변환하는것)
		int value4 = (int)3.5;  //double => int 다운캐스팅
		float value5 = 7.8F;		//double 이 기본실수인데 float으로 하려해서 오류 수동으로 float으로 바꿔주어야한다.
		
		System.out.println(value4);
		System.out.println(value5);
		
		
		
	}

}
