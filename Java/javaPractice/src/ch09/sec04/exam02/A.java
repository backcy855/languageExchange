package ch09.sec04.exam02;

public class A {
	//매소드
	void usbB() {
		//로컬 클래스
		class B {
			//인스턴스 필드
			int field1 = 1;
			
			//정적 필드(java 17부터 허용)
			static int field2 = 2;
			
			//생성자
			B() {
				System.out.println("B-생성자 실행");
			}
			
			//인스턴스 매소드
			void mehtod1() {
				System.out.println("B-method1 실행");
			}
			
			//정적 매소드(java 17부터 허용)
			static void method2() {
				System.out.println("B-method2 실행");
			}
		}
		
		//로컬 객체 생성
		B b = new B();
		
		//로컬 객체의 인스턴스 필드와 매소드 사용
		System.out.println(b.field1);
		b.mehtod1();
		//로컬 클래스의 정적 필드와 매소드 사용(java 17부터 허용)
		System.out.println(B.field2);
		B.method2();
		
	}
}
