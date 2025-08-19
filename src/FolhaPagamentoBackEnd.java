public class FolhaPagamentoBackEnd {

    public static double calculoSalario(double salarioBruto) {
        double percentualDesconto;

        if (salarioBruto <= 2000){
            percentualDesconto = 0;
        } else if (salarioBruto <= 4000){
            percentualDesconto = 2;
        } else {
            percentualDesconto = 4;
        }

        double valorDesconto = salarioBruto * percentualDesconto / 100;

        if (valorDesconto > 400){
            valorDesconto = 400;
        }

        return valorDesconto;
    }

    public static double calcularSalarioLiquido(double salarioBruto, double valorDesconto){
        return salarioBruto - valorDesconto;
    }

    public static String ifTipoDesconto(double salarioBruto) {
        String tipoDesconto;

        if (salarioBruto <= 2000){
            tipoDesconto = "Isento";
        } else if (salarioBruto <= 4000) {
            tipoDesconto = "Baixo";
        } else {
            double valorDesconto = salarioBruto * 4 / 100;
            if (valorDesconto > 400) {
                tipoDesconto = "Máximo";
            } else {
                tipoDesconto = "Médio";
            }

        }
        return tipoDesconto;
    }
}
