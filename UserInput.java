import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number: ");
        String num = scanner.next();
        System.out.println(num);
        scanner.close();
    }
}
