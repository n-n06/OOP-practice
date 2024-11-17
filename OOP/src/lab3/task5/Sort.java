package lab3.task5;

import java.util.ArrayList;

public class Sort {
	static <E> void swap(E[] array, int i, int j) {
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	
	
	static <E extends Comparable<E>> void heapSort(E[] array) {
		Heap<E> h = new Heap<E>(array);
		h.heapSort();
	}
	
	private static <E extends Comparable<E>> void merge(E[] array, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		ArrayList<E> leftArray = new ArrayList<>(n1);
		ArrayList<E> rightArray = new ArrayList<>(n2);
		
		for (int i = 0; i < n1; i+=1) {
			leftArray.add(array[l + i]); 
		}
		
		for (int i = 0; i < n2; i+=1) {
			rightArray.add(array[mid + i + 1]); 
		}
		
		int i, j, k;
		i = j = 0;
		k = l;
		
		while (i < n1 && j < n2) {
			if (leftArray.get(i).compareTo(rightArray.get(j)) < 0) {
				array[k] = leftArray.get(i);
				i++;
			} else {
				array[k] = rightArray.get(j);
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			array[k] = leftArray.get(i);
			i++;
			k++;
		}
		
		while (j < n2) {
			array[k] = rightArray.get(j);
			j++;
			k++;
		}
		
	}
	
	static <E extends Comparable<E>> void mergeSort(E[] array) {
		int n = array.length;
		
		int currentSize, leftStart;
		
	    for (currentSize = 1; currentSize <= n - 1;  currentSize = 2 * currentSize) {
	    	for (leftStart = 0; leftStart < n - 1; leftStart += 2 * currentSize) {
	    		int mid = Math.min(leftStart + currentSize - 1, n-1);
	    		int right_end = Math.min(leftStart + 2*currentSize - 1, n-1);
	    		
	    		merge(array, leftStart, mid, right_end);
	    	}
		}
		
	}

}