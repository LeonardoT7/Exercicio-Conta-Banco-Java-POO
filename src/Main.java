public class Main{
    public static void main(String[] args) {
        //Criando a primeira conta, do tipo "Corrente".
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("CC");
        p1.setDonoConta("Bruce Wayne");
        p1.setNumConta(12345678);
        p1.setStatus(true);

        //Criando uma segunda conta, do tipo "Poupança".
        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("CP");
        p2.setDonoConta("Selina Kyle");
        p2.setNumConta(87654321);
        p2.setStatus(true);

        //Método de depositar saldo na primeira conta.
        p1.depositar(50);
        //Método para sacar saldo da segunda conta.
        p2.sacar(100);
        //Método para tentar sacar um valor acima do saldo atual da primeira conta.
        p1.sacar(700);

        //Método para mostrar dados das contas na tela.
        p1.statusConta();
        p2.statusConta();
    }
}