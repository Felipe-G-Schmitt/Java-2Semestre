import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do Comprimento: ");
        double comprimento = scanner.nextDouble();
        System.out.println("Digite o valor da Largura: ");
        double largura = scanner.nextDouble();
        System.out.println("Digite o valor da Altura: ");
        double altura = scanner.nextDouble();

        double volume = comprimento * largura * altura;
        System.out.println("O volume é: " + volume);
    }
}
