package lab3.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Heap<E extends Comparable<E>> {
	private int heapSize;
	private int arraySize;
	private E[] array;
	
	public Heap(E[] array) {
		this.array = array;
		this.heapSize = array.length;
		this.arraySize = array.length;
	}
	
	private int parent(int i) {
		return (i - 1) / 2;
	}
	
	private int left(int i) {
		return 2 * i + 1;
	}
	
	private int right(int i) {
		return 2 * i + 2;
	}
	
	private void heapify(int i) {
		int largest = i;
		int l = left(i);
		int r = right(i);
		
		if (l < heapSize && array[l].compareTo(array[largest]) > 0) {
			largest = l;
		}
		
		if (r < heapSize && array[r].compareTo(array[largest]) > 0) {
			largest = r;
		}	
		
		if (largest != i) {
			Sort.swap(array, i, largest);
			heapify(largest);
		}
	}
	
	private void buildMaxHeap() {
		for (int i = (heapSize - 2) / 2; i >= 0; i--) {
			heapify(i);
		}
	}
	
	public void heapSort() {
		buildMaxHeap();
        Sort.swap(array, 0, heapSize - 1);
        heapSize--;
        while (heapSize > 0) {
            heapify(0);
            Sort.swap(array, 0, heapSize - 1);
            heapSize--;
        }
	}
	
}
