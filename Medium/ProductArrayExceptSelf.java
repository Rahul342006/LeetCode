//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.
//Example 1:
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]

//Example 2:
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]

import java.util.Scanner;
public class ProductArrayExceptSelf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]arr;
        System.out.println("Enter Size:");
        int s=sc.nextInt();
        arr= new int[s];
        for(int e=0 ; e<arr.length ; e++){
            System.out.println("Enter elements:");
            arr[e]=sc.nextInt();
        }
        int[]left=new int[s];
        int[]right=new int[s];
        left[0]=1;
        for(int i=1 ; i<arr.length ; i++){
            left[i]=left[i-1]*arr[i-1];
        }
        right[arr.length-1]=1;
        for(int i = arr.length-2; i >= 0; i--){
         right[i] = right[i+1] * arr[i+1];
        }
        int[]answers=new int[s];
        for(int i=0 ; i<arr.length ; i++){
            answers[i]=left[i]*right[i];
        }
        for(int i = 0; i < answers.length; i++){
            System.out.print(answers[i] + " ");
        }

    }
    
}
