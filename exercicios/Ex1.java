package exercicios;

// 1. Classe Aluno
class Aluno {
    String nome;
    String matricula;
    double[] notas = new double[4];
    int qtdNotas = 0;

    Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Cadastrar notas (máximo de 4)
    void cadastrarNota(double nota) {
        if (qtdNotas < 4) {
            notas[qtdNotas++] = nota;
        } else {
            System.out.println("Limite de notas atingido!");
        }
    }

    // Calcular a média
    double calcularMedia() {
        if (qtdNotas == 0) return 0;
        double soma = 0;
        for (int i = 0; i < qtdNotas; i++) soma += notas[i];
        return soma / qtdNotas;
    }

    // Verificar se está aprovado (média >= 7.0)
    boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }
}

// 2. Classe Turma
class Turma {
    Aluno[] alunos;

    Turma(Aluno[] listaAlunos) {
        this.alunos = listaAlunos;
    }

    // Listar alunos aprovados e reprovados
    void exibirRelatorio() {
        System.out.println("\n--- RELATÓRIO DA TURMA ---");
        for (Aluno a : alunos) {
            if (a != null) {
                String status = a.estaAprovado() ? "APROVADO" : "REPROVADO";
                System.out.println("Aluno: " + a.nome + " | Média: " + String.format("%.2f", a.calcularMedia()) + " | Status: " + status);
            }
        }
    }
}

// Classe Principal para rodar o exercício
public class Ex1 {
    public static void main(String[] args) {
        // Criando alguns alunos
        Aluno a1 = new Aluno("Ricardo", "001");
        a1.cadastrarNota(8.0);
        a1.cadastrarNota(7.5);

        Aluno a2 = new Aluno("Maria", "002");
        a2.cadastrarNota(5.0);
        a2.cadastrarNota(6.0);

        // Criando a turma com o array de objetos Aluno
        Aluno[] lista = {a1, a2};
        Turma turmaA = new Turma(lista);

        // Exibindo o relatório
        turmaA.exibirRelatorio();
    }
}