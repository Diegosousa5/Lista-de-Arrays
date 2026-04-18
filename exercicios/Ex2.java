package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] megaSena = new int[6];
        int qtdValidos = 0;

        System.out.println("--- Sorteio Mega-Sena ---");

        while (qtdValidos < 6) {
            System.out.print("Digite o " + (qtdValidos + 1) + "º número (1 a 60): ");
            int numero = leitor.nextInt();

            // 1. Verifica se está no intervalo permitido
            if (numero < 1 || numero > 60) {
                System.out.println("Erro: O número deve estar entre 1 e 60!");
                continue;
            }

            // 2. Verifica se o número já foi digitado (duplicado)
            boolean duplicado = false;
            for (int i = 0; i < qtdValidos; i++) {
                if (megaSena[i] == numero) {
                    duplicado = true;
                    break;
                }
            }

            if (duplicado) {
                System.out.println("Erro: Você já digitou esse número!");
            } else {
                // 3. Adiciona ao array e incrementa o contador
                megaSena[qtdValidos] = numero;
                qtdValidos++;
            }
        }

        // 4. Ordena o array em ordem crescente
        Arrays.sort(megaSena);

        // 5. Exibe o resultado
        System.out.println("\nNúmeros da sorte (ordenados): " + Arrays.toString(megaSena));

        leitor.close();
    }
}