package ch.ffhs.dua.binSearch;

public class BinSearch {
	/**
	 * Findet fuer einen aufsteigend geordneten Array zu einer Zahl value den
	 * kleinsten und den groessten Index (Pair).
	 * 
	 * @param array
	 * @param value
	 * @return Ein Paar mit kleinestem und groesstem Index oder null.
	 * 
	 */
	public static Pair search(int[] array, int value) {

		int max = 0;
		int min = 0;

		int links = 0;
		int rechts = array.length - 1;

		if (array.length == 0) {
			return null;
		}
		// wenn der gesuchte wert ausserhalb des Arraybereichs ist, null
		// zurückgeben
		if (value < array[links] || value > array[rechts]) {
			return null;
		}
		while (links <= rechts) // bis der linke und rechte übereinanderfallen
		{
			// Die mitte des Arrays wird bestimmt.
			int mitte = (links + rechts) / 2;
			// Wenn der Suchwert mit der Mitte uebereinstimmt, fahre auf linker seite weiter für min wert
			if (value == array[mitte]) {
				min = mitte;
				rechts = mitte - 1;
			}
			//falls wert grösser als mitte, setze rechten rand auf mitte
			else if (value < array[mitte]) {
				rechts = mitte - 1;
			}
			//falls linker rand grösser, setze linker rans auf mitte
			else {

				links = mitte + 1;

			}
		}

		links = 0;
		rechts = array.length - 1;

		/*
		 * Hier wird die gleiche Schlaufe nocheinmal durchlaufen, nur das hier der maxwert gesucht und bei einem Treffer
		 * auf der rechten seite weitergesucht wird.
		 */		
		while (links <= rechts) // bis der linke und rechte aufeinanderfallen
		{
			int mitte = (links + rechts) / 2;
			if (value == array[mitte]) {
				max = mitte;
				links = mitte + 1;
			} else if (value < array[mitte]) {
				rechts = mitte - 1;
			}

			else {
				links = mitte + 1;

			}
		}

		Pair p = new Pair(min, max);

		return p;

		
	}

}
