import implementations.Queue;
import implementations.Stack;


/**
 * The Class App.
 */
public class App {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main (String[] args) {
		Stack stack = new Stack();
		Queue queue = new Queue();
		
		for(int i=1;i<=100;i++)
		{
			stack.add(i);
			queue.add(i);
		}
		
		for(int i=1;i<=100;i++)
		{
			try {
				System.out.println("Peeked element "+stack.peek());
				System.out.println("Popped element "+stack.get());
				System.out.println("Peeked Queue element "+queue.peek());
				System.out.println("Popped Queue element "+queue.get());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
