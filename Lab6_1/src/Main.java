import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        BinarySearch searcher = new ApproximateBinarySearch();

        for (int i = 0; i < m; i++){
            if (i > 0){
                System.out.println(' ');
            }
            System.out.println(searcher.findClosest(array, scanner.nextInt()));
        }
    }
}