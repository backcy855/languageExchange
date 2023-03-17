package ch07.sec11;

public class SealedExample {
	public static void main(String[] args) {
		Person p = new Person();
		Employee e = new Employee();
		Manger m = new Manger();
		Director d = new Director();
		
		p.work();
		e.work();
		m.work();
		d.work();
	}
}
