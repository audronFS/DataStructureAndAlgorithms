package Algorithms.ArraySort;

public class QuickSort {
    //Average running time O(n*log(n))
    //O(n^2) THis is the worst case.
    //Quicksort uses less space than MergeSort because it sorts the array in place without a temporary arrays
    public static void main(String[] args) {
        int[] arr = {15,9,5,10,2,11,4,7,21,6,2,12};
        int end = arr.length-1;
        arr = quickSort(arr, 0, end);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
    public static int[] quickSort(int[] arr, int start, int end){
        if(start<end){
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);
        }
        return arr;
    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = -1;
       for(int j=0; j<arr.length-1; j++){
           if(arr[j]<pivot){
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j]=temp;
           }
       }
       i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end]=temp;
       return i;
    }
}
