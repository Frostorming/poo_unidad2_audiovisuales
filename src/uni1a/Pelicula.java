package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase que hereda de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    
    // Relación de AGREGACIÓN: una película tiene una lista de actores
    private List<Actor> elenco;

    // Constructor
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.elenco = new ArrayList<>(); // Inicializamos la lista vacía
    }

    // Método para sumar un actor al elenco de la película
    public void agregarActor(Actor actor) {
        elenco.add(actor);
    }

    public List<Actor> getElenco() {
        return elenco;
    }

    // Muestra los detalles de la película y su elenco
    @Override
    public void mostrarDetalles() {
        System.out.println("Película: " + getTitulo());
        System.out.println("  Duración: " + getDuracionEnMinutos() + " min | Género: " + getGenero() + " | Estudio: " + estudio);
        System.out.println("  Elenco de Actores (Agregación):");
        if (elenco.isEmpty()) {
            System.out.println("    - Sin actores asignados.");
        } else {
            for (Actor a : elenco) {
                System.out.println("    • " + a);
            }
        }
    }
}