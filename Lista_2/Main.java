import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\033\143");

        Funcionario iago = new Funcionario("Iago Cesar", 20);
        Funcionario gabriel = new Funcionario("Gabriel Tibúrcio", 13);

        iago.atualizarNome(input.nextLine());
        gabriel.atualizarNome(input.nextLine());

        iago.atualizarSalarioHora(input.nextDouble());
        gabriel.atualizarSalarioHora(input.nextDouble());

        iago.adicionarDiaDeTrabalho(input.nextDouble());
        gabriel.adicionarDiaDeTrabalho(input.nextDouble());

        System.out.println("");

        iago.printFuncionario();
        gabriel.printFuncionario();

        input.close();
    }
}