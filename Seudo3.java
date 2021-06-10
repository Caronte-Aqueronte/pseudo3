import java.util.Scanner;

public class Seudo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int factorial = 0;
        System.out.println("Ingrese un numero");
        num = scanner.nextInt();
        factorial = num;
        for (int x = 1; x < (num - 1); x++) {
            factorial = factorial * (num - x);
        }
        System.out.println("El factorial es " + factorial);
    }
}