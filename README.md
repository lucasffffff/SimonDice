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

![Captura de pantalla 2023-12-18 211059](https://github.com/lucasffffff/SimonDice/assets/114582569/86187ca3-1237-4a55-87cc-60545bed26fc)

```mermaid
graph TD
    A[MainActivity] -->|Iniciar SimonDiceActivity| B[SimonDiceActivity]
    B -->|Usuario inicia juego| C[Iniciar nuevo juego]
    C -->|Generar patrón aleatorio| D[Mostrar patrón en la UI]
    B -->|Usuario selecciona colores| E[Verificar entrada del jugador]
    E -->|Si la entrada es correcta| F[¿Jugador completó la secuencia?]
    F -->|Generar próximo número| G[Mostrar nuevo patrón en la UI]
    G -->|Fin del juego| H[¿Juego terminado?]
    H -->|Mostrar mensaje de juego terminado| I[Fin del juego]
    E -->|Si la entrada es incorrecta| I[Mostrar mensaje de juego terminado]
    I -->|Fin del juego| J[Usuario reinicia juego]
    J -->|Fin| K[Fin]






