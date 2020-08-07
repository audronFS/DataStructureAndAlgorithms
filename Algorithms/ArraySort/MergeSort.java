package Algorithms.ArraySort;
//O(n(logn))-->it is very fast but it also takes more space than other algorithms
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6,3,8,14,9,1,18,4};
        int last = arr.length-1;
        int[] sortArray = mergeSort(arr, 0, last);
        for(int e: sortArray){
            System.out.print(e + " ");
        }


    }
    public static int[] mergeSort(int[] arr, int start, int end){
        int[] sortArray = new int[arr.length];
        if(start<end){
            int mid = (end+start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            sortArray=merge(arr, start, mid, end);
        }
        return sortArray;
    }
    public static int[] merge(int [] arr, int left, int mid, int right){
//        int left_cnt = mid-left+1;
//        int right_cnt = right - mid;
//        int[] leftArray = new int[left_cnt];
//        int[] rightArray = new int[right_cnt];
//
//        for(int i=0; i<left_cnt; i++){
//            leftArray[i] = arr[left+i];
//        }
//        for(int j=0; j<right_cnt; j++){
//            rightArray[j] = arr[mid+j+1];
//        }
//       int j = 0;
//       int i = 0;
//       int k =left;
//      while(i<=left_cnt && j<=right_cnt){
//              if(leftArray[i] < rightArray[j]) {
//                  arr[k] = leftArray[i];
//                  i++;
//              } else{
//                  arr[k] = rightArray[j];
//                  j++;
//              }
//          k++;
//      }
//      while(i<left_cnt){
//          arr[k] = leftArray[i];
//          i++;
//          k++;
//      }
//      while(j<right_cnt){
//          arr[k]=rightArray[j];
//          j++;
//          k++;
//      }
//        return arr;

//        ----------------------------------------------------------------------->
//        ----------------------------------------------------------------------->


        int left_cnt = mid-left+1;
        int right_cnt = right - mid;
        int[] leftArray = new int[left_cnt+1];
        int[] rightArray = new int[right_cnt+1];

        for(int i=0; i<left_cnt; i++){
            leftArray[i] = arr[left+i];
        }
        leftArray[left_cnt]=999999999;
        for(int j=0; j<right_cnt; j++){
            rightArray[j] = arr[mid+j+1];
        }
        rightArray[right_cnt]=999999999;
        int j = 0;
        int i = 0;

        for(int k =left; k<right+1; k++){
            if(leftArray[i]<rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
        }
        return arr;
    }

}
