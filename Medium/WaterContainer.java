//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//Notice that you may not slant the container.
//Example 1:
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49

//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

//Example 2:
//Input: height = [1,1]
//Output: 1

import java.util.Scanner;
class WaterContainer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]arr;
        int maxArea=0;
        System.out.println("Enter size of an array ");
        int s=sc.nextInt();
        arr=new int[s];
        for(int e=0;e<arr.length;e++){
            System.out.println("Enter elements into an array");
            arr[e]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int width=j-i;
                int area=0;
                if(arr[i]<arr[j]){
                    area=width*arr[i];
                }
                else{
                    area=width*arr[j];
                }
                if(area>maxArea){
                    maxArea=area;
                }
            }
        }
        System.out.println("Maximum amount  of water container can store:"+maxArea);
    } 
}



 