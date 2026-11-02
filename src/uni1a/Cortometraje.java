package uni1a;

// Subclase nueva que hereda de ContenidoAudiovisual
public class Cortometraje extends ContenidoAudiovisual {
    // Atributos propios de un cortometraje
    private String director;
    private String festivalPremiado;
    private boolean esAnimacion;

    // Constructor
    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director, String festivalPremiado, boolean esAnimacion) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.festivalPremiado = festivalPremiado;
        this.esAnimacion = esAnimacion;
    }

    // Getters
    public String getDirector() { return director; }
    public String getFestivalPremiado() { return festivalPremiado; }
    public boolean isEsAnimacion() { return esAnimacion; }

    // Muestra los detalles del cortometraje en consola
    @Override
    public void mostrarDetalles() {
        System.out.println("Cortometraje: " + getTitulo());
        System.out.println("  Duración: " + getDuracionEnMinutos() + " min | Género: " + getGenero());
        System.out.println("  Director: " + director + " | Festival: " + festivalPremiado + " | Animación: " + (esAnimacion ? "Sí" : "No"));
    }
}