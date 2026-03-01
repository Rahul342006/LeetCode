//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//Example 1:
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation: 
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.

//Example 2:
//Input: nums = [0,1,1]
//Output: []
//Explanation: The only possible triplet does not sum up to 0.

//Example 3:
//Input: nums = [0,0,0]
//Output: [[0,0,0]]
//Explanation: The only possible triplet sums up to 0.

import java.util.*; 
public class Sum3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]arr;
        List<List<Integer>> Triplets=new ArrayList<>();
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
        sc.nextLine();
        for(int i=0 ; i<arr.length-2 ; i++){
            if (i > 0 && arr[i] == arr[i - 1]){
                continue;
            }
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum<0){
                    left++;
                }
                else if(sum>0){
                    right--;
                }
                else{
                    Triplets.add(Arrays.asList(arr[i] , arr[left] , arr[right]));
                    left++;
                    right--;
                    while(left < right && arr[left]==arr[left-1]){
                        left++;
                    }
                    while(left < right && arr[right]==arr[right+1]){
                        right--;
                    }
                }
            }
        }
    System.out.println("Triplets:");
    for (List<Integer> list : Triplets) {
      System.out.println(list);
    }
}
}
 