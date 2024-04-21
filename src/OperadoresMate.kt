fun main(args:Array<String>){
    // operadores aritméticos

    println("Ingrese un primer número: ")
    var a:Int = readLine()?.toInt()?:0

    println("Ingrese un segundo número: ")
    var b:Int = readLine()?.toInt()?:0

    //Operación
    var resultado:Int
    resultado = a * b

    println("El resultado es: " + resultado)

}