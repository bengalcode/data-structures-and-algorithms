package Searching;

public class LinearSearch {

	// linear searing
	static int linearSearch(int[] array, int SearchItem) {
		// looping
		for (int i = 0; i < array.length; i++) {
			// matching with search item and return
			if (array[i] == SearchItem) {
				return i;
			}
		}
		// return
		return -1;
	}

}
