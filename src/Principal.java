import models.Filme;
import models.Series;
import calculos.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) throws Exception {

        Filme favorito = new Filme();
        favorito.setNome("O Poderoso Chefão");
        favorito.setAnoDeLançamento(1970);
        favorito.setDuracaoEmMinutos(180);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Series serie = new Series();
        serie.setNome(“La Casa de Papel”);
serie.setAnoDeLancamento(2017);
serie.setIncluidoNoPlano(true);
serie.setAtiva(true);
serie.setTemporadas(5);
serie.setEpisodiosPorTemporada(10);
serie.setMinutosPorEpisodio(45);

CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
calculadora.inclui(favorito);
calculadora.inclui(outro);
calculadora.inclui(serie);

System.out.println(“Tempo total: “ +calculadora.getTempoTotal());
    }
}
