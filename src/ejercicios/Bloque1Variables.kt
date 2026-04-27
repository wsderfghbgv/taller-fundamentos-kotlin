package ejercicios

fun ejecutarBloque1() {
    println("\n=== BLOQUE 1: VARIABLES ===")

    // Ejercicio 1
    val nombre = "Andres"
    println("1) Nombre: $nombre")

    // Ejercicio 2
    var edad = 24
    println("2) Edad inicial: $edad")
    edad += 1
    println("   Edad actualizada: $edad")

    // Ejercicio 3
    val altura = 1.72
    val peso = 68.5
    println("3) Altura: $altura m, Peso: $peso kg")

    // Ejercicio 4
    val inicial = nombre.first()
    val esMayorDeEdad = edad >= 18
    println("4) Inicial: $inicial, Mayor de edad?: $esMayorDeEdad")

    // Ejercicio 5
    val anioNacimientoAprox = 2026 - edad
    println("5) Año de nacimiento aproximado: $anioNacimientoAprox")
}
