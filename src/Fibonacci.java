import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Por favor, digite um número: ");
        int num = input.nextInt();
        boolean pertence = false;
        int a = 0;
        int b = 1;
        int c = 0;
            while (c < num) {
                c = a + b;
                a = b;
                b = c;
                if (c == num) {
                        pertence = true;
                    }
                }
                if (pertence) {
                    System.out.println(num + " pertence à sequência de Fibonacci.");
                } else {
                    System.out.println(num + " não pertence à sequência de Fibonacci.");
                }
            }

        }