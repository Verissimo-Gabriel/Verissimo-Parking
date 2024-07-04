package application;

import entities.Estacionamento;

import java.util.*;
import java.time.LocalDateTime;

import static application.UI.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Estacionamento e = new Estacionamento();
        printWelcome();
        System.out.println();
        UI.printMenu();

        String input = sc.nextLine();

        while (!Objects.equals(input, "0")) {
            try {
                switch (input) {

                    case "1":
                        UI.clearScreen();
                        UI.printCase1();
                        System.out.println("Digite a placa do veículo: ");
                        String placa = sc.nextLine().toUpperCase();
                        if (e.checkPlaca(placa)){
                            while (e.checkPlaca(placa)){
                                System.out.printf("Veículo já registado. %nDigite a placa do veículo: ");
                                placa = sc.nextLine().toUpperCase();
                            }
                        }
                        System.out.println("Digite o modelo do veículo: ");
                        String modelo = sc.nextLine().toUpperCase();
                        System.out.println("Digite a marca do veículo: ");
                        String marca = sc.nextLine().toUpperCase();
                        LocalDateTime horaEntrada = LocalDateTime.now();

                        String result = null;
                        while (result == null) {

                            UI.printEscolhaVeic();
                            result = sc.nextLine();

                            if (Objects.equals(result, "1")) {
                                e.entradaCarro(placa, e.checkModelo(modelo), marca, horaEntrada); //metodos da classe Estacionamento
                            } else if (Objects.equals(result, "2")) {
                                e.entradaMoto(placa, e.checkModelo(modelo), marca, horaEntrada);
                            } else result = null;
                        }
                        System.out.println("Veículo guardado!");
                        break;

                    case "2":
                        UI.clearScreen();
                        UI.printCase2();
                        System.out.println("Digite a placa do veiculo a ser retirado: ");
                        String retirarPlaca = sc.nextLine().toUpperCase();

                        if (e.checkPlaca(retirarPlaca)) {               //Checa a existencia do veiculo atraves de um metodo booleano na classe Estacionamento
                            e.saidaVeiculo(LocalDateTime.now(), retirarPlaca);
                        } else System.out.println("Veiculo não encontrado!");

                        break;

                    case "3":
                        UI.clearScreen();
                        UI.printCase3();
                        e.showVeiculos();
                        break;

                    case "4":
                        UI.clearScreen();
                        System.out.println("Digite a placa do veiculo a ser consultado: ");
                        String consultPlaca = sc.nextLine().toUpperCase();

                        if (e.checkPlaca(consultPlaca)) {
                            e.consultVeic(consultPlaca);
                        } else System.out.println("Veiculo não encontrado.");

                        break;

                    case "0":
                        UI.clearScreen();
                        break;

                    default:

                        System.out.println("Escolha inválida.");
                        break;
                }

            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage());
                System.out.println();
            }

            UI.printMenu();
            input = sc.nextLine();
        }

        sc.close();
    }
}