import java.util.Scanner;

class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int option=0;

        do {
            // Código ANSI(?) para limpar o terminal.
            System.out.println("\033\143");

            System.out.printf(
                "\033[34;1m    __    _      __           ___\n"+
                "   / /   (_)____/ /_____ _   <  /\n"+
                "  / /   / / ___/ __/ __ `/   / /\n"+
                " / /___/ (__  ) /_/ /_/ /   / /\n"+
                "/_____/_/____/\\__/\\__,_/   /_/\n\n\033[m"+
                "0: Encerrar o Programa\n"+
                "1: Calculadora de média\n"+
                "2: Fome no avião\n"+
                "3: Volume da esfera\n"+
                "4: Calculadora\n"+
                "5: Gasolina\n"+
                "6: Adivinhação\n"+
                "\nInsira o exercício desejado:\n> "
            );

            switch(option = entrada.nextInt()) {
                case 1:
                    EX01.media(entrada);
                    break;
                
                case 2:
                    EX02.fomeNoAviao(entrada);
                    break;

                case 3:
                    EX03.volumeDaEsfera(entrada);
                    break;

                case 4:
                    EX04.calculadora(entrada);
                    break;
                
                case 5:
                    EX05.gasolina(entrada);
                    break;

                case 6:
                    EX06.adivinhacao(entrada);
                    break;
            }
        } while(option != 0);

        entrada.close();

        System.out.println("\033\143");
        System.out.println("Até a próxima \033[36mT-T\033[m");
    }
}