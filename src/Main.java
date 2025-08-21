//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       ContaPoupanca contaDeJubileu = ContaPoupanca.abrirContaPoupanca(123456789, "Jubileu Souza", 0002);
       contaDeJubileu.depositar(250);
       contaDeJubileu.sacar(100);
       contaDeJubileu.taxaMensal();
       contaDeJubileu.fecharConta();

       ContaCorrente contaDeCreuza = ContaCorrente.abrirContaCorrente(123456789,"Creuza Souza",0003);
       contaDeCreuza.depositar(500);
       contaDeCreuza.sacar(100);
       contaDeCreuza.taxaMensal();
       contaDeCreuza.fecharConta();
    }
}