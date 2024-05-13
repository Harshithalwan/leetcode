package org.hhalwan.search;

public class SearchingAlgorithms {

//    public SearchingAlgorithms() {
//        System.out.println("Searching Algorithms");
//    }
    public int linearSearch(int[] arr, int num) {
        for(int i=0; i< arr.length; i++) {
            if(arr[i] == num) return i;
        }
        return -1;
    }

    public int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(arr[mid] == num) return mid;
            else if(arr[mid] < num) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
