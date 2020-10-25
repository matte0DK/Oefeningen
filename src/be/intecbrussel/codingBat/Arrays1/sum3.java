package be.intecbrussel.codingBat.Arrays1;

public class sum3 {
    public int sum3(int[] nums) {
        nums = new int[3];
        int sum = 0;

        for (int i = 0; i < nums.length-1;i++) {
            sum += nums[i];
        } return sum;
    }
}
