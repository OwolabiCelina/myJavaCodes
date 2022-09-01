package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack animals = new Stack();
    Stack bags = new Stack();

    @BeforeEach
    public void setUp() {
       animals = new Stack();
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Parrot");

        bags = new Stack();
        bags.push("Powder");
        bags.push("Lipstick");
        bags.push("Shoes");
    }

    @Test
    public void testThatNewStackIsEmpty(){
        assertTrue(animals.isEmpty());
    }

    @Test
    public void testThatItemsCanBePushedToStack(){

        assertFalse(animals.isEmpty());
        assertEquals(3, animals.size());


        assertFalse(animals.isEmpty());
    }

    @Test
    public void popItemFromStackTest(){
        boolean response = animals.pop();
        assertTrue(response);
    }

    @Test
    public void peekItemFromStack(){
        animals.peek("Parrot");
        assertEquals("Parrot", animals.peek("Parrot"));
    }

    @Test
    public void searchItemFromStack(){
        animals.search("Dog");
        bags.search("Powder");
        assertEquals("Dog", animals.search("Dog"));
        assertEquals("Powder", bags.search("Powder"));
    }

    @Test
    public void emptyItemFromStack(){
        animals.empty();
        bags.empty();
        assertFalse(animals.empty());
        assertFalse(bags.empty());
    }
}