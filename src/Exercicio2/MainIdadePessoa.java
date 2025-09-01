package Exercicio2;

public class MainIdadePessoa {
    public static void main(String[] args) {
        idadePessoa pessoa1 = new idadePessoa();

        pessoa1.setNome("Matheus");
        pessoa1.setIdade(22);

        idadePessoa pessoa2 = new idadePessoa();

        pessoa2.setNome("Eric");
        pessoa2.setIdade(16);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade());
        pessoa1.vereficarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade());
        pessoa2.vereficarIdade();
    }
}
