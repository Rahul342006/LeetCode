//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//Example 1:
//Input: strs = ["flower","flow","flight"]
//Output: "fl"

//Example 2:
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
 
import java.util.Scanner;
class LongestCommonPrefix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[]arr;
        System.out.println("Enter size of an array");
        int s=sc.nextInt();
        sc.nextLine();
        arr=new String[s];
        String Prefix="";
        for(int e=0 ; e<arr.length ; e++){
            System.out.println("Enter elements:");
            arr[e]=sc.nextLine();
        }
        String temp=arr[0];
        outer:
        for(int i=0 ; i<temp.length() ; i++){
            char c=temp.charAt(i);
            for(int j=1 ; j<arr.length ; j++){
                if(i>=arr[j].length() || arr[j].charAt(i)!=c){
                    break outer;
                }
            }
             Prefix +=temp.charAt(i);
        }
        System.out.println("The longest prefix is: "+ Prefix);
    }
}