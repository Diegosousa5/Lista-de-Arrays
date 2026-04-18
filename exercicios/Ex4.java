package exercicios;

// Classe Aluno (usada para o exemplo de Array de Objetos)
class AlunoEx4 {
    String nome;
    AlunoEx4(String nome) { this.nome = nome; }
}

public class Ex4 {
    public static void main(String[] args) {

        // --- RESPOSTA PARTE (A): ALOCAÇÃO DE MEMÓRIA ---

        // 1. Array de Primitivos:
        // Reserva espaço para os VALORES REAIS. Já nasce com 0.
        int[] notas = new int[2];

        // 2. Array de Objetos:
        // Reserva espaço apenas para ENDEREÇOS (referências). Nasce com null.
        // É como uma agenda de contatos vazia.
        AlunoEx4[] turma = new AlunoEx4[2];

        // --- RESPOSTA PARTE (B): CUIDADOS AO ACESSAR ---

        // CUIDADO 1: Instanciação.
        // Se tentar fazer: turma[0].nome AGORA, o programa trava (NullPointerException).
        // É obrigatório usar o 'new' para cada posição:
        turma[0] = new AlunoEx4("Ricardo");

        // CUIDADO 2: Verificação de Nulo.
        // Sempre cheque se a posição não é null antes de usar métodos ou atributos.
        System.out.println("--- RESULTADOS ---");

        for (int i = 0; i < turma.length; i++) {
            if (turma[i] != null) {
                System.out.println("Posição " + i + " tem o aluno: " + turma[i].nome);
            } else {
                System.out.println("Posição " + i + " está VAZIA (null).");
            }
        }
    }
}