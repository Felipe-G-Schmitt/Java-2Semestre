import java.util.Scanner;

public class bhaskara  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        double anum = scanner.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        double bnum = scanner.nextDouble();
        
        System.out.println("Digite o valor de C: ");
        double cnum = scanner.nextDouble();

        double delta = (bnum * bnum) - (4 * anum * cnum);
        System.out.println("O valor do seu delta é: " + delta);

        if (delta < 0) {
            System.out.println("Não há raízes reais, pois o delta é negativo.");
        } else {
            double XPositivo = ((-bnum) + Math.sqrt(delta)) / (2 * anum);
            double XNegativo = ((-bnum) - Math.sqrt(delta)) / (2 * anum);

            System.out.println("O valor positivo: " + XPositivo);
            System.out.println("O valor negativo: " + XNegativo);
        }

        scanner.close();
    }
}
