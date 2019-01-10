package easy;

/**
 * @Description:
 * @Author: guojun
 * @Date: 2019/1/10
 */
public class RemoveElements27 {

    public int removeElement(int[] nums, int val) {
        int replaceIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[replaceIndex] = nums[i];
                replaceIndex++;
            }
        }
        return replaceIndex;
    }
}
