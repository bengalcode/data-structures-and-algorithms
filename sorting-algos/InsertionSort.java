package Sorting;

public class InsertionSort {

	// insertion sort
	static void insertionSort(int[] array) {
		// initializations
		int i, j, min_item, n = array.length;
		// looping
		for (i = 1; i < n; i++) {
			// set minimum item
			min_item = array[i];
			j = i - 1;
			// looping
			while ((j >= 0) & (array[j] > min_item)) {
				// exchange items
				array[j + 1] = array[j];
				j = j - 1;
			}
			// set minimum item
			array[j + 1] = min_item;
		}
	}
}
