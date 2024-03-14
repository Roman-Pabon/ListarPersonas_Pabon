import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

public class ListarPersonas {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        // Crear 5 personas con nombres y apellidos aleatorios
        personas.add(new Persona("Juan", "García"));
        personas.add(new Persona("María", "Martínez"));
        personas.add(new Persona("Luis", "Pérez"));
        personas.add(new Persona("Ana", "González"));
        personas.add(new Persona("Pedro", "Rodríguez"));

        // Ordenar por nombre
        Collections.sort(personas, Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenado por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        // Ordenar por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        System.out.println("\nOrdenado por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }

        // Ordenar inversamente por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nOrdenado inversamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }
    }
}

