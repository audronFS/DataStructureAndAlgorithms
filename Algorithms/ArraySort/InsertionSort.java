package Algorithms.ArraySort;
//O(n^2)
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = insertionSort(new int[]{5,9,11,3,17});
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
    public static int[] insertionSort(int[] arr){

//        for(int i=1; i<arr.length; i++){
//            for(int j=i-1; j>=0; j--){
//                if(arr[i]<arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                    i--;
//                }
//            }
//
//        }
//        return arr;

        for(int i=1; i<arr.length;i++){
            int element = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>element){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=element;
        }
        return arr;
    }
}
