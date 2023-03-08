import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        String strInvertida = new String(chars);
        System.out.println("A string invertida é: " + strInvertida);
    }
}
