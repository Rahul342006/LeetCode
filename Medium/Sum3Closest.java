//Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.
//Return the sum of the three integers.
//You may assume that each input would have exactly one solution.
//Example 1:
//Input: nums = [-1,2,1,-4], target = 1
//Output: 2
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

//Example 2:
//Input: nums = [0,0,0], target = 1
//Output: 0
//Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

import java.util.*;
public class Sum3Closest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]arr;
        System.out.println("Enter size:");
        int s=sc.nextInt();
        arr=new int[s];
        sc.nextLine();
        for(int e=0 ; e<arr.length ; e++){
            System.out.println("Enter elements:");
            arr[e]=sc.nextInt();
        }
        sc.nextLine();
        Arrays.sort(arr);
        System.out.println("Enter Target num:");
        int Target=sc.nextInt();
        int ClosestSum=arr[0]+arr[1]+arr[2];
        int BestDistance=Math.abs(ClosestSum-Target);
        for(int i=0 ; i<arr.length-2 ; i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int CurrentSum=arr[i]+arr[left]+arr[right];
                int CurrentDistance=Math.abs(CurrentSum-Target);
                if(CurrentDistance<BestDistance){
                    BestDistance=CurrentDistance;
                    ClosestSum=CurrentSum;
                }
                if(CurrentSum<Target){
                    left++;
                }
                else if(CurrentSum>Target){
                    right--;
                }
                else{
                    System.out.println("ClosestSum:"+CurrentSum);
                    return;
                }
            }
        }
        System.out.println("ClosestSum:"+ClosestSum);
    }
    
}
