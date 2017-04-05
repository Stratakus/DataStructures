public class Main {

	public static void main(String[] args) {
		Liste liste = new Liste();
		
		System.out.println("Liste: " + liste);
		
		liste.add(new Element(5));
		liste.add(new Element(4));
		liste.add(new Element(8));
		liste.add(new Element(3));
		
		System.out.println("Liste: " + liste);
		// Erwartet: 5 -> 4 -> 8

		System.out.println(liste.get(0));
		System.out.println(liste.get(1));
		System.out.println(liste.get(2));
		System.out.println(liste.get(3));
		//System.out.println(liste.get(4));
		
		liste.remove(1);
		
		System.out.println("Liste: " + liste);
		System.out.println();
		
		prim();
	}
	
	public static void prim() {
		int maxZahl = 100;
		int counter = 0;
		int teiler = 3;
		Liste primListe = new Liste();
		// Die Liste beginnt mit 2, da 1 keine Primzahl ist
		for (int i = 2; i <= maxZahl; i++) {
			primListe.add(new Element(i));
			counter++;
		}
		for (int i = 1; i < counter; i++) {
			if(primListe.get(i) % 2 == 0) {
				primListe.remove(i);
				counter--;
			}
		}
		while (teiler * teiler < maxZahl) {
			int zähler = teiler - 1;
			for (; zähler < counter; zähler++) {
				if (primListe.get(zähler) % teiler == 0) {
					primListe.remove(zähler);
					counter--;
				}
			}
			teiler += 2;
		}
		// Hier sollen nur Primzahlen ausgegeben werden!
		System.out.println("Es wurden " + counter + " Primzahlen gefunden:\n");
		System.out.println(primListe);
	}
}
