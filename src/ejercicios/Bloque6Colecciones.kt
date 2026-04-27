package ejercicios

fun ejecutarBloque6() {
    println("\n=== BLOQUE 6: COLECCIONES ===")

    // Ejercicio 1
    val frutas = listOf("Manzana", "Banano", "Mango")
    println("1) Lista de frutas: $frutas")

    // Ejercicio 2
    val numeros = mutableListOf(1, 2, 3)
    numeros.add(4)
    numeros.add(5)
    println("2) Lista mutable: $numeros")

    // Ejercicio 3
    val mayoresQueDos = numeros.filter { it > 2 }
    println("3) Filtrados (>2): $mayoresQueDos")

    // Ejercicio 4
    val cuadrados = numeros.map { it * it }
    println("4) Cuadrados: $cuadrados")

    // Ejercicio 5
    val notas = mapOf("Ana" to 4.5, "Luis" to 3.8, "Marta" to 4.9)
    println("5) Nota de Marta: ${notas["Marta"]}")
}
