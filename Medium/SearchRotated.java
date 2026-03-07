//There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//You must write an algorithm with O(log n) runtime complexity.

//Example 1:
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4

//Example 2:

//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1

//Example 3:
//Input: nums = [1], target = 0
//Output: -1
 
import java.util.Scanner;
public class SearchRotated{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("Enter size:");
        int s = sc.nextInt();
        arr = new int[s];
        for(int e = 0; e < arr.length; e++){
            System.out.println("Enter elements:");
            arr[e] = sc.nextInt();
        }
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
            if(arr[left]<=arr[mid]){
                if(Target>=arr[left] && Target<arr[mid] ){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(Target<=arr[right] && Target>arr[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        
        
    }
}
