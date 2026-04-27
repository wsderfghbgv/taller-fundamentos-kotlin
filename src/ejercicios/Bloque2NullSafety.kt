package ejercicios

fun ejecutarBloque2() {
    println("\n=== BLOQUE 2: NULL SAFETY ===")

    // Ejercicio 6 — Opcional String? inicial null (apodo)
    var apodo: String? = null
    println("6) Apodo: $apodo")

    // Ejercicio 7 — Elvis sobre apodo y literal "Sin apodo"
    println("7) ${apodo ?: "Sin apodo"}")

    // Llamada segura (?.) sobre un valor no nulo para mostrar longitud
    var correo: String? = "andres@email.com"
    println("8) Longitud segura del correo: ${correo?.length}")

    correo = null
    val longitudDefecto = correo?.length ?: 0
    println("8) Longitud con valor por defecto: $longitudDefecto")

    // Ejercicio 9 — let e imprimir "Correo enviado a $it"
    val destinatario: String? = "ana@correo.com"
    destinatario?.let { println("9) Correo enviado a $it") }

    // Ejercicio 10 — aserción no nula !! para longitud
    val codigoSeguro: String? = "Kotlin2026"
    println("10) Longitud con !!: ${codigoSeguro!!.length}")
}
