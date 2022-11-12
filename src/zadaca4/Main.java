package zadaca4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try(Scanner frli = new Scanner(System.in)) {
            Brojac brojac = new Brojac();
            System.out.println("kolku pati se frla parickata?");
            brojac.frlanje= frli.nextInt();
            brojac.brojac1(brojac.frlanje);
            brojac.reset(brojac.pismo,brojac.glava);
        }
    }
}

