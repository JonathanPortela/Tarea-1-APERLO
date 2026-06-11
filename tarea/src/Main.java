
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int opcionWhile = 879876876;
        System.out.println("Para finalizar el programa pongale 0");
        while (opcionWhile != 0) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Que vamos a hacer?");
            int opcionElegida = opciones();
            opcionWhile = opcionElegida;
            switch (opcionElegida) {

                case 1:
                    mostrarSaludo();
                case 2:
                    saludar();
                case 3:
                    System.out.println("¡Ahora calculemos el area de un triangulo!");


                    System.out.print("Ingresá su altura: ");
                    int altura = teclado.nextInt();
                    System.out.print("Ingresá su base: ");
                    int base = teclado.nextInt();

                    System.out.println("El area de su rectangulo es: " + calcularAreaTriangulo(base, altura));
                case 4:
                    mayusculas();
                case 5:
                    esPar();
                case 6:
                    cuadradoDeUnNumero();
                case 7:
                    factorial();
                case 8:
                    sumaDeEnteros();
                    break;

            }
        }
    }

    //Metodos
//1. Mostrar mensaje fijo
    public static void mostrarSaludo() {
        System.out.println("¡Hola mundo!");
    }
//2. Saludo personalizado


    public static void saludar() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresá tu nombre: ");

        String nombreIngresado = teclado.nextLine();
        System.out.println("¡Hola " + nombreIngresado + "!!!");

    }

    //3. Área de un rectángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura);
    }

    //4. Convertir a mayúsculas
    public static void mayusculas() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresá tu oracion: ");

        String oracion = teclado.nextLine();
        //String oracionEnMayuscula = oracion.toUpperCase()
        System.out.println(oracion.toUpperCase());

    }

    //5. Mostrar menú
    public static int opciones() {
        System.out.print("Elija una opcion: \n1-Saludar\n2-Saludarte\n3-Calcular area de rectangulo\n4-convertir todo a minuscula\n5-Es Par??\n6-Para saber el cuadrado de un numero\n7-Si desea calcular el factorial de un numero\n8-Suma de numeros indiscriminada.\nESCRIBE UNA!!!::");
        Scanner teclado = new Scanner(System.in);


        int opcion = teclado.nextInt();
        return opcion;
    }

    //6. Número par o impar
    public static int esPar() {
        int numero;
        System.out.println("Ingrese un numero para ves si es par");
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

    //7. Calcular el cuadrado de un número
    public static double cuadradoDeUnNumero() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresá su numero para saber su cuadrado: ");
        double base = teclado.nextDouble();
        double resultado = base * base;
        System.out.println("El cuadrato de "+ base + " Es: "+ resultado );
        return resultado;
    }
    //8. Factorial recursivo
    public static int factorial() {
        Scanner teclado = new Scanner(System.in);
        int resultado = 0;


        System.out.print("Ingresá su numero para ver el factorial: ");
        int factorial = teclado.nextInt();

        for (int i = 1;i <= factorial; i++) {
            resultado += i * (factorial-1);
        }
        System.out.println(" Es: "+ resultado );

        return resultado;
    }
    //9. Sumar múltiples números (varargs)
    public static int sumaDeEnteros()
    {
        Scanner teclado = new Scanner(System.in);
        int resultado = 0;
        System.out.println("Si quere para de suma metele una letra.");
        System.out.println("Ingrese el numero que desea sumar: ");

        while (teclado.hasNextInt()){
            System.out.println("Ingrese el numero que desea sumar: ");
            int numeroIngresado = teclado.nextInt();
            resultado += numeroIngresado;
            System.out.println("Vas sumando: " + resultado);

        }
        System.out.println("Sumaste un total de " + resultado);
            return resultado;
    }

}
