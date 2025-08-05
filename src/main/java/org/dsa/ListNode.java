package org.dsa;

/*
 * Definition for singly-linked list.*/

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ListNode {
     int val;
    ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        //head.next.next.next.next.next=head.next; //uncomment for hascycles

       System.out.println(getMidUsingArrays(head).val);
        //System.out.println(hasCycles(head)? "Contains Cycles":"Doesnot Contain Cycles");






        //System.out.println(head);



    }


    private static boolean hasCycles(ListNode head){

        HashSet<ListNode> set = new HashSet<>();
        while(head!=null)
        {
            if(set.contains(head))
                return true;
            set.add(head);
            head=head.next;
        }
        return false;

    }


    private static void reverseListNode(ListNode  head){
        ListNode current = head;
        ListNode prev=null;

        while(current!=null){
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;

        }

    }



    private static ListNode findMid(ListNode head){
        ListNode slow= head;
        ListNode fast=head;

                while(fast!=null && fast.next!=null){
                    slow=slow.next;
                    fast= fast.next.next;
                }
                return slow;

    }

    private static ListNode getMidUsingArrays(ListNode head){
        ListNode [] a= new ListNode[100];
        int i=0;
        while(head!=null){
            a[i]=head;
            head=head.next;
            i++;
        }
        return (a[i/2]);


    }





}

