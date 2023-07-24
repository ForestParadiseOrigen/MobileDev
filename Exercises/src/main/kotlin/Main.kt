import  kotlin.math.PI
import kotlin.math.pow
import kotlin.collections.MutableList

fun main() {
    val selected = readln().toInt()
    println("¿Que secciín quieres probar primero?\n1. Operadores.\n2. Condicionales.\n3. Ciclos")
    when(selected){
        1 -> operators()
        2 -> conditionals()
        3 -> cicles()
    } // End when()
}

fun operators() {
    println("Bienvenido a los operadores. Elige un operador del 1 al 8.")
    val selected = readln().toInt()
    
    fun exercise1() {
        print("Ingrese la base: ")
        val base:Int = readln().toInt()

        print("Ingrese la altura: ")
        val altura:Int = readln().toInt()

        println("Calculando...")

        val area:Int = base * altura / 2

        print("El area del triangulo es: $area")
    } // End exercise1()

    fun exercise2() {
        print("Ingrese el numero 1: ")
        val number1:Int = readln().toInt()
        print("Ingrese el numero 2: ")
        val number2:Int = readln().toInt()
        val result:Int = number1 + number2
        print("La suma del numero $number1 y del numero $number2 es: $result")
    } // End exercise2()

    fun exercise3() {
        print("Ingrese el numero: ")
        val number:Int = readln().toInt()
        print("Ingrese el exponente: ")
        val exponent:Int = readln().toInt()
        val result = number.toDouble().pow(exponent.toDouble())

        print("El numero $number elevado al $exponent es $result")
    } // End exercise3()

    fun exercise4() {
        print("Ingrese el monto en euros: ")
        val amount:Double = readln().toDouble()

        val result = amount * 1.12

        print("La conversion de euros a dolares es de: $result")
    } // End exercise4()

    fun exercise5() {
        print("Ingrese el lado del cuadrado: ")
        val side:Int = readln().toInt()
        val perimeter = side * 4
        val area = side * side
        print("El area del cuadrado es $area y el perimetro es $perimeter.")
    } // End exercise5()

    fun exercise6() {
        // Ask for the fundamental data.
        print("Ingrese el radio del cilindro: ") // Radio
        val radio:Double = readln().toDouble()
        print("Ingrese la altura del cilindro: ") // Height
        val height:Double = readln().toDouble()

        // Doing the calculations with functions.
        fun areaBaseCal (radio:Double):Double = PI * radio * radio
        fun areaLateralCal (radio:Double, height:Double):Double =  2 * PI * radio * height
        fun totalAreaCal (areaBase:Double, areaLateral:Double):Double = 2 * areaBase * areaLateral
        fun perimeterCircleCal (radio:Double):Double = 2 * PI * radio
        fun perimeterTotalCal (perimeterBase:Double, height:Double):Double = 2 * perimeterBase * height

        // Assigning the results of the functions in variables.
        val areaBase = areaBaseCal(radio)
        val areaLateral = areaLateralCal(radio, height)
        val areaTotal = totalAreaCal(areaBase, areaLateral)
        val perimeterBase = perimeterCircleCal(radio)
        val perimeterTotal = perimeterTotalCal(perimeterBase, height)

        // Give up the results to the user.
        println("El area del total del cilindro es: $areaTotal")
        println("El perimetro total del cilindro es: $perimeterTotal")
    } // End exercise6()

    fun exercise7() {
        val radio:Double = readln().toDouble()
        val length:Double = 2 * PI * radio
        val area:Double = PI * radio * radio

        println("El area de la circunferencia es: $area")
        println("La longitud de la circunferencia es: $length")
    } // End exercise7()

    fun exercise8() {
        print("Ingrese el numero 1: "); val num1:Int = readln().toInt()
        print("Ingrese el numero 2: "); val num2:Int = readln().toInt()
        print("Ingrese el numero 3: "); val num3:Int = readln().toInt()

        val average: Int = (num1 + num2 + num3) / 3; println("El promedio de los 3 números es de: $average")
    } // End exercise8()

    when(selected){
        1 -> exercise1()
        2 -> exercise2()
        3 -> exercise3()
        4 -> exercise4()
        5 -> exercise5()
        6 -> exercise6()
        7 -> exercise7()
        8 -> exercise8()
        else -> println("Seleccionaste una opcion equivocada... el programa finalizó.")
    } // End when()

}// End operators()

