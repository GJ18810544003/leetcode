package easy;

/**
 * @Description:
 * @Author: guojun
 * @Date: 2018/12/6
 */
public class ReverseInteger7 {

    /**
     * 49%
     * @param x
     * @return
     */
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int pop = x % 10;
            x = x / 10;

            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;
        }

        return rev;
    }

    /**
     * 9.5%
     * @param x
     * @return
     */
    public int reverse2(int x) {
        boolean isPositive = x > 0 ? true:false;
        String s = String.valueOf(x).substring(isPositive ? 0 : 1);
        StringBuilder sb = new StringBuilder();
        sb.append(s);


        Long res = isPositive ? Long.valueOf(sb.reverse().toString()) : -Long.valueOf(sb.reverse().toString());

        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return res.intValue();

    }
}
