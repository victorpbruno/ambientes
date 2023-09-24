
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int X = scanner.nextInt(); // Valor a ser verificado

            boolean primo = true;

            if (X <= 1) {
                primo = false;
            } else {
                for (int j = 2; j * j <= X; j++) {
                    if (X % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println(X + " é primo");
            } else {
                System.out.println(X + " não é primo");
        }
    }
}