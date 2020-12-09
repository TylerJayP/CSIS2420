package Week7;

public class ManualStack {
	
	
	public static void main(String[] args) {
		
		ManualStackLinkedList manualStack = new ManualStackLinkedList();
		
		
		manualStack.push(50);
		manualStack.push(99);
		manualStack.push(43);
		manualStack.push(12);
		manualStack.printStack(manualStack.head);
		
		System.out.println("Stack size: " + manualStack.size());
		System.out.println("Top Of Stack: " + manualStack.peek());
		System.out.println("Popped: " + manualStack.pop());
		
		manualStack.push(23);
		manualStack.push(69);
		System.out.println();
		manualStack.printStack(manualStack.head);
		
		System.out.println("\nStack size: " + manualStack.size());
		System.out.println("Top Of Stack: " + manualStack.peek());
		System.out.println("Popped: " + manualStack.pop());
		
	}

}
