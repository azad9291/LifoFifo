package tests.implementations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import implementations.Stack;


/**
 * The Class StackTest.
 */
public class StackTest {
	
	/** The test stack. */
	Stack testStack;
	
	/**
	 * Inits the.
	 */
	@BeforeEach
	public void init() {
		testStack = new Stack();
	}
	
	/**
	 * Tests the queue is created without any size input.
	 */
	@Test
	public void TestsTheQueueIsCreatedWithoutAnySizeInput() {
		assertEquals(testStack.size(),0);
	}
	
	/**
	 * Tests that an item is inserted succesfully.
	 */
	@Test
	public void TestsThatAnItemIsInsertedSuccesfully() {
		testStack.add(10);
		assertEquals(testStack.size(),1);
		try {
			assertEquals(testStack.peek(), 10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Tests that an item is removed succesfully from top.
	 */
	@Test
	public void TestsThatAnItemIsRemovedSuccesfullyFromTop() {
		testStack.add(10);
		assertEquals(testStack.size(),1);
		testStack.add(12);
		assertEquals(testStack.size(),2);
		try {
			assertEquals(testStack.get(), 12);
			assertEquals(testStack.size(), 1);
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
			testStack.add(i);
		}
		assertEquals(testStack.size(),15);
		try {
			assertEquals(testStack.peek(11), 12);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
