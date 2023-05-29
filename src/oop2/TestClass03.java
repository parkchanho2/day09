package oop2;

import java.util.Scanner;

public class TestClass03 {
	public int[] inputNum() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("수입력: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int[] arr = {num1,num2};
		return arr;
	}
	
	public int ttt(int[] a) {
		int sum = 0;
		sum = a[0] + a[1];
		return sum;
	}
	
	public void outputNum(int[] a, int sum) {
		System.out.println(a[0] + "+" + a[1] + "= " + sum);
	}
	

}
