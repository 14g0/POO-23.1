import java.util.Scanner;

public class EX05 {
    public static void gasolina(Scanner entrada) {
        double tempo, veloc;

        // Consultar EX01.java
        System.out.println("\033\143");

        System.out.printf("Insira o tempo que será gasto na viagem, em horas:\n> ");
        tempo = entrada.nextDouble();

        System.out.printf("\nInsira a velocidade em que a viagem será feita em Km/h:\n> ");
        veloc = entrada.nextDouble();

        System.out.printf("\033[32;1mVocê precisará de %.3f litro(s).", tempo*veloc/12);

        // Espera o Enter => Consultar EX01.java
        System.out.println("\n\n\033[33mPressione [ENTER] para continuar\033[m");
        try { System.in.read(); }
        catch(Exception excep) {}
    }
}
