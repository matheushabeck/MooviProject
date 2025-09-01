package Exercicio1;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria myconta = new ContaBancaria();

        myconta.setNumeroConta(1510);
        myconta.setSaldo(1500);
        myconta.titular = "Matheus";

        System.out.println("Número da conta: " + myconta.getNumeroConta());
        System.out.println("Saldo da conta: " + myconta.getSaldo());
        System.out.println("Titular: " + myconta.titular);

        myconta.setSaldo(2000);
        System.out.println("Novo saldo:" + myconta.getSaldo());

    }
}
