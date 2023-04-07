import java.util.Scanner;

public class EX04 {
    public static void calculadora(Scanner entrada) {
        double a, b;
        String opt = null;

        do {
            // Consultar EX01.java
            System.out.println("\033\143");

            System.out.printf(
                "a: Soma\n"+
                "b: Subtração\n"+
                "c: Multiplicação\n"+
                "d: Divisão\n"+
                "Escolha a operação:\n> "
            );
            while(
                !(opt = entrada.next()).equals("a") && !opt.equals("b") && !opt.equals("c") &&
                !opt.equals("d") && !opt.equals("s") && !opt.equals("S")
            ) {
                System.out.println("\033[31mEntrada incorreta.");
                System.out.printf("\033[33mInsira a opção desejada:\033[m\n> ");
            }
            if(opt.equals("s") || opt.equals("S")) break;

            System.out.printf("\nInsira o 1º número da operação:\n> ");
            a = entrada.nextInt();

            System.out.printf("\nInsira o 2º número da operação:\n> ");
            b = entrada.nextInt();

            System.out.print("\033[32;1mResultado: ");
            switch (opt) {
                case "a":
                    System.out.printf("%.2f + %.2f = %.2f", a, b, a+b);
                    break;
            
                case "b":
                    System.out.printf("%.2f - %.2f = %.2f", a, b, a-b);
                    break;

                case "c":
                    System.out.printf("%.2f x %.2f = %.2f", a, b, a*b);
                    break;

                case "d":
                    System.out.printf("%.2f : %.2f = %.2f", a, b, a/b);
                    break;
            }

            // Espera o Enter => Consultar EX01.java
            System.out.println("\n\n\033[33mPressione [ENTER] para continuar\033[m");
            try { System.in.read(); }
            catch(Exception excep) {}
        } while(true);

        
    }
}
