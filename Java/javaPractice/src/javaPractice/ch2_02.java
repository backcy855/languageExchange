package javaPractice;

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
		
	}
}
