package ejercicios

fun ejecutarBloque5() {
    println("\n=== BLOQUE 5: FUNCIONES ===")

    // Ejercicio 21 — saludo que devuelve String
    val mensajeSaludo = saludar("Camila")
    println("21) $mensajeSaludo")

    // Ejercicio 22 — suma en una sola línea
    val total = sumar(10, 15)
    println("22) Suma: $total")

    // Ejercicio 23 y 24 — rectángulo con alto por defecto y solo ancho nombrado
    val areaDefault = crearRectangulo(ancho = 6.0)
    println("23-24) Área rectángulo (alto por defecto): $areaDefault")

    val areaCompleta = crearRectangulo(ancho = 5.0, alto = 3.0)
    println("23) Área rectángulo (ancho y alto): $areaCompleta")

    // Ejercicio 25 — conversor
    val millas = kmAMillas(10.0)
    println("25) 10 km ≈ $millas millas")
}

fun saludar(nombre: String): String = "Hola $nombre"

fun sumar(a: Int, b: Int): Int = a + b

fun crearRectangulo(ancho: Double, alto: Double = 1.0): Double = ancho * alto

fun kmAMillas(kilometros: Double): Double = kilometros * 0.621371
