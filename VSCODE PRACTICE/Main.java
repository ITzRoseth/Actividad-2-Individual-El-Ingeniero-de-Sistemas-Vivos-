
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal para probar el sistema de animales.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el nombre del perro: ");
            String nombrePerro = sc.nextLine();

            System.out.print("Ingrese la edad del perro: ");
            int edadPerro = Integer.parseInt(sc.nextLine());

            System.out.print("Ingrese la raza del perro: ");
            String raza = sc.nextLine();

            Perro perro = new Perro(nombrePerro, edadPerro, raza);
            perro.hacerSonido();

            System.out.print("\nIngrese el nombre del gato: ");
            String nombreGato = sc.nextLine();

            System.out.print("Ingrese la edad del gato: ");
            int edadGato = Integer.parseInt(sc.nextLine());

            System.out.print("Ingrese el color del gato: ");
            String color = sc.nextLine();

            Gato gato = new Gato(nombreGato, edadGato, color);
            gato.hacerSonido();

            System.out.print("\nIngrese el nombre del pez: ");
            String nombrePez = sc.nextLine();

            System.out.print("Ingrese la edad del pez: ");
            int edadPez = Integer.parseInt(sc.nextLine());

            System.out.print("Ingrese el tipo de agua (dulce/salada): ");
            String tipoAgua = sc.nextLine();

            Pez pez = new Pez(nombrePez, edadPez, tipoAgua);
            pez.hacerSonido();

            System.out.println("\nTotal de animales creados: " + Animal.getContadorAnimales());

        } catch (ValidacionException e) {
            System.err.println("Error de validación: " + e.getMessage());
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println("Error: La edad debe ser un número válido.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los datos: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
