import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {

        // Para garantir que os números decimais sejam lidos com ponto
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario;
        int horasTrabalhadas;
        double valorPorHora;
        double salario;

        // Lê o número do funcionário
        numeroFuncionario = sc.nextInt();

        // Lê o número de horas trabalhadas
        horasTrabalhadas = sc.nextInt();

        // Lê o valor recebido por hora
        valorPorHora = sc.nextDouble();

        // Calcula o salário
        salario = horasTrabalhadas * valorPorHora;

        // Imprime o número do funcionário
        System.out.println("NUMBER = " + numeroFuncionario);

        // Imprime o salário formatado com duas casas decimais
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();
    }
    
}
