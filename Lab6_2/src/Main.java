import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long w = scanner.nextLong();
        long h = scanner.nextLong();

        DiplomBoxSolver solver = new DiplomBoxSolver();
        System.out.println(solver.findMinSqSide(n, w, h));
    }
}