import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();// вводим число

        for (int i = 1; i <= a; ++i) {

            for (int j = 1; j < i; ++j) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 3; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
            for (int j = 1; j < i + 1; ++j) {
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println("");

        }

    }
    }
