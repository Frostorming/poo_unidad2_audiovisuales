package uni1a;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documental: " + getTitulo());
        System.out.println("  Duración: " + getDuracionEnMinutos() + " min | Género: " + getGenero() + " | Tema: " + tema);
        System.out.println("  Investigador responsable (Asociación):");
        if (investigador != null) {
            System.out.println("    • " + investigador);
        } else {
            System.out.println("    • Sin investigador asignado.");
        }
    }
}