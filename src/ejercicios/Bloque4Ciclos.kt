package ejercicios

fun ejecutarBloque4() {
    println("\n=== BLOQUE 4: CICLOS ===")

    // Ejercicio 1
    print("1) Del 1 al 5: ")
    for (i in 1..5) {
        print("$i ")
    }
    println()

    // Ejercicio 2
    print("2) Pares del 2 al 10: ")
    for (i in 2..10 step 2) {
        print("$i ")
    }
    println()

    // Ejercicio 3
    var contador = 5
    print("3) Cuenta regresiva: ")
    while (contador >= 1) {
        print("$contador ")
        contador--
    }
    println()

    // Ejercicio 4
    var suma = 0
    for (i in 1..100) {
        suma += i
    }
    println("4) Suma de 1 a 100: $suma")

    // Ejercicio 5
    var intento = 0
    do {
        intento++
        println("5) Intento #$intento")
    } while (intento < 3)
}
