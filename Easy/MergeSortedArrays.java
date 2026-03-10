//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

//Example 1:
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

//Example 2:
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].

//Example 3:
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

import java.util.Arrays;
import java.util.Scanner;

class MergeSortedArrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] arr;
        int[] arr2;

        System.out.println("Enter size:");
        int s=sc.nextInt();
        arr=new int[s];

        for(int e=0 ; e<arr.length ; e++){
            System.out.println("Enter elements:");
            arr[e]=sc.nextInt();
        }

        System.out.print("[ ");
        for(int l=0 ; l<arr.length ; l++){
            System.out.print(arr[l]+" ");
        }
        System.out.print("]");

        System.out.println();

        System.out.println("Enter size:");
        int s1=sc.nextInt();
        arr2=new int[s1];

        for(int f=0 ; f<arr2.length ; f++){
            System.out.println("Enter elements:");
            arr2[f]=sc.nextInt();  
        }

        System.out.print("[ ");
        for(int p=0 ; p<arr2.length ; p++){
            System.out.print(arr2[p]+" ");  
        }
        System.out.print("]");

        System.out.println();
        
        Arrays.sort(arr);
        Arrays.sort(arr2);

        int i=0;
        int j=0;
        int k=0;

        int[]result= new int[arr.length+arr2.length];
        while(i<arr.length && j<arr2.length){
            if(arr[i]<arr2[j]){
                result[k]=arr[i];
                i++;
            }
            else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr.length){
            result[k]=arr[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            result[k]=arr2[j];
            j++;
            k++;
        }
        System.out.print("Merged Array: [ ");
        for(int x=0; x<result.length; x++){
            System.out.print(result[x]+" ");
        }
        System.out.print("]");

        
    }
}