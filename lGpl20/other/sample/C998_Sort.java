package lGpl20.other.sample;

/**
 * Sorting test.<br/>
 * Sorting test.
 * 
 * @version 2016/03/19_18:47:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C998_Sort" >C998_Sort.java</a>
 * 
 */
public class C998_Sort {

	public static void swap(int[] list, int a, int b) {

		int temp;
		temp = list[a];
		list[a] = list[b];
		list[b] = temp;

	}

	public static void insertionSort(int[] list) {

		int step, pos;
		for (step = 1; step <= list.length - 1; step++) {

			pos = step;
			while ((pos > 0) && (list[pos] < list[pos - 1])) {

				swap(list, pos, (pos - 1));
				pos--;

			}

		}

	}

	public static void selectionSort(int[] list) {

		int step, pos, min, minpos;
		for (step = 1; step <= list.length - 1; step++) {

			minpos = step - 1;
			min = list[step - 1];

			for (pos = step; pos <= list.length - 1; pos++) {

				if (list[pos] < min) {

					min = list[pos];
					minpos = pos;

				}

			}

			if (minpos != step - 1) {

				swap(list, minpos, (step - 1));

			}

		}

	}

	public static void bubbleSort(int[] list) {

		int step, pos;
		for (step = 1; step <= list.length - 1; step++) {

			for (pos = list.length - 1; pos >= step; pos--) {

				if (list[pos] < list[pos - 1]) {

					swap(list, pos, (pos - 1));

				}

			}

		}

	}

	public static void quickSort(int[] list, int first, int last) {

		int left, right, key;

		if (first < last) {

			left = first;
			right = last + 1;
			key = list[first];

			do {

				do {

					left++;

				} while (list[left] < key);

				do {

					right--;

				} while (list[right] > key);

				if (left < right) {

					swap(list, left, right);

				}

			} while (left < right);

			swap(list, first, right);

			quickSort(list, first, right - 1);
			quickSort(list, right + 1, last);

		}

	}

	public static void mergeSort(int[] list, int first, int last) {

		int mid;
		if (first < last) {

			mid = (first + last) / 2;
			mergeSort(list, first, mid);
			mergeSort(list, mid + 1, last);
			merge(list, first, mid, last);

		}

	}

	public static void merge(int[] list, int first, int mid, int last) {

		int temp[] = new int[last - first + 1];
		int p1 = first, p2 = mid + 1, p3 = 0;

		while ((p1 <= mid) && (p2 <= last)) {

			if (list[p1] <= list[p2]) {

				temp[p3++] = list[p1++];

			} else {

				temp[p3++] = list[p2++];

			}

		}

		while (p1 <= mid) {

			temp[p3++] = list[p1++];

		}

		while (p2 <= last) {

			temp[p3++] = list[p2++];

		}

		for (p3 = 0, p1 = first; p3 <= (last - first); p3++) {

			list[p1] = temp[p3];
			p1++;

		}

	}

	public static void adjHeap(int[] list, int last, int pos) {

		int son, sonpos;

		while (last >= 2 * pos + 1) {

			son = list[2 * pos + 1];
			sonpos = 2 * pos + 1;

			if (last > 2 * pos + 1) {

				if (list[sonpos + 1] > son) {

					son = list[++sonpos];

				}

			}

			if (list[sonpos] > list[pos]) {

				swap(list, sonpos, pos);

				pos = sonpos;

			} else {

				break;

			}

		}

	}

	public static void heapSort(int[] list) {

		int pos, num;
		for (pos = (list.length - 1) / 2; pos >= 0; pos--) {

			adjHeap(list, list.length - 1, pos);

		}

		swap(list, 0, (list.length - 1));

		for (num = list.length - 2; num >= 1; num--) {

			adjHeap(list, num, 0);
			swap(list, 0, num);

		}

	}

	public static void main(String[] sAry) {

		int[] list1 = { 37, 1, 5, 26, 12, 60, 0 };

		System.out.println("\n" + "bef insert_sort:");
		for (int i = 0; i <= list1.length - 1; i++) {

			System.out.print(list1[i] + ", ");

		}

		insertionSort(list1);

		System.out.println("\n" + "aft insert_sort:");
		for (int i = 0; i <= list1.length - 1; i++) {

			System.out.print(list1[i] + ", ");

		}

		int[] list2 = { 3, 1, 5, 26, 12, 6, 0 };

		System.out.println("\n" + "\n" + "bef select_sort:");
		for (int i = 0; i <= list2.length - 1; i++) {

			System.out.print(list2[i] + ", ");

		}

		selectionSort(list2);

		System.out.println("\n" + "aft select_sort:");
		for (int i = 0; i <= list2.length - 1; i++) {

			System.out.print(list2[i] + ", ");

		}

		int[] list3 = { 17, 1, 5, 26, 12, 60, 0 };

		System.out.println("\n" + "\n" + "aft bubble_sort:");
		for (int i = 0; i <= list3.length - 1; i++) {

			System.out.print(list3[i] + ", ");

		}

		bubbleSort(list3);

		System.out.println("\n" + "aft bubble_sort:");
		for (int i = 0; i <= list3.length - 1; i++) {

			System.out.print(list3[i] + ", ");

		}

		int[] list4 = { 26, 5, 37, 1, 61, 11, 59, 15, 48, 19 };

		System.out.println("\n" + "\n" + "bef quick_sort:");
		for (int i = 0; i <= list4.length - 1; i++) {

			System.out.print(list4[i] + ", ");

		}

		quickSort(list4, 0, list4.length - 1);

		System.out.println("\n" + "aft quick_sort:");
		for (int i = 0; i <= list4.length - 1; i++) {

			System.out.print(list4[i] + ", ");

		}

		int[] list5 = { 26, 5, 37, 1, 61, 11, 59, 15 };

		System.out.println("\n" + "\n" + "bef merge_sort:");
		for (int i = 0; i <= list5.length - 1; i++) {

			System.out.print(list5[i] + ", ");

		}

		mergeSort(list5, 0, list5.length - 1);

		System.out.println("\n" + "aft merge_sort:");
		for (int i = 0; i <= list5.length - 1; i++) {

			System.out.print(list5[i] + ", ");

		}

		int[] list6 = { 37, 1, 5, 26, 12, 60 };

		System.out.println("\n" + "\n" + "bef heap_sort:");
		for (int i = 0; i <= list6.length - 1; i++) {

			System.out.print(list6[i] + ", ");

		}

		heapSort(list6);

		System.out.println("\n" + "aft heap_sort:");
		for (int i = 0; i <= list6.length - 1; i++) {

			System.out.print(list6[i] + ", ");

		}

	}

}