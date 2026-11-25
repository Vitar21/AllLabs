import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner(System.in);
        if (!scanner.hasNext()) {
            return;
        }

        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        PrefixSum prefixSum = new PrefixSum(array);
        PrintWriter out = new PrintWriter(System.out);

        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            if (!scanner.hasNext()) {
                break;
            }
            int j = scanner.nextInt();
            out.println(prefixSum.getRangeSum(i, j));
        }

        out.flush();
    }
}