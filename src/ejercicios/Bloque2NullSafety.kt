package ejercicios

fun ejecutarBloque2() {
    println("\n=== BLOQUE 2: NULL SAFETY ===")

    // Ejercicio 1
    var correo: String? = "andres@email.com"
    println("1) Correo: $correo")

    // Ejercicio 2
    println("2) Longitud segura del correo: ${correo?.length}")

    // Ejercicio 3
    correo = null
    val correoPorDefecto = correo ?: "sin-correo@dominio.com"
    println("3) Correo por defecto (Elvis): $correoPorDefecto")

    // Ejercicio 4
    val longitud = correo?.length ?: 0
    println("4) Longitud con valor por defecto: $longitud")

    // Ejercicio 5
    val usuario: String? = "ana"
    if (usuario != null) {
        println("5) Usuario en mayusculas: ${usuario.uppercase()}")
    }
}
