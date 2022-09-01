package example1;

import java.util.Arrays;

public class Example1 {
    private int[] nums = {1,2,3,4,5,6,7,8};

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        System.out.println("printing array without toString:: "+ example1.getNums());
        System.out.println(Arrays.toString(example1.getNums()));

        //replacing an item in array nums
        int[] nums = example1.getNums();
        nums[5]=10;
        System.out.println(Arrays.toString(nums));

    }
}
