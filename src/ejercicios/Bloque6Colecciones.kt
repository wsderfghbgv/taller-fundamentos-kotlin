package ejercicios

fun ejecutarBloque6() {
    println("\n=== BLOQUE 6: COLECCIONES ===")

    // Ejercicio 26 — lista de compras mutable: añadir y eliminar
    val compras = mutableListOf("leche", "pan", "huevos")
    println("26) Lista inicial: $compras")
    compras.add("arroz")
    compras.remove("pan")
    println("26) Tras add y remove: $compras")

    // Ejercicio 27 — precios menores a 50
    val precios = mutableListOf(120.0, 35.5, 49.99, 10.0, 75.0)
    val preciosBajos = precios.filter { it < 50.0 }
    println("27) Precios menores a 50: $preciosBajos")

    // Ejercicio 28 — find: primer nombre que empieza por 'A'
    val amigos = listOf("Luis", "Andrea", "Carlos", "Ana")
    val encontrado = amigos.find { it.startsWith("A") }
    println("28) Primer amigo con A: $encontrado")

    // Ejercicio 29 — extensión Int.esNegativo()
    val x = -3
    val y = 5
    println("29) $x es negativo: ${x.esNegativo()} | $y es negativo: ${y.esNegativo()}")

    // Ejercicio 30 — extensión String.quitarEspacios()
    val texto = "  hola   mundo  "
    println("30) Sin espacios: '${texto.quitarEspacios()}'")
}

fun Int.esNegativo(): Boolean = this < 0

fun String.quitarEspacios(): String = this.replace(" ", "")
