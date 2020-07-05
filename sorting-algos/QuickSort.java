package Sorting;

public class QuickSort {

	// quick sort
	static void quickSort(int[] array, int left, int right) {
		// checking
		if (left < right) {
			// find index position by partitioning the input array
			int index = partition(array, left, right);
			
			// left sorting
			quickSort(array, left, index - 1);
			
			// right sorting
			quickSort(array, index + 1, right);
		}
	}

	// partitioning
	static int partition(int[] array, int left, int right) {
		// initializations
		int i, pivot, index, temp;
		
		// update pivot
		pivot = array[right];
		index = left;
		
		// looping
		for (i = left; i < right; i++) {
			// checking pivot and exchange
			if (array[i] < pivot) {
				temp = array[i];
				array[i] = array[index];
				array[index++] = temp;
			}
		}
		
		// exchange pivot
		array[right] = array[index];
		array[index] = pivot;
		// return index
		return index;
	}

}
