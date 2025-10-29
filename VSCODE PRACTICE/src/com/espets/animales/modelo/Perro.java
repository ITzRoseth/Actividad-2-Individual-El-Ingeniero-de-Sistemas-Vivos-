
/**
 * Clase que representa un perro.
 */
public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, String raza) throws ValidacionException {
        super(nombre, edad);
        setRaza(raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza == null || raza.trim().isEmpty()) {
            throw new IllegalArgumentException("La raza no puede estar vacía.");
        }
        this.raza = raza.trim();
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau guau!");
    }
}
