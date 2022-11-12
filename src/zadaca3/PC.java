package zadaca3;

public class PC {

	public int memorija;
	public String tip;
	public int harddisk;
	public String golemina;
	
	public PC() {
		this.memorija=2;
		this.tip="DDR4";
		this.harddisk=160;
	}
	public void metod(int zgolemi, int novhd) {
		System.out.println("Memorijata bese: " + this.memorija + "GB, sega iznesuva " + (this.memorija + zgolemi));
		System.out.println("Tipot na memorija e: " + this.tip);
		System.out.println("HD ima golemina od: " + (this.harddisk + novhd) + "GB. Prethodno iznesuvase " + this.harddisk);

	}
}
