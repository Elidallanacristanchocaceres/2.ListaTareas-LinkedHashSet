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

         // 3. Mostrar la lista de tareas en el orden ingresado
         System.out.println("\n📋 Lista de tareas:");
         for (String tarea : tareas) {
             System.out.println("- " + tarea);
         }
    }
}