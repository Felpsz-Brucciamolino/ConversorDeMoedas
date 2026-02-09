import java.util.InputMismatchException;
import java.util.Scanner;
import Interacao.Escolhas;
import Interacao.Interface;

public class Principal {
    public static void main(String[] args) {

        Scanner Leitura = new Scanner(System.in);
        Interface menu= new Interface();
        int escolhainicial = 0;

        System.out.println("""
                
                ******************************
                SISTEMA DE CONVERSÃO DE MOEDAS
                ******************************
                """);
        while (escolhainicial != 7) {
            System.out.println(menu.ExibirMenuInicial());
            try {
                escolhainicial = Leitura.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Valor inválido, digite um número.");
                Leitura.nextLine();
                continue;
            }
            Escolhas escolhas = new Escolhas(Leitura);
            switch (escolhainicial) {
                case 1: {
                    //Opções de conversão
                    int escolhaconversor = 0;
                    while (escolhaconversor != 7) {
                        System.out.println(menu.ExibirMenu());
                        try {
                            escolhaconversor = Leitura.nextInt();
                        } catch (InputMismatchException e){
                            System.out.println("Valor inválido, digite um número.");
                            Leitura.nextLine();
                            continue;
                        }
                        if (escolhaconversor == 7) {
                            break;
                        }

                        switch (escolhaconversor) {
                            case 1: {
                                escolhas.Escolha1();
                                escolhas.Sair(2);
                                continue;
                            }
                            case 2: {
                                escolhas.Escolha2();
                                escolhas.Sair(2);
                                continue;
                            }
                            case 3: {
                                escolhas.Escolha3();
                                escolhas.Sair(2);
                                continue;
                            }
                            case 4: {
                                escolhas.Escolha4();
                                escolhas.Sair(2);
                                continue;
                            }
                            case 5: {
                                escolhas.Escolha5();
                                escolhas.Sair(2);
                                continue;
                            }
                            case 6: {
                                escolhas.Escolha6();
                                escolhas.Sair(2);
                                continue;
                            }
                            case 7: {
                                continue;
                            }
                            default: break;
                        }
                    }
                } break;
                case 2: {
                    //Cotação atual

                    Leitura.nextLine();
                    System.out.println("""
                                    Qual é a moeda que quer se basear na cotação?
                                    Somente o código internacional BRL,USD,ARS,etc.
                                    """);
                    String valor = "";
                    escolhas.CotacaoAtual(valor = Leitura.nextLine());
                    escolhas.Sair(2);
                    break;
                }
                case 7: {
                    System.out.println("""
                            Foi um prazer te atender ^-^
                            Volte sempre!!
                            """);
                    break;
                }
                default:{
                    escolhas.Sair(2);
                }
            }
        }
    }
}