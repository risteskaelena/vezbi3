package zadaca1;

public class Avtomobil {

	public String marka;
	public String model;
	public String boja;
	public String registracija;
	public int kilometri;
	public int godina;
	
	public Avtomobil (String marka, String model, String boja, String registracija, int kilometri, int godina) {
		this.marka=marka;
		this.model=model;
		this.boja=boja;
		this.registracija=registracija;
		this.kilometri=kilometri;
		this.godina=godina;
	}
	public void metod1() {
		System.out.println(this.marka + " " + this.model + " " + this.boja);
	}
	public double metod2() {
		double pominatikm;
		pominatikm=this.kilometri + 1520.25;
		return pominatikm;
	}
	
	
}
