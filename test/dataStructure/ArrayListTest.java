package dataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    @Test
    void testThatNewListIsEmpty() {
        List list = new ArrayList();
        assertTrue(list.isEmpty());
    }

    @Test
    void testThatAddItemsListIsNotEmpty() {
        List list = new ArrayList();
        list.add("G-String");
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
    }

    @Test
    void addItemGetItemByIndex() {
        List list = new ArrayList();
        list.add("G-Strings");
        assertEquals("G-Strings", list.get(0));
    }

    @Test
    void addTwoItemGetItemByIndex() {
        List list = new ArrayList();
        list.add("G-Strings");
        list.add("A-Strings");
        assertEquals("G-Strings", list.get(0));
        assertEquals("A-Strings", list.get(1));
    }

    @Test
    void addTwoAndDeleteItemGetItemByIndex() {
        List list = new ArrayList();
        list.add("G-Strings");
        list.add("A-Strings");
        list.remove(1);
        assertEquals(1, list.size());
        String deletedItem = list.get(1);
        assertNull(deletedItem);
    }

    @Test
    void addOneToIndex_ItemIsNotEmptyTest() {
        List list = new ArrayList();
        list.add("G-String");
        assertFalse(list.isEmpty());
    }

    @Test
    void testThatSizeIsZeroAfterClearingArray() {
        List list = new ArrayList();
        list.add("G-String");
        list.add("A-String");
        list.clear();
        assertTrue(list.isEmpty());

    }

    @Test
    void testThatXYDoesNotExistAfterClearingArray() {

        List list = new ArrayList();
        list.add("Item-1");
        list.add("Item-2");
        list.clear();
        assertNull(list.get(0));
        assertNull(list.get(1));

    }
}
