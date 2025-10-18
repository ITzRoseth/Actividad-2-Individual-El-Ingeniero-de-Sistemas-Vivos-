public class Pez extends Animal {
    private String especiePez;
    private String tipoAgua; // Dulce o Salada

    //Constructor
    public Pez() {

    }
    public Pez(String nombre, int edad, String color, String especiePez, String tipoAgua) {
        super(nombre, edad, color);
        this.especiePez = especiePez;
        this.tipoAgua = tipoAgua;
    }

    //Getters y Setters
    public String getEspeciePez() {
        return especiePez;
    }
    public void setEspeciePez(String especiePez) {
        this.especiePez = especiePez;
    }
    public String getTipoAgua() {
        return tipoAgua;
    }
    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    //Metodos
    public void mostrarDatosPez(){
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Color: " + getColor());
        System.out.println("Especie: " + getEspeciePez());
        System.out.println("Tipo de agua: " + getTipoAgua());
    }
    public void nadar() {
        System.out.println("El pez está nadando");
    }
}
