
import java.util.Random;
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
                    break;
                case 2:
                    saludar();
                    break;
                case 3:
                    System.out.println("¡Ahora calculemos el area de un triangulo!");
                    System.out.print("Ingresá su altura: ");
                    int altura = teclado.nextInt();
                    System.out.print("Ingresá su base: ");
                    int base = teclado.nextInt();
                    System.out.println("El area de su rectangulo es: " + calcularAreaTriangulo(base, altura));
                    break;
                case 4:
                    mayusculas();
                    break;
                case 5:
                    esPar();
                    break;
                case 6:
                    cuadradoDeUnNumero();
                    break;
                case 7:
                    factorial();
                    break;
                case 8:
                    sumaDeEnteros();
                    break;
                case 9:
                    promedioArray();
                    break;
                case 10:
                    numeroBuscar();
                    break;
                case 11:
                    formaFormateada();
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
        System.out.print("Elija una opcion: \n1-Saludar\n2-Saludarte\n3-Calcular area de rectangulo\n4-convertir todo a minuscula\n5-Es Par??\n" +
                "6-Para saber el cuadrado de un numero\n7-Si desea calcular el factorial de un numero\n8-Suma de numeros indiscriminada.\n" +
                "-9 para sumar un promedio de numeros\n10-Juego de buscar en el array\n-11 aca te muestro un array...\nESCRIBE UNA!!!::");
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
        int resultado = 1;


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


    //10. Promedio de un array
    public static int promedioArray()
    {
        Scanner teclado = new Scanner(System.in);
        double sumaTotal = 0;
        System.out.println("Indique la cantidad de numeros que va a ingresar: ");
        int largoArray = teclado.nextInt();

        double[] numeros = new double[largoArray];
        System.out.println("ingrese el numero: ");
        for(int i = 0; i < numeros.length; i++)
        {

            numeros[i] = teclado.nextDouble();
            System.out.println("otro mas: ");
        }

        for(int i = 0; i < numeros.length; i++)
        {
            sumaTotal += numeros[i];



        }
        System.out.println("El promedio es: " + sumaTotal/numeros.length);
        return (int) sumaTotal;
    }
    //11. Buscar valor en array
    public static int numeroBuscar()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Juego de buscar.... tu tarea es colocar un numero. si esta entre los 5 seleccionados ganaste!!!");

        Random aleatorio = new Random();

        int[] numeros = new int[5];
        System.out.println("ingrese el numero: ");
        int eleccion = teclado.nextInt();
        for(int i = 0; i < numeros.length; i++)
        {
            int numeroAleatorio = aleatorio.nextInt(100);
            numeros[i] = numeroAleatorio;
        }
        int lePego = 0;
        for(int i = 0; i < numeros.length; i++)
        {

            if(numeros[i] == eleccion)
            {
                lePego = 1;
            }

        }
        if(lePego == 1) {
            System.out.println("----------------MUY BIEN TU NUMERO ESTABA ENTRE LOS 5 SELECCIONADOS!!!!----------------");
        }
        else {
            System.out.println("--------------vas a tener que mejorar--------------------");

        }
        return eleccion;
    }
    //12. Contar ocurrencias
    //Crear un método que reciba un array de String y un string clave, y devuelva cuántas veces aparece.
    // NO ENTENDI QUE PIDE
    //13. Imprimir array de forma formateada
    public static int formaFormateada()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Recorremos el array");

        Random aleatorio = new Random();

        int[] numeros = new int[5];
        for(int i = 0; i < numeros.length; i++)
        {
            int numeroAleatorio = aleatorio.nextInt(100);
            numeros[i] = numeroAleatorio;
        }
        System.out.print("[");
        for(int i = 0; i < numeros.length; i++)
        {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1)
            {
                System.out.print(",");

            }
        }
        System.out.println("]");

        int condador = 0;
        condador = numeros.length;
        System.out.println("y alrevez.");
        System.out.print("[");

        for(int i = 0; i < numeros.length; i++)
        {
            condador--;
            System.out.print(numeros[condador]);
            if (i < numeros.length - 1)
            {
                System.out.print(",");

            }
        }
        System.out.println("]");
        return 0;
    }
    //15. Estudiante con mejor nota
    public static int estudiante()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("tu tarea es colocar la nota y el estudiante a quien corresponda!!!");

        int[] notas = new int[5];
        String[] nombres = new String[5];
        int mayor = 0;
        String estudiante = 0;
        int eleccion = teclado.nextInt();
        for(int i = 0; i < notas.length; i++)
        {
            System.out.println("ingrese la nota del estudiante");

            notas[i] = teclado.nextInt();
            System.out.println("Ingrese el nombre del estudiante");

            nombres[i] = teclado.nextLine();
        }
        for(int i = 0; i < notas.length; i++)
        {
            if (notas[i] > mayor) {
                mayor = notas[i];
                estudiante = nombres[i];
        }
            System.out.println("El estudiante con mayor nota es" + estudiante + " con una nota de " + mayor);
        }


        return mayor;
    }
