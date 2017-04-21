public class Main {

	public static void main(String[] args) {
		Liste liste = new Liste();
		
		System.out.println("Liste: " + liste);
		
		liste.add(new Element(5));
		liste.add(new Element(4));
		liste.add(new Element(8));
		liste.add(new Element(3));
		
		System.out.println("Liste: " + liste);

		System.out.println(liste.get(0));
		System.out.println(liste.get(1));
		System.out.println(liste.get(2));
		System.out.println(liste.get(3));
		
		liste.remove(1);
		
		System.out.println("Liste: " + liste);
		System.out.println();
		
		prim();
		
		FIFOListe fifoListe = new FIFOListe();
		
		System.out.println("\nFIFO-Liste: " + fifoListe + "\n");
		
		fifoListe.add(new Element(7));
		fifoListe.add(new Element(5));
		fifoListe.add(new Element(3));
		fifoListe.add(new Element(1));
		fifoListe.add(new Element(9));
		
		System.out.println("\nFIFO-Liste: " + fifoListe + "\n");
		
		System.out.println(fifoListe.getNext());
		System.out.println("FIFO-Liste: " + fifoListe + "\n");
		System.out.println(fifoListe.getNext());
		System.out.println("FIFO-Liste: " + fifoListe + "\n");
		System.out.println(fifoListe.getNext());
		System.out.println("FIFO-Liste: " + fifoListe + "\n");
		System.out.println(fifoListe.getNext());
		System.out.println("FIFO-Liste: " + fifoListe + "\n");
		System.out.println(fifoListe.getNext());
		System.out.println("FIFO-Liste: " + fifoListe + "\n");
	}
	
	public static void prim() {
		int maxZahl = 100;
		int teiler = 2;
		Liste primListe = new Liste();
		// Die Liste beginnt mit 2, da 1 keine Primzahl ist
		for (int i = 2; i <= maxZahl; i++) {
			primListe.add(new Element(i));
		}
		// Alle Vielfachen der jeweils nächsten Primzahl werden entfernt.
		// Dies passiert solange das Quadrat des Teilers kleiner als die
		// größte Zahl des Suchbereichs ist.
		while (teiler * teiler < maxZahl) {
			int zähler = teiler - 1;
			for (; zähler < maxZahl - 1; zähler++) {
				if (primListe.get(zähler) % teiler == 0) {
					primListe.remove(zähler);
					maxZahl--;
				}
			}
			teiler += 1;
		}
		// Hier wird die Anzahl der gefundenen Primzahlen und die Primzahlen
		// selbst ausgegeben.
		System.out.println("Es wurden " + (maxZahl - 1) + " Primzahlen gefunden:\n");
		System.out.println(primListe);
	}
}
