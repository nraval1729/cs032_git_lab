package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubble(int unsortedArray[]) {
	    int temp;
	    int length = unsortedArray.length;

	    for(int i=0; i<length; i++) {
	    	for(int j=0; j<length-i-1;j++) {
	    		if(unsortedArray[j] > unsortedArray[j+1]) {
	    			temp = unsortedArray[j];
	    			unsortedArray[j] = unsortedArray[j+1];
	    			unsortedArray[j+1] = temp;
	    		}
	    	}
	    }
	    return unsortedArray;
  }
