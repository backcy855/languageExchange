package ch15.sec03.exam01;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체
		set.add("JAVA");
		set.add("JAVAS");
		set.add("JAVAC");
		set.add("JAVAP");
		set.add("JAVA"); // 중복 객체이므로 저장하지 않음
		
		//저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수 : " +  size);
	}
}