fun conditionals() {
    println("Bienvenido a los operadores. Elige un operador del 1 al 7.")
    val selected = readln().toInt()

    fun exercise1() {
        print("Ingrese el numero: "); val number:Int = readln().toInt()
        if(number%2 == 0){println("El numero $number es par.")}else{println("El numero $number es impar.")}
    } // End exercise1()

    fun exercise2() {
        print("Ingrese el numero 1: "); val number1:Int = readln().toInt()
        print("Ingrese el numero 2: "); val number2:Int = readln().toInt()
        if(number1 > number2){print("El numero $number1 es mayor.")}else{print("El numero $number2 es mayor.")}
    } // End exercise2()

    fun exercise3() {
        print("Escriba el numero 1: "); val number1 = readln().toInt()
        print("Escriba el numero 2: "); val number2 = readln().toInt()
        print("Escriba el numero 3: "); val number3 = readln().toInt()

        if(number1 < 0){print("El numero $number1 es positivo")}else{print("El numero $number1 es negativo")}
        if(number2 < 0){print("El numero $number2 es positivo")}else{print("El numero $number2 es negativo")}
        if(number3 < 0){print("El numero $number3 es positivo")}else{print("El numero $number3 es negativo")}
    } // End exercise3()

    fun exercise4() {
        print("Escriba el numero 1: "); val number1 = readln().toInt()
        print("Escriba el numero 2: "); val number2 = readln().toInt()

        val result:Int = if(number1 > number2){
            number1 + number2
        }else{
            number1 - number2
        }

        print("Resultado $result")

    } // End exercise4()

    fun exercise5() {
        print("Escriba el numero 1: "); val number1 = readln().toInt()
        print("Escriba el numero 2: "); val number2 = readln().toInt()

        if(number1== 0 || number2 == 0) {
            print("No existe la division entre 0, intentalo nuevamente.")
        }else{
            val resultado = number1 / number2
            print("El resultado es: $resultado")
        }
    } // End exercise5()

    fun exercise6(){
        print("Escriba el numero 1: "); val number1 = readln().toInt()
        print("Escriba el numero 2: "); val number2 = readln().toInt()

        val result:Int = if(number1 < 0 || number2 < 0){
            number1 + number2
        }else{
            number1 * number2
        }

        print("El resultado es: $result")
    } // End exercise6()

    fun exercise7() {
        print("Escriba el año: "); val year = readln().toInt()

        if((year % 4 == 0) || ((year % 100 == 0) || (year % 400 == 0))){
            println("El año $year es biciesto.")
        }else{
            println("Lo siento, el año no es bicoesto")
        }
    } // End exercise7()

    when(selected) {
        1 -> exercise1()
        2 -> exercise2()
        3 -> exercise3()
        4 -> exercise4()
        5 -> exercise5()
        6 -> exercise6()
        7 -> exercise7()
        else -> println("Seleccionaste una opcion equivocada... el programa finalizó.")
    } // End when()

} // End conditionals()

fun cicles() {
    val selected = readln().toInt()

    fun exercise1() {
        val multiples = mutableListOf<Int>(100)
        for (i in 1..100) {
            if (i % 3 == 0) {
                multiples.add(i)
            }
        }

        println("La cantidad de números múltiplos de 3 son: $multiples")
    } // End exercise1()

    fun exercise2() {
        val uneven = mutableListOf<Int>(100)
        for (i in 1..100) {
            if (!(i % 2 == 0)) {
                uneven.add(i)
            }
        }

        println("La cantidad de números impares son: $uneven")
    } // End exercise2()

    fun exercise3() {
        val even = mutableListOf<Int>(100)
        for (i in 1..100) {
            if (i % 2 == 0) {
                even.add(i)
            }
        }

        println("La cantidad de números impares son: $even")
    } // End exercise3()

    fun exercise4() {
        val squares = mutableListOf<Int>(30)

        for (i in 1..30) {
            val selected = i * i

            squares.add(selected)
        }

        println("Los cuadrados del 1 al 30 son: $squares")
    } // End exercise4()

    fun exercise5() {
        val allSquares = mutableListOf<Int>()

        for (i in 1..100) {
            allSquares += i * i
        } // End for

        println("Los cuadrados sumados son: $allSquares")
    } // End exercise5()

    fun exercise6() {
        val lowNum = 2
        val hightNum = 10

        for (i in lowNum..hightNum) {
            println(i)
        }
    } // End exercise6()

    fun exercise7() {
        println("Digita cualquier numero mientras no sea 0, en caso de que pongas 0 el programa finalizará")

        var count = 0

        do {
            print("Digita nu numero: ");
            val wrote = readln().toInt()
            count += wrote

            println("EL sumado total es: $count")
        } while (wrote != 0)

        print("El programa finalizó por tu culpa...")
    } // End exercise7()

    when (selected) {
        1 -> exercise1()
        2 -> exercise2()
        3 -> exercise3()
        4 -> exercise4()
        5 -> exercise5()
        6 -> exercise6()
        7 -> exercise7()
        else -> println("Seleccionaste una opción equivocada... el programa finalizó.")
    } // End when()

} // End cicles()