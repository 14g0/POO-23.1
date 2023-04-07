import java.util.Random;
import java.util.Scanner;

public class EX06 {
    public static void adivinhacao(Scanner entrada) {
        int user, cont=0;
        Random gerador = new Random();

        // Consultar EX01.java
        System.out.println("\033\143");

        System.out.printf("Insira um número entre 0 e 100:\n> ");
        while(((user = entrada.nextInt()) > 100) || (user < 0)) {
            System.out.println("\033[31mEntrada incorreta.");
            System.out.printf("\033[33mInsira um número entre 0 e 100:\n\033[m> ");
        }

        while(user != gerador.nextInt(101)) cont+=1;
        
        System.out.printf("\n\n\033[32;1mPrecisei de %d tentativas para acertar.", cont);

        // Espera o Enter => Consultar EX01.java
        System.out.println("\n\n\033[33mPressione [ENTER] para continuar\033[m");
        try { System.in.read(); }
        catch(Exception excep) {}
    }
}
