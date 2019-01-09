package easy;

/**
 * @Description:
 * @Author: guojun
 * @Date: 2019/1/9
 */
public class RemoveDuplicatesFromSortedArray26 {

    public int removeDuplicates(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        int duplicateIndex = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[duplicateIndex]) {
                duplicateIndex++;
                nums[duplicateIndex] = nums[j];
            }
        }

        return duplicateIndex + 1;
    }

    public int removeDuplicates2(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        int duplicateIndex = 1;
        int start = 0;
        while (start < nums.length) {
            int k = start + 1;
            while (k < nums.length && nums[k] == nums[start]) {
                k++;
            }
            if (k >= nums.length) {
                return duplicateIndex;
            }
            nums[duplicateIndex] = nums[k];
            duplicateIndex++;
            start = k;
        }
        return duplicateIndex;
    }
}
