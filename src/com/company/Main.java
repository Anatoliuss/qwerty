package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37},15));
    }

    public static int binarySearch(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while(l <= r) {
            int m = l + (r-l)/2;
            if(arr[m] == x) {
                return m;
            }
            if(x > arr[m]) {
                l = m+1;

            } else {
                r = m-1;
            }
        }
        return -1;
    }
}
