package javaPractice;

public class ch3_01 {
	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		 if(strVar1 == strVar2) {
			 System.out.println("strVar1과 strVar2는 참조가 같음");
		 }else {
			 System.out.println("strVar1과 strVar2는 참조가 다름");
		 }
		 
		 if(strVar1.equals(strVar2)) {
			 System.out.println("strVar1과 strVar2는 문자열이 같음");
		 }
		 
		 String strVar3 = new String("홍길동");
		 String strVar4 = new String("홍길동");
		 
		 if(strVar3 == strVar4) {
			 System.out.println("strVar3과 strVar4는 참조가 같음");
		 } else {
			 System.out.println("strVar3과 strVar4는 참조가 다름");
		 }
		 
		 if(strVar3.equals(strVar4)) {
			 System.out.println("strVar3과 strVar4는 문자열이 같음");
		 }
		 
		 //배열 변수 선언과 배열 생성
		 int[] arr1 = new int[3];
		 //배열 항목의 초기값 출력
		 for(int i = 0; i<3; i++) {
		 }
		 
		 // 길이 3인 배열
		 String[] oldStrArray = {"java", "array", "copy"};
		 // 길이 5인 배열을 새로 생성
		 String[] newStrArray = new String[5];
		 //배열 항목 복사
		 for(int i=0; i<newStrArray.length; i++) {
			 System.out.println(newStrArray[i] + ", ");
		 }
	}
}
