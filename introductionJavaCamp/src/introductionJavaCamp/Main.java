package introductionJavaCamp;

public class Main {

	public static void main(String[] args) {
		System.out.println("\t" + "\t" + "I'm online");

		System.out.println("\t" + "Variables");

		String ortaMetin = "Ýlginizi Cekebilir";
		String altMetin = "Vade Süresi";

		System.out.println(ortaMetin);

		int vade = 12;
		double dolarDun = 18.81;
		double dolarBugun = 18.81;
		boolean dolarDustuMu = false;
		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			dolarDustuMu = true;
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			dolarDustuMu = false;
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		System.out.println("\t" + "Arrays and Loops");

		String[] krediler = { "Hizli Kredi", "Maasýný Halkabank'tan Alanlara Ozel", "Mutlu Emekli Ihtiyac Kredisi",
				"Kamu Calisanlarina Ozel", "Ozel Sektor Calisanlarina Ozel", "Halkbank Gayrimenkul Arsa" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i] + " ");
		}
		
	}

}
