package Zadaca1;

public class MainClass {
	public static void main(String args[]) {
		Avtomobil bmw = new Avtomobil("BMW", "330", "Crna", 1150.23, 2003, "BT333AD");

		bmw.prvMetod();
		System.out.println(bmw.vtorMetod());
	}
}
