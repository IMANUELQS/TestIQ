fun main(args:Array<String>){
   //Impresion de variable en consola
    var nombre:String = "Fany"
    //print("$nombre")
//--------------------------------------------------------------------------------
    // Tipos de variables
    //Integer
    //var a:Int = 5

    //String
    var nombres:String = "Isaac"

    //println(a)
    //print(nombre)
//-----------------------------------------------------------------------------------
    //Diferencia var y val
    // var es una variable que puede cambiar
    // val es una consonante no puede cambiar en el código (ejemplo una ruta)
//--------------------------------------------------------------------------------
    //Conversión de tipos de datos
    var a:Int = 5
    var b:String = "10"

    var c:Int = b.toInt()

   // print(c)

//-----------------------------------------------------------------------------
    //Declaración de variables nulos
    //Kotlin no permite variables nulas, se usa un operador para que los acpte

    val costo: Int? = 10 // asignar un valor opcionalmente nulo

    val total = if (costo != null) {
        costo + 50 // suma 50 al costo si no es nulo
    } else {
        0 // asigna 0 si el costo es nulo
    }

    //println("El total es: $total")

    //------------------------------------------------------------------------
    // Ingreso de datos

    var nombress:String = ""
//    print("Ingresa tú nombre:")
 //   nombress = readLine().toString() //readline permite guardar el dato tecleado

    //-----------------------------------------------------------
    //Incremento o decremento solo se antepone un ++ o -- antes de la variable
    //---------------------------------------------------------------------
    //Operadores relacionales
    // son aquellos qie solo pueden ser del tipo Integer
// < > = etc

    //-------------------------------------------------------
    // Operadores logicos  And &&, OR || ,  NOT !

    

}