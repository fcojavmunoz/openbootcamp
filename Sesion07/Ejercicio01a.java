

package Sesion07;

import java.io.*;
import java.util.*;


class Ejercicio01a {

    // Ejercicio 1.a

    /* 1.- Dada la función:
    public static String reverse(String texto) {}

    a.- Escribe el código que devuelva una cadena al revés.
    Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    */


    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Escriba el texto que quiere invertir");
        String cadena = c.nextLine();
        // Esta será la cadena invertida, primero está vacía
        String invertida = "";
        // Recorremos la original del final al inicio
        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
            // Y vamos concatenando cada carácter a la nueva cadena
            invertida += cadena.charAt(indice);
        }
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);
    }
}

// Ejercicio 1.b
    /* 1.- Dada la función:
    public static String reverse(String texto) {}
    b.- Crea un array unidimensional de Strings y recórrelo,
    mostrando únicamente sus valores.
    */

class Ejercicio01b {

    public static void main(String arg[]) {

        String nombre[] = new String[5];

        nombre[0] = "Noa";

        nombre[1] = "Alba";

        nombre[2] = "Ismael";

        nombre[3] = "Samuel";

        nombre[4] = "Miguel";

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + nombre[i]); //se muestra cada elemento del array
        }
    }
}

// Ejercicio 1.c
    /* 1.- Dada la función:
    public static String reverse(String texto) {}
    c.- Crea un array bidimensional de enteros y recórrelo,
    mostrando la posición y el valor de cada elemento en ambas
    dimensiones.
    */

class Ejercicio01c {
    public static void main(String[] args) {
        String arrayBidi[][] = new String[3][4];

        arrayBidi[0][0] = "árbol";
        arrayBidi[0][1] = "bolsa";
        arrayBidi[0][2] = "casa";
        arrayBidi[0][3] = "dado";

        arrayBidi[1][0] = "aguila";
        arrayBidi[1][1] = "burro";
        arrayBidi[1][2] = "conejo";
        arrayBidi[1][3] = "dinosaurio";

        arrayBidi[2][0] = "arteria";
        arrayBidi[2][1] = "bazo";
        arrayBidi[2][2] = "cabeza";
        arrayBidi[2][3] = "dedo";

        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidi[i][j]);
            }

        }
    }
}

// Ejercicio 2
    /* 2.- Crea un "Vector" del tipo de dato que prefieras y añádele
    5 elementos.
    Elimina el 2o y 3er elemento y muestra el resultado final.
     */

class Ejercicio02 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Uno");
        vector.add("Dos");
        vector.add("Tres");
        vector.add("Cuatro");
        vector.add("Cinco");

        vector.remove(2); // elimina "Tres"
        vector.remove(3); //OJO: elimina "Cinco", que ahora pasa a estar en el índice 3

        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Valor en la posicion " + i + " del vector: " + vector.get(i));
        }

    }
}

class Ejercicio03 {


// Ejercicio 3

/*

3.- Indica cuál es el problema de utilizar un Vector con la
capacidad por defecto si tuviésemos 1000 elementos para ser
añadidos al mismo.

A pesar de que los vectores son dinámicos, conviene no sobrecargarlos con muchos elementos
cuando tienen la capacidad por defecto (que se va doblando su capacidad cada vez) ya que
para llevar a cabo esta ampliación, el programa debe crear nuevos arrays, copiar los
elementos que ya están en el vector y añadir los elementos nuevos. El gran problema viene en
la operación de copiar los datos existentes, ya que es una operación muy costosa en términos
de recursos computacionales. Además, al ir duplicando cada vez la capacidad del vector, el uso
de memoria por el mismo también se duplica.

Para llegar a un vector de 1000 elementos partiendo de la capacidad por defecto (10) se crearán
las siguientes ampliaciones:

1.- 10
2.- 20
3.- 40
4.- 80
5.- 160
6.- 320
7.- 640
8.- 1280

Se da el caso negativo, además de lo ya comentado anteriormente, de que para utilizar 1000 elementos
estamos reservando espacio y gastando recursos como para utilizar 2550. Un 155% más de lo que en realidad
necesitamos.

Este desperdicio de recursos computacionales podría eliminarse creando, directamente, un vector con
capacidad para los 1000 elementos que sabemos que tenemos o limitando la capacidad de incremento,
de manera que cuando se complete la capacidad disponible no se duplique directamente.

= new Vector (InitialCapacity: 1000, capacityIncrement: 100);

Espero haberme explicado bien. No uso muchos términos técnicos porque estoy empezando en este campo.

 */
}

/*
Ejercicio 4.-

4.- Crea un ArrayList de tipo String, con 4 elementos.
Cópialo en una LinkedList.
Recorre ambos mostrando únicamente el valor de cada elemento.

 */
class Ejercicio04 {
    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>();

        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");

        for (String e : numbers) {
            System.out.println("Valor actual en el ArrayList: " + e);

        }


        LinkedList<String> listaEnlazada = new LinkedList<>(numbers);

        for (String elemento : listaEnlazada) {
            System.out.println("El elemento en la LinkedList es : " + elemento);
        }


    }
}

    /*
    Ejercicio 5.-

    5.- Crea un ArrayList de tipo int.
    - Utilizando un bucle rellénalo con elementos 1..10.
    - A continuación, con otro bucle, recórrelo y elimina
    los números pares.
    - Por último, vuelve a recorrerlo y muestra el ArrayList final.
    - Si te atreves, puedes hacerlo en menos pasos, siempre y cuando
    cumplas el primer "for" de relleno.

     */

