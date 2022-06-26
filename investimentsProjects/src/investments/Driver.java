package investments;

/*O código de exemplo acompanha a mudança no preço das
ações após cada dia de negociação. Um usuário insere o
preço de compra e o preço de fechamento nos dias de negociação
subsequentes. Em seguida, os ganhos são avaliados. O processo
para quando um preço de fechamento negativo é inserido.*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("****************************************************\n");
        System.out.print("Insira seu preço de compra por ação: ");
        double buyingPrice = scan.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        while(true){
            System.out.print("Insira o preço de fechamento do dia "
                    + day + " qualquer valor negativo para deixar: ");
            closingPrice = scan.nextDouble();
            if(closingPrice < 0.0) break;
            double earnings = closingPrice - buyingPrice;
            if (earnings > 0.0){
                System.out.println("Próximo dia " + day + ", você ganhou "
                        + df.format(earnings) + " por compartilhamento.");
            } else if (earnings < 0.0){
                System.out.println("Próximo dia " + day + ", você perdeu "
                        + df.format(-earnings) + " por compartilhamento.");

            }else{
                System.out.println("Próximo dia " + day + ", você teve "
                        + "nenhum ganho por compartilhamento.");
            }
            day += 1;
        }
        scan.close();
    }
}

