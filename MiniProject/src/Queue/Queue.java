package Queue;

public class Queue {
	int front, rear, size, capacity;
	int array[];
	
	public Queue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}
	
	//Empty queue
	public boolean Empty(Queue queue) {
		return (queue.size == 0);
	}
	
	//When queue's size becomes equal to capacity -> Full
	public boolean Full(Queue queue) {
		return (queue.size == queue.capacity);
	}
	
	//Add an index into queue
	public void enQueue(int element) {
		if (Full(this))
			return;
		this.rear = (this.rear +1)%this.capacity;
		this.array[this.rear] = element;
		this.size = this.size +1;
		System.out.println(element + " enqueued");
	}
	
	//Remove an index from queue
	public int deQueue() {
		if(Empty(this))
			return Integer.MIN_VALUE;
		int element = this.array[this.front];
		this.front = (this.front +1)%this.capacity;
		this.size = this.size -1;
		return element;
	}
	
	//Print queue
	public void queueDisplay() {
		int i;
		if(Empty(this)) {
			System.out.println("Queue is empty!");
			return;
		}
		for (i = front; i<=rear; i++) {
			System.out.printf(" %d,",array[i]);
		}
		return;
	}
	
	//Get front
	public int front() {
		if(Empty(this))
			return Integer.MIN_VALUE;
		return this.array[this.front];
	}
	
	//Get rear
	public int rear() {
		if(Empty(this))
			return Integer.MIN_VALUE;
		return this.array[this.rear];
	}
	
}
