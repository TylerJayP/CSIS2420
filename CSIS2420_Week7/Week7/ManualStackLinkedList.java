package Week7;

/**
 * 
 * @author tyler
 *
 *Stack implementation using a LinkedList instead of using Java's api
 */
public class ManualStackLinkedList {
	
	Node head;
	
	/**
	 * 
	 * @param data
	 */
	public void push(int data) {
		
		Node oldHead = head;
		
		head = new Node(data);
		
		head.next = oldHead;
		
	}
	
	/**
	 *
	 * @return the value of the top node and removing it from the Stack.
	 */
	public int pop() {
		
		if (head == null) {
			
			return -1;
			
		}else {
			
			int value = head.data;
			
			head = head.next;
			
			return value;
			
		}
		
	}
	
	/**
	 *
	 * @return top node with a value without removing the node.
	 */
	public int peek() {
		
		if (!isEmpty()) {
			
			return head.data;
			
		}else {
			
			System.out.println("The Stack is empty");
			return -1;
			
		}
		
	}
	
	/**
	 * 
	 * @return the number of nodes within the Stack.
	 */
	public int size() {
		
		Node t = head;
		int nodeCount = 0;
		
		while (t != null) {
			
			t = t.next;
			nodeCount++;
			
		}
		
		return nodeCount;
	}
	
	/**
	 * 
	 * @return if the Stack is empty or not.
	 */
	public boolean isEmpty() {
		
		return head == null;
		
	}
	
	/**
	 * Printing the Stack
	 * 
	 * @param head
	 */
	public void printStack(Node head) {
		
		Node t = head;
		
		System.out.println("Stack: ");
		
		while (t != null) {
			
			System.out.format("%d ", (t.data));
			t = t.next;
			
		}
		
		System.out.println();
		
	}
	

}
