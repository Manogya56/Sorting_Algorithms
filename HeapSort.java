package com.company;

import java.util.Vector;

public class HeapSort {
     void swapval(Vector<Integer> A, int i) {
        int temp = (int) A.get(i);
        A.set(i, A.get(i / 2));
        A.set(i / 2, temp);
    }
      void swap(Vector<Integer> A, int v1, int v2){

        int temp= A.get(v1);
        A.set(v1,A.get(v2));
        A.set(v2,temp);

    }
     void heapify(Vector<Integer> arr, int n, int i)
    {
        int smallest = i; // Initialize largest as root
        int l = 2 * i ; // left = 2*i + 1
        int r = 2 * i + 1; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr.get(l) < arr.get(smallest))
            smallest = l;

        // If right child is larger than largest so far
        if (r < n && arr.get(r) < arr.get(smallest))
            smallest = r;

        // If largest is not root
        if (smallest != i) {
            swap(arr,i,smallest);

            // Recursively heapify the affected sub-tree
            heapify(arr, n, smallest);
        }
    }


    void heap_sort(int[] arr){
        Vector<Integer> vec = new Vector<>(arr.length);
      //  int finalarr[]= new int[arr.length];
        int j;
        vec.add(0,null);
        //  vec.add(1,1);
        int n=0,m=0;

        for (int i = 0; i < arr.length; i++) {
            n = n + 1;
            vec.add(n, arr[i]); // sortarr[n]= arr[i];
            j = n;

            while (j > 1 && vec.get(j) < vec.get(j / 2)) {
                swapval(vec, j);
                j = j / 2;
            }
        }


        for(int i=vec.size()-1; i>=1; i-- ){
            arr[m++]=vec.get(1);
            swap(vec,1,i);// vec.get(1), vec.get(i));
            heapify(vec,i,1);
        }


    }
    //print array sorted using heap sort
    void printHeapSortArray(int[] arr) {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }
}
