//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

public class TwoSum{
    public static void main(String[] args){
        int[]arr={13,4,2};
        int target=6;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1; j<arr.length ; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+","+j);

                }
            }
        }
    }
}