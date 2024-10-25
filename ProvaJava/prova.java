import java.util.ArrayList;
import java.util.Scanner;

public class prova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n\n\n\n");
        System.out.println("==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==");
        System.out.println("\t\t Sistema para avaliação de alunos");
        System.out.println("Desenvolvido por: Felipe Gabriel Schmitt e Felipe Hlatki Vieira");
        System.out.println("==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--== \n");
        
        ArrayList<String> nomeAlunoList = new ArrayList<String>();
        ArrayList<Character> notaAlunoList = new ArrayList<Character>();
        int qtOtimo = 0;
        int qtBom = 0;
        int qtSatisfatorio = 0;
        int qtInsatisfatorio = 0;
        int Escolha;

        do {
            System.out.println("==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==");
            System.out.println("\t\t Escolha uma das opções abaixo: ");
            System.out.println("==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==");
            System.out.println(" [1] Inserir um aluno");
            System.out.println(" [2] Listar todos os alunos e conceitos");
            System.out.println(" [3] Exibir a quantidade de alunos em cada conceito");
            System.out.println(" [4] Exibir o aluno com o conceito mais alto");
            System.out.println(" [5] Encerrar o programa");
            System.out.println(" Escolha: ");
        
            Escolha = scanner.nextInt();
            scanner.nextLine(); 
        
            switch (Escolha) {
                case 1: {
                    System.out.println("\n Insira o nome do aluno: ");
                    String nome = scanner.nextLine();
                    nomeAlunoList.add(nome);
                    char nota = 'X';
                    
                        System.out.println("\n Insira a nota do aluno (O, B, S, I): ");
                        nota = scanner.nextLine().toUpperCase().charAt(0);
                        notaAlunoList.add(nota);
    
                        switch (nota) {
                            case 'O':
                                System.out.println("Ótimo \n");
                                qtOtimo++;
                                break;
    
                            case 'B':
                                System.out.println("Bom \n");
                                qtBom++;
                                break;
    
                            case 'S':
                                System.out.println("Satisfatório \n");
                                qtSatisfatorio++;
                                break;
    
                            case 'I':
                                System.out.println("Insatisfatório \n");
                                qtInsatisfatorio++;
                                break;
    
                            default:
                                System.out.println("Nota inválida \n");
                                try {
                                    throw new Exception("Nota inválida");
                                } catch (Exception e) {
                                    System.out.println("Nota inválida. Tente novamente. \n");
                                }
                        }

                    break;
                } 
                
                case 2: {
                    System.out.println("\n Lista de todos os alunos e conceitos");
                    for (int i = 0; i < nomeAlunoList.size(); i++) {
                        System.out.println("\n Nome: " + nomeAlunoList.get(i) + "\n Nota: " + notaAlunoList.get(i));
                        System.out.println(" Index: " + i + "\n");
                    }
                    break;
                }
        
                case 3: {
                    System.out.println("\n Quantidade de alunos em cada conceito: \n");
                    System.out.println("Ótimo: " + qtOtimo);
                    System.out.println("Bom: " + qtBom);
                    System.out.println("Satisfatório: " + qtSatisfatorio);
                    System.out.println("Insatisfatório: " + qtInsatisfatorio + "\n");
                    break;
                }   
        
                case 4:{
                    System.out.println("\n === Aluno com o maior conceito ===");

                    if(qtOtimo>0){
                        System.out.println("Alunos com conceito ótimo: ");
                        for (int i = 0; i < nomeAlunoList.size(); i++) {
                            if(notaAlunoList.get(i) == 'O'){
                                System.out.println("\n Nome: " + nomeAlunoList.get(i) + "\n Nota: " + notaAlunoList.get(i) + "\n");
                            }
                        }
                    } else if(qtBom>0){
                        System.out.println("Alunos com conceito bom: ");
                        for (int i = 0; i < nomeAlunoList.size(); i++) {
                            if(notaAlunoList.get(i) == 'B'){
                                System.out.println("\n Nome: " + nomeAlunoList.get(i) + "\n Nota: " + notaAlunoList.get(i) + "\n");
                            }
                        }
                    } else if(qtSatisfatorio>0){
                        System.out.println("Alunos com conceito satisfatório: ");
                        for (int i = 0; i < nomeAlunoList.size(); i++) {
                            if(notaAlunoList.get(i) == 'S'){
                                System.out.println("\n Nome: " + nomeAlunoList.get(i) + "\n Nota: " + notaAlunoList.get(i) + "\n");
                            }
                        }
                    } else if(qtInsatisfatorio>0){
                        System.out.println("Alunos com conceito insatisfatório: ");
                        for (int i = 0; i < nomeAlunoList.size(); i++) {
                            if(notaAlunoList.get(i) == 'I'){
                                System.out.println("\n Nome: " + nomeAlunoList.get(i) + "\n Nota: " + notaAlunoList.get(i) + "\n");
                            }
                        }
                    } else {
                        System.out.println("\n Nenhum aluno cadastrado \n");
                    }

                    break;
                }
                
                case 5: {
                    System.out.println("\n Programa encerrado \n");
                    break;
                }

                default: {
                    System.out.println("\n Escolha inválida. Tente novamente. \n");
                }
            }

        } while (Escolha != 5);
        
        scanner.close();
    }
}