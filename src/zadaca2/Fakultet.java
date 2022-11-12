package zadaca2;

public class Fakultet {
	public String naziv;
	public int smerovi;
	public int studenti;
	public String dekan;
	public String sediste;
	
	public void metod1() {
		System.out.println("Zgolemen broj na studenti: " + (this.studenti + 50));
	}
	public int metod2(int namali) {
		int namaleno=this.studenti - namali;
		return namaleno;
	}
	public void metod3() {
		System.out.println("Naziv na fakultet: " + this.naziv + ". Sediste na fakultet: " + this.sediste);
	}
}
