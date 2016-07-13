
/**
 * @author LIA6010
 *
 * @param <E>
 */
public class SArrayQueue<E> {
	//private fields
	private E[] items;
	private int INITISIZE = 10;
	private int numItems;
	private int frontIndex;
	private int rearIndex;
	
	/**
	 * Constructor
	 */
	@SuppressWarnings("unchecked")
	public SArrayQueue() {
		items = (E[])(new Object[INITISIZE]);
		numItems = 0;
		frontIndex = 0;
		rearIndex = 0;
	}
	
	/**
	 * enqueue: Add the item to the queue
	 * @param item: the item to be added
	 */
	public void enqueue(E item) {
		//Check if the array is full
		if (items.length == numItems) {
			expendArray();
		}
		//increment the rearIndex
		rearIndex = incrementIndex(rearIndex);
		
		//Add the item at the rear end of the queue
		items[rearIndex] = item;
		numItems++;
	}
	
	
	 /**
     * expendArray: a private helper method to expand the original array
     */
    @SuppressWarnings("unchecked")
	private void expendArray() {
		//TODO: implement the expand array method
    	//1. create a new array that's twice the size
    	E[] newArray = (E[])(new Object[items.length * 2]);
    	//2. Copy the old array from frontIndex to items.length - 1 to the new array
    	for (int i = frontIndex; i < items.length; i ++) {
    		newArray[i] = items[i];
    	}
    	//3. Copy the old array from index 0 to rearIndex to the new array
    	for (int i = 0; i < rearIndex + 1; i ++ ) {
    		newArray[i] = items[i];
    	}
    	//4. Assign the new array to the old array
    	items = newArray;
	}
    
    
    /**
     * A private helper method to increment the index according to the array
     * @param index: the index that needs to be incremented
     * @return index after the increment
     */
    private int incrementIndex(int index) {
    	if (index == items.length - 1) {
    		return 0;
    	}else {
    		return index + 1;
    	}
    }
	
	/**
	 * dequeue: Return the first item in the queue
	 * @return the first item in the queue
	 */
	public E dequeue() throws EmptyQueueException {
		//Check if the queue is empty
		if (numItems == 0) throw new EmptyQueueException();
		//Return the first item in the array and update the index
		else {
			return items[frontIndex];
		}
	}
	
	
	/**
	 * Check if the queue is empty
	 * @return true if the queue is empty, false otherwise;
	 */
	public boolean isEmpty() {
		return (numItems == 0);
	}
}
