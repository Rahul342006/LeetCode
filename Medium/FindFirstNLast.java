//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.

//Example 1:
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]

//Example 2:
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]

//Example 3:
//Input: nums = [], target = 0
//Output: [-1,-1]

import java.util.Arrays;
import java.util.Scanner;
public class FindFirstNLast{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]arr;
        System.out.println("Enter Size:");
        int s=sc.nextInt();
        arr=new int[s];
        for(int e=0 ; e<arr.length ; e++){
            System.out.println("Enter elements:");
            arr[e]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter Target:");
        int Target=sc.nextInt();
        int firstIndex=-1;
        int lastIndex=-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==Target){
                firstIndex=mid;
                right=mid-1;
            }
            else if(arr[mid]<Target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        left=0;
        right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==Target){
                lastIndex=mid;
                left=mid+1;
            }
            else if(arr[mid]<Target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println("[" + firstIndex + "," + lastIndex + "]");


    }
    
}