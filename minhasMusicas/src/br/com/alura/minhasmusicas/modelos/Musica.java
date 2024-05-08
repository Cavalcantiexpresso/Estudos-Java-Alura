package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{
    private String Album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        }else {
            return 7;
        }

    }
}
