# poo_unidad2_audiovisuales

# Sistema de Gestión de Contenidos Audiovisuales (POO - Unidad 2)

**Estudiante:** Angel Steeven Flores Coronado  
**Carrera:** Desarrollo de Software  
**Materia:** Programación Orientada a Objetos  
**Institución:** Universidad Politécnica Salesiana  

---

## 📌 Descripción del Proyecto
Este proyecto es una aplicación desarrollada en Java para la gestión integral de un catálogo de contenidos audiovisuales. Amplía el código base original aplicando conceptos avanzados de Programación Orientada a Objetos (POO), implementando relaciones semánticas entre entidades y demostrando el polimorfismo dinámico en tiempo de ejecución.

---

## 🏗️ Clases y Relaciones Implementadas

### 1. Clases Base
* **`ContenidoAudiovisual` (Clase Abstracta):** Define los atributos comunes (`id`, `titulo`, `duracionEnMinutos`, `genero`) y el método abstracto `mostrarDetalles()`.

### 2. Nuevas Clases de Soporte y Relaciones
* **`Actor` (Relación de Agregación con `Pelicula`):** Gestiona el elenco de actores con nombre, papel y nacionalidad. La película contiene una lista de actores (`List<Actor>`), los cuales existen independientemente de la película.
* **`Temporada` (Relación de Composición con `SerieDeTV`):** Modela cada temporada con número, cantidad de episodios y título. Pertenecen estrictamente a la serie; si la serie se destruye, sus temporadas se eliminan simultáneamente.
* **`Investigador` (Relación de Asociación con `Documental`):** Representa al experto científico que asesora el documental, con nombre, especialidad e institución.

### 3. Nuevas Subclases Creadas
* **`VideoYouTube` (Hereda de `ContenidoAudiovisual`):** Modela producciones digitales con canal, visualizaciones y estado de monetización.
* **`Cortometraje` (Hereda de `ContenidoAudiovisual`):** Representa cortometrajes cinematográficos con director, festivales premiados y técnica de animación.

---

## 📂 Estructura del Proyecto
```text
AudioVisual/
├── src/
│   ├── poo/
│   │   └── PruebaAudioVisual.java    # Clase principal con el método main
│   └── uni1a/
│       ├── ContenidoAudiovisual.java # Superclase abstracta
│       ├── Pelicula.java             # Subclase con agregación de Actor
│       ├── SerieDeTV.java            # Subclase con composición de Temporada
│       ├── Documental.java           # Subclase con asociación de Investigador
│       ├── Actor.java                # Clase auxiliar
│       ├── Temporada.java            # Clase auxiliar
│       ├── Investigador.java         # Clase auxiliar
│       ├── VideoYouTube.java         # Nueva subclase
│       └── Cortometraje.java         # Nueva subclase
└── README.md                         # Documentación del proyecto
