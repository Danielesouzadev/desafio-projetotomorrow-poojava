public class Conta extends Pessoa {

    private int numero;
    private double saldo;
    private boolean status;
    private int pontos;
    private double bonusInicial;


    public Conta(int cpf, String nome, int numero) {
        super(cpf, nome);
        this.numero = numero;
        this.bonusInicial = bonusInicial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getBonusInicial() {
        return bonusInicial;
    }

    public void setBonusInicial(double bonusInicial) {
        this.bonusInicial = bonusInicial;
    }

    public void depositar(double valor) {
        if (!status) {
            System.out.println("A conta está inativa! Depósito não permitido");
            return;
        }
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido");
            return;
        }
        saldo += valor;
        int pontosGanhos = (int) (valor / 100);
        pontos += pontosGanhos;

        System.out.println("Depósito realizado: R$" + valor + "\nSaldo atual: R$" + saldo + ". \nPontos ganhos neste depósito: " + pontosGanhos + ". \nTotal de pontos: " + pontos + "\n====================");
    }

    public void sacar(double valor) {
        if (!status) {
            System.out.println("A conta está inativa! Saque não permitido");
            return; //sai do método
        }
        if (valor <= 0) {
            System.out.println("Valor de saque inválido");
            return;
        }
        if (valor > saldo) {
            System.out.println("Você não possui saldo suficiente. Saldo atual: R$" + saldo + "\n====================");
            return;
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso! \nSaldo atual: R$" + saldo + "\n====================");
    }

    public void fecharConta() {
        if (!isStatus()) {
            System.out.println("A conta já está fechada.");
            return;
        }

        if(getSaldo() > 0){
            System.out.println("Não é possível encerrar a conta. \nSeu saldo é: R$" + saldo + "\nPara encerramento da conta, não pode haver nenhum valor.");
            return;
        } else if (getSaldo() < 0){
            System.out.println("Não é possível encerrar a conta. \nVocê possui saldo negativo de R$" + saldo + "\nPor favor, regularize sua conta!");
        }
        setStatus(false); // É a mesma coisa de status = false
        System.out.println("Conta de " + getNome() + " foi encerrada com sucesso.");

    }

}