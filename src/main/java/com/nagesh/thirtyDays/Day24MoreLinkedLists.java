package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  08/12/17.
 */
public class Day24MoreLinkedLists {


    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }

    public static Node removeDuplicates(Node head) {

        if(head == null)
            return head;
        //Write your code here
        Node current = head;
        Node without_duplicates = null;
        without_duplicates = insert(without_duplicates,current.data);
        while(current.next != null) {
            if (listAlreadyContainsNode(without_duplicates,current.next)) {
                current = current.next;
                continue;
            }
            else{
                without_duplicates = insert(without_duplicates,current.next.data);
                current = current.next;
            }

        }
        return without_duplicates;
    }

    private static boolean listAlreadyContainsNode(Node unique, Node is_present) {
        while (unique != null) {
            if (unique.data == is_present.data) {
                return true;
            }
            unique = unique.next;
        }
        return false;
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
