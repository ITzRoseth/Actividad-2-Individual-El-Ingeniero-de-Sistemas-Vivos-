import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("----------------------- Sistema de adopción de animales -----------------------");
        System.out.println("Ingrese el tipo de animal a adoptar (Perro/Gato/Pez): ");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Pez");
        System.out.print("Seleccione un opcion: " );
        int tipoAnimal = scan.nextInt();
        scan.nextLine(); // Consumir el salto de línea pendiente

        switch (tipoAnimal) {
            case 1:
                System.out.println("--- Datos del Perro ---");
                System.out.print("Ingrese el nombre del perro: ");
                String nombrePerro = scan.nextLine();
                System.out.print("Ingrese la edad del perro: ");
                int edadPerro = scan.nextInt();
                scan.nextLine(); // Consumir el salto de línea pendiente
                System.out.print("Ingrese el color del perro: ");
                String colorPerro = scan.nextLine();
                System.out.print("Ingrese la raza del perro: ");
                String razaPerro = scan.nextLine();
                System.out.print("¿El perro está adiestrado? (true/false): ");
                boolean esAdiestrado = scan.nextBoolean();
                
                Perro perro = new Perro(nombrePerro, edadPerro, colorPerro, razaPerro, esAdiestrado);
                
                System.out.println("\n--- Datos del Perro Adoptado ---");
                perro.mostrarDatosPerro();

                break;
            case 2:
                System.out.println("--- Datos del Gato ---");
                System.out.print("Ingrese el nombre del gato: ");
                String nombreGato = scan.nextLine();
                System.out.print("Ingrese la edad del gato: ");
                int edadGato = scan.nextInt();
                scan.nextLine(); // Consumir el salto de línea pendiente
                System.out.print("Ingrese el color del gato: ");
                String colorGato = scan.nextLine();
                System.out.print("Ingrese la raza del gato: ");
                String razaGato = scan.nextLine();
                System.out.print("¿El gato es de interior? (true/false): ");
                boolean esDeInterior = scan.nextBoolean();

                Gato gato = new Gato(nombreGato, edadGato, colorGato, razaGato, esDeInterior);
                
                System.out.println("---- Datos del Gato Adoptado ---");
                gato.mostrarDatosGato();
                break;
            case 3:
                System.out.println("--- Datos del Pez ---");
                System.out.println("Ingrese el nombre del pez: ");
                String nombrePez = scan.nextLine();
                System.out.println("Ingrese la edad del pez: ");
                int edadPez = scan.nextInt();scan.nextLine(); 
                System.out.println("Ingrese el color del pez:");
                String colorPez = scan.nextLine();
                System.out.println("Ingrese la especie del pez: ");
                String especiePez = scan.nextLine();
                System.out.println("Ingrese el tipo de agua (Dulce/Salada): ");
                String tipoAgua = scan.nextLine();

                Pez pez = new Pez(nombrePez, edadPez, colorPez, especiePez, tipoAgua);
                System.out.println("\n--- Datos del Pez Adoptado ---");
                pez.mostrarDatosPez();
                break;
            case 4:
                System.out.println("Saliendo del sistema de adopción. ¡Hasta luego!");
                break;  
            default:
                System.out.println("Opción no válida. Por favor, seleccione 1, 2 o 3.");
                break;
        }
        scan.close();
    }
}
