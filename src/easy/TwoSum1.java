package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: guojun
 * @Date: 2018/12/3
 */
public class TwoSum1 {

    /**
     * 54%
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
          int k = target - nums[i];
          if (map.containsKey(k)) {
              return new int[]{map.get(k), i};
          }else {
              map.put(nums[i], i);
          }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {

    }
}
