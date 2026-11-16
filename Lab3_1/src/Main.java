import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        if ( scanner.hasNextInt()){
            int n = scanner.nextInt();
            List<Integer> nums = new ArrayList<>(n);

            for (int i = 0; i < n; i++){
                nums.add(scanner.nextInt());
            }

            Sorting<Integer> sorter = new CountingSort();
            sorter.sort(nums);

            for (int i = 0; i < nums.size(); i++){
                builder.append(nums.get(i));
                if (i < nums.size() - 1){
                    builder.append(" ");
                }
            }
            System.out.println(builder.toString());
        }
    }
}