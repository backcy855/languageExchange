package ch11.sec04;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (MyResource res = new MyResource("A")) {
			String data = res.read1();
		}
	}
}