package se.hig.aod.lab0;

public class LinkedList<T> implements List<T>{
	
	private ListNode<T> head;
	private ListNode<T> current;
	private int numberOfElements = 0;
	private boolean chekifEmpty;
	
	public LinkedList() {
		this.head = null;
	}
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		else
			return false;
	}
	public T getFirst(){
		return getFirst();
	}
	public void clear() {
		chekifEmpty = true;
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertLast(T t) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public T removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T removeLast() {
		// TODO Auto-generated method stub
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
