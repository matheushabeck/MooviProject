package br.com.moovi.calculos;

import br.com.moovi.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoMin();
    }
}
