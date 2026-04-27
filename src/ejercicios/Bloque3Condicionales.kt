package ejercicios

fun ejecutarBloque3() {
    println("\n=== BLOQUE 3: CONDICIONALES ===")

    // Ejercicio 11 — Mayoría de edad / votar
    val edad = 19
    if (edad >= 18) {
        println("11) Puede votar (mayor de edad: $edad)")
    } else {
        println("11) No puede votar (menor de edad: $edad)")
    }

    // Ejercicio 12 — if como expresión: Aprobado / Reprobado según nota
    val nota = 4.2
    val resultado = if (nota >= 3.0) "Aprobado" else "Reprobado"
    println("12) Resultado: $resultado (nota $nota)")

    // Ejercicio 13 — Semáforo
    val color = "rojo"
    val accion = when (color) {
        "rojo" -> "Pare"
        "amarillo" -> "Precaución"
        "verde" -> "Siga"
        else -> "Color no válido"
    }
    println("13) Semáforo ($color): $accion")

    // Ejercicio 14 — Rangos de temperatura
    val temperatura = 22.0
    val sensacion = when {
        temperatura < 15.0 -> "Frío"
        temperatura in 15.0..25.0 -> "Templado"
        else -> "Calor"
    }
    println("14) Temperatura $temperatura °C: $sensacion")

    // Ejercicio 15 — Verificación de tipo con when + is
    val muestraA: Any = "Hola Kotlin"
    val muestraB: Any = 42
    when (muestraA) {
        is String -> println("15a) Es un String: ${muestraA.length} caracteres")
        is Int -> println("15a) Es un Int")
        else -> println("15a) Otro tipo")
    }
    when (muestraB) {
        is String -> println("15b) Es un String")
        is Int -> println("15b) Es un Int: $muestraB")
        else -> println("15b) Otro tipo")
    }
}
