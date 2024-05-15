import models.Exercicio_conta;

public class Exercicio_ContaPoupanca extends Exercicio_conta {

    private double taxaDeJuros;

    public void calcularJuros() {
        double juros = this.getSaldo() * taxaDeJuros;
        System.out.println("Juros Atual: " + juros);
    }

    public void sacar(double valor) {
        double taxaSaque = 0.01;
        super.sacar(valor + taxaSaque);
    }
}
