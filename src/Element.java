public class Element {
	private int wert;
	private Element next;
	
	public Element(int wert) {
		this.wert = wert;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}

	public int getWert() {
		return this.wert;
	}
	
	public String toString() {
		return String.format("%3d", wert);
	}
}
