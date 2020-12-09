package Week7;

import java.util.Stack;

/** 
 * @author tyler
 *
 *This is my Stack using Java's Api!
 *
 */
public class ApiStack {

	
	public static void main(String[] args) {
		
		/**
		 * Creating a Stack with Integer data type.
		 * 
		 */
		Stack<Integer> stack = new Stack<Integer>();
		
		/**
		 * 
		 * Pushing numbers onto the Stack
		 * .
		 */
		stack.push(99);
		stack.push(12);
		stack.push(56);
		stack.push(87);
		
		/**
		 * 
		 * Calling Stack to see what's on the Stack. Using size() to see the size of the stack.
		 * Using peek() to see what's on top of the stack. Using pop() to remove a pushed Integer
		 * that's on the stack, except, I'm using sysout to visualize what was removed.
		 * 
		 */
		System.out.println("Stack: " + stack);
		System.out.println("Size: " + stack.size());
		System.out.println("Top Of Stack: " + stack.peek());
		System.out.println("Popped: " + stack.pop());
		System.out.println("Stack: " + stack);
		
		/**
		 * Pushing more numbers onto the Stack.
		 * 
		 */
		stack.push(185);
		stack.push(66);
		stack.push(2);
		stack.push(18);
		
		
		/**
		 * 
		 * Calling Stack to see what's on the Stack. Using size() to see the size of the stack.
		 * Using peek() to see what's on top of the stack. Using pop() to remove a pusehed Interger
		 * that's on the stack, except, I'm using sysout to visualize what was removed.
		 * 
		 */
		System.out.println("\nStack: " + stack);
		System.out.println("Size: " + stack.size());
		System.out.println("Top Of Stack: " + stack.peek());
		System.out.println("Popped: " + stack.pop());
		System.out.println("Stack: " + stack);
		
		/**
		 * Ectera...
		 * 
		 */
		stack.push(12);
		System.out.println("\nStack:" + stack);
		stack.push(42);
		System.out.println("Stack: " + stack);
		System.out.println("Popped: " + stack.pop());
		System.out.println("Stack: " + stack);
		
	}
	
}
