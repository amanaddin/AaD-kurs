package se.hig.aod.lab1;

@SuppressWarnings("serial")
public class PriorityQueueFullException extends RuntimeException{
	
	public PriorityQueueFullException(String message) {
		super(message);
	}
}
