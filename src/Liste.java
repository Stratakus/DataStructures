public class Liste extends Object {
	
	private Element start;
	private int count;
	
	public Liste() {
		super();
	}

	public void add(Element newElement) {

		if (this.start == null)
		{
			this.start = newElement;
			count++;
		} else {

			Element current = start;
			do {
				if (current.getNext() == null) {
					current.setNext(newElement);
					count++;
					break;
				} else {
					current = current.getNext();
				}
			} while(current != null);

		}
	}
	
	public int get(int index) { // Hier das bleibt so! 
		Element current = start;
		
		if (index >= count) {
			throw new IndexOutOfBoundsException("Index liegt ausserhalb des Bereichs!");
		} else {
			for (int i = 0; i < index; i++) {	
				current = current.getNext();
			}
			//System.out.println("Element " + index + " enthällt Wert " + current.getWert() + ".");
			return current.getWert();
		}
		
		// Eingabe = 0 => Ergebnis = 5
		// Eingabe = 1 => Ergebnis = 4
		// Eingabe = 2 => Ergebnis = 8
		// Eingabe = ... => Ergebnis = ...
		
		// Bei 3 => throw new IndexOutOfBoundsException();
		
	} // Das hier auch ;)
	
	public void remove(int index) 
	{
		if (index < 0 || index >= count) {
			throw new IndexOutOfBoundsException("Index liegt ausserhalb des Bereichs!");
		} else if (index == 0) {
				start = start.getNext();
			} else {
				Element current = start;
				for (int i = 0; i < index - 1; i++) {
					current = current.getNext();
				}
				current.setNext(current.getNext().getNext());
				count--;
			}
	}
	
	@Override
	public String toString() {
		String listeAlsString = "|";
		
		if(this.start == null) {
			return "Leere Liste";
		}
		int counter = 1;
		Element current = start.getNext();
		listeAlsString += start + "|";
		do {
			if (counter == 10) {
				listeAlsString += "\n" + "|";
				counter = 0;
			} else {
				listeAlsString += current + "|";
				current = current.getNext();
				counter++;
			}
		} while(current != null);
		
		return listeAlsString;
	}
}