import java.util.ArrayList;
import java.util.Scanner;

import br.edu.fatecriopreto.projetoagenda.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        ArrayList<Servico> listaServicos = new ArrayList<>();
        ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
        ArrayList<Agenda> listaAgenda = new ArrayList<>();
        int opcao1=0, opcao2=0;;
        do {
            // System.out.println("----- MENU 1 -----");
            // System.out.println("1 - Clientes");
            // System.out.println("2 - Funcionários");
            // System.out.println("3 - Departamentos");
            // System.out.println("4 - Serviços");
            // System.out.println("5 - Agenda");
            // System.out.println("10 - SAIR");
            // System.out.println("Digite uma opção:");
            // opcao1 = entrada.nextInt();
            // System.out.println("---- MENU 2 ----");
            // System.out.println("20 - Incluir novo");
            // System.out.println("21 - Editar");
            // System.out.println("22 - Listar");
            // System.out.println("23 - Excluir");
            // System.out.println("24 - VOLTAR");
            // System.out.println("Digite uma opção");
            // opcao2 = entrada.nextInt();
            // ou esta opcao
            System.out.println("----- MENU  -----");
            System.out.println("--> Clientes");
            System.out.println("11 - Incluir Cliente");
            System.out.println("12 - Editar Cliente");
            System.out.println("13 - Listar clientes");
            System.out.println("14 - Excluir Clientes");
            System.out.println("--> Funcionários");
            System.out.println("21 - Incluir Funcionário");
            System.out.println("22 - Editar Funcionário");
            System.out.println("23 - Listar Funcionário");
            System.out.println("24 - Excluir Funcionário");
            System.out.println("--> Departamentos");
            System.out.println("31 - Incluir Funcionário");
            System.out.println("32 - Editar Funcionário");
            System.out.println("33 - Listar Funcionário");
            System.out.println("34 - Excluir Funcionário");
            System.out.println("--> Serviços");
            System.out.println("41 - Incluir Serviço");
            System.out.println("42 - Editar Serviço");
            System.out.println("43 - Listar Serviço");
            System.out.println("44 - Excluir Serviço");
            System.out.println("--> Agenda");
            System.out.println("51 - Incluir Agenda");
            System.out.println("52 - Editar Agenda");
            System.out.println("53 - Listar Agenda");
            System.out.println("54 - Excluir Agenda");
            System.out.println("10 - SAIR");
            System.out.println("Digite uma opção:");
            opcao1 = entrada.nextInt();
            switch (opcao1) {
                case 11:
                    
                    break;
                case 12:
                    
                    break;
                case 13:
                    
                    break;
                case 14:
                    
                    break;     
                default:
                    break;
            }
        } while (opcao1!=10);
    }
}
