package lista_3.exec_5;

public class ContaTeste {
    double saldo = 0;

    public void deposita(double money) {
        this.saldo += money;
    }

    public double pegaSaldo() {
        return this.saldo;
    }

    public boolean sacar(double money) {
        if((money > this.saldo) && (money > 0)) return false;
        else {
            saldo -= money;
            return true;
        }
    }

    /* deposita(double)
     * pegaSaldo: double
     * sacar(double): boolean
     */

    public void Teste(ContaTeste conta) {
        System.out.println("\n\nTeste da Conta");
        conta.deposita(400);
        if(conta.pegaSaldo() == 300) {
            System.out.println("\033[32mTeste: 1");
        }
        else System.out.println("\033[31mTeste: 1");

        if(conta.sacar(500)) System.out.println("\033[32mTeste: 2");
        else System.out.println("\033[31mTeste: 2");

    /*------------------------------------------------------------------------*/

        if(conta.sacar(250)) System.out.println("\033[32mTeste: 3");
        else System.out.println("\033[31mTeste: 3");

        if(conta.pegaSaldo() == 150) {
            System.out.println("\033[32mTeste: 4");
        }
        else System.out.println("\033[31mTeste: 4");

        conta.deposita(100);
        if(conta.pegaSaldo() == 250) {
            System.out.println("\033[32mTeste: 5\033[m");
        }
        else System.out.println("\033[31mTeste: 5\033[m");
    }
}
