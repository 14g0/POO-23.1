public class Funcionario {
    private String nome = "";

    private double salarioHora = 0, horasTrabalhadasMes = 0;
    double salarioHoraMinimo = 0;

    private int ID_FUNC = -1, proxID = -1;

    /*----------------------------------------------------------*/

    Funcionario(String nome) {
        this.nome = nome;
    }

    Funcionario(String nome, double salarioHM) {
        this.nome = nome;
        this.salarioHoraMinimo = salarioHM;
    }

    /*----------------------------------------------------------*/

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return ID_FUNC;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    /*----------------------------------------------------------*/

    public double calculaSalarioMes() {
        double salarioHora = this.salarioHora;

        return salarioHora;
    }

    public void atualizaNome(String nome) {
        this.nome = nome;
    }
}
