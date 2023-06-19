/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ups.edu.ec.practicalinkedlist.vista;

import java.util.Scanner;
import ups.edu.ec.practicalinkedlist.modelo.Agenda;
import ups.edu.ec.practicalinkedlist.modelo.Contacto;

/**
 *
 * @author ESTUDIANTE
 */
public class PracticaLinkedList {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        while (!quit) {
            agenda.printMenu();
            int eleccion = scanner.nextInt();
            scanner.nextLine(); 

            switch (eleccion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el telefono: ");
                    String telefono = scanner.nextLine();
                    agenda.añadirContacto(nombre, telefono);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String busquedaNombre = scanner.nextLine();
                    Contacto<String, String> contacto = agenda.buscarContacto(busquedaNombre);
                    if (contacto != null) {
                        System.out.println("Nombre: " + contacto.getNombre());
                        System.out.println("Telefono: " + contacto.getTelefono());
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre a borrar: ");
                    String borrarNombre = scanner.nextLine();
                    agenda.borrarContacto(borrarNombre);
                    break;
                case 4:
                    quit = true;
                    System.out.println("Saliendo de la agenda...");
                    break;
                default:
                    System.out.println("Eleccion invalida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
