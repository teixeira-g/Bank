package co.gabrielteixeira.bank;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Criar uma conta (Agência, conta, nome(e sobrenome)) ✅
        // Limitar o nome para até 12 caracteres ✅
        // Sacar valores ✅
        // Não pode sacar mais do que o saldo✅
        // Depositar✅
        // Mostrar as operações✅
        Account account = new Account("001","1234", "Gabriel", "Teixeira");


        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar){
            //D = Depósito
            //S = sacar
            //E = Sair(exit)
           System.out.println("O que deseja fazer? D=Depósito, S=Sacar, E=Sair");
            String op = scanner.nextLine();


            switch (op){
                case "D":
                    System.out.println("Qual valor deseja depositar?");
                    double value = scanner.nextDouble();
                    account.deposit(value);
                    break;
                case "d":
                    System.out.println("Qual valor deseja depositar?");
                    double value2 = scanner.nextDouble();
                    account.deposit(value2);
                    break;
                case "S":
                    System.out.println("Qual valor deseja sacar?");
                    double value3 = scanner.nextDouble();
                    account.withDraw(value3);
                    break;
                case "s":
                    System.out.println("Qual valor deseja sacar?");
                    double value4 = scanner.nextDouble();
                    account.withDraw(value4);
                    break;
                case "E":
                    System.out.println("Finalizando o programa...");
                    continuar = false;
                    break;
                case "e":
                    System.out.println("Finalizando o programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }

            scanner = new Scanner(System.in);
        }
    }

}