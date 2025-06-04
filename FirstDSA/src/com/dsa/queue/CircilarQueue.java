package com.dsa.queue;

public class CircilarQueue {
	
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	public CircilarQueue(int capacity) {
		this.queue = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
		this.capacity = capacity;
	}
	
	public void enqueue(int data) {
		if (size == capacity) {
			System.out.println("Queue is full!!");			
			return;
		}
		
		rear = (rear + 1) % capacity;
		queue[rear] = data;
		size++;
	}
	
	public void dequeue() {
		if (size == 0) {
			System.out.println("Queue is empty!!");			
			return;
		}
		
		System.out.println("Delete element is : " + queue[front]);
		front = (front + 1) % capacity;
		size--;
	}
	
//	return size
	
	public void size() {
		System.out.println("Size of queue : " + this.size);		
	}
	
	public void didplay() {
		if (size == 0) {
			System.out.println("Queue is empty!!");
			return;
			
		}
		
		for(int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % capacity] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		CircilarQueue cq = new CircilarQueue(5);
		
		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.enqueue(50);
		
		cq.didplay();
		
		cq.dequeue();
		cq.size();
		
		cq.enqueue(60);
		cq.didplay();
		
		cq.dequeue();
		cq.enqueue(70);
		cq.didplay();
	}

}
