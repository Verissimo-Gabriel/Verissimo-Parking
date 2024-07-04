package application;

public class UI {

    //Cor de FONTE
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";

    //Cor de BACKGROUND

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\033[0;107m";


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printWelcome() {
        System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "#####################################" + ANSI_RESET);
        System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "##" + ANSI_CYAN_BACKGROUND + "Bem vindo ao Veríssimo's Parking!" + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "##" + ANSI_RESET);
        System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "#####################################" + ANSI_RESET);
    }

    public static void printMenu() {
        System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "Selecione uma opção:" + ANSI_RESET);

        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Entrada de veículo: Digite " + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "'1'" + ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND + ANSI_BLACK + "Saída de veículo: Digite " + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "'2'" + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "Consultar todos os veiculos: Digite " + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "'3'" + ANSI_RESET);
        System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_BLACK + "Consultar veiculo especifico: Digite " + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "'4'" + ANSI_RESET);
        System.out.println(ANSI_RED_BACKGROUND + ANSI_BLACK + "Encerrar programa: Digite " + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "'0'" + ANSI_RESET);

    }

    public static void printCase1() {
        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Entrada de veículo: " + ANSI_RESET);
    }

    public static void printEscolhaVeic() {
        System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "Digite '1' para guardar um CARRO, ou digite '2' para guardar uma MOTO: " + ANSI_RESET);
    }

    public static void printCase2() {
        System.out.println(ANSI_YELLOW_BACKGROUND + ANSI_BLACK + "Saída de veículo: " + ANSI_RESET);
    }

    public static void printCase3() {
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_BLACK + "Lista de Veículos: " + ANSI_RESET);
    }

}
