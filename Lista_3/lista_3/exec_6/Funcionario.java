package lista_3.exec_6;

public class Funcionario {
    private String nome = "";

    double salarioHoraMinimo = 12.5;
    private double salarioHora = salarioHoraMinimo, horasTrabalhadasMes = 0;
    
    private static int proxID = 1;
    private final int ID_FUNC = proxID;

    /*------------------------ Construtores -------------------------*/

    public Funcionario(String nome) {
        this.nome = nome;
        this.adicionarDiaDeTrabalho(4);
        proxID += 1;
    }

    public Funcionario(String nome, double salarioHM) {
        this.atualizarNome(nome);
        this.atualizarSalarioHora(salarioHM);
        proxID += 1;
    }

    /*----------------------------- Get -----------------------------*/

    public String getNome() { return this.nome; }

    public int getId() { return this.ID_FUNC; }

    public double getSalarioHora() { return this.salarioHora; }

    public int getProxID() { return proxID; }

    /*----------------------------- Set -----------------------------*/
    
    public void atualizarNome(String nome) {
        String[] nomes = nome.split(" ");

        if(nomes.length <= 1) return;
        else {
            for(String i : nomes) {
                if(i.length() < 2) return;
            }
            this.nome = nome;
        }
    }
    
    public void atualizarSalarioHora(double salarioHora) {
        if(salarioHora <= this.salarioHora) return;
        else this.salarioHora = salarioHora;
    }
    
    /*-------------------- Métodos auxiliativos ---------------------*/

    public void reiniciaMesTrabalho() {
        this.horasTrabalhadasMes = 0;
    }
    
    public double calculaSalarioMes() {
        return (this.salarioHora * this.horasTrabalhadasMes);
    }

    public void adicionarDiaDeTrabalho(double horas) {
        if(horas >= 4) this.horasTrabalhadasMes += horas;
        else return;
    }

    public void printFuncionario() {
        System.out.printf("ID:%05d {\n"+
            "\tNome: %s\n"+
            "\tSalario/Hora: %.2f\n"+
            "\tHoras Trabalhadas: %.2f\n"+
            "}\n"
        ,this.ID_FUNC, this.getNome(), this.getSalarioHora(), this.horasTrabalhadasMes);
    }
}