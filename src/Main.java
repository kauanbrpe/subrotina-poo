import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double percentualDesconto = 0;

        System.out.println("Qual seu salário? ");
        double salarioBruto = sc.nextDouble();

        percentualDesconto = ifPercentualDesconto(salarioBruto, percentualDesconto);

        calculoSalario(salarioBruto, percentualDesconto);

        sc.close();
    }

    private static double ifPercentualDesconto(double salarioBruto, double percentualDesconto) {
        if (salarioBruto <= 2000){
            percentualDesconto = 0;
        } else if (salarioBruto > 2000 && salarioBruto <= 4000){
            percentualDesconto = 2;
        } else if (salarioBruto > 4000){
            percentualDesconto = 4;
        }
        return percentualDesconto;
    }

    private static void calculoSalario(double salarioBruto, double percentualDesconto) {

        double valorDesconto = salarioBruto * percentualDesconto / 100;

        if (valorDesconto < 400 && percentualDesconto == 0){
            System.out.println("Tipo de Desconto: Isento");
        } else if (valorDesconto < 400 && percentualDesconto == 2) {
            System.out.println("Tipo de Desconto: Baixo");
        } else if (valorDesconto < 400 && percentualDesconto == 4) {
            System.out.println("Tipo de Desconto: Médio");
        } else if (valorDesconto >= 400) {
            valorDesconto = 400;
            System.out.println("Tipo de Desconto: Máximo");
        }

        System.out.printf("Valor do Desconto: R$ %.2f\n", valorDesconto);
        double salarioLiquido = salarioBruto - valorDesconto;
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);

    }

}