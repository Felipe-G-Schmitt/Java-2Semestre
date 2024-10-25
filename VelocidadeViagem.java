import java.util.Scanner;

public class VelocidadeViagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite a distância da sua viagem (km): ");
            double distancia = scanner.nextDouble();
            System.out.println("Digite o tempo até o destino da sua viagem (h): ");
            double tempo = scanner.nextDouble();
        
            double VeloMedia = distancia / tempo;
            System.out.println("A velocidade média foi: " + VeloMedia);
        } catch (Exception e) {
            System.out.println("Digite um valor válido");
        }
        scanner.close();
    }
}
