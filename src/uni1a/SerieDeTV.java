package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase que hereda de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    // Relación de COMPOSICIÓN: las temporadas pertenecen a la serie
    private List<Temporada> temporadas;

    // Constructor (mantiene compatibilidad con el código original)
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int numTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    }

    // Composición: la serie crea y agrega directamente su temporada
    public void agregarTemporada(int numTemporada, int episodios, String titulo) {
        temporadas.add(new Temporada(numTemporada, episodios, titulo));
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    // Muestra los detalles de la serie y sus temporadas
    @Override
    public void mostrarDetalles() {
        System.out.println("Serie de TV: " + getTitulo());
        System.out.println("  Duración promedio por cap: " + getDuracionEnMinutos() + " min | Género: " + getGenero());
        System.out.println("  Temporadas registradas (Composición):");
        if (temporadas.isEmpty()) {
            System.out.println("    - Sin temporadas registradas.");
        } else {
            for (Temporada t : temporadas) {
                System.out.println("    • " + t);
            }
        }
    }
}