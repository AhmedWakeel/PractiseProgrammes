package com.generic.test;

class Queue<E> {
	  private E[] elements;
	  private int head=0, tail=0;
	  Queue(int size) {
	    elements = (E[]) new Object[size];
	  }

	  void insert(E element) throws QueueFullException {
	    if (isFull())
	      throw new QueueFullException();
	    elements[tail] = element;
	    tail = (tail + 1) % elements.length;
	    System.out.println(tail+" in insert "+head);
	  }

	  E remove() throws QueueEmptyException {
	    if (isEmpty()){
	      throw new QueueEmptyException();
	    }
	    E element = elements[head];
	    head = (head + 1) % elements.length;
	    return element;
	  }

	  boolean isEmpty() {
		  System.out.println(head+" "+tail);
	    return head == tail;
	  }

	  boolean isFull() {
		  System.out.println("isFull "+(tail + 1) % elements.length +"=="+head);
	    return (tail + 1) % elements.length == head;
	  }
	}

	 class QueueSorting{
	  public static void main(String[] args) 
	      throws QueueFullException, QueueEmptyException {
	    Queue<String> queue = new Queue<String>(2);
	    System.out.println("Empty: " + queue.isEmpty());
	    System.out.println("Full: " + queue.isFull());
	    queue.insert("A");
	    System.out.println("Empty: " + queue.isEmpty());
	    System.out.println("Full: " + queue.isFull());
	    System.out.println("Removing " + queue.remove());
	    System.out.println("Empty: " + queue.isEmpty());
	    System.out.println("Full: " + queue.isFull());
	    System.out.println("Adding F");
	    queue.insert("F");
	    while (!queue.isEmpty()){
	      System.out.println("Removing " + queue.remove());
	    }
	      
	    System.out.println("Empty: " + queue.isEmpty());
	    System.out.println("Full: " + queue.isFull());
	  }
	}
	
	class QueueEmptyException extends Exception {
	}

	class QueueFullException extends Exception {
	}