# SimonDice - Juego Android

## Descripción

Este es un juego de "Simon Dice" desarrollado para dispositivos Android. El juego simula el famoso juego electrónico "Simon" en el que se muestra una secuencia de colores y sonidos, y el jugador debe repetir la secuencia en el mismo orden.

## Funcionalidades

La aplicación "Simon Dice" incluye las siguientes funcionalidades:

- **Cuatro Colores Diferentes:** Cuatro botones de colores (Rojo, Verde, Azul y Amarillo) que representan la secuencia de colores.

- **Generación Aleatoria de Secuencia:** El juego genera aleatoriamente una secuencia de colores que el jugador debe replicar.

- **Reinicio del Juego:** El jugador puede reiniciar el juego en cualquier momento presionando el botón "Reiniciar Juego".

- **Interacción de Usuario:** Los jugadores hacen clic en los botones de colores para repetir la secuencia generada.

- **Verificación de Secuencia:** La aplicación verifica si la secuencia ingresada por el jugador coincide con la secuencia generada.

- **Puntuación:** Lleva un registro de la puntuación y muestra el progreso del jugador.

## Requisitos
Android Studio 4.0 o superior.
Dispositivo Android o emulador con Android 7.0 (Nougat) o superior.

## Diagrama de Flujo

digraph G {
    Inicio [shape=ellipse, label="Inicio"]
    "Generar Secuencia" -> "Mostrar Secuencia"
    "Mostrar Secuencia" -> "Esperar Entrada"
    "Esperar Entrada" -> "Verificar Entrada"
    "Verificar Entrada" -> "Correcto" [label="Sí"]
    "Verificar Entrada" -> "Incorrecto" [label="No"]
    "Correcto" -> "Generar Secuencia"
    "Incorrecto" -> "Fin" [label="Reiniciar"]
    "Fin" [shape=ellipse, label="Fin"]
}
