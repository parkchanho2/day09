package oop2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass04 {
	public ArrayList<String> input() {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("수입력: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		arr.add(num1+"");
		arr.add(num2+"");
		System.out.println(arr);
		return arr;
		
	}
	public void output(ArrayList<String> arr) {
		
		int i = Integer.parseInt(arr.get(0));
		int j = Integer.parseInt(arr.get(1));
		
		System.out.println(i + "+" + j + "= " + (i + j));
	}
}
