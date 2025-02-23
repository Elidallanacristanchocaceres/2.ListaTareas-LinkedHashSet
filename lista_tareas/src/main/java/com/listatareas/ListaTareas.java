package com.listatareas;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> tareas = new LinkedHashSet<>();

        // 1. Pedir al usuario que ingrese tareas
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
    }
}