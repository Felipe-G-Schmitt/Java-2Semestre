import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o seu salário bruto: ");
            double Salario = scanner.nextDouble();
        
            if(Salario < 1903.98) {
                System.out.println("O seu salário de R$" + Salario + " é isento de imposto de renda! Sendo 0%");
            } else{
                if((Salario > 1903.98) && (Salario < 2826.65)){
                    double impostoRenda1 = Salario - (Salario * 0.925);
                    System.out.println("O seu salário de R$" + Salario + " pagara " + impostoRenda1 + " de imposto de renda! Sendo 7,5%");
                } else {
                    if((Salario > 2826.65) && (Salario < 3751.05)){
                        double impostoRenda2 = Salario - (Salario * 0.85);
                        System.out.println("O seu salário de R$" + Salario + " pagara " + impostoRenda2 + " de imposto de renda! Sendo 15%");
                    } else {
                        if((Salario > 3751.05) && (Salario < 4664.68)){
                            double impostoRenda3 = Salario - (Salario * 0.775);
                            System.out.println("O seu salário de R$" + Salario + " pagara " + impostoRenda3 + " de imposto de renda! Sendo 22,5%");
                        } else {
                            if(Salario > 4664.68){
                                double impostoRenda4 = Salario - (Salario * 0.725);
                                System.out.println("O seu salário de R$" + Salario + " pagara " + impostoRenda4 + " de imposto de renda! Sendo 27.5%");
                            } else {
                                System.out.println("Digite um número válido");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Digite um número válido");
        }
        scanner.close();
    }
}
