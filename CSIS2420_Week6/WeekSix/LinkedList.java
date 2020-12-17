package WeekSix;

public class LinkedList 
{

	static Node head;
	
	public void append(int data)
	{
		if (head == null)
		{
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null)
		{
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void prepend(int data)
	{
		Node newHead = new Node(data);
		
		newHead.next = head;
		head = newHead;
		
	}
	
	public void deleteWithValue(int data)
	{
		if (head == null) return;
		
		if (head.data == data)
		{
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null)
		{
			if (current.next.data == data)
			{
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	//Added this myself John
	public String searchList(int data)
	{
		String result = "Not found";
		if (head == null) return "List Empty";
		Node current = head;
	
		if (head.data == data)
		{
			result = "Test Number: " + head.data;
		}
		else
		{
			while (current.next != null)
			{
				if (current.next.data == data)
				{
					result = "Test Number: " + head.data;
				}
				current = current.next;
			}
		}
		return result;
	}
	
	//Added this myself John
	public static Node addEnd(int data) {
		
        Node node = new Node(data);
          node.next = null;
         if (head == null){
             return node;
         }
         else{
             Node temp = head;
             while(temp.next != null){
                 temp = temp.next;
             }
             temp.next = node; 
             return head;
         }        
}
	
	public void printList()
	{
		Node current = head;
		System.out.print("List: ");
		while (current != null)
		{
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

}
