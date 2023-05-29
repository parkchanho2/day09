package oop2;

import java.util.Scanner;

public class TestClass02 {
	public String[] input() {
		Scanner sc = new Scanner(System.in);
		String num1, num2, num3;
		System.out.println("3개의 이름 입력: ");
		num1 = sc.next();
		num2 = sc.next();
		num3 = sc.next();
		String[] arr = {num1,num2,num3};
		return arr;
		
	}
	public void output(String[] n) {
		System.out.println(n[0] +", " +  n[1] + ", "+ n[2] );
	}
}
