
import org.junit.Test;
import static org.junit.Assert.*;

public class MinStackTest {

    private MinStack minStack = new MinStack();

    @Test (expected = IllegalStateException.class)
    public void emptyStack() { 
        minStack.min();
    }

    @Test
    public void withOneItem() { 
        minStack.push(4);
        assertEquals(4, minStack.min());
    }

    @Test
    public void withTwoItems() { 
        minStack.push(5);
        minStack.push(4);
        assertEquals(4, minStack.min());               
    }
    
    @Test
    public void withTwoItemsMinimumBelow() { 
        minStack.push(4);
        minStack.push(5);
        assertEquals(4, minStack.min());               
    }

    @Test
    public void twoItemsAndPop() { 
        minStack.push(5);
        minStack.push(4);
        minStack.pop();
        assertEquals(5, minStack.min());               
    }
    
    @Test
    public void sameItems() { 
        minStack.push(4);
        minStack.push(4);
        assertEquals(4, minStack.min());               
    }
    
    @Test
    public void popDoesNotChangeMiniumIfSameItems() { 
        minStack.push(4);
        minStack.push(4);
        minStack.pop();
        assertEquals(4, minStack.min());               
    }

    


}
