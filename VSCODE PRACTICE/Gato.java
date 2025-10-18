public class Gato extends Animal {
    private String razaGato;
    private boolean esDeInterior;

    //Constructor
    public Gato() {
    
    }
    public Gato(String nombre, int edad, String color, String razaGato, boolean esDeInterior) {
        super(nombre, edad, color);
        this.razaGato = razaGato;
        this.esDeInterior = esDeInterior;
    }


    //Getters y Setters
    public String getRazaGato() {
        return razaGato;
    }
    public void setRazaGato(String razaGato) {
        this.razaGato = razaGato;
    }
    public boolean isEsDeInterior() {
        return esDeInterior;
    }
    public void setEsDeInterior(boolean esDeInterior) {
        this.esDeInterior = esDeInterior;
    }

    //Metodos
    public void mostrarDatosGato(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Color: " + getColor());
        System.out.println("Raza: " + getColor());
        System.out.println("Es de interior: " + isEsDeInterior());
    }

    public void maullar() {
        System.out.println("El gato está maullando");
    }
}
