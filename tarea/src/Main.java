
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        int opcionElegida = opciones();
        switch (opcionElegida) {

            case 1:
            mostrarSaludo();
            case 2:
            saludar();
            case 3:
            System.out.println("¡Ahora calculemos el area de un triangulo!");

            Scanner teclado = new Scanner(System.in);

            System.out.print("Ingresá su altura: ");
            int altura = teclado.nextInt();
            System.out.print("Ingresá su base: ");
            int base = teclado.nextInt();

            System.out.println("El area de su rectangulo es: " + calcularAreaTriangulo(base, altura));
            case 4:
            mayusculas();
            case 5:
                esPar();
            break;

        }
    }

    //Metodos
//1. Mostrar mensaje fijo
    public static void mostrarSaludo()
    {
        System.out.println("¡Hola mundo!");
    }
//2. Saludo personalizado



    public static void saludar()
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresá tu nombre: ");

        String nombreIngresado = teclado.nextLine();
        System.out.println("¡Hola " + nombreIngresado + "!!!");

    }
    //3. Área de un rectángulo
    public static double calcularAreaTriangulo(double base, double altura)
    {
    return (base * altura);
    }
    //4. Convertir a mayúsculas
    public static void mayusculas()
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresá tu oracion: ");

        String oracion = teclado.nextLine();
        //String oracionEnMayuscula = oracion.toUpperCase()
        System.out.println(oracion.toUpperCase());

    }
    //5. Mostrar menú
    public static int opciones() {
        System.out.print("Elija una opcion: \n1-Saludar\n2-Saludarte\n3-Calcular area de rectangulo\n4-convertir todo a minuscula\n5-Es Par??\nESCRIBE UNA!!!::");
        Scanner teclado = new Scanner(System.in);


        int opcion = teclado.nextInt();
        return opcion;
    }
    //6. Número par o impar
    public static int esPar() {
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        int par = numero % 2;
        if (par == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
        
        return numero;
    }
}
