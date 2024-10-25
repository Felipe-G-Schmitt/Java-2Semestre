package exercicios.petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
    int opt = 0;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Categoria> categorias = new ArrayList<Categoria>();
    ArrayList<Tutor> tutores = new ArrayList<Tutor>();
    ArrayList<Animal> animais = new ArrayList<Animal>();
        do {
            System.out.println("=========================");
            System.out.println("1 - Cadastrar Categoria");
            System.out.println("2 - Cadastrar Tutor");
            System.out.println("3 - Cadastrar Animal");
            System.out.println("4 - Listar Categoria");
            System.out.println("5 - Listar Tutor");
            System.out.println("6 - Listar Animal");
            System.out.println("7 - Sair");
            System.out.println("========================= \n");
            try {
                opt = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opção inválida");
                scanner.nextLine(); // Limpa o buffer de entrada
                continue;
            }
            switch (opt) {
                case 1:
                    System.out.println("Digite o Id: ");
                    Number categoriaId = scanner.nextInt();
                    System.out.println("Digite a Descrição: ");
                    String descricao = scanner.next();
                    Categoria categoria = new Categoria(categoriaId, descricao); 
                    categorias.add(categoria);
                    break;
                case 2:
                    System.out.println("Digite o Id: ");
                    Number tutorId = scanner.nextInt();
                    System.out.println("Digite o Nome: ");
                    String tutorNome = scanner.next();
                    System.out.println("Digite o Telefone: ");
                    String tutorTelefone = scanner.next();
                    System.out.println("Digite o Email: ");
                    String tutorEmail = scanner.next();
                    Tutor tutor = new Tutor(tutorId, tutorNome, tutorTelefone, tutorEmail);
                    tutores.add(tutor);
                    break;
                case 3:
                    System.out.println("Digite o Id: ");
                    Number animalId = scanner.nextInt();
                    System.out.println("Digite o Nome: ");
                    String animalNome = scanner.next();
                    System.out.println("Digite a Raça: ");
                    String animalRaca = scanner.next();
                    System.out.println("Digite o Peso: ");
                    Number animalPeso = scanner.nextInt();
                    System.out.println("Digite o IdCategoria: ");
                    Number animalIdCategoria = scanner.nextInt();
                    System.out.println("Digite o IdTutor: ");
                    Number animalIdTutor = scanner.nextInt();
                    Animal animal = new Animal(animalId, animalNome, animalRaca, animalPeso, animalIdCategoria, animalIdTutor);
                    animais.add(animal);
                    break;
                case 4:
                    for (Categoria categoriaPrint : categorias) {
                        System.out.println("Id: " + categoriaPrint.Id);
                        System.out.println("Descrição: " + categoriaPrint.Descricao);
                        int count = 0;
                        for (Animal animalPrint : animais) {
                            if (animalPrint.IdCategoria == categoriaPrint.Id) {
                                count++;
                            }
                        }
                        System.out.println("Quantidade de animais: " + count);
                        System.out.println("\n");
                    }
                    break;
                case 5:
                    for (Tutor tutorPrint : tutores) {
                        System.out.println("Id: " + tutorPrint.Id);
                        System.out.println("Nome: " + tutorPrint.Nome);
                        System.out.println("Telefone: " + tutorPrint.Telefone);
                        System.out.println("Email: " + tutorPrint.Email);
                        int count = 0;
                        for (Animal animalPrint : animais) {
                            if (animalPrint.IdTutor == tutorPrint.Id) {
                                count++;
                            }
                        }
                        System.out.println("Quantidade de animais: " + count);
                        System.out.println("\n");
                    }
                    break;
                case 6:
                    for (Animal animalPrint : animais) {
                        System.out.println("Id: " + animalPrint.Id);
                        System.out.println("Nome: " + animalPrint.Nome);
                        System.out.println("Raça: " + animalPrint.Raça);
                        System.out.println("Peso: " + animalPrint.Peso);
                        System.out.println("IdCategoria: " + animalPrint.IdCategoria);
                        System.out.println("IdTutor: " + animalPrint.IdTutor);
                        // Nome do Tutor e descrição da categoria
                        for (Tutor tutorPrint : tutores) {
                            if (tutorPrint.Id == animalPrint.IdTutor) {
                                System.out.println("Nome do Tutor: " + tutorPrint.Nome);
                            }
                        }
                        for (Categoria categoriaPrint : categorias) {
                            if (categoriaPrint.Id == animalPrint.IdCategoria) {
                                System.out.println("Descrição da Categoria: " + categoriaPrint.Descricao);
                            }
                        }
                        System.out.println("\n");
                    }
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
        } while (opt != 7);
        scanner.close();
    }
}
