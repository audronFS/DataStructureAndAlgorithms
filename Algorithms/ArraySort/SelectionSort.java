package Algorithms.ArraySort;
//O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = selectionSort(new int[]{5,9,11,3,17});
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
    public static int[] selectionSort(int[] arr){
//        int i=0;
//        while(i<arr.length){
//            int min=arr[i];
//            for(int j=i; j<arr.length; j++){
//                if(min>arr[j]){
//                    min=arr[j];
//                    int temp = arr[i];
//                    arr[i] = min;
//                    arr[j] = temp;
//                }
//            }
//            i++;
//        }
//        return arr;
        int min;
        for(int i=0; i<arr.length; i++){
            min = i;
            for(int j=i+1; j<arr.length; j++){
                 if(arr[min]>arr[j]){
                     min = j;
                 }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
