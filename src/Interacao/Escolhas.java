package Interacao;

import Classes.CodigoInternacional;
import Classes.ConexaoAPI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Escolhas extends ConexaoAPI {
    private final Scanner Leitura;
    ConexaoAPI conexaoAPI = new ConexaoAPI();

    public Escolhas(Scanner Leitura){
        this.Leitura = Leitura;
    }

    public void CotacaoAtual(String valor) {
        while (true) {
            while (!valor.matches("[A-Za-z]{3}")) {
                System.out.println("""
                        Digite apenas o Código internacional
                        BRL, USD, ARS, COP, etc
                        """);
                valor = Leitura.nextLine().toUpperCase();
            }
            Interface menu = new Interface();
            try {
                CodigoInternacional codigoInternacional = BuscarJson(valor);
                System.out.println(menu.ExibirCotacao(valor,
                        codigoInternacional.conversion_rates().ARS(),
                        codigoInternacional.conversion_rates().USD(),
                        codigoInternacional.conversion_rates().BRL(),
                        codigoInternacional.conversion_rates().EUR()));
                break;
            } catch (NullPointerException e) {
                System.out.println("""
                        ******** não há nenhum dado sobre a moeda: %s
                        confira o código internacional digitado ******** 
                        %s
                        """.formatted(valor,
                        e.getMessage()));

                System.out.println("Digite o código internacional novamente");
                valor = Leitura.nextLine();
            }
        }
    }

    public int Sair(int valor) {
        int sair = -1;
        while (sair != valor){
            try{
                System.out.println("""
                digite %d para voltar ao menu
                """.formatted(valor));

                sair = Leitura.nextInt();
                Leitura.nextLine();
                if (sair != valor) {
                    System.out.println("opção inválida");
                }
            } catch (InputMismatchException e){
                System.out.println("Entrada inválida! Digite apenas números.");
                Leitura.nextLine();
            }
        }
        return sair;
    }

    public void Escolha1() {
        // dólar para peso argentino

        double valor = 0;
        conexaoAPI.BuscarJson("USD");

        System.out.println("Qual o valor em dólar?");
        while (true){
            try {
                valor = Leitura.nextDouble();
                Leitura.nextLine();
                var resultado = valor * conexaoAPI.getCodigoInternacional().conversion_rates().ARS();
                System.out.println("""
                --------------------------------------
                Resultado Dólar para Peso Argentino


                 $%.2f Dólares equivalem a
                 $%.2f Pesos Argentinos
                --------------------------------------
                """.formatted(valor,
                        resultado));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Número inválido, digite um valor válido");
                Leitura.nextLine();
            }
        }
    }

    public void Escolha2() {
        // peso argentino para dólar

        double valor = 0;
        conexaoAPI.BuscarJson("ARS");

        System.out.println("Qual o valor em Peso Argentino?");
        while (true){
            try {
                valor = Leitura.nextDouble();
                Leitura.nextLine();
                var resultado = valor * conexaoAPI.getCodigoInternacional().conversion_rates().USD();
                System.out.println("""
                --------------------------------------
                Resultado Peso Argentino para Dólar


                 $%.2f Pesos argentinos equivalem a
                 $%.2f Dólares
                --------------------------------------
                """.formatted(valor,
                        resultado));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Número inválido, digite um valor válido");
                Leitura.nextLine();
            }
        }
    }

    public void Escolha3() {
        // dólar real

        double valor = 0;
        conexaoAPI.BuscarJson("USD");

        System.out.println("Qual o valor em Dólar?");
        while (true){
            try {
                valor = Leitura.nextDouble();
                Leitura.nextLine();
                var resultado = valor * conexaoAPI.getCodigoInternacional().conversion_rates().BRL();
                System.out.println("""
                --------------------------------------
                Resultado Dólar para Real Brasileiro


                 $%.2f Dólares equivalem a
                 $%.2f Reais Brasileiros
                --------------------------------------
                """.formatted(valor,
                        resultado));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Número inválido, digite um valor válido");
                Leitura.nextLine();
            }
        }
    }

    public void Escolha4() {
        // real dólar

        double valor = 0;
        conexaoAPI.BuscarJson("BRL");

        System.out.println("Qual o valor em Real Brasileiro?");
        while (true){
            try {
                valor = Leitura.nextDouble();
                Leitura.nextLine();
                var resultado = valor * conexaoAPI.getCodigoInternacional().conversion_rates().USD();
                System.out.println("""
                --------------------------------------
                Resultado Real Brasileiro para Dólar


                 $%.2f Reais Brasileiros equivalem a
                 $%.2f Dólares
                --------------------------------------
                """.formatted(valor,
                        resultado));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Número inválido, digite um valor válido");
                Leitura.nextLine();
            }
        }
    }

    public void Escolha5() {
        // dólar peso colombiano

        double valor = 0;
        conexaoAPI.BuscarJson("USD");

        System.out.println("Qual o valor em Dólar?");
        while (true){
            try {
                valor = Leitura.nextDouble();
                Leitura.nextLine();
                var resultado = valor * conexaoAPI.getCodigoInternacional().conversion_rates().EUR();
                System.out.println("""
                --------------------------------------
                Resultado Dólar para Euro


                 $%.2f Dólares equivalem a
                 $%.2f Euros
                --------------------------------------
                """.formatted(valor,
                        resultado));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Número inválido, digite um valor válido");
                Leitura.nextLine();
            }
        }
    }

    public void Escolha6() {
        // peso colombiano dólar

        double valor = 0;
        conexaoAPI.BuscarJson("EUR");

        System.out.println("Qual o valor em Euro?");
        while (true){
            try {
                valor = Leitura.nextDouble();
                Leitura.nextLine();
                var resultado = valor * conexaoAPI.getCodigoInternacional().conversion_rates().USD();
                System.out.println("""
                --------------------------------------
                Resultado Euro para Dólar


                 $%.2f Euros equivalem a
                 $%.2f Dólares
                --------------------------------------
                """.formatted(valor,
                        resultado));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Número inválido, digite um valor válido");
                Leitura.nextLine();
            }
        }
    }
}