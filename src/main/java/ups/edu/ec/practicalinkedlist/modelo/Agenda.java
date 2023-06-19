/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.practicalinkedlist.modelo;

import java.util.LinkedList;

/**
 *
 * @author ESTUDIANTE
 */
public class Agenda {
    private LinkedList<Contacto<String, String>> contactos;

    public Agenda() {
        contactos = new LinkedList<>();
    }

    public void añadirContacto(String nombre, String telefono) {
        Contacto<String, String> newContacto = new Contacto<>(nombre, telefono);
        contactos.add(newContacto);
    }

    public Contacto<String, String> buscarContacto(String nombre) {
        for (Contacto<String, String> contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public void borrarContacto(String nombre) {
        Contacto<String, String> removerContacto = null;
        for (Contacto<String, String> contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                removerContacto = contacto;
                break;
            }
        }
        if (removerContacto != null) {
            contactos.remove(removerContacto);
            System.out.println("Contacto borrado: " + removerContacto.getNombre());
        } else {
            System.out.println("Contacto no encontrado: " + nombre);
        }
    }
    
    public void printMenu() {
        System.out.println("\n--- Menu Agenda ---");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Borrar contacto");
        System.out.println("4. Salir");
        System.out.print("Escoga una opcion: ");
    }
}
