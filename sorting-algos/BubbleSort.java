public class BubbleSort {

	// bubble sort
	static void bubbleSort(int[] array) {
		// initializations
		int i, j, temp, n = array.length;
		// looping
		for (i = 0; i < n; i++) {
			// looping
			for (j = i; j < n - i - 1; j++) {
				// checking
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

}
