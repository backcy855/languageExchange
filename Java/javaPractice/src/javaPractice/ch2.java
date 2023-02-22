package javaPractice;

public class ch2 {
	public static void main(String[] args) {
		//변수 value 선언
		int value = 0;
		
		//연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔이 출력
		System.out.println(result);
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
		//변수를 또 다른 변수에 대입하여 메모리 간에 값을 복사
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}
}
