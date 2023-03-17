package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); xxxxxxxxxxxxxx
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();  //Phone의 메소드
		smartPhone.interneSearch();
		smartPhone.turnOff(); //Phone의 메소드
	} 
}
