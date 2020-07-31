package Algorithms.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int value = 7;
        //System.out.println(linearSearch(arr, value));
        System.out.println(recursiveLinearSearch(arr, 0, value));
    }
    public static int linearSearch(int[] arr, int value){
     for(int i = 0; i<arr.length; i++){
         if(arr[i] == value)
            return i;
     }
        return -1;
    }
    public static int recursiveLinearSearch(int[] arr, int i, int value){

        if(i>=arr.length) return -1;
        else if(arr[i] == value) return i;
        else{
           return recursiveLinearSearch(arr, i += 1, value);
       }
    }
}
