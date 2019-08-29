package jianzhi;

/**
 * @Description:
 * @Author: guojun
 * @Date: 2019/4/29
 */
public class DuplicationInArray {

    public static boolean solution(int numbers[], int length, int[] duplication) {
        if (length == 0) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                int tmp = numbers[i];
                numbers[i] = numbers[tmp];
                numbers[tmp] = tmp;

            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,3,1,0,2,5};
        int[] duplication = new int[2];
        boolean res = solution(nums, nums.length, duplication);
        System.out.println("####res = " + res);
        System.out.println("####ans = " + duplication[0]);
    }
}
