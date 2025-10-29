
/**
 * Clase base abstracta para todos los animales del sistema.
 */
public abstract class Animal {

    private String nombre;
    private int edad;
    private static int contadorAnimales = 0;

    public Animal(String nombre, int edad) throws ValidacionException {
        setNombre(nombre);
        setEdad(edad);
        contadorAnimales++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ValidacionException {
        if (edad < 0 || edad > 100) {
            throw new ValidacionException("La edad debe estar entre 0 y 100 años.");
        }
        this.edad = edad;
    }

    protected String generarIDInterno() {
        return "AN-" + contadorAnimales + "-" + nombre.toUpperCase();
    }

    public static int getContadorAnimales() {
        return contadorAnimales;
    }

    public abstract void hacerSonido();
}
