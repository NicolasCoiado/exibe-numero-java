import java.util.Scanner;
public class ExibeNumero {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("O número digitado foi:" + numero+".");
    }
}
