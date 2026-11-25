import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMapImpl<>();

        while (scanner.hasNext()){
            String input = scanner.next();

            if (input.equals("put")){
                map.put(scanner.next(), scanner.next());
            }
            else if (input.equals("delete")){
                map.delete(scanner.next());
            }
            else if (input.equals("get")){
                System.out.println(map.getValue(scanner.next()));
            }
        }
    }
}