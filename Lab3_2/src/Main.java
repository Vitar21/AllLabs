import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            List<BigInteger> nums = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {
                nums.add(new BigInteger(scanner.next()));
            }

            Sorting<BigInteger> sorter = new RadixSort();
            sorter.sort(nums);

            for (BigInteger num : nums) {
                builder.append(num).append("\n");
            }
            System.out.print(builder.toString());
        }
    }
}