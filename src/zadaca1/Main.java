package zadaca1;

public class Main {
	
	public static void main(String[]args) {
		Avtomobil avtomobil = new Avtomobil("opel", "corsa", "crna", "pp-7777-aa", 100000, 2010);
		
		avtomobil.metod1();
		System.out.println(avtomobil.metod2());
	}
}
