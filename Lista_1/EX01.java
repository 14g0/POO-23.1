import java.util.Scanner;

public class EX01 {
    /*
        Se eu inicializar um Scanner de entrada aqui
        ele da erro de vazamento de alguma coisa,

        então eu passo ele como argumento pela main e fecho lá
    */

    public static void media(Scanner entrada) {
        double nota = 0;
        double total = 0;
        int cont = 0;
        
        System.out.println("\033\143");
        System.out.printf("Insira a %dª nota> ", cont+1);
        while((nota = entrada.nextDouble()) > - 1) {
            total += nota;
            cont+=1;

            System.out.printf("Insira a %dª nota> ", cont+1);
        }

        System.out.printf("\033[32;1mMédia Total: %.2f\n\n\n\033[m", total/cont);
        
        System.out.println("\033[33mPressione [ENTER] para continuar\033[m");

        // Só funciona direito com o enter direto, ele ainda aceita entrada diferente
        // https://stackoverflow.com/questions/19870467/how-do-i-get-press-any-key-to-continue-to-work-in-my-java-code
        try { System.in.read(); }
        catch(Exception excep) {}
    }
}
