import java.util.Scanner;

public class BMExercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de X: ");
        int x = scanner.nextInt();

        int y;
        boolean first = true;
        do {
            if (!first) {
                System.out.print(" -> ");
            }
            first = false;
            if (x % 2 == 0) {
                y = x / 2;
            } else {
                y = 3 * x + 1;
            }
            System.out.print(y);
            x = y;
        } while (y != 1);

        scanner.close();
    }
}
