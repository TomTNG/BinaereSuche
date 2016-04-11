package ch.ffhs.dua.binSearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest 
{

	@Test
	public void emptyArrayTest()
	{
		//assertNull asserts that an object is null
		//Ein leeres Array und m=0 gibt null zur�ck
		assertNull(BinSearch.search(new int[0], 0));
	}
	
	@Test
	public void notFoundTest()
	{
		//Array das nur 1 enth�lt
		int[] array = {1};
		//Testen mit nicht vorhandenen Werten, ob null zur�ckgegeben wird
		assertNull(BinSearch.search(array, 0));
		assertNull(BinSearch.search(array, 3));
		
		//Testen mit anderem Array und ebgenfalls nicht enthaltenen Zahlen
        array = new int[] {1,2,4,5};
		assertNull(BinSearch.search(array, 0));
		assertNull(BinSearch.search(array, 3));
		assertNull(BinSearch.search(array, 6));
	}
	
	@Test
	public void strictTest()
	{
		int[] array = {0, 10, 20, 30, 40};
		//assertEquals asserts that two objects are equal
		
		assertEquals(new Pair(4, 4), BinSearch.search(array, 40));
		assertEquals(new Pair(2, 2), BinSearch.search(array, 20));
		assertEquals(new Pair(0, 0), BinSearch.search(array,  0));
	}
	
	@Test
	public void severalMatchesTest()
	{
		assertEquals(new Pair(0, 3), BinSearch.search(new int[] {0, 0, 0, 0}, 0));
		assertEquals(new Pair(0, 3), BinSearch.search(new int[] {0, 0, 0, 0, 1, 1}, 0));
		assertEquals(new Pair(0, 3), BinSearch.search(new int[] {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, 0));
		assertEquals(new Pair(1, 3), BinSearch.search(new int[] {0, 1, 1, 1}, 1));
		assertEquals(new Pair(5, 7), BinSearch.search(new int[] {0, 0, 0, 0, 0, 1, 1, 1}, 1));
		assertEquals(new Pair(1, 3), BinSearch.search(new int[] {0, 1, 1, 1, 2, 2, 2, 2, 2, 2}, 1));
		assertEquals(new Pair(5, 7), BinSearch.search(new int[] {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2}, 1));
		
	}
	
}
