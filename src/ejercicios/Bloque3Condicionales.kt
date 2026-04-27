package ejercicios

fun ejecutarBloque3() {
    println("\n=== BLOQUE 3: CONDICIONALES ===")

    // Ejercicio 1
    val nota = 4.2
    if (nota >= 3.0) {
        println("1) Aprobado con $nota")
    } else {
        println("1) Reprobado con $nota")
    }

    // Ejercicio 2
    val numero = 7
    val tipo = if (numero % 2 == 0) "par" else "impar"
    println("2) El numero $numero es $tipo")

    // Ejercicio 3
    val dia = 3
    val nombreDia = when (dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6, 7 -> "Fin de semana"
        else -> "Dia invalido"
    }
    println("3) Dia: $nombreDia")

    // Ejercicio 4
    val edad = 17
    when {
        edad < 12 -> println("4) Niño")
        edad < 18 -> println("4) Adolescente")
        edad < 60 -> println("4) Adulto")
        else -> println("4) Adulto mayor")
    }

    // Ejercicio 5
    val usuario = "admin"
    val clave = "1234"
    val acceso = usuario == "admin" && clave == "1234"
    println("5) Acceso permitido?: $acceso")
}
