package ch08.sec12;


public class InstanceofExample {
	public static void main(String[] args) {
		//구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		//ride() 매소드 호출 시 구형 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	
	//인터페이스 매개변수를 갖는 매소드
	public static void ride(Vehicle vehicle) {
		//방법1
		/*
		 if(vehicle instatnceof Bus) {
		 Bus bus = (Bus) vehicle;
		 bus checkFare(); 
		 매개값이 Bus인 경우에만 강제 타입 변환해서 checkFare() 매소드를 호출
		 */
		
		//방법2
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
