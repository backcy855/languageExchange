package ch09.sec07.exam02;

public class Home {
	//필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	//매소드(필드 이용)
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	//매소드(로컬 변수 이용)
	public void use2() {
		//로컬 변수에 익명 구현 객체 대입
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("에어컨을 끕니다.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	//매소드(매개벼수 이용)
	public void use3(RemoteControl rc) {
		rc.turnOff();
		rc.turnOn();
	}
}
