fun main(args:Array<String>) {

    println("Ingresa un número")

    var a: Int = readLine()?.toInt() ?: 0

    if (a <= 15)
    {
            println("El valor de la variable es menor o igual a 15")
    }
    else
    {
    println("El valor de la variable es mayor o igual a 15")
}
}