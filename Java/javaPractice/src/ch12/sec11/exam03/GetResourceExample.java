package ch12.sec11.exam03;


public class GetResourceExample {
	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1").getPath();
		String photo2Path = clazz.getResource("images/photo2").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
