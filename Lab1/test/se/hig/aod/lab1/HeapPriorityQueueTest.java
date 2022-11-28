package se.hig.aod.lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeapPriorityQueueTest {

	static final Integer[] INT_FIXTURE = { 21, 2, 3, 1, 99, 100 }; 

	HeapPriorityQueue<Integer> nonEmptyQueue;
	HeapPriorityQueue<Integer> emptyQueue;

	@BeforeEach
	void setUp() throws Exception {
		nonEmptyQueue = new HeapPriorityQueue<Integer>(INT_FIXTURE.length);
		emptyQueue = new HeapPriorityQueue<Integer>(INT_FIXTURE.length);

		for (int testData : INT_FIXTURE) {
			nonEmptyQueue.enqueue(testData);
		}
	}

	@AfterEach
	void tearDown() throws Exception {
		nonEmptyQueue = null;
		emptyQueue = null;
	}

	@Test
	void testClearNonEmptyQueue() {
		nonEmptyQueue.clear();
		assertTrue(nonEmptyQueue.isEmpty(), "intQueue borde vara tom efter en clear");
	}

	@Test
	void testClearEmptyQueue() {
		emptyQueue.clear();
		assertTrue(emptyQueue.isEmpty(), "emptyQueue should be empty after clear");
	}

	@Test
	void testEnqueInFullArray() {
		Integer r = 12;
		assertThrows(PriorityQueueFullException.class, () -> nonEmptyQueue.enqueue(r), "Heap is full!");
	}

	@Test
	void testDequeEmptyArray() {
		assertThrows(PriorityQueueEmptyException.class, () -> emptyQueue.dequeue(), "");
	}

	@Test
	void testSize() {
		assertEquals(6, nonEmptyQueue.size());
	}

	@Test
	void testGetFront() {
		assertEquals(100, nonEmptyQueue.getFront());
	}

	@Test
	void testTosString() {
		assertEquals("100 21 99 1 2 3 ", nonEmptyQueue.toString());
	}

	@Test
	void testDeque() {
		nonEmptyQueue.dequeue();
		nonEmptyQueue.dequeue();
		assertEquals(21, nonEmptyQueue.dequeue());
	}

}
