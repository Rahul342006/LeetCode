//Given an integer x, return true if x is a palindrome, and false otherwise.

//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.

//Example 2:
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

//Example 3:
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        boolean result;
        int temp=0;
        int orginalnum=num;
        if(num<0){
            result=false;
            System.out.println("Is the num Palindrome:" + result);
            
        }
        else{
            while(num!=0){
            int RemoveLastDigit=num%10;
            temp=(temp * 10 )+ RemoveLastDigit;
            num=num/10;
            }
            if(temp==orginalnum){
            result=true;
            System.out.println("Is the num Palindrome:"+result);
            }
            else{
            result=false;
            System.out.println("Is the num Palindrome:" + result);
            }
        }
    }
    
}
