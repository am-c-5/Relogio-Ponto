import RelgPontoPkg.Funcionario;
import RelgPontoPkg.Gerente;
import RelgPontoPkg.Operador;
import RelgPontoPkg.Secretaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import RelgPontoPkg.RelogioPonto;
import java.lang.Thread;

public class main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                RelogioPonto rp = new RelogioPonto();

                int menu;
                List<Funcionario> list = new ArrayList<>();


        System.out.println("Informe seu ID: ");
        int id = sc.nextInt();

        System.out.println("Nome: ");
        String nome = sc.next();

        System.out.println("E-mail: ");
        String email = sc.next();

        System.out.println("RG: ");
        String rg = sc.next();

        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println("Selecione:");
        System.out.println("1. Gerente");
        System.out.println("2. Secretária");
        System.out.println("3. Operador");
        System.out.println("=-=-=-=-=-=-=-=-=-=");


        System.out.println("Digite sua opção: ");
        menu = sc.nextInt();

        try {
            System.out.println("Carregando... ");
            Thread.sleep(1000);
        } catch (Exception erro) {
        }

        switch(menu){

            case 1:
                list.add(new Gerente(id, nome, email, rg, "Admin", "admin1"));
                        for (Funcionario Gpoli : list){
                            Gpoli.imprimir();
                            rp.imprimirHora();
                        }
                    break;
            case 2:
                list.add(new Secretaria(id, nome, email, rg, "121212123", "Contabilidade"));
                        for (Funcionario Spoli : list){
                            Spoli.imprimir();
                            rp.imprimirHora();
                        }
                    break;
            case 3:
                list.add(new Operador(id, nome, email, rg, 7.00));
                        for (Funcionario Opoli : list){
                            Opoli.imprimir();
                            rp.imprimirHora();
                        }
                    break;

            default:
                System.out.println("Opção inválida.");
        }

                sc.close();
    }
}