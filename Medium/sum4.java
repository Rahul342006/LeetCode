//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
//nums[a] + nums[b] + nums[c] + nums[d] == target
//You may return the answer in any order.
//Example 1:
//Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
//Example 2:
//Input: nums = [2,2,2,2,2], target = 8
//Output: [[2,2,2,2]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class sum4 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int[]arr;
        List<List<Integer>> Quadriplets=new ArrayList<>();
        System.out.println("Enter size:");
        int s=sc.nextInt();
        arr=new int[s];
        sc.nextLine();
        for(int e=0 ; e<arr.length ; e++){
            System.out.println("Enter elements:");
            arr[e]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("before array");
        System.out.print("[");
        for(int k=0 ; k<arr.length ; k++){
            System.out.print(arr[k]+ " ");
        }
        System.out.print("]");
        Arrays.sort(arr);
        sc.nextLine();
        System.out.println("Enter target:");
        int target = sc.nextInt();
        for(int i=0 ; i<arr.length-3 ; i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1 ; j<arr.length-2 ; j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int left=j+1;
                int right=arr.length-1;
                while(left<right){
                    int sum=arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum<target){
                        left++;
                    }
                    else if(sum>target){
                        right--;
                    }
                    else{
                        Quadriplets.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        left++;
                        right--;
                        while(left<right && arr[left]==arr[left-1]){
                            left++;
                        }
                        while(left<right && arr[right]==arr[right+1]){
                            right--;
                        }
                    }
                }
            }
        }
        System.out.println("Quadriplets:");
            for(List<Integer> List:Quadriplets){
                System.out.println(List);
            }
        
    }
    
}
