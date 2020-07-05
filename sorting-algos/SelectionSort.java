public class SelectionSort {

	// selection sort
	static void selectionSort(int[] array) {
		// initializations
		int i, j, min_index, temp, n = array.length;
		// looping
		for (i = 0; i < n; i++) {
			// set initial value to the minimum index
			min_index = i;
			// looping
			for (j = i + 1; j < n; j++) {
				// find minimum index
				if (array[j] < array[min_index]) {
					min_index = j;
				}
			}

			// checking minimum index
			if (min_index != i) {
				temp = array[i];
				array[i] = array[min_index];
				array[min_index] = temp;
			}
		}
	}

}
