public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldo;
    private boolean status;

    //Método para mostrar os dados da conta.
    public void statusConta() {
        System.out.println("----------------------------------");
        System.out.println("Dono(a) da conta: " + this.getDonoConta());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipoConta());
        System.out.println("Saldo disponível: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }

    //Se o usuário abrir uma Conta Corrente (CC), recebe R$50,00 de saldo, se optar por Conta Poupança (CP),
    // recebe R$ 150,00.
    public void abrirConta(String tc) {
        this.setTipoConta(tc);
        this.setStatus(true);
        if (tc.equals("CC")) {
            this.setSaldo(50);
        } else if (tc.equals("CP")){
            this.setSaldo(150);
        }
    }

    //Para fechar a conta, o(a) dono(a) não pode estar com saldo negativo ou positivo, deve ser igual a zero.
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Erro, retire seu saldo atual: ");
        } else if (this.getSaldo() < 0) {
            System.out.println("Erro, pague sua pendência ");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso! ");
        }
    }

    //Depositar saldo, e efetuar a soma do depósito com o saldo e mostrar o nome do dono(a) da conta.
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito efetuado com sucesso na conta de " + this.getDonoConta());
        } else {
            System.out.println("Não é possível depositar em uma conta fechada! ");
        }
    }

    //Para sacar, usuário precisar ter uma conta e saldo suficiente referente ao valor de saque desejado.
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque efetuado com sucesso! ");
            } else {
                System.out.println("Erro, saldo insuficiente! ");
            }
        } else {
            System.out.println("Erro, não é possível sacar de uma conta fechada! ");
        }
    }

    //Para pagar a mensalidade, será descontado do saldo um valor referente ao tipo de conta.
    public void pagarMensal() {
        int v = 0;
        if (this.getTipoConta() == "Conta Corrente") {
            v = 12;
        } else if (this.getTipoConta() == "Conta Poupança") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso! ");
        } else {
            System.out.println("Erro, não é possível pagar mensalidade de uma conta fechada! ");
        }
    }

    //Construtor
    public ContaBanco() {
    }

    //Getters e Setters
    public void setNumConta(int nc) {
        this.numConta = nc;
    }
    public int getNumConta() {
        return this.numConta;
    }

    public void setTipoConta(String tc) {
        this.tipoConta = tc;
    }
    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setDonoConta(String dc) {
        this.donoConta = dc;
    }
    public String getDonoConta() {
        return this.donoConta;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }
    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    public boolean getStatus() {
        return this.status;
    }
}