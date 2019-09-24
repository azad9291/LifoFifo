package tests.implementations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import implementations.Queue;


/**
 * The Class QueueTest.
 */
public class QueueTest {
	
	/** The test queue. */
	Queue testQueue;
	
	/**
	 * Inits the.
	 */
	@BeforeEach
	public void init() {
		testQueue = new Queue();
	}
	
	/**
	 * Tests the queue is created without any size input.
	 */
	@Test
	public void TestsTheQueueIsCreatedWithoutAnySizeInput() {
		assertEquals(testQueue.size(),0);
	}
	
	/**
	 * Tests that an item is inserted succesfully.
	 */
	@Test
	public void TestsThatAnItemIsInsertedSuccesfully() {
		testQueue.add(10);
		assertEquals(testQueue.size(),1);
		try {
			assertEquals(testQueue.peek(), 10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Tests that an item is removed succesfully from front.
	 */
	@Test
	public void TestsThatAnItemIsRemovedSuccesfullyFromFront() {
		testQueue.add(10);
		assertEquals(testQueue.size(),1);
		testQueue.add(12);
		assertEquals(testQueue.size(),2);
		try {
			assertEquals(testQueue.get(), 10);
			assertEquals(testQueue.size(), 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Tests that more than ten items are added.
	 */
	@Test
	public void TestsThatMoreThanTenItemsAreAdded() {
		for(int i=1;i<=15;i++)
		{
			testQueue.add(i);
		}
		assertEquals(testQueue.size(),15);
		try {
			assertEquals(testQueue.peek(11), 12);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
