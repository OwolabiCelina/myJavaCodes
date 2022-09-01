package exercises;

import java.util.List;

public class Functions8 {


    public static int addUsingForLoop(List<Integer> numbers) {
        int sum = 0;
        for(Integer number:numbers){
            sum = sum + number;
        }
        return sum;
    }

    public static int addUsingWhileLoop(List<Integer> myNumbers) {
        int sum = 0;
        int count = myNumbers.size();
        while (count>0){
            sum = sum + myNumbers.get(count-1);
            count--;
        }
        return sum;
    }
}
