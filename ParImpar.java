import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um valor: ");
            double num = scanner.nextDouble();
        
            if(num % 2 == 0) {
                System.out.println("O número "+num+" é par");
            } else {
                System.out.println("O número "+num+" é ímpar");
            }
        } catch (Exception e) {
            System.out.println("Digite um número válido");
        }
        scanner.close();
    }
}
