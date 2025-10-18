public class Perro extends Animal {
    private String razaPerro;
    private boolean esAdiestrado;
    
    //Constructor
    public Perro() {
    
    }
    public Perro(String nombre, int edad, String color, String razaPerro, boolean esAdiestrado) {
        super(nombre, edad, color);
        this.razaPerro = razaPerro;
        this.esAdiestrado = esAdiestrado;
    }

    //Getters y Setters
    public String getRazaPerro() {
        return razaPerro;
    }
    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }
    public boolean isEsAdiestrado() {
        return esAdiestrado;
    }
    public void setEsAdiestrado(boolean esAdiestrado) {
        this.esAdiestrado = esAdiestrado;
    }

    //Metodos
    public void mostrarDatosPerro(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Color: " + getColor());
        System.out.println("Raza: " + getRazaPerro());
        System.out.println("Adiestrado: " + isEsAdiestrado());
    }
    
    public void ladrar() {
        System.out.println("El perro está ladrando");
    }
}
