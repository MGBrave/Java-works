package cinema;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o número da fila: ");
        int numberOfRows = scanner.nextInt();
        System.out.print("Entre com o Número de bancos em cada fileira: ");
        int numberOfSeats = scanner.nextInt();

        int totalNumberOfSeats = numberOfRows * numberOfSeats;
        int totalIncome;

        if (totalNumberOfSeats <= 60) {
            totalIncome = totalNumberOfSeats * 10;
        } else {
            int frontHalfOfRows = numberOfRows / 2;
            int backHalfOfRows = numberOfRows - frontHalfOfRows;

            totalIncome = frontHalfOfRows * numberOfSeats * 10
                    + backHalfOfRows * numberOfSeats * 8;

        }
        System.out.print("Renda Total: R$ " + totalIncome);
        System.out.println(" ");

    }
}
