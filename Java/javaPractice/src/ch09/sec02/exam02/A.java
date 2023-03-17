package ch09.sec02.exam02;

public class A {
	//인스턴스 맴버 클래스
	class B {
		//인스턴스 필드
		int field1 = 1;
		
		//장적 필드(Java 17부터 허용)
		static int field2 = 2;
		
		//생성자
		B() {
			System.out.println("B-생성자 실행");
		}
		
		//인스턴스 매소드
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		//정적 메소드(Java 17부터 허용)
		static void method2() {
			System.out.println("B-method2 실행");
		}
	}
	
	//인스턴스 매소드
	void usbB() {
		//B 객체 생성 및 인스턴스 필드 및 매소드 사용
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		//B 클래스의 정적 필드 및 매소드 사용
		System.out.println(B.field2);
		B.method2();
	}
}
