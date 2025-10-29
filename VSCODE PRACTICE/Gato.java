
/**
 * Clase que representa un gato.
 */
public class Gato extends Animal {

    private String color;

    public Gato(String nombre, int edad, String color) throws ValidacionException {
        super(nombre, edad);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("El color no puede estar vacío.");
        }
        this.color = color.trim();
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau miau!");
    }
}
