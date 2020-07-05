public class Stack {

	// initializations
	static int top;
	static int stackSize = 10;
	static int stackItems = 0;
	static int stack[] = new int[stackSize];
	
	// is empty
	boolean isEmpty() {
		return (stackItems == 0);
	}
	
	// is full
	boolean isFull() {
		return (stackItems == stackSize);
	}
	
	// peek 
	int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return-1;
		}
		return stack[top];
	}
	
	// push item
	void push(int item) {
		if(isFull()) {
			System.out.println("Stack is full.");
			return;
		}
		stack[top++] = item;
		stackItems++;
		System.out.println("Stack item pushed: "+item);
	}
	
	// pull item
	void pull() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return;
		}
		int item = stack[--top];
		stack[top] = 0;
		stackItems--;
		System.out.println("Stack item pulled: "+item);
	}

	// traverse
	void traverse() {
		if (isEmpty()) return;
		for (int i = 0; i < stackSize; i++) {
			if (i == top) break;
			System.out.println(stack[i]);
		}
	}
	
}
