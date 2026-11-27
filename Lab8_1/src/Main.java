import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        PrefixSum prefixSum = new PrefixSum(array);

        while (scanner.hasNextInt()){
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            System.out.println(prefixSum.getRangeSum(i, j));
        }
    }
}