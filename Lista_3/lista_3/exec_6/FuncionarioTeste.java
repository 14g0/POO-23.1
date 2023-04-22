package lista_3.exec_6;

public class FuncionarioTeste {

    public void Teste(Funcionario func1, Funcionario func2) {

        /* Testes errados para o primeiro funcionário */
    /*------------------------------------------------------------------------*/
        if(func1.getNome().equals("Iago Cesar")) {
            System.out.println("\033[32mTeste: 1");
        }
        else System.out.println("\033[31mTeste: 1");
    /*------------------------------------------------------------------------*/
        if(func1.getId() == 0) {
            System.out.println("\033[32mTeste: 2");
        }
        else System.out.println("\033[31mTeste: 2");
    /*------------------------------------------------------------------------*/
        if(func1.getProxID() == 2) {
            System.out.println("\033[32mTeste: 3");
        }
        else System.out.println("\033[31mTeste: 3");
    /*------------------------------------------------------------------------*/
        if(func1.getSalarioHora() == 11) {
            System.out.println("\033[32mTeste: 4");
        }
        else System.out.println("\033[31mTeste: 4");
    /*------------------------------------------------------------------------*/
        if(func1.calculaSalarioMes() != 0) {
            System.out.println("\033[32mTeste: 5");
        }
        else System.out.println("\033[31mTeste: 5");
    /*------------------------------------------------------------------------*/
        func1.atualizarNome("Jose");
        if(func1.getNome().equals("Jose D")) {
            System.out.println("\033[32mTeste: 6");
        }
        else System.out.println("\033[31mTeste: 6");
    /*------------------------------------------------------------------------*/
        func1.reiniciaMesTrabalho();
        if(func1.calculaSalarioMes() != 0) {
            System.out.println("\033[32mTeste: 7");
        }
        else System.out.println("\033[31mTeste: 7");




    
        /* Testes certos para o segundo funcionário */
    /*------------------------------------------------------------------------*/
        if(func2.getNome().equals("Rafaela Brum")) {
            System.out.println("\033[32mTeste: 1");
        }
        else System.out.println("\033[31mTeste: 1");
    /*------------------------------------------------------------------------*/
        if(func2.getId() == 2) {
            System.out.println("\033[32mTeste: 2");
        }
        else System.out.println("\033[31mTeste: 2");
    /*------------------------------------------------------------------------*/
        if(func2.getProxID() == 3) {
            System.out.println("\033[32mTeste: 3");
        }
        else System.out.println("\033[31mTeste: 3");
    /*------------------------------------------------------------------------*/
        if(func2.getSalarioHora() == 12.5) {
            System.out.println("\033[32mTeste: 4");
        }
        else System.out.println("\033[31mTeste: 4");
    /*------------------------------------------------------------------------*/
        if(func2.calculaSalarioMes() == 12.5*4) {
            System.out.println("\033[32mTeste: 5");
        }
        else System.out.println("\033[31mTeste: 5");
    /*------------------------------------------------------------------------*/
        func2.atualizarNome("Jose T.");
        if(func2.getNome().equals("Jose T.")) {
            System.out.println("\033[32mTeste: 6");
        }
        else System.out.println("\033[31mTeste: 6");
    /*------------------------------------------------------------------------*/
        func2.reiniciaMesTrabalho();
        if(func2.calculaSalarioMes() == 0) {
            System.out.println("\033[32mTeste: 7");
        }
        else System.out.println("\033[31mTeste: 7");
    /*------------------------------------------------------------------------*/
        func2.adicionarDiaDeTrabalho(6);
        if(func2.calculaSalarioMes() == 12.5*6) {
            System.out.println("\033[32mTeste: 8");
        }
        else System.out.println("\033[31mTeste: 8");
    /*------------------------------------------------------------------------*/
        func2.atualizarSalarioHora(20);
        if(func2.calculaSalarioMes() == 20*6) {
            System.out.println("\033[32mTeste: 9\033[m");
        }
        else System.out.println("\033[31mTeste: 9\033[m");
    /*------------------------------------------------------------------------*/
    
    }
}