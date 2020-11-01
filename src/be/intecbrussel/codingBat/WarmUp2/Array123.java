package be.intecbrussel.codingBat.WarmUp2;

public class Array123 {
    public boolean array123(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == nums[i + 1] && nums[j + 1] == nums[i + 2]) {
                    return true;
                }
            }
        } return false;
    }

}
