package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {

    @Test
    public void bitFlipperTest(){
        Kata kata = new Kata();
        assertEquals(9, kata.bitFlipper(9));
    }

    @Test
    public void evenOrOddNumberTest(){
        Kata numbers = new Kata();
        assertFalse(numbers.isEven(9));
    }
    @Test
    public void utmeDrillTest(){
        Kata banke = new Kata();
        int result = banke.getQuantity(38);
        assertEquals(57000, result);
    }

    @Test
    @DisplayName("Find the largest element in an array")
    public void findMaximumTest(){
        Kata array = new Kata();
        int[] scores = {2, 4, 5, 99, 5, 3, 22, 4};
        assertEquals(99, array.maximumElement(scores));
    }

    @Test
    public void findMinimumTest(){
        Kata array = new Kata();
        int[] numbers = {10, 3, 4, 7, 9, 6};
        assertEquals(3, array.minimumElement(numbers));
    }
    @Test
    public void findSumOfElement(){
        Kata add = new Kata();
        int[] numbers = {10, 15, 11, 2, 9, 7};
        assertEquals(54,add.findSumOfElement(numbers));
    }
    @Test
    public void findSumOfAverage(){
    Kata sum = new Kata();
    int[] numbers = {20,21, 4, 15,11};
    assertEquals( 14.2, sum.findSumOfAverage(numbers));
    }
//    @Test
//    public void findPrimeNumber(){
//    Kata numbers = new Kata();
//    int [] array = {2, 4, 7, 10, 3};
//    assertEquals(7, numbers.findPrimeNumber(array));
//    }
}