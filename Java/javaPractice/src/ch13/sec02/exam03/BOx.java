package ch13.sec02.exam03;

public class BOx<T> {
	public T content;
	
	//BOx의 내용물이 같은지 비교
	public boolean compare(BOx<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}
}
