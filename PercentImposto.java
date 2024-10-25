import java.util.Scanner;

public class PercentImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o seu faturamento: ");
            double faturamento = scanner.nextDouble();
            System.out.println("Digite quantos reais você pagou de imposto: ");
            double imposto = scanner.nextDouble();

            double percentImpos = faturamento / imposto;
            System.out.println("Você pagou " + percentImpos + "% de imposto");
        } catch (Exception e) {
            System.out.println("Digite um valor válido");
        }
        scanner.close();
    }
}
