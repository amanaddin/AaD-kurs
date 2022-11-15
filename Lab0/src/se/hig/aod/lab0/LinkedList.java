package se.hig.aod.lab0;

public class LinkedList<T> implements List<T>{
	
	private ListNode<T> head;
	private ListNode<T> tail;
	private ListNode<T> current;
	private int numberOfElements;
	private boolean chekifEmpty;
	
	public LinkedList() {
		this.head = null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public T getFirst(){
		return head.data;
	}
	public void clear() {
		head = null;
		numberOfElements = 0;
	}
	@Override
	public int numberOfElements() {
		current = head;
		while(current != null) {
			current = current.next;
			numberOfElements++;
		}
		return numberOfElements;
	}
	@Override
	public void insertFirst(T t) {
		if(head == null) {
			ListNode<T> newNode = new ListNode<T>(t, null);
			head = newNode;
			tail = newNode;
		}
		else {
			ListNode<T> newNode = new ListNode<T>(t, head);
			head = newNode;
		}
	}
	@Override
	public void insertLast(T t) {
		if(isEmpty()){
			ListNode<T> newNode = new ListNode<T>(t, null);
			head = newNode;
		}
		else {
			ListNode<T> newNode = new ListNode<T>(t, null);
			tail.next = newNode;
			tail = newNode;	
		}
	}
	@Override
	public T removeFirst() {
		if(!isEmpty()) {
			ListNode<T> newNode = new ListNode<T>
			(head.next.data, head.next.next);
			head = null;
			head = newNode;
			return head.data;
		}
		else
			throw new ListEmptyException("unable to remove first elemen. list is empty");
	}
	@Override
	public T removeLast() {
		if(!isEmpty()) {
			
		}
		return null;
	}
	@Override
	public T getLast() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class ListNode<T> {
		T data;
		ListNode<T> next;
		public ListNode(T data, ListNode<T> next) {
			this.data = data;
			this.next = next;
		}
		
	}
}
