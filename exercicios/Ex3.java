package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a quantidade de números (n) da série de Fibonacci: ");
        int n = leitor.nextInt();

        // 1. Tratamento para casos onde n é muito pequeno
        if (n <= 0) {
            System.out.println("Por favor, informe um valor maior que 0.");
        } else {
            long[] fibo = new long[n]; // Usamos 'long' pois os números crescem muito rápido

            // 2. Definindo os dois primeiros valores base
            if (n >= 1) fibo[0] = 0;
            if (n >= 2) fibo[1] = 1;

            // 3. Calculando os próximos números: F(i) = F(i-1) + F(i-2)
            for (int i = 2; i < n; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }

            // 4. Exibindo o array formatado
            System.out.println("Série de Fibonacci com " + n + " termos:");
            System.out.println(Arrays.toString(fibo));
        }

        leitor.close();
    }
}