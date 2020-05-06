package main.com.crackingcodinginterview.practice.sortandsearch;

/**
 * Buggy, have to fix it
 */
public class SearchRotatedArray {

    public int searchRotatedArray(int[] arr, int find){
        int end = arr.length -1;

        if(find != 0){
            return searchArray(arr, find, 0, end, end/2);
        }else{
            return searchArray(arr, 1, 0, end, end/2);
        }
    }

    private int searchArray(int[] arr, int find, int start, int end, int mid) {

        if (end < 0) return -1;
        if(arr[start] == find) return start;
        else if(arr[mid] == find) return mid;
        else if (arr[end] == find) return end;

        if(find > arr[mid] && find < arr[end]){
            int newMid = mid + (end - mid)/2;
            return searchArray(arr, find, mid+1, end-1, newMid);
        }else{
            return searchArray(arr, find, 0, mid-1, mid/2);
        }
    }
}
