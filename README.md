# Informe Pokémon

## Descripción

Aplicación desarrollada en Java utilizando Maven que permite leer información de Pokémon almacenada en un archivo JSON, procesar los datos obtenidos y generar un informe de estadísticas en un archivo de texto.

---

## Clases del proyecto

### Pokemon

Clase modelo que representa un Pokémon dentro de la aplicación.

Cada objeto de esta clase almacena la información leída desde el archivo JSON, incluyendo:

- Identificador (`id`)
- Nombre (`nombre`)
- Tipo (`tipo`)
- Nivel (`nivel`)
- Puntos de salud (`ps`)

Esta clase únicamente almacena datos y proporciona los métodos necesarios para acceder a ellos mediante getters.

---

### LecturaArchivo

Clase encargada de la lectura de datos.

Su función principal es acceder al archivo `pokemon.json`, leer toda la información contenida en él y transformarla en objetos de tipo `Pokemon` utilizando la librería Jackson.

Al finalizar la lectura devuelve una colección de Pokémon que será utilizada por el resto de la aplicación.

Responsabilidades:

- Leer archivos JSON.
- Convertir JSON en objetos Java.
- Devolver una lista de Pokémon lista para ser procesada.

---

### GestionPokemon

Clase responsable de toda la lógica de negocio del programa.

Recibe la colección de Pokémon obtenida desde `LecturaArchivo` y realiza sobre ella los cálculos solicitados.

Entre sus funciones se encuentran:

- Calcular el número total de Pokémon.
- Obtener el nivel medio.
- Obtener la media de puntos de salud.
- Buscar el Pokémon con mayor nivel.
- Buscar el Pokémon con mayor cantidad de PS.
- Agrupar los Pokémon según su tipo.

---

### EscrituraArchivo

Clase encargada de generar el informe final.

Utiliza los resultados calculados por `GestionPokemon` para crear el archivo `informe_pokemon.txt`.

El informe incluye:

- Estadísticas generales.
- Pokémon con mayor nivel.
- Pokémon con más PS.
- Agrupación de Pokémon por tipos.

Su responsabilidad se limita exclusivamente a la escritura del informe, sin realizar cálculos adicionales.

---

### Main

Clase principal y punto de entrada de la aplicación.

Su objetivo es coordinar la ejecución del programa manteniendose lo mas breve posible:

1. Leer los datos desde el archivo JSON.
2. Crear el gestor de Pokémon.
3. Obtener las estadísticas necesarias.
4. Generar el informe final.
