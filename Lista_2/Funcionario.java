public class Funcionario {
    private String nome = "";

    double salarioHoraMinimo = 12.5;
    private double salarioHora = salarioHoraMinimo, horasTrabalhadasMes = 0;
    
    private static int proxID = 1;
    private final int ID_FUNC = proxID;

    /*------------------------ Construtores -------------------------*/

    Funcionario(String nome) {
        this.nome = nome;
        proxID += 1;
    }

    Funcionario(String nome, double salarioHM) {
        this.nome = nome;
        this.salarioHoraMinimo = salarioHM;
        proxID += 1;
    }

    /*----------------------------- Get -----------------------------*/

    public String getNome() { return this.nome; }

    public int getId() { return this.ID_FUNC; }

    public double getSalarioHora() { return this.salarioHora; }

    public int getProxID() { return proxID; }

    /*----------------------------- Set -----------------------------*/
    
    public void atualizaNome(String nome) {
        String[] nomes = nome.split(" ");

        if(nomes.length <= 1) {
            System.out.printf("\033[32mNome inválido\033[m");
        }
        else {
            for(String i : nomes) {
                if(i.length() < 2) {
                    System.out.println("Nome inválido");
                    return;
                }
            }
            this.nome = nome;
        }
    }
    
    public void atualizaSalarioHora(double salarioHora) {
        if(salarioHora <= this.salarioHora) {
            System.out.println("Salário menor ou igual ao antigo.");
        }
        else this.salarioHora = salarioHora;
    }
    
    /*-------------------- Métodos auxiliativos ---------------------*/

    public void reiniciaMesTrabalho() {
        this.horasTrabalhadasMes = 0;
    }
    
    public double calculaSalarioMes() {
        return (this.salarioHora * this.horasTrabalhadasMes);
    }

    public void adicionaDiaDeTrabalho(double horas) {
        if(horas >= 4) this.horasTrabalhadasMes += horas;
        else System.out.println("Hora não computada, minímo de 4h.");
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