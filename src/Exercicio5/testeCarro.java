package Exercicio5;

public class testeCarro {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();
        carro.definirModelo("Sedan");
        carro.definirPrecos(30000, 32000, 35000);
        carro.exibirInfo();
    }
}
