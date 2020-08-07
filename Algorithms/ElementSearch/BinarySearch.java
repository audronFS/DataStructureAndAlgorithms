package Algorithms.ElementSearch;
//O(log(n))
public class BinarySearch {
    public static void main(String[] args) {
        //System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 7));
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int last = arr.length-1;
        System.out.println(recursiveBinarySearch(arr, 12, 0, last));
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
    public static  int recursiveBinarySearch(int[] arr, int value, int first, int last){
        System.out.println("["+first+"..."+last+"]");
        if(first>last) return -1;
        int middle = (first+last)/2;
            if (arr[middle] > value)
               return recursiveBinarySearch(arr, value, first, middle - 1);
            else if (arr[middle] < value)
                return recursiveBinarySearch(arr, value, middle + 1, last);
        return middle;
    }
}
