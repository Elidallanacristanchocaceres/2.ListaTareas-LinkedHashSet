package com.listatareas;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> tareas = new LinkedHashSet<>();

        // 1.ingresar tareas
        System.out.println("Ingrese las tareas (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Tarea: ");
            String tarea = scanner.nextLine();
            if (tarea.equalsIgnoreCase("fin")) {
                break;
            }
            if (!tareas.add(tarea)) {
                System.out.println("⚠ La tarea '" + tarea + "' ya está en la lista.");
            }
        }

         // 3.mostrar la lista
         System.out.println("\n📋 Lista de tareas:");
         for (String tarea : tareas) {
             System.out.println("- " + tarea);
         }

         // 4.eliminar
        System.out.print("\nIngrese el nombre de la tarea que desea eliminar: ");
        String tareaEliminar = scanner.nextLine();
        if (tareas.remove(tareaEliminar)) {
            System.out.println("✅ Tarea eliminada con éxito.");
        } else {
            System.out.println("❌ La tarea no existe en la lista.");
        }

        //listo
        System.out.println("\n📋 Lista actualizada de tareas:");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }

        scanner.close();
    }
}