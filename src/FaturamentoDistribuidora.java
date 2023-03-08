public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        // Definindo os valores de faturamento de cada estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Calculando o valor total mensal da distribuidora
        double total = sp + rj + mg + es + outros;

        // Calculando e imprimindo o percentual de representação de cada estado
        double spPercentual = (sp / total) * 100;
        double rjPercentual = (rj / total) * 100;
        double mgPercentual = (mg / total) * 100;
        double esPercentual = (es / total) * 100;
        double outrosPercentual = (outros / total) * 100;

        System.out.println("Percentual de representação por estado:");
        System.out.println("SP: " + spPercentual + "%");
        System.out.println("RJ: " + rjPercentual + "%");
        System.out.println("MG: " + mgPercentual + "%");
        System.out.println("ES: " + esPercentual + "%");
        System.out.println("Outros: " + outrosPercentual + "%");
    }
}
