public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double ValorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - ValorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + ValorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}
