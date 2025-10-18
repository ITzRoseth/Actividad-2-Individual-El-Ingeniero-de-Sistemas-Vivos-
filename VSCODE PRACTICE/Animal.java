public class Animal {

    //Atributos
    private String nombre;
    private int edad;
    private String color;

    //Constructores
    public Animal() {

    }

    public Animal(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
    //Metodos
    public void comer() {
        System.out.println("El animal está comiendo");
    }

}
