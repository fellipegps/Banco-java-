package Banco;

class ContaDebEspecial extends Conta {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void debitar(double valor) {
        if (valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo e limite insuficientes para débito de R$ " + valor);
        }
    }
}
