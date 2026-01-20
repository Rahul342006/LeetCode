//You are given two non-empty linked lists representing two non-negative integers. //The digits are stored in reverse order, and each of their nodes contains a single //digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.

import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class AddTwoNum{
    public static void main(String[] args){
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(4);
        ListNode n3=new ListNode(3);
        n1.next=n2;
        n2.next=n3;
        n3.next=null;
        ListNode head1=n1;
        ListNode l1=new ListNode(5);
        ListNode l2=new ListNode(6);
        ListNode l3=new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        l3.next=null;
        ListNode head2=l1;
        ListNode ptr1=head1;
        ListNode ptr2=head2;
        int carry=0;
        ListNode sum=new ListNode(0);
        ListNode bridge=sum;
        while(ptr1!=null || ptr2!=null){
            int val1=0;
            int val2=0;
            if(ptr1!=null){
                val1=ptr1.val;
            }
            if(ptr2!=null){
                val2=ptr2.val;
            }
            int Addition=val1+val2+carry;
            int NewDigit=Addition%10;
            carry=Addition/10;
            bridge.next=new ListNode(NewDigit);
            bridge=bridge.next;
            if(ptr1!=null){
                ptr1=ptr1.next;
            }
            if(ptr2!=null){
                ptr2=ptr2.next;
            }
            if(carry>0){
                bridge.next=new ListNode(carry);
            }
        }
        ListNode ptr3=sum.next;
        while(ptr3!=null){
            System.out.println(ptr3.val+"");
            ptr3=ptr3.next;
        }





    }
    
}
