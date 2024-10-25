import java.util.Scanner;

public class ComparString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeira string: ");
        String string1 = scanner.nextLine();

        System.out.print("Insira a segunda string: ");
        String string2 = scanner.nextLine();

        if (string1.equals(string2)) {
            System.out.println("As strings são iguais");
        } else {
            System.out.println("As strings são diferentes");
        }

        int comparisonResult = string1.compareTo(string2);
        if (comparisonResult == 0) {
            System.out.println("As strings são iguais");
        } else if (comparisonResult < 0) {
            System.out.println("A primeira string é menor que a segunda");
        } else {
            System.out.println("A primeira string é maior que a segunda");
        }

        scanner.close();
    }
}
