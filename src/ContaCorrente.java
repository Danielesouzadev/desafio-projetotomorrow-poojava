public class ContaCorrente extends Conta {

    private String tipo = "Corrente";

    public ContaCorrente(int cpf, String nome, int numero, String tipo) {
        super(cpf, nome, numero);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static ContaCorrente abrirContaCorrente (int cpf, String nome, int numero){
        ContaCorrente contaCorrente = new ContaCorrente(cpf,nome,numero,"Corrente");
        contaCorrente.setStatus(true);
        contaCorrente.setBonusInicial(50.0);
        contaCorrente.setSaldo(contaCorrente.getBonusInicial());

        System.out.println("Parabéns, " + contaCorrente.getNome() + "!" + " Sua conta " + contaCorrente.getTipo() + " foi aberta com sucesso! \nVocê ganhou um bônus de R$" + contaCorrente.getBonusInicial() + "\n====================");

        return contaCorrente;
    }

    public void taxaMensal(){
        double taxa = 20.0;

        if (!isStatus()) {
            System.out.println("Conta inativa. Mensalidade não cobrada.");
            return;
        }

        if (getSaldo() < taxa) {
            System.out.println("Saldo insuficiente para cobrar mensalidade. Saldo atual: R$" + getSaldo());
            return;
        }

        setSaldo(getSaldo() - taxa);
        System.out.println("Mensalidade de R$" + taxa + " cobrada. Saldo atual: R$" + getSaldo());

    }

}
