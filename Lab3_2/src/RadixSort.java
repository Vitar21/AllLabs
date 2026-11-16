import java.math.BigInteger;
import java.util.List;

public class RadixSort implements Sorting<BigInteger> {
    @Override
    public void sort(List<BigInteger> nums) {
        if (nums == null || nums.size() <= 1) {
            return;
        }

        final int DIGITS = 20;
        int n = nums.size();

        String[] strNums = new String[n];
        for (int i = 0; i < n; i++) {
            String s = nums.get(i).toString();
            if (s.length() < DIGITS) {
                s = "0".repeat(DIGITS - s.length()) + s;
            }
            strNums[i] = s;
        }

        BigInteger[] currentObjs = nums.toArray(new BigInteger[0]);
        BigInteger[] tempObjs = new BigInteger[n];
        String[] tempStrs = new String[n];

        for (int d = DIGITS - 1; d >= 0; d--) {
            int[] count = new int[10];
            for (int i = 0; i < n; i++) {
                int digit = strNums[i].charAt(d) - '0';
                count[digit]++;
            }

            int[] pos = new int[10];
            for (int i = 1; i < 10; i++) {
                pos[i] = pos[i - 1] + count[i - 1];
            }

            for (int i = 0; i < n; i++) {
                int digit = strNums[i].charAt(d) - '0';
                int targetIndex = pos[digit]++;
                tempStrs[targetIndex] = strNums[i];
                tempObjs[targetIndex] = currentObjs[i];
            }

            System.arraycopy(tempStrs, 0, strNums, 0, n);
            System.arraycopy(tempObjs, 0, currentObjs, 0, n);
        }

        for (int i = 0; i < n; i++) {
            nums.set(i, currentObjs[i]);
        }
    }
}