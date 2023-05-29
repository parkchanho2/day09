package oop;

import java.net.MulticastSocket;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		// 소문자 = 변수 대문자 = 객체
		
		TestClass05  t = new TestClass05();
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("수입력: ");
		num = sc.nextInt();
		
				// ↓ 인자값 or parameta
		t.sumFunc(num);
		System.out.println("\nsumfunc2");
		
		int s = t.sumFunc2(num);
		System.out.println("1~" + num + "까지의 합: " + s);
		
	}
}







