
public class SArrayStack<E> {
	 // *** fields ***
    private static final int INITSIZE = 10;  // initial array size
    private E[] items; // the items in the stack
    private int numItems;   // the number of items in the stack


  // *** constructor ***
    @SuppressWarnings("unchecked")
	public SArrayStack() { 
    	items = (E[])(new Object[INITSIZE]);
    	numItems = 0;
    }     
     
  // *** required StackADT methods ***
    
    // add items
    public void push(E ob) { 
    	if (items.length == numItems) {
    		expendArray();
    	}
    	items[numItems] = ob;
    	numItems++;
    }  

    private void expendArray() {
		// Expand Array when the item list is full
    	@SuppressWarnings("unchecked")
		E[] newArray = (E[])(new Object[items.length * 2]); //larger array
    	//copy every item from the old array to the new one
		for (int i = 0; i < items.length; i++) {
			newArray[i] = items[i];
		}
		//Substitute the old array with the new one
		items = newArray;
	}

	// remove items
    public E pop() throws EmptyStackException { 
    	//Check if the stack is empty
    	if (numItems == 0) throw new EmptyStackException("The Stack is Empty!");
    	else { 
    		numItems--;
    		return items[numItems];
    	}
    }

    // other methods
    public E peek() throws EmptyStackException {  
    	//Check if the stack is empty
    	if (numItems == 0) throw new EmptyStackException("The Stack is Empty!");
    	else {
    		return items[numItems - 1];
    	}
    }    
    public boolean isEmpty() {
    	return (numItems == 0);
    }  
}
