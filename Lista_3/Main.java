import lista_3.exec_5.ContaTeste;
import lista_3.exec_6.Funcionario;
import lista_3.exec_6.FuncionarioTeste;

public class Main {
    public static void main(String[] args) {

        Funcionario iago = new Funcionario("Iago C", 11);
        Funcionario rafaela = new Funcionario("Rafaela Brum");

        ContaTeste conta = new ContaTeste();

        new FuncionarioTeste().Teste(iago, rafaela);
        new ContaTeste().Teste(conta);
    }
}
