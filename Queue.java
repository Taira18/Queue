/*
 * This is the class that implements the queue data structure.
 * You may decide what data structure to use to implement it.
 */
public class Queue implements QueueInterface {
	private Node h;
	public Queue() {
		h = null;
	}

	@Override
	public void enqueue(String record) {
		Node pointer = h;
		Node newNode = new Node(record);
		if (h == null) {
			h = newNode;
		} else {
			while (pointer.next != null) {
				pointer = pointer.next;
			}
		pointer.next = newNode;
		}
	}

	@Override
	public String dequeue() {
		Node temp = h;
		h = h.next;
		return temp.record;
	}

	@Override
	public void printQueue() {
		Node pointer = h;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
	}

	// Your implementation here
	
}
