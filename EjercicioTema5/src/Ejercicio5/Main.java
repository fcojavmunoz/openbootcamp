/*
Ejercicios tema 5
1.- Crear una interfaz CocheCRUD.
2.- Crear una implementación CocheCRUDImpl que implemente
la interfaz CocheCRUD.
3.- Como métodos de CocheCRUD podemos poner:
save()
findAll()
delete()

4.- Imprimir por consola el nombre del propio método.

5.- Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y
llamar a cada uno de los métodos.


Ejemplo: CocheCRUD cocheCrud = new CocheCRUDImpl()
 */

package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        CocheCRUDImpl cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

    }
}
