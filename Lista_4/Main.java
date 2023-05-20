public class Main {
    public static void main(String[] args) {
        Funcionario iago = new Funcionario("Iago C.", 25);
        Funcionario gabriel = iago.clone();

        System.out.println(iago.equals(gabriel));

        iago.printFuncionario();
        gabriel.printFuncionario();
    } 
}