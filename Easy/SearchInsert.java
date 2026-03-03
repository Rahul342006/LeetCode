//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [1,3,5,6], target = 5
//Output: 2

//Example 2:
//Input: nums = [1,3,5,6], target = 2
//Output: 1

//Example 3:
//Input: nums = [1,3,5,6], target = 7
//Output: 4

import java.util.*;
public class SearchInsert{
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
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==Target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<Target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(left);
        
    }
    
}
