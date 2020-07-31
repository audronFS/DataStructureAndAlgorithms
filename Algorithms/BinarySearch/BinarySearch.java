package Algorithms.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 7));
    }
    public static int binarySearch(int[] arr, int value){
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
            int middle = (last+first)/2;
            if(value == arr[middle])
                return middle;
            if(value>arr[middle])
                first = middle+1;
            else
                last = middle-1;
        }
        return -1;
    }
}
