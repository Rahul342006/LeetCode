//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//Example 1:
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//Example 2:
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//P     I    N
//A   L S  I G
//Y A   H R
//P     I  

import java.util.*;
class ZigZagConversion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter String:");
        String str=sc.nextLine();
        int l=str.length();
        StringBuilder[] arr=new StringBuilder[row];
        for(int i=0 ; i<row ; i++){
            arr[i]=new StringBuilder();
        }
        int index=0;
        int rowptr=0;
        boolean down=false;
        if(row==1){
            System.out.println(str);
        }
        else{
            while(index<l){
            arr[rowptr].append(str.charAt(index));
            index++;
            if(rowptr==0){
                down=true;
            }
            else if(rowptr==row-1){
                down=false;
            }
            if(down){
                rowptr++;
            }
            else{
                rowptr--;
            }
        }
        StringBuilder result=new StringBuilder();
        for(int i=0 ; i<row ; i++){
            result.append(arr[i]);
        }
        System.out.println(result.toString());
    }
}
}
        