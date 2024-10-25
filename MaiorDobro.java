import java.util.Scanner;

public class MaiorDobro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num * 2 > num2 * 2) {
            System.out.println("O dobro do primeiro número é maior que o dobro do segundo número");
        } else if (num * 2 < num2 * 2) {
            System.out.println("O dobro do segundo número é maior que o dobro do primeiro número");
        } else {
            System.out.println("Os dois números tem o mesmo dobro");
        }

        scanner.close();
    }
}
