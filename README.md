# Lista de Tareas en Java con LinkedHashSet

Este proyecto permite gestionar una lista de tareas donde se pueden agregar, visualizar y eliminar tareas.

### 🚀 Funcionalidades

- Permite ingresar tareas y almacenarlas en un LinkedHashSet.

- Mantiene el orden de ingreso de las tareas.

- Evita duplicados y muestra un mensaje si una tarea ya ha sido agregada.

- Permite eliminar una tarea específica de la lista.

- Muestra la lista actualizada después de cada operación.

### 🛠 Tecnologías utilizadas

- Java

- Colecciones (Set, LinkedHashSet)

- Entrada de datos con Scanner

### 📌 Uso

- Ejecuta el programa en un entorno compatible con Java.

- Ingresa tareas (escribiendo fin para finalizar la entrada).

- Se mostrará la lista de tareas ingresadas.

- Ingresa el nombre de una tarea para eliminarla.

- Se mostrará la lista actualizada después de la eliminación.

### 📂 Estructura del Código
````bash
Set<String> tareas = new LinkedHashSet<>();
````
Se utiliza LinkedHashSet para mantener el orden de ingreso y evitar duplicados.
````bash
if (!tareas.add(tarea)) {
    System.out.println("⚠ La tarea '" + tarea + "' ya está en la lista.");
}
````
Verifica si una tarea ya ha sido ingresada.
````bash
if (tareas.remove(tareaEliminar)) {
    System.out.println("✅ Tarea eliminada con éxito.");
} else {
    System.out.println("❌ La tarea no existe en la lista.");
}
````
Permite eliminar una tarea de la lista.

### 📝 Notas

- Se deben ingresar tareas sin espacios adicionales.

- Para finalizar la entrada de tareas, se debe escribir fin.
