package uni1a;

// Representa una temporada que formará parte de una SerieDeTV
public class Temporada {
    // Atributos privados
    private int numeroTemporada;
    private int cantidadEpisodios;
    private String tituloTemporada;

    // Constructor: inicializa los datos de la temporada
    public Temporada(int numeroTemporada, int cantidadEpisodios, String tituloTemporada) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadEpisodios = cantidadEpisodios;
        this.tituloTemporada = tituloTemporada;
    }

    // Getters para consultar los datos
    public int getNumeroTemporada() { return numeroTemporada; }
    public int getCantidadEpisodios() { return cantidadEpisodios; }
    public String getTituloTemporada() { return tituloTemporada; }

    // Muestra los datos de la temporada en formato de texto
    @Override
    public String toString() {
        return "Temporada " + numeroTemporada + ": '" + tituloTemporada + "' (" + cantidadEpisodios + " episodios)";
    }
}