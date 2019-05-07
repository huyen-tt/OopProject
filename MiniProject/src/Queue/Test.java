package Queue;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Queue q = new Queue(10);
		q.queueDisplay();
		q.enQueue(2);
		q.enQueue(345);
		q.enQueue(54);
		q.queueDisplay();
		System.out.println("\n"+q.deQueue()+ " deQueued");
		q.queueDisplay();
		System.out.println("\nFront element is "+ q.front());
		System.out.println("Rear element is "+ q.rear());
	}

}
