
public class Test {

	public static void main(String[] args) {
		
		//Create a new stack
		SArrayStack<Integer> stack = new SArrayStack<Integer>();
		
		//Create a new queue
		SArrayQueue<Integer> queue = new SArrayQueue<Integer>();
		
		try {
			stackTest(stack);
			queueTest(queue);
		} catch (EmptyStackException e) {
			System.out.println("An exception has been caught!");
			e.printStackTrace();
		} catch (EmptyQueueException e) {
			System.out.println("An exception has been caught!");
			e.printStackTrace();		
		}

	}
	
	public static void stackTest(SArrayStack<Integer> stack) throws EmptyStackException {
		
		//Push numbers into the stack
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
		//Check for size and isEmpty
		System.out.println("The size of the stack now is "+stack.size());
		if (stack.isEmpty()) System.out.println("The stack is empty! Something is wrong!");
		else System.out.println("The stack is not empty.");
		
		//Check for pop
		System.out.println("The stack popped: " + stack.pop());
		if (stack.size() != 5) {
			System.out.println("Now there's only " + stack.size() + " items in the stack");
		} else {
			System.out.println("The size is not correct!");
		}
		
		//Check for peek
		System.out.println("Take a peek at the stack and the top item is " + stack.peek());
	}

	

	
	public static void queueTest(SArrayQueue<Integer> queue) throws EmptyQueueException {
		//Enqueue items into the queue
		for (int i = 0; i < 5; i++) {
			queue.enqueue(i);
		}
		
		//Check for size and isEmpty
		if (queue.size() != 5 || queue.isEmpty()) {
			System.out.println("Something is wrong. The items are not enqueued correctedly");
		} else {
			System.out.println("The queue's size is " + queue.size());
		}
		
		//Check for dequeue
		System.out.println("Dequeue item: " + queue.dequeue());
		System.out.println("Now the size is " + queue.size());
		
		
	}

}
