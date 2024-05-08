package br.com.alura.screnmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if(classificavel.getclassificacao() >= 4){
            System.out.println("Está entre os Preferidos no momento!");
        } else if (classificavel.getclassificacao() >= 2) {
            System.out.println("Muito bem avaliado!");
        }else {
            System.out.println("Coloque em sua lista para assistir depois");
        }
    }
}
