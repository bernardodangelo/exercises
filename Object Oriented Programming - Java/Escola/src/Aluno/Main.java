package Aluno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do primeiro aluno: ");
        String nomeAluno1 = sc.nextLine();
        
        System.out.println("Digite a matrícula do primeiro aluno: ");
        int matricula1 = sc.nextInt();
        
        System.out.println("Digite a primeira nota do primeiro aluno: ");
        double aluno1Nota1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota do primeiro aluno: ");
        double aluno1Nota2 = sc.nextDouble();
        
        Aluno aluno1 = new Aluno(nomeAluno1, matricula1, aluno1Nota1, aluno1Nota2);
        
        sc.nextLine(); // Consumir a nova linha pendente
        
        System.out.println("Digite o nome do segundo aluno: ");
        String nomeAluno2 = sc.nextLine();
        
        System.out.println("Digite a matrícula do segundo aluno: ");
        int matricula2 = sc.nextInt();
        
        System.out.println("Digite a primeira nota do segundo aluno: ");
        double aluno2Nota1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota do segundo aluno: ");
        double aluno2Nota2 = sc.nextDouble();
        
        Aluno aluno2 = new Aluno(nomeAluno2, matricula2, aluno2Nota1, aluno2Nota2);
        
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        
        int comparacao = Aluno.compareMedia(aluno1, aluno2);
        System.out.println(comparacao);
        if (comparacao < 0) {
            System.out.println(aluno2.getNome() + " tem a maior média.");
        } else if (comparacao > 0) {
            System.out.println(aluno1.getNome() + " tem a maior média.");
        } else {
            System.out.println("Os dois alunos têm a mesma média.");
        }
        
        sc.close();
    }
}
