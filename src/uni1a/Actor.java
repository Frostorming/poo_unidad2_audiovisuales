package uni1a;

// Representa a un actor que formará parte del elenco de una Película
public class Actor {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String papel;
    private String nacionalidad;

    // Constructor: inicializa los datos del actor
    public Actor(String nombre, String papel, String nacionalidad) {
        this.nombre = nombre;
        this.papel = papel;
        this.nacionalidad = nacionalidad;
    }

    // Getters: permiten leer los atributos
    public String getNombre() { return nombre; }
    public String getPapel() { return papel; }
    public String getNacionalidad() { return nacionalidad; }

    // Muestra los datos del actor en formato de texto
    @Override
    public String toString() {
        return nombre + " (Papel: " + papel + ", País: " + nacionalidad + ")";
    }
}