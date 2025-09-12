import java.util.Scanner;

public class chá {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // A primeira linha contém o tipo de chá correto
        int T = scanner.nextInt();

        // A segunda linha contém as cinco respostas dos competidores
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();

        // Inicializa um contador para as repostas corretas
        int respostasCorretas = 0;

        // Compara cada resposta com o tipo de chá correto e incrementa o contador se for correta
        if (A == T) {
            respostasCorretas++;
        }
        if (B == T) {
            respostasCorretas++;
        }
        if (C == T) {
            respostasCorretas++;
        }
        if (D == T) {
            respostasCorretas++;
        }
        if (E == T) {
            respostasCorretas++;
        }

        // Imprime o número total de respostas corretas
        System.out.println(respostasCorretas);

        // Fecha o scanner para liberar os recursos    
        scanner.close();
    }
}