package ch08.sec11.exam02;

public class Driver {
	void drive (Vehicle vehicle) {
		vehicle.run(); // 구현 객체가 대입될수 있도록 매개변수를 인터페이스 타입으로 선언 후 인터페이스 메소드 호출
	}
}
