package com.main;
  // Merge Sort (Birleştirmeli Siralama)
  // 5 3 6  4 6 2
  // i = 0,1, 2
  // j = 3,4
  // 4 5 3
public class Application {

	public static void main(String[] args) {
		int n=10;
		int[] dizi = new int[n];
		for (int i = 0; i < dizi.length ; i++) dizi[i]=dizi.length-i;
		for (int i = 0; i < dizi.length ; i++) System.out.printf("%4d", dizi[i]); System.out.println();
		mergeSort(dizi, 0, dizi.length-1);
		for (int i = 0; i < dizi.length ; i++) System.out.printf("%4d",dizi[i]);System.out.println();

	}
	public static void mergeSort(int dizi[], int l, int r) {
		if (l < r) {
			int m = l+(r-l)/2;
			mergeSort(dizi, l, m);
			mergeSort(dizi, m+1, r);
			merge(dizi, l, m, r);
		}
	}
	public static void merge(int dizi[], int l,int m, int r) {
		int nl = m - l + 1;
		int nR = r - m;
		int[] left = new int[nl];
		int[] right = new int[nR];
		
		for (int i = 0; i < nl; i++) left[i] = dizi[l + i] ;
		for (int j = 0; j < nR; j++) right[j] = dizi[m + 1+ j];
		
		int i = 0, j = 0;
		int k = l;
		while (i < nl && j < nR) {
			if(left[i] <= right[j]) {
				dizi[k] = left[i];
				i++;
			}else {
				dizi[k] = right[j];
				j++;
			}
			k++;
		}
		
		while (i < nl) {
			dizi[k] = left[i];
			i++;
			k++;
		}
		
		while (j < nR) {
			dizi[k] = right[j];
			j++;
			k++;
		}
	}

}
