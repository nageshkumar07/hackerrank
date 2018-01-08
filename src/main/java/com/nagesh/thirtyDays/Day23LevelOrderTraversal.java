package com.nagesh.thirtyDays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  03/12/17.
 */
public class Day23LevelOrderTraversal {
    static class Node {
        Node left, right;

        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    static void levelOrder(Node root) {
        //Write your code here
        Queue<Node> q = new LinkedList<>();
        if (root == null) {
            return;
        }
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.remove();
            System.out.print(n.data + " ");
            if (n.left != null) {
                q.add(n.left);
            }
            if (n.right != null) {
                q.add(n.right);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
