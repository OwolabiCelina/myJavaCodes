package exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Functions8Test {

    @Test
    void testAddUsingForLoop(){
        //[1, 2, 3, 4]
        //given that I have a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //when I call addUsingForLoop
       int sum = Functions8.addUsingForLoop(numbers);

       //assert
        assertEquals(10, sum);
    }

    @Test
    void testAddUsingWhileLoop(){
        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);

        int sum = Functions8.addUsingWhileLoop(myNumbers);

        assertEquals(10, sum);

    }

    @Test
    void testLargestElement(){
      List<Integer> num = new ArrayList<>();

    }

}