package Interacao;

public class Interface {

    public String ExibirMenuInicial(){
        return """
                Seja bem vinda(o) ao meu conversor de moedas
                O que deseja fazer?
                
                1) Conversor de Moedas
                2) Cotação atual
                
                7) sair
                
                Referência de cotação de moeda: https://www.exchangerate-api.com/
                """;
    }

    public String ExibirMenu( ) {
        return """
                O que você deseja?
                
                1) Dólar --> Peso Argentino
                2) Peso Argentino --> Dólar
                3) Dólar --> Real Brasileiro
                4) Real Brasileiro --> Dólar
                5) Dólar --> Euro
                6) Euro --> Dólar
                
                7) Sair.
                *****************************
                """;
    }
    public String ExibirCotacao(String valor, double cod1, double cod2,
                                double cod3, double cod4){
        return """
                ***************************
                Cotação Baseada em %s
                ***************************
                
                Peso Argentino: %.2f
                Dólar: %.2f
                Real Brasileiro: %.2f
                Euro: %.2f
                """.formatted(valor, cod1, cod2,
                cod3, cod4);
    }
}
