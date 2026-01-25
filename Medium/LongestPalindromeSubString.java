//Given a string s, return the longest palindromic substring in s.
//Example 1:
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//Example 2:
//Input: s = "cbbd"
//Output: "bb"

import java.util.*;
public class LongestPalindromeSubString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        int start=0;
        int maxlen=0;
        for(int i=0 ; i<str.length() ; i++){
            int left1=i;
            int right1=i;
            int left2=i;
            int right2=i+1;
            while(left1>=0 && right1<str.length() && str.charAt(left1)==str.charAt(right1)){
                int currentlen=right1-left1+1;
                if(currentlen>maxlen){
                    start=left1;
                    maxlen=currentlen;
                }
                left1--;
                right1++;
            }
            while(left2>=0 && right2<str.length() && str.charAt(left2)==str.charAt(right2)){
                int currentlen=right2-left2+1;
                if(currentlen>maxlen){
                    start=left2;
                    maxlen=currentlen;
                }
                left2--;
                right2++;
            }
        }
        String answer=str.substring(start , start+maxlen);
        System.out.println("PalinDrome is:" + answer);
    }
    
}
