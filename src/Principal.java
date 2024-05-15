import models.Filme;

public class Principal {
    public static void main(String[] args) throws Exception {
        Filme favorito = new Filme();
        favorito.setNome("O Poderoso Chefão");
        favorito.setAnoDeLançamento(1970);
        favorito.setDuracaoEmMinutos(180);
        favorito.setIncluidoNoPlano(true);

        favorito.exibiFichaTecnica();
        favorito.Avalia(8);
        favorito.Avalia(5);
        favorito.Avalia(10);
        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());

    }
}
