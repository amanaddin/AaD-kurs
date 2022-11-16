package se.hig.aod.lab0;

public class LinkedList<T> implements List<T> {

	private ListNode<T> head;
	private ListNode<T> current;
	private int numberOfElements;

	public LinkedList() {
		this.head = null;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}

	public T getFirst() {
		if (head != null) {
			return head.data;
		} else
			throw new ListEmptyException("unable to remove first elemen. list is empty");
	}

	public void clear() {
		head = null;
		numberOfElements = 0;
	}

	@Override
	public int numberOfElements() {
		current = head;
		numberOfElements = 0;
		while (current != null) {
			current = current.next;
			numberOfElements++;
		}
		return numberOfElements;
	}

	@Override
	public void insertFirst(T t) {
		if (head == null) {
			ListNode<T> newNode = new ListNode<T>(t, null);
			head = newNode;
		} else {
			ListNode<T> newNode = new ListNode<T>(t, head);
			head = newNode;
		}
	}

	@Override
	public void insertLast(T t) {
		if (isEmpty()) {
			ListNode<T> newNode = new ListNode<T>(t, null);
			head = newNode;
		} else {
			ListNode<T> newNode = new ListNode<T>(t, null);
			current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	@Override
	public T removeFirst() {
		if (!isEmpty()) {
			ListNode<T> newNode = new ListNode<T>(head.next.data, head.next.next);
			head = newNode;
			return head.data;
		} else
			throw new ListEmptyException("unable to remove first elemen. list is empty");
	}

	@Override
	public T removeLast() {
		if (!isEmpty()) {
			current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
			return getLast();
		} else
			throw new ListEmptyException("unable to remove first elemen. list is empty");
	}

	@Override
	public T getLast() {
		if (!isEmpty()) {
			current = head;
			while (current.next != null) {
				current = current.next;
			}
			return current.data;
		}
		return null;
	}

	public void inserAt(int position, T t) {
		if (position <= numberOfElements() && position > 0) {
			if (position == 1) {
				insertFirst(t);
			} else {
				int i = 1;
				current = head;
				while (i <= position + 1 && current.next != null) {
					if (i == position - 1) {
						ListNode<T> newNode = new ListNode<T>(t, current.next);
						current.next = newNode;
						i++;
					} else {
						current = current.next;
						i++;
					}
				}
			}
		}
	}

	public T getElementAtIndex(int index) {
		if (!isEmpty() && index > 0 && index <= numberOfElements()) {
			current = head;
			int i = 1;
			while (current.next != null) {
				if (i == index)
					break;
				i++;
				current = current.next;
			}
			return current.data;
		} else
			throw new IndexOutOfBoundsException(index);
	}

	public void printNodes() {
		current = head;
		while (current.next != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	@SuppressWarnings("hiding")
	private class ListNode<T> {
		T data;
		ListNode<T> next;

		public ListNode(T data, ListNode<T> next) {
			this.data = data;
			this.next = next;
		}

	}
}
