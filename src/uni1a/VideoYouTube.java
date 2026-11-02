package uni1a;

// Subclase nueva que hereda de ContenidoAudiovisual
public class VideoYouTube extends ContenidoAudiovisual {
    // Atributos propios de un video de YouTube
    private String canal;
    private long visualizaciones;
    private boolean monetizado;

    // Constructor que inicializa los datos base y los propios
    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, long visualizaciones, boolean monetizado) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.visualizaciones = visualizaciones;
        this.monetizado = monetizado;
    }

    // Getters
    public String getCanal() { return canal; }
    public long getVisualizaciones() { return visualizaciones; }
    public boolean isMonetizado() { return monetizado; }

    // Muestra los detalles del video en consola
    @Override
    public void mostrarDetalles() {
        System.out.println("Video de YouTube: " + getTitulo());
        System.out.println("  Duración: " + getDuracionEnMinutos() + " min | Categoría: " + getGenero());
        System.out.println("  Canal: " + canal + " | Vistas: " + visualizaciones + " | Monetizado: " + (monetizado ? "Sí" : "No"));
    }
}