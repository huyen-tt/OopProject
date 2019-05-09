package application;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
	public  LinkedList <String> queue = new LinkedList <String>();
    public  Scanner scanner = new Scanner(System.in); 
    
    public int size() {
        return queue.size();
      }
    public boolean isEmpty() {
        return size() == 0;
      }
    
    public void enQueue(String str) {
    	System.out.print("Enter a string: ");
        str=scanner.nextLine();
        queue.addLast(str);
    }
    
    public void deQueue() {
    	if(isEmpty())
    		throw new RuntimeException("Empty Queue");
        queue.removeFirst();
    }
    
    public String peek() {
    	if (isEmpty()) 
    	      throw new RuntimeException("Queue Empty");
    	return queue.peekFirst();
    }
    
    public void deleteQueue() {
    	queue.clear();
    }
    
}
