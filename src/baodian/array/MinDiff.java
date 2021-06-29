package baodian.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 来源：快手国际化面试
 * 题目：给定两个无序数组，求两个数组元素之间的最小差异绝对值
 * 举例：list1 = [10,5,7,9], list2 = [99,98,96,95]
 * 则最小差值为：95-10=85
 * 要求时间复杂度为nlog(n)
 *lettcode原题：
 * 给定两个整数数组a和b，计算具有最小差绝对值的一对数值（每个数组中取一个值），并返回该对数值的差
 * 示例：
 * 输入：{1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}
 * 输出：3，即数值对(11, 8)
 *
 * 1 <= a.length, b.length <= 100000
 * -2147483648 <= a[i], b[i] <= 2147483647
 * 正确结果在区间 [0, 2147483647] 内
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/smallest-difference-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/smallest-difference-lcci
 *
 *
 */
public class MinDiff {

    public static void main(String[] args) {

    }

    public static int findMinDiff(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
        long min = Long.MAX_VALUE;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                return 0;
            }

            min = Math.min(min, Math.abs((long)a[i] - (long)b[j]));

            if (a[i] > b[j]) {
                j++;
            }else {
                i++;
            }

        }
        return (int) min;

    }
}
