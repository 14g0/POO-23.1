public class Main {
    public static void main(String[] args) {
        System.out.println("\033\143");

        Funcionario iago = new Funcionario("Iago", 25);
        Funcionario gabriel = new Funcionario("gabriel", 10);
        
        iago.printFuncionario();
        gabriel.printFuncionario();
    }
}