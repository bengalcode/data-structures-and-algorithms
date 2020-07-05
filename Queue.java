public class Queue {

	// initializations
	private int head=0, tail=0;
	private int queueSize = 10;
	private int queueCounter = 0;
	private int queue[] = new int[queueSize];
	
	// is empty
	boolean isEmpty() {
		return (queueCounter == 0);
	}
	
	// is full
	boolean isFull() {
		return (queueCounter == queueSize);
	}
	
	// enqueue
	void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is full.");
			return;
		}
		queue[tail] = item;
		tail = ((tail+1)%queueSize); 
		queueCounter++;
	}
	
	// dequeue
	void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		int item = queue[head];
		queue[head] = 0;
		head = ((head+1)%queueSize);
		queueCounter--;
		System.out.println("Dequeue: "+item);
	}
	
	// traverse
	void traverse() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.println("----------------------------------------------");
		System.out.println("Queue Size: "+queueSize+", Enqueued: "+queueCounter+", Head: "+head+", Tail: "+tail);
		System.out.println("----------------------------------------------");
		for(int item : queue) System.out.println(item);
	}

}
