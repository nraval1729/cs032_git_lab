package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
		for (int i = 1; i < array.length; i++) {
		    int j = i;
		    while ((j > 0) && (array[j-1] > array[j])) {
		         int temp = array[j-1];
		         array[j-1] = array[j];
		         array[j] = temp;
		         --j;
	   		}
	  	}
    return array;
		return null;
	}
}