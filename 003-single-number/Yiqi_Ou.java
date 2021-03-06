import java.util.HashSet;

public class Solution {
    //the HasSet version, use o(n) space and o(n) time
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i]))
                set.remove(nums[i]);
            else
                set.add(nums[i]);
        }
        int res = -1;
        if(!set.isEmpty())
            res = set.iterator().next();
        return res;
    }
    
    //the xor version, xor two numbers will get 0. The left one
    //is the unique number
    public int singleNumber2(int[] nums) {
    	int res = 0;
    	for(int i = 0; i < nums.length; i++) 
    		res ^= nums[i];
    	return res;
    }
}
