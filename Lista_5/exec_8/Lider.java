package exec_8;
import java.util.ArrayList;
import lista_2.Funcionario;

public class Lider extends Funcionario {

    ArrayList<Funcionario> lista_funcionario = new ArrayList<Funcionario>();

    public Lider() {}

    public boolean adicionaFuncionario() {
        return true;
    }

    public boolean removeFuncionario() {
        return true;
    }

    public double calculaBonificacao() {
        return 2.3;
    }
}