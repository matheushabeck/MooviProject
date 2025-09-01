package br.com.moovi.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minPorEps;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinPorEps() {
        return minPorEps;
    }

    public void setMinPorEps(int minPorEps) {
        this.minPorEps = minPorEps;
    }

    @Override
    public int getDuracaoMin() {
        return temporadas * episodiosPorTemporada * minPorEps;
    }
}
