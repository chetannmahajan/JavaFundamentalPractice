package org.example;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] intArray = {89,71,63,59,45,25,23,17,9,5};
        Arrays.sort(intArray);
        boolean b = binarySearch(intArray, intArray.length - 1, 5);
        System.out.println(b);

    }

    public static boolean binarySearch(int[] array, int size, int data)
    {
     int left=0;
     int right=size;
     int mid;

        while(left <= right){
            mid = left+right/2;

            if(data == array[mid]){
                System.out.println(array[mid]);
                return true;
            }else if(data < array[mid]){
                right = mid-1;
            } else if (data > array[mid]) {
                left = mid+1;
            }
        }
        return false;
    }

}
