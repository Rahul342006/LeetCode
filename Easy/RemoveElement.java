//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//Return k.

//Example 1:
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//It does not matter what you leave beyond the returned k (hence they are underscores).

//Example 2:
//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3,_,_,_]
//Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//Note that the five elements can be returned in any order.
//It does not matter what you leave beyond the returned k (hence they are underscores).
 

import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]arr;
        int left=0;
        int right=0;
        System.out.println("Enter size of an array:");
        int s=sc.nextInt();
        arr=new int[s];
        sc.nextLine();
        for(int e=0 ; e<arr.length ; e++){
            System.out.println("Enter elements:");
            arr[e]=sc.nextInt();
        }
        System.out.println("before array");
        System.out.print("[");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print("]");
        sc.nextLine();
        System.out.println("Enter element to remove from the array:");
        int Removedval=sc.nextInt();
        while(right<arr.length){
            if(arr[right]!=Removedval){
                arr[left]=arr[right];
                left++;
            }
            right++;
        }
        System.out.println("After array");
        System.out.print("[");
        for(int j=0 ; j<left ; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.print("]");
        System.out.println("Length:"+left);
    }
    
}
