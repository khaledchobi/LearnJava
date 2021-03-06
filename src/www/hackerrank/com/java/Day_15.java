package www.hackerrank.com.java;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day_15 {
    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null)
            return new Node( data);
        else if(head.next == null){
            head.next = new Node(data);
        }
        else{
            insert(head.next,data);
        }
        return head;

        // OR ....
        /*// if list has no elements, return a new node
        if(head == null){
            return new Node(data);
        }

        // else iterate through list, add node to tail, and return head
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new Node(data);

        return head;*/

        // OR ....
        /*Node n = new Node(data);
        Node  temp = head;
        if (head == null) // check if head is null(there will be no nodes at the very begining)
            return n; //if yes create new node and return that
        else
            while(temp.next!=null){ //check if this node points to null
                temp = temp.next ; //iterate through the list, move to the next node if current node is not pointing to null
            }

        temp.next = n; //the last node must now point to the newly added node
        return head; // return the head*/

        // OR .....
        /*// This is a "method-only" submission.
        // You only need to complete this method.
        Node current = head;
        // Setting up our new node to add
        Node newTail = new Node(data);
        newTail.next = null;
        // if the list isn't empty
        if (current != null) {
            // get to the end of the list and set the current
            // to the last element
            while (current.next != null) {
                // iterating through
                current = current.next;
            }
        } else {
            // otherwise the list is empty and we should just return our new node with the data
            return newTail;
        }
        // then add our new tail onto the end of the list
        current.next = newTail;
        return head;*/

        // OR .....
        /*if (head == null) return new Node(data);
        head.next = insert(head.next, data);
        return head;*/

        // OR ....
        /*Node n = new Node(data);
        if(head==null){
            head=n;
        }else{
            Node temp = head;
            while(temp.next != null){temp=temp.next;}
            temp.next=n;
        }
        return head;*/

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
