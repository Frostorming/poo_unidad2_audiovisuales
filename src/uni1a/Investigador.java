package uni1a;

// Representa al especialista asociado a un Documental
public class Investigador {
    // Atributos privados
    private String nombre;
    private String especialidad;
    private String institucion;

    // Constructor: inicializa los datos del investigador
    public Investigador(String nombre, String especialidad, String institucion) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.institucion = institucion;
    }

    // Getters para consultar los datos
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public String getInstitucion() { return institucion; }

    // Muestra los datos del investigador en formato de texto
    @Override
    public String toString() {
        return nombre + " [" + especialidad + " - " + institucion + "]";
    }
}