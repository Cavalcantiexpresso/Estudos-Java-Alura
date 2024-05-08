import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screnmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screnmatch.calculos.FiltroRecomendacao;


public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome( "Crônicas de Nárdia" );
        meuFilme.setAnoDeLancamento(2005);
        meuFilme.setDuracaoEmMinutos(143);



        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.ExibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(25);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome( "Avatar" );
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);



    }
}