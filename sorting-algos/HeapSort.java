package Sorting;

public class HeapSort {

	// heap sort
	static void heapSort(int[] heap) {
		// initializations
		int i, heapSize = (heap.length - 1);

		// looping for heaping
		for (i = (heapSize / 2); i >= 1; i--) {
			maxHeapify(heap, heapSize, i);
		}

		// looping for sorting
		for (i = heapSize; i > 1; i--) {
			int temp = heap[1];
			heap[1] = heap[i];
			heap[i] = temp;
			heapSize--;
			maxHeapify(heap, heapSize, 1);
		}
	}

	// max heaping
	static void maxHeapify(int[] heap, int heapSize, int parentIndex) {
		// initializations
		int largestIndex, leftIndex, rightIndex, temp;

		// initial value
		largestIndex = parentIndex;
		leftIndex = (parentIndex * 2);
		rightIndex = (leftIndex + 1);

		// finding largest index value
		if ((leftIndex <= heapSize) && (heap[leftIndex] > heap[largestIndex])) {
			largestIndex = leftIndex;
		}
		if ((rightIndex <= heapSize) && (heap[rightIndex] > heap[largestIndex])) {
			largestIndex = rightIndex;
		}
		
		// compare largest index value with parent index value
		if (largestIndex != parentIndex) {
			temp = heap[parentIndex];
			heap[parentIndex] = heap[largestIndex];
			heap[largestIndex] = temp;
			maxHeapify(heap, heapSize, largestIndex);
		}
	}

}
