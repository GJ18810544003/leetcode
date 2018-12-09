package easy;

public class PalindromeNumber9 {

    /**
     * 22%
     * 反转之后比较是否相等
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int tmp = x;
        int rev = 0;
        while (tmp != 0) {
            int k = tmp % 10;
            tmp = tmp / 10;
            rev = rev * 10 + k;
        }
        return rev== x;
    }

    /**
     * 反转一半比较是否相等
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        int start = 0;
        int end = x;

        while (start <= end) {
            if (start == end) {
                return true;
            }
            int k = end % 10;
            start = start * 10 + k;
            end = end / 10;

        }

        if (start > 10) {
            start = start / 10;
            if (end == start) {
                return true;
            }
        }


        return false;
    }

    /**
     * 91%
     * 把x的每一位存到int数组里，然后比较。。。
     * @param x
     * @return
     */
    public static boolean isPalindrome3(int x) {
        int[] resultArray = new int[20];
        boolean result = true;
        int i=0;
        int mod= x%10;
        if(x<0) {
            return false;
        }
        if(x==0) {
            return true;
        }
        for(; x>0; i++){
            resultArray[i]=mod;
            x=x/10;
            mod = x%10;
        }
        for(int j=0; j<=(i-1)/2 && result; j++){
            result = result && (resultArray[j] == resultArray[i-j-1]);
        }
        return result;
    }
}
