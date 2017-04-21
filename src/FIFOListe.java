public class FIFOListe extends Liste {
	public int getNext() {
		int wert = get(0);
		remove(0);
		return wert;
	}
}
