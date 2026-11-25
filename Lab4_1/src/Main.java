import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MinStack<Integer> stack = new MinStackImpl();

        while (scanner.hasNext()){
            String input = scanner.next();

            if (input.equals("push")){
                stack.push(scanner.nextInt());
            }
            else if (input.equals("pop")){
                stack.pop();
            }
            else if (input.equals("top")){
                System.out.println(stack.top());
            }
            else if (input.equals("min")){
                System.out.println(stack.min());
            }
        }
    }
}