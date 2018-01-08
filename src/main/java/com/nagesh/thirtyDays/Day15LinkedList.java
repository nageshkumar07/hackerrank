package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  20/11/17.
 */
public class Day15LinkedList {

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node to_be_inserted = new Node(data);
        if(head == null)
            return to_be_inserted;

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = to_be_inserted;
        return head;
    }


    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
