//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//Return true if you can reach the last index, or false otherwise.
//Example 1:
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

//Example 2:
//Input: nums = [3,2,1,0,4]
//Output: false
//Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("Enter size:");
        int s = sc.nextInt();
        arr = new int[s];
        int maxReach=0;
        boolean canReach=true;
        for(int e = 0; e < arr.length; e++){
            System.out.println("Enter elements:");
            arr[e] = sc.nextInt();
        }
        for(int i=0 ; i< arr.length ; i++){
            if(i > maxReach){
                canReach=false;
                break;
            }
            else{
                maxReach=Math.max(maxReach , i+arr[i]);
            }
        }
        if(canReach == true) {
            System.out.println("true");
        } 
        else {
            System.out.println("false");
        }

    }
    
}
