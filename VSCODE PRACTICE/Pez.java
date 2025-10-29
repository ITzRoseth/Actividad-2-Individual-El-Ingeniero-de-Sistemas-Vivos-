
/**
 * Clase que representa un pez.
 */
public class Pez extends Animal {

    private String tipoAgua; // dulce o salada

    public Pez(String nombre, int edad, String tipoAgua) throws ValidacionException {
        super(nombre, edad);
        setTipoAgua(tipoAgua);
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        if (tipoAgua == null || tipoAgua.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de agua no puede estar vacío.");
        }
        this.tipoAgua = tipoAgua.trim();
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace burbujas... ¡blup blup!");
    }
}
