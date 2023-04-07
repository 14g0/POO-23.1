import java.util.Scanner;

public class EX03 {
    public static void volumeDaEsfera(Scanner entrada) {
        double raio, pi = 3.14159;

        // Consultar EX01.java
        System.out.println("\033\143");

        System.out.printf("Insira o raio da esfera:\n> ");
        raio = entrada.nextDouble();
        raio = raio*raio*raio*pi*4/3;

        System.out.printf("\n\n\033[32;1mO volume da esfera é: %f", raio);


        // Espera o Enter => Consultar EX01.java
        System.out.println("\n\n\033[33mPressione [ENTER] para continuar\033[m");
        try { System.in.read(); }
        catch(Exception excep) {}
    }
}
