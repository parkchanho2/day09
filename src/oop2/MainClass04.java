package oop2;

import java.util.ArrayList;

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		ArrayList<String> a = new ArrayList<>();
		
		a = t.input();
		t.output(a);
		System.out.println("종료");
	}
}
