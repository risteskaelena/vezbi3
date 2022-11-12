package zadaca2;

public class Main {

	public static void main(String[] args) {
		Fakultet fakultet1 = new Fakultet();
		fakultet1.naziv="Medicinski fakultet";
		fakultet1.smerovi=10;
		fakultet1.studenti=1500;
		fakultet1.dekan="Mirko Tosev";
		fakultet1.sediste="Skopje";
		fakultet1.metod1();
		System.out.println("Namalen broj studenti: " + fakultet1.metod2(1000));
		fakultet1.metod3();
		
		Fakultet fakultet2 = new Fakultet();
		fakultet2.naziv="Filoloski fakultet";
		fakultet2.smerovi=5;
		fakultet2.studenti=100;
		fakultet2.dekan="Cveta Janeva";
		fakultet2.sediste="Skopje";
		fakultet2.metod1();
		System.out.println("Namalen broj studenti: " + fakultet2.metod2(90));
		fakultet2.metod3();
	}

}
