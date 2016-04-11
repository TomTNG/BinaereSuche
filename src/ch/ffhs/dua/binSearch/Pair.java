package ch.ffhs.dua.binSearch;

/**
 * Einfache Klasse fuer ein Paar von zwei int-Werten.
 */
public class Pair 
{
	public int lower;
	public int higher;
//Eine Setter methode?	
	public Pair(int lower, int higher)
	{
		this.lower = lower;
		this.higher = higher;
	}

	// Generiert duch eclipse
	
	@Override
	public int hashCode() {
		final int prime = 101;
		int result = 1;
		//101*1 + higher
		result = prime * result + higher;
		//101*result + lower
		result = prime * result + lower;
		return result;
	}

	@Override
	//Die equals Methode wird überschrieben (geerbt von der Objektklasse)
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (higher != other.higher)
			return false;
		if (lower != other.lower)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "("+ lower + ", " + higher + ")";
	}
	
	
}
