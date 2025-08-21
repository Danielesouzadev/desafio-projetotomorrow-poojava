public class ContaPoupanca extends Conta{
    private String tipo = "Poupança";

    public ContaPoupanca(int cpf, String nome, int numero, String tipo) {
        super(cpf, nome,numero);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static ContaPoupanca abrirContaPoupanca(int cpf, String nome, int numero){
        ContaPoupanca contaPoupanca = new ContaPoupanca(cpf,nome, numero,  "Poupança" );
        contaPoupanca.setStatus(true);
        contaPoupanca.setBonusInicial(150.0);
        contaPoupanca.setSaldo(contaPoupanca.getBonusInicial());

        System.out.println("Parabéns, " + contaPoupanca.getNome() + "!" + " Sua conta " + contaPoupanca.getTipo() + " foi aberta com sucesso! \nVocê ganhou um bônus de R$" + contaPoupanca.getBonusInicial() + "\n====================");

        return contaPoupanca;
    }

    public void taxaMensal(){
        double taxa = 10.0;

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
