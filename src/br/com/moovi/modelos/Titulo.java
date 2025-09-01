package br.com.moovi.modelos;

public class Titulo {
    private String name;
    private int Lancamento;
    private String Biografia;
    private String Genero;
    private int duracaoMin;
    private double Avaliacao;
    private int idadeMin;

    private boolean incluidoPlano;

    private double somaAvaliacoes;
    private int totalAvaliacoes;


    public String getName() {
        return name;
    }

    public int getLancamento() {
        return Lancamento;
    }

    public String getBiografia() {
        return Biografia;
    }

    public String getGenero() {
        return Genero;
    }

    public double getAvaliacao() {
        return Avaliacao;
    }

    public int getIdadeMin() {
        return idadeMin;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLancamento(int lancamento) {
        this.Lancamento = lancamento;
    }

    public void setBiografia(String biografia) {
        this.Biografia = biografia;
    }

    public void setGenero(String genero) {
        this.Genero = genero;
    }

    public void setAvaliacao(double avaliacao) {
        this.Avaliacao = avaliacao;
    }

    public void setIdadeMin(int idadeMin) {
        this.idadeMin = idadeMin;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public void exibeFicha(){
        System.out.println("Título: " + name);
        System.out.println("Biografia: " + Biografia);
        System.out.println("Genêro: " + Genero);
        System.out.println("Duração: " + duracaoMin);
        System.out.println("Classificação indicativa: " + idadeMin);
        System.out.println("Data de lançamento: " + Lancamento);
        System.out.println("IMDb: " + Avaliacao);
    }

    public void avaliar(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes ++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }

}
