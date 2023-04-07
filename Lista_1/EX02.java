import java.util.Scanner;

public class EX02 {
    public static void fomeNoAviao(Scanner entrada) {
        int cont, disponivel;
        int pedidos[] = new int[3], estoque[] = new int[3];
        String opcoes[] = {"FRANGO", "BIFE", "MASSA"};

        // Consultar EX01.java
        System.out.println("\033\143");

        System.out.printf(
            "Insira a quatidade de cada pedido, no formato [FRANGO] [BIFE] [MASSA]:\n> "
        );
        pedidos[0] = entrada.nextInt();
        pedidos[1] = entrada.nextInt();
        pedidos[2] = entrada.nextInt();

        System.out.printf(
            "\nAgora insira a quatidade em estoque, no formato [FRANGO] [BIFE] [MASSA]:\n> "
        );
        estoque[0] = entrada.nextInt();
        estoque[1] = entrada.nextInt();
        estoque[2] = entrada.nextInt();

        for(cont=0 ; cont<3 ; cont+=1) {
            disponivel = estoque[cont]-pedidos[cont];
            if(disponivel < 0) {
                System.out.printf("\033[31mFaltarão %d refeições de %s.\n",
                disponivel*-1, opcoes[cont]);
            }
            else {
                System.out.printf("\033[32mHá refeições suficientes de %s.",
                opcoes[cont]);
            }
        }

        // Espera o Enter => Consultar EX01.java
        System.out.println("\n\n\033[33mPressione [ENTER] para continuar\033[m");
        try { System.in.read(); }
        catch(Exception excep) {}
    }
}