package cinema;
/*
O cinema faz parte da indústria do entretenimento há muito tempo:
um bom filme é uma forma de fugir da realidade e viver uma variedade
de emoções. A melhor experiência de cinema que você pode ter é provavelmente em uma sala de cinema.
Neste projeto, você criará um aplicativo que ajuda a gerenciar uma sala de cinema: vender ingressos,
verificar assentos disponíveis, ver estatísticas de vendas e muito mais.

*Visualize a disposição dos assentos imprimindo-a no console
*Calcule o lucro de todos os ingressos vendidos.
*Defina o preço do bilhete.
*Adicione um menu que permita comprar ingressos e exibir o
estado atual da disposição dos assentos.
*Manipule alguns erros de entrada.
 */

import java.util.Scanner;

public class Cine2 {

    private static char[][] cinemaHall;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        createCinema();
        int command;
        do {
            System.out.println(" ");
            System.out.println("Escolha uma das alternativas abaixo:");
            System.out.println("1. Mostre os bancos");
            System.out.println("2. Compre um ticket");
            System.out.println("0. Sair");
            System.out.print("Alternativa número: ");
            System.out.print(" ");

            command = scanner.nextInt();
            switch (command) {
                case 1:
                    printCinemaHall();
                    break;
                case 2:
                    takeTicket();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Comando errado! Digite novamente. ");

            }
        } while (command != 0);
    }

    public static void createCinema() {
        System.out.print("Digite o número de fileiras:  ");
        int numberOfRows = scanner.nextInt();
        System.out.print("Digite o número de assentos em cada fileira: ");
        int numberOfSeats = scanner.nextInt();

        cinemaHall = new char[numberOfRows][numberOfSeats];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfSeats; j++) {
                cinemaHall[i][j] = 's';
            }
        }

    }

    public static void printCinemaHall() {
        System.out.println(" ");
        System.out.println("Cinema: ");
        System.out.println(" ");
        System.out.print(" ");
        for (int i = 1; i <= cinemaHall[0].length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < cinemaHall.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < cinemaHall[0].length; j++) {
                System.out.print(" " + cinemaHall[i][j]);
            }
            System.out.println();
        }
    }

    public static void takeTicket() {
        System.out.println(" ");
        System.out.print("Digite  o número da fila: ");
        int seatRow = scanner.nextInt();
        System.out.print("Digite o número do assento desta fila: ");
        int seatNumber = scanner.nextInt();


        int totalNumberOfSeats = cinemaHall.length + cinemaHall[0].length;

        int priceTicket;

        if (totalNumberOfSeats <= 60) {
            priceTicket = 10;
        } else {
            int frontHallOfRows = cinemaHall.length / 2;
            if (seatRow <= frontHallOfRows) {
                priceTicket = 10;
            } else {
                priceTicket = 8;
            }
        }
        System.out.println("Preço do Ingresso: R$" + priceTicket);
        cinemaHall[seatRow - 1][seatNumber - 1] = 'B';
    }
}
