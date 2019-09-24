package implementations;

import interfaces.MyCollection;


/**
 * The Class Queue.
 */
public class Queue implements MyCollection{
	
	/** The size. */
	private int size;
	
	/** The rear. */
	private int rear;
	
	/** The array. */
	private int[] array;
	
	/**
	 * Instantiates a new queue.
	 */
	public Queue(){
		this.size = 10;
		this.rear = -1;
		array = new int[size];
	}
	
	/**
	 * Adds the.
	 *
	 * @param item the item
	 */
	public void add(int item){
		if(this.isFull()) {
			resize();
		}
		array[++rear] = item;
	}
	
	/**
	 * Resize.
	 */
	private void resize() {
		int[] newArray = new int[size + 10];
		System.arraycopy(array, 0, newArray, 0, size);
		size += 10;
		array = newArray;
	}

	
	/**
	 * Peek.
	 *
	 * @return the int
	 * @throws Exception the exception
	 */
	public int peek() throws Exception{
		if(!this.isEmpty()) {
			return array[0];
		} else {
			throw new Exception("Queue is Empty");
		}
	}
	
	/**
	 * Peek.
	 *
	 * @param index the index
	 * @return the int
	 * @throws Exception the exception
	 */
	public int peek(int index) throws Exception{
		if(!this.isEmpty()) {
			return array[index];
		} else {
			throw new Exception("Queue is Empty");
		}
	}
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	@Override
	public boolean isEmpty() {
		return rear == - 1;
	}
	
	/**
	 * Checks if is full.
	 *
	 * @return true, if is full
	 */
	private boolean isFull() {
		return size - 1 <= rear;
	}

	/**
	 * Gets the.
	 *
	 * @return the int
	 * @throws Exception the exception
	 */
	@Override
	public int get() throws Exception {
		if(!this.isEmpty()) {
			int item = array[0];
			
			for(int i=1; i<= rear; i++) {
				array[i-1]=array[i];
			}
			rear--;
			return item;
			
		} else {
			throw new Exception("Queue is Empty");
		}
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.rear + 1;
	}
}
