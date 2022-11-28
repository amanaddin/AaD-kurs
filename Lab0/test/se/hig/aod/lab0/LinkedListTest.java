package se.hig.aod.lab0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LinkedListTest {

	private LinkedList<Integer> listUnderTest;
	private final int[] fixture = {1, 2, 3, 4, 5};
	
	/**
	 * Resets list to a new empty LinkedList-instance
	 * before each test method is executed.
	 * 
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		listUnderTest = new LinkedList<Integer>(); 
	}

	/**
	 * Sets list to null after each test method is executed.
	 * 
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		listUnderTest = null;
	}

	/**
	 * Test method for {@link se.hig.aod.lab0.LinkedList#isEmpty()}.
	 */
	@Test
	public void testEmptyListIsEmpty() {
		assertTrue(listUnderTest.isEmpty(), "An empty list instance should not contain any item");
	}
	
	/**
	 * Test method for {@link se.hig.aod.lab0.LinkedList#isEmpty()}.
	 */
	@Test
	public void testInitializedListIsNotEmpty() {
		initializeList();
		assertFalse(listUnderTest.isEmpty(), "A list instance containing elements should not be empty");
	}
	
	/**
	 * Test method for {@link se.hig.aod.lab0.LinkedList#clear()}.
	 */
	@Test
	public void testClearOnEmptyList() {
		listUnderTest.clear();
		assertTrue(listUnderTest.isEmpty(), "An empty list instance that is cleared should not contain any item");
	}
	
	/*
	 * Skriv fler test-metoder själv........................
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	/**
	 * Test method for {@link se.hig.aod.lab0.LinkedList#getFirst()}.
	 */
	@Test
	public void testGetFirstOnEmptyList() {
		assertThrows(ListEmptyException.class, () -> listUnderTest.getFirst() , "GetFirst() on empty list should throw ListEmptyException");
	}
	
	/**
	 * Test method for {@link se.hig.aod.lab0.LinkedList#getFirst()}.
	 */
	@Test
	public void testGetFirstOnInitializedList() {
		initializeList();
		assertEquals(1, listUnderTest.getFirst() , "GetFirst() should return first element in list");
	}
	/**
	 * Test method for {@link se.hig.aod.lab0.LinkedList.numberOfElements().
	 */
	@Test
	public void testNumberOfElements() {
		initializeList();
		assertEquals(fixture.length, listUnderTest.numberOfElements());
	}
	/**
	 * Test method for {@link se.hig.aod.lab0.LinkedList.inserFirst().
	 */
	@Test
	public void testInsertFirst() {
		initializeList();
		listUnderTest.insertFirst(100);
		assertEquals(listUnderTest.getFirst(), 100);
	}
	/**
	 * Test method for {@link se.hig.aod.lab0.LinkedList.insertLast().
	 */
	@Test
	public void testInsertLast() {
		initializeList();
		listUnderTest.insertLast(100);
		assertEquals(listUnderTest.getLast(), 100);
	}
	/**
	 * Test method for {@link se.hig.aod.lab0.LinkedList.insertAtGivenIndex().
	 */
	@Test
	public void testInsertAtGivenIndex() {
		initializeList();
		listUnderTest.inserAt(3, 100);
		assertEquals(listUnderTest.getElementAtIndex(3), 100);
	}
	
	@Test
	void testRemoveFirst() {
		initializeList();
		listUnderTest.removeFirst();
		assertEquals("[2, 3, 4, 5]", listUnderTest.toStringRecursive());
	}
	
	@Test
	void testRemoveLast() {
		initializeList();
		listUnderTest.removeLast();
		assertEquals("[1, 2, 3, 4]", listUnderTest.toStringRecursive());
	}
	
	@Test
	void testToStringRecursive() {
		initializeList();
		assertEquals("[1, 2, 3, 4, 5]", listUnderTest.toStringRecursive());
	}
	
	@Test
	void testToStringReversed() {
		initializeList();
		assertEquals("[5, 4, 3, 2, 1]", listUnderTest.toStringReverseRecursive());
	}

	private void initializeList() {
		for (int i = 0; i < fixture.length; i++) {
			listUnderTest.insertLast(fixture[i]);
		}
	}

}
