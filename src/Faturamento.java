import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class Faturamento {
    public static void main(String[] args) {

        // Leitura dos dados de faturamento diário a partir de um arquivo JSON
        JSONParser parser = new JSONParser();
        try {
            JSONArray faturamentoMensal = (JSONArray) parser.parse(new FileReader("faturamento.json"));

            // Cálculo do menor valor de faturamento diário
            double menorFaturamento = Double.MAX_VALUE;
            for (Object obj : faturamentoMensal) {
                JSONObject dia = (JSONObject) obj;
                double faturamento = (double) dia.get("faturamento");
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
            }
            System.out.println("Menor faturamento diário: R$" + menorFaturamento);

            // Cálculo do maior valor de faturamento diário
            double maiorFaturamento = Double.MIN_VALUE;
            for (Object obj : faturamentoMensal) {
                JSONObject dia = (JSONObject) obj;
                double faturamento = (double) dia.get("faturamento");
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
            }
            System.out.println("Maior faturamento diário: R$" + maiorFaturamento);

            // Cálculo da média mensal de faturamento
            double totalFaturamento = 0;
            int numDiasComFaturamento = 0;
            for (Object obj : faturamentoMensal) {
                JSONObject dia = (JSONObject) obj;
                double faturamento = (double) dia.get("faturamento");
                if (faturamento > 0) {
                    totalFaturamento += faturamento;
                    numDiasComFaturamento++;
                }
            }
            double mediaFaturamento = totalFaturamento / numDiasComFaturamento;

            // Cálculo do número de dias em que o faturamento diário foi superior à média mensal
            int numDiasAcimaDaMedia = 0;
            for (Object obj : faturamentoMensal) {
                JSONObject dia = (JSONObject) obj;
                double faturamento = (double) dia.get("faturamento");
                if (faturamento > mediaFaturamento) {
                    numDiasAcimaDaMedia++;
                }
            }
            System.out.println("Número de dias com faturamento acima da média mensal: " + numDiasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