class Ejercicio05 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            numeros.add(i);

        }
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 != 0) {
                numeros.remove(i);
            }
        }
        System.out.println("ArrayList final: " + numeros);
    }
}

/*

Ejercicio 6.-

6.- Crea una función DividePorCero.
     - Esta debe generar una excepción ("throws") a su llamante
       del tipo ArithmeticException que será capturada por su llamante
       (desde "main", por ejemplo).
     - Si se dispara la excepción, mostraremos el mensaje
       "Esto no puede hacerse".
     - Finalmente, mostraremos en cualquier caso: "Demo de código".

 */

class Ejercicio06 {
    public static void main(String[] args) {
        DividePorCero(4, 4);
    }

    private static void DividePorCero(int A, int B) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = A / B;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

    }
}

/*

Ejercicio 7.-

7.- Utilizando InputStream y PrintStream,
    crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    La tarea de la función será realizar la copia del fichero dado
    en el parámetro "fileIn" al fichero dado en "fileOut".

 */

class Ejercicio07 {
    public static void main(String[] args) {

       CopiarFichero();

    }


    private static void CopiarFichero() {

        try {
            InputStream in = new FileInputStream("/etc/passwd");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());

        }
    }
}

/*
Ejercicio 8.-

8.- Sorpréndenos creando un programa de tu elección que utilice
    InputStream OK
    PrintStream OK?
    Excepciones OK
    HashMap OK
    ArrayList OK
    LinkedList o array. OK
 */

class Ejercicio08 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        HashMap<Integer, String> m = new HashMap<>();

        m.put(934, "Víctor Román");
        m.put(438, "Álex de OpenBootcamp");
        m.put(328, "Jesús de OpenBootcamp");
        m.put(293, "Martín de OpenBootcamp");
        m.put(234, "Raúl de OpenBootcamp");
        m.put(568, "Sergio de OpenBootcamp");
        m.put(113, "Bot de Administración de OpenBootcamp");

        System.out.print("Por favor, introduzca el número de registro personal: ");
        int codigoIntroducido = c.nextInt();

        if (m.containsKey(codigoIntroducido)) {
            System.out.println(" ");
            System.out.print("El código " + codigoIntroducido + " corresponde a ");
            System.out.println(m.get(codigoIntroducido));
            System.out.println(" ");
            ArrayList<String> a = new ArrayList<String>();

            a.add("rojo");
            a.add("verde");
            a.add("azul");
            a.add("blanco");
            a.add("amarillo");

            System.out.println("Los colores favoritos de " + m.get(codigoIntroducido) + " son:");

            for (String color : a) {
                System.out.println(color);

            }


            Scanner s = new Scanner(System.in);
            System.out.println("");
            System.out.println(m.get(codigoIntroducido) + " ha venido a visitarte a tu casa con amigos.");
            System.out.println("¿Cuántas cervezas tienes en el frigorífico?");
            int cervezas = Integer.parseInt(s.nextLine());
            System.out.print("¿Cuántos amigos han venido con él? ");
            int amigos = Integer.parseInt(s.nextLine());
            // beben cervezas los amigos que trae MÁS dos (el que viene y tú). Indicado en la función (amigos + 2).
            try {
                System.out.println("A cada persona le corresponden " + reparteCervezas(cervezas, amigos) + " cervezas.");
                System.out.println(" ");
            } catch (Exception e) {
                // nunca va a dar excepción porque siempre hay al menos dos personas, pero pongo el código
                // por aquí porque era parte exigida en el ejercicio ;-)
                System.out.println("¿Has contado bien a las personas que han venido a verte?");
            }

            double[] nota = new double[4];
            Scanner n = new Scanner(System.in);
            System.out.println(m.get(codigoIntroducido) + " está preocupado porque no sabe si aprobará el ");
            System.out.println("curso de Java Básico.");

            for (int i = 0; i < 4; i++) {
                System.out.print("¿Qué nota sacó en el " + (i + 1) + " examen? ");
                nota[i] = n.nextDouble();
            }

            System.out.println("Sus notas son: ");

            double suma = 0;

            for (int i = 0; i < 4; i++) {
                System.out.print(nota[i] + "  ");
                suma += nota[i];
            }

            System.out.println("\nLa media es " + suma / 4);
            System.out.println(" ");

            try {
                BufferedReader br = new BufferedReader(new FileReader("JavaBasico.txt"));

                String linea = "";

                while (linea != null) {
                    System.out.println(linea);
                    linea = br.readLine();
                }

                br.close();

            } catch (FileNotFoundException fnfe) { // si no se encuentra el fichero

                System.out.println("No se encuentra el fichero JavaBasico.txt");






                Scanner h = new Scanner(System.in);
                System.out.println("¿Quieres que lo cree ahora? (s / n)");
                String ahora = h.nextLine();

                if (ahora.equals("s")){

                    try{File JavaBasico = new File("JavaBasico.txt") ;
                        JavaBasico.createNewFile();


                    }catch (FileNotFoundException e) { // si no se encuentra el fichero

                        System.out.println("No se puede crear el fichero JavaBasico.txt");



                } catch (IOException e) {
                        e.printStackTrace();
                    }
                }















            } catch (IOException ioe) { // si hay un error en la lectura del fichero

                System.out.println("No se puede leer el fichero JavaBasico.txt");

            }


        } else {
            System.out.print("En nuestro archivo no figura ninguna persona con ese número de registro.");
            System.out.println(" ");

        }


    }

    private static int reparteCervezas(int cervezas, int amigos) {
        return cervezas / (amigos + 2);
    }


}
















