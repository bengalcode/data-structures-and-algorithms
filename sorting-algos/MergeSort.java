package Sorting;

public class MergeSort {

	// merge sort
	static void mergeSort(int[] array, int left, int right) {
		// checking 
		if (left < right) {
			// find middle index
			int mid = (left + (right - left) / 2);
			
			// merge sort first half
			mergeSort(array, left, mid);
			
			// merge sort second half
			mergeSort(array, mid + 1, right);
			
			// merging
			merge(array, left, mid, right);
		}
	}

	// merging
	static void merge(int[] array, int left, int mid, int right) {
		// initializations
		int i, index_a, index_l, index_r;
		int size_l, size_r;
		
		// find new array size
		size_l = (mid - left + 1);
		size_r = (right - mid);

		// initializations of new arrays
		int[] array_left = new int[size_l];
		int[] array_right = new int[size_r];

		// store data items to the new arrays
		for (i = 0; i < size_l; i++) {
			array_left[i] = array[left + i];
		}
		for (i = 0; i < size_r; i++) {
			array_right[i] = array[mid + i + 1];
		}

		// set default value to the initializations
		index_a = left; index_l = 0; index_r = 0;

		// final merging
		while ((index_l < size_l) & (index_r < size_r)) {
			// matching two new array's same index 
			if (array_left[index_l] <= array_right[index_r]) {
				array[index_a++] = array_left[index_l++];
			} else {
				array[index_a++] = array_right[index_r++];
			}
		}
		// left array remaining merging
		while (index_l < size_l) {
			array[index_a++] = array_left[index_l++];
		}
		// right remaining merging
		while (index_r < size_r) {
			array[index_a++] = array_right[index_r++];
		}
	}
}
