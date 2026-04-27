package ejercicios

fun ejecutarBloque5() {
    println("\n=== BLOQUE 5: FUNCIONES ===")

    // Ejercicio 1
    saludar("Camila")

    // Ejercicio 2
    val suma = sumar(10, 15)
    println("2) Suma: $suma")

    // Ejercicio 3
    val area = areaRectangulo(5.0, 2.5)
    println("3) area del rectangulo: $area")

    // Ejercicio 4
    val par = esPar(11)
    println("4) 11 es par?: $par")

    // Ejercicio 5
    imprimirPerfil(nombre = "Luis", edad = 20, ciudad = "Bogota")
}

fun saludar(nombre: String) {
    println("1) Hola, $nombre")
}

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun areaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun esPar(numero: Int): Boolean {
    return numero % 2 == 0
}

fun imprimirPerfil(nombre: String, edad: Int, ciudad: String = "No definida") {
    println("5) Perfil -> Nombre: $nombre, Edad: $edad, Ciudad: $ciudad")
}
