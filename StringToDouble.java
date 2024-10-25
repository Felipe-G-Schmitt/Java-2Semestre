import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número com ponto: ");
            String NumString = scanner.nextLine();

            double NumDouble = Double.parseDouble(NumString);

            System.out.println("O número em string é: " + NumString);
            System.out.println("O número em double é: " + NumDouble);
        } catch (Exception e) {
            System.out.println("Digite um número válido");
        }
        scanner.close();
    }
}
