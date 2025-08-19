import java.util.Scanner;

public class FolhaPagamentoFrontEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu salário? ");
        double salarioBruto = sc.nextDouble();

        double desconto = FolhaPagamentoBackEnd.calculoSalario(salarioBruto);

        System.out.println("O desconto é R$ " + desconto);
        System.out.println("O Salário Líquido é R$ " + FolhaPagamentoBackEnd.calcularSalarioLiquido(salarioBruto, desconto));
        System.out.println("O tipo do desconto é " + FolhaPagamentoBackEnd.ifTipoDesconto(salarioBruto));

        sc.close();
    }


}

