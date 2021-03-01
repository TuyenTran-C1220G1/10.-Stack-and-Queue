package com.company;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = queue.rear = null;
        queue.enQueue(queue, 12);
        queue.enQueue(queue, 13);
        queue.enQueue(queue, 14);
        queue.deQueue(queue);
        queue.deQueue(queue);
        queue.displayQueue(queue);
    }
}
