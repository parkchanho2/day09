package oop;

import java.util.Scanner;

public class TestClass05 {
					//  ↓ 매개변수 or argument
	public void sumFunc(int num) { //int num = 100; 이 저장됨
		
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum+=i;
		}
		System.out.println("1~" + num + "까지의 합: " + sum);
	}
	public int sumFunc2(int num) { //int num = 100; 이 저장됨
		
			int sum = 0;
			for(int i=0; i<=num; i++) {
				sum+=i;
			}
			// 메소드를 종료하는 기능 
			// return 다응에 값이 있으면, 값을 돌려주는 기능
			return sum;
			
	}
}




