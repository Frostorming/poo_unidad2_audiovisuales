package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  SISTEMA DE GESTIÓN AUDIOVISUAL - TAREA UNIDAD 2");
        System.out.println("==================================================");

        // 1. Película con actores (Relación de Agregación)
        Pelicula pelicula = new Pelicula("Avatar", 162, "Ciencia Ficción", "20th Century Studios");
        pelicula.agregarActor(new Actor("Sam Worthington", "Jake Sully", "Australiano"));
        pelicula.agregarActor(new Actor("Zoe Saldana", "Neytiri", "Estadounidense"));

        // 2. Serie con temporadas (Relación de Composición)
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasía", 8);
        serie.agregarTemporada(1, 10, "Winter Is Coming");
        serie.agregarTemporada(2, 10, "The North Remembers");

        // 3. Documental con investigador (Relación de Asociación)
        Documental doc = new Documental("Cosmos", 45, "Divulgación Científica", "Astronomía y Astrofísica");
        doc.setInvestigador(new Investigador("Carl Sagan", "Astrofísica", "Universidad de Cornell"));

        // 4. Video de YouTube (Nueva subclase)
        VideoYouTube video = new VideoYouTube("Patrones de Diseño en Java", 24, "Tecnología", "TechCode UPS", 154200, true);

        // 5. Cortometraje (Nueva subclase)
        Cortometraje corto = new Cortometraje("Piper", 6, "Animación / Familiar", "Alan Barillaro", "Premios Óscar 2017", true);

        // Arreglo polimórfico con los 5 tipos de contenido
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = pelicula;
        contenidos[1] = serie;
        contenidos[2] = doc;
        contenidos[3] = video;
        contenidos[4] = corto;

        // Recorrido polimórfico: cada objeto ejecuta su propio mostrarDetalles()
        for (ContenidoAudiovisual contenido : contenidos) {
            System.out.println("--------------------------------------------------");
            contenido.mostrarDetalles();
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println(">> Total de elementos procesados: " + contenidos.length);
        System.out.println(">> Ejecución completada con éxito.");
    }
}