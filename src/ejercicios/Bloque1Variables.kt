package ejercicios

private const val ANIO_NACIMIENTO = 2002
private const val ANIO_ACTUAL = 2026

object Constants {
    const val VELOCIDAD_LUZ = 299_792_458L
}

fun ejecutarBloque1() {
    println("\n=== BLOQUE 1: VARIABLES ===")

    // Ejercicio 1 — Perfil de usuario
    val nombre = "Andres"
    var ciudad = "Medellín"
    println("1) Nombre: $nombre ciudad: $ciudad")
    ciudad = "Bogotá"
    println("   Ciudad nueva: $ciudad")

    // Ejercicio 2 — Calculadora de años (constante año de nacimiento → edad)
    val edadAproximada = ANIO_ACTUAL - ANIO_NACIMIENTO
    println("2) Año de nacimiento (constante): $ANIO_NACIMIENTO edad aproximada: $edadAproximada")

    // Ejercicio 3 — Tipos explícitos
    val precioCoche: Double = 28_500.0
    val pesoNaranja: Float = 0.18f
    val poblacionMundo: Long = 8_119_000_000L
    println("3) Precio coche: $precioCoche peso naranja: $pesoNaranja kg población mundo: $poblacionMundo")

    // Ejercicio 4 — Inferencia (nombre requerido)
    val inicial = nombre.first()
    val estaLloviendo = false
    println("4) Inicial: $inicial esta lloviendo: $estaLloviendo")

    // Ejercicio 5 — Constantes (objeto + const val)
    println("5) Velocidad de la luz: ${Constants.VELOCIDAD_LUZ} m/s")
}
