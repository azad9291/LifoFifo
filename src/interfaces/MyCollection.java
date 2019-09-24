package interfaces;


public interface MyCollection {
	void add(int item);
	int get() throws Exception;
	boolean isEmpty();
	int size();
}
