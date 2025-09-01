import br.com.moovi.calculos.CalculadoraDeTempo;
import br.com.moovi.modelos.Filme;
import br.com.moovi.modelos.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setName("Creed: Nascido para lutar.");
        filme.setBiografia("Adonis Johnson decide entrar no mundo do boxe e convence Rocky Balboa a ser seu treinador. Enquanto um luta pela glória, o outro luta pela vida.");
        filme.setGenero("Ação");
        filme.setDuracaoMin(127);
        filme.setAvaliacao(7.6);
        filme.setLancamento(2016);
        filme.setIdadeMin(12);

        filme.exibeFicha();

        filme.avaliar(8);
        filme.avaliar(10);
        filme.avaliar(9);

        System.out.println("Total de Avaliação: " + filme.getTotalAvaliacoes());
        System.out.println("Avaliação: " + filme.pegaMedia() + "\n");

        Serie serie = new Serie();

        serie.setName("Teen Wolf");
        serie.setBiografia("Scott McCall, um estudante do ensino médio que é mordido por um lobisomem e precisa aprender a controlar seus novos poderes enquanto protege a cidade de Beacon Hills de criaturas sobrenaturais e outras ameaças, tudo isso enquanto tenta manter sua vida normal e esconder sua condição de lobisomem. ");
        serie.setGenero("Ação e Terror");
        serie.setIdadeMin(14);
        serie.setLancamento(2011);
        serie.setAvaliacao(7.7);

        serie.exibeFicha();

        serie.setTemporadas(6);
        serie.setEpisodiosPorTemporada(16);
        serie.setMinPorEps(50);
        System.out.println("Duração para maratonar: " + serie.getDuracaoMin());

        Filme outroFilme = new Filme();

        outroFilme.setName("Velozes Furiosos");
        outroFilme.setBiografia("Um agente oferece ajuda para cuidar de Shaw em troca do resgate de um \"hacker\". Dessa vez, não se trata apenas de velocidade: a corrida é pela sobrevivência.");
        outroFilme.setGenero("Ação");
        outroFilme.setDuracaoMin(145);
        outroFilme.setAvaliacao(7.1);
        outroFilme.setLancamento(2015);
        outroFilme.setIdadeMin(12);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());


    }
}