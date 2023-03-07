package javaPractice;

import java.util.Scanner;


public class ch2_02 {
	public static void main(String[] args) {
		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 8진수
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 16진수
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		byte var1b = -128;
		byte var2b = -30;
		byte var3b = 0;
		byte var4b = 127;
//		byte var5 = 128; // 컴파일에러(Type mismatch: cannot convert from int to byte)
		
		long var1l = 10;
		long var2l = 20L;
//		long var3l = 1000000000;  컴파일러는 int로 간주하기 때문에 에러 발생
		long var4l = 1000000000L; // -2,147,483,648 ~ 2,147,483,647 초과하는 경우 맨뒤에 l. L을 붙여 long 타입 값임을 컴파일러에게 알려야 함
		
		char c1 = 'A'; //문자 저장
		char c2 = 65; //유니코드 직접 저장
		
		//실수 타입
		double x = 5e2;
		double y = 0.12E-2;
		
		float var = 3.14f; // float 타입에 대입하고 싶다면 리터럴 뒤에 소문자 'f'나 대문자 'F'를 붙여 컴파일러가 float 타입임을 알 수 있도록 해야함
		// double 타입은 float 타입 보다 약 2배의 유효 자릿수를 가짐 
		
		//논리 타입
		boolean stop = true;
		boolean stopf = false;
		
		// 문자열 타입
		//char var1 = '홍길동'; 컴파일 에러 
		
		String var1s = "홍길동";
		String str2 = """
				"id":"winter"
				""";
		
		// 자동타입 변환
		long longValue = 50000000000000L;
		float floatValue = longValue;   //5.0E9f로 저장
		double doubleValue = longValue; //5.0E9로 저장됨
		
		// 강제 타입 변환(캐스팅)
		long longValuec = 300;
		int intValue = (int) longValue; //강제 타입 변환 후에 300이 그대로 유지
	
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8);
		
		// 문자열을 기본 타입으로 변환
		String str = "30000";
		int value = Integer.parseInt(str);
		
		String str1 = String.valueOf(value);
		
		// 키보드 입력 데이터를 변수에 저장
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int xi = Integer.parseInt(strX);
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int yi = Integer.parseInt(strY);
		
		int result = xi + yi;
		System.out.println("x + y " + result);
		System.out.println();
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println(score + "점은 " + grade + "등급입니다.");	
	}
}


