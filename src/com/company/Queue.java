package com.company;

public class Queue {
    public Node front;
    public Node rear;

    public void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println(" Elements in Circular Queue are: ");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }


    public void enQueue(Queue q, int data) {
        Node temp = new Node(data);
        if (q.front == null) {
            q.front = temp;
        } else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }

    public int deQueue(Queue q) {
        if (q .front ==  null) {
            System.out.printf ("Queue is empty");
            return Integer.MIN_VALUE;
        }

        // If this is the last node to be deleted
        int data; // Value to be dequeued
        if (q .front == q .rear) {
            data = q .front .data;
            q .front =  null;
            q .rear =  null;
        }
        else  // There are more than one nodes
        {
            Node  temp = q .front;
            data = temp .data;
            q .front = q .front .link;
            q .rear .link= q .front;
        }

        return data ;
    }
}
