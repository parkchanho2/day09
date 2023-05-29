package oop2;

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		
		int[] a = (int[]) t.inputNum();
		int s = t.ttt(a);
		t.outputNum(a, s);
	}
}
