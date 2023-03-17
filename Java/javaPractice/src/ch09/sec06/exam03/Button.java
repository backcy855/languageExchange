package ch09.sec06.exam03;

public class Button {
	//정적 맴버 인터페이스
	public static interface ClickListener {
		//추상 매소드
		void onClick();
	}
	
	//필드 
	private ClickListener clickListener;
	
	//매소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
