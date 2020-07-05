public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// binary searching
	static int binarySerach(int[] array, int searchItem) {
		// initialization
		int left, right, middle;
		// set initial value
		left = 0; right = (array.length-1);
		
		// looping
		while(left<=right) {
			
			// find middle item index
			middle = (left+(right-left)/2); // identical to (left + right) / 2 but avoids overflow
			
			// matching mid value with search item
			if(array[middle] == searchItem) {
				return middle; // Return if element found
			}
			
			// update left / right value
			if(array[middle] < searchItem) {
				left = middle + 1; // Look in right half
			} else {
				right = middle - 1; // Look in left half
			}
			
		}
		
		// return
		return -1;  // Element not found
	}
	
}
