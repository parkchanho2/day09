package oop2;

import java.util.Scanner;

public class TestClass01 {
	public String input(){
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("이름 입력: ");
		name = sc.next();
		
		return name;
	}
	public void output(String a) {
		System.out.println(a);
	}
}
