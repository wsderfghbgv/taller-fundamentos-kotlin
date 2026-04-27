package ejercicios

fun ejecutarBloque4() {
    println("\n=== BLOQUE 4: CICLOS ===")

    // Ejercicio 16 — del 1 al 10
    print("16) Del 1 al 10: ")
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // Ejercicio 17 — cuenta regresiva 10 a 1 con downTo
    print("17) Cuenta regresiva: ")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    // Ejercicio 18 — del 1 al 20 saltando de 3 en 3
    print("18) Saltos de 3: ")
    for (i in 1..20 step 3) {
        print("$i ")
    }
    println()

    // Ejercicio 19 — while con energía
    var energia = 4
    println("19) Simulación de energía:")
    while (energia > 0) {
        println("   Energía restante: $energia")
        energia--
    }

    // Ejercicio 20 — do-while hasta contraseña correcta
    val intentosSimulados = listOf("0000", "5678", "1234")
    var indice = 0
    var claveIngresada: String
    println("20) Validación de contraseña:")
    do {
        claveIngresada = intentosSimulados[indice]
        println("   Intento: $claveIngresada")
        indice++
    } while (claveIngresada != "1234")
    println("   Acceso permitido.")
}
