package implementations;

import interfaces.MyCollection;

public class Stack implements MyCollection {
	private int size;
	private int top;
	private int[] array;
	
	public Stack(){
		this.size = 10;
		this.top = -1;
		array = new int[size];
	}
	
	@Override
	public void add(int item){
		if(this.isFull()) {
			resize();
		}
		array[++top] = item; 
	}
	
	private void resize() {
		int[] newArray = new int[size + 10];
		System.arraycopy(array, 0, newArray, 0, size);
		size += 10;
		array = newArray;
	}
	
	public int peek() throws Exception{
		if(!this.isEmpty()) {
			return array[top];
		} else {
			throw new Exception("Stack is Empty");
		}
	}
	
	public int peek(int index) throws Exception{
		if(!this.isEmpty()) {
			return array[index];
		} else {
			throw new Exception("Queue is Empty");
		}
	}
	
	public boolean isEmpty() {
		return top == - 1;
	}
	
	private boolean isFull() {
		return size - 1 <= top;
	}

	@Override
	public int get() throws Exception {
		if(!this.isEmpty()) {
			int item = array[top];
			top--;
			return item;
			
		} else {
			throw new Exception("Stack is Empty");
		}
	}

	@Override
	public int size() {
		return this.top + 1;
	}
}
