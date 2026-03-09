//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

//Example 2:
//Input: nums = [0]
//Output: [0]

import java.util.Scanner;
class MoveZeroes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]arr;
        System.out.println("Enter size of an array");
        int s=sc.nextInt();
        arr=new int[s];
        for(int e=0; e<arr.length ; e++){
            System.out.println("Enter elements:");
            arr[e]=sc.nextInt();
        }
        System.out.println("Array:");
        System.out.print("[ ");
        for(int j=0 ; j<arr.length ; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.print("] ");
        int left=0;
        for(int right=0 ; right<arr.length ; right++){
            if(arr[right]==0){
                continue;
            }
            else{
                arr[left]=arr[right];
                left++;
            }
        }
        for(int l=left ; l<arr.length ; l++){
            arr[l]=0;
        }
        System.out.println("\nArray after moving zeroes:");
        System.out.print("[ ");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.print(" ]");
        

    }
}