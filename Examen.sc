//Pregunta 1
//Transforme el siguiente método Java desarrollado de forma imperativa a una versión funcional utilizando Scala
def myMethod(datos: List[Double]): Double = {
   val logs = datos.map(math.log)
   val promedioLogs = logs.sum / logs.length
   val sumaCuadrados = logs.map(l => math.pow(l-promedioLogs,2))
   math.sqrt(sumaCuadrados.sum / logs.length)
}

//Pregunta 2
//Ajuste de precios con políticas variables
//
//En una tienda digital se trabaja con listas de precios que necesitan ser ajustadas antes de ser
// mostradas al usuario. De acuerdo con el país, la temporada o las promociones vigentes, el ajuste
// puede consistir en agregar un impuesto, aplicar un descuento o modificar el precio según cierta
// estrategia comercial. Se requiere elaborar una solución donde exista una única función capaz de
// recibir la lista de precios y, además, la función que representa la regla de ajuste que se quiera
// aplicar en ese momento. Esta función deberá retornar una nueva lista de precios ya modificados de
// acuerdo con la política específica que se haya suministrado.
def ajustePrecio(precios: List[Double], politica: Double): List[Double] = {
  precios.map(politica)
}


//Pregunta 3
//Transforme la función anónima a una función con nombre
//val generadorIncrementadorAnonimo: Int => (Int => Int) =
//  (incremento: Int) =>
//    (x: Int) =>
//      x + incremento
def generadorIncrementadorAnonimo(incremento: Int): Int => Int = {
  def incrementar(x: Int): Int = x + incremento
  incrementar
}
//Con ia
//Primera pregunta
def myMetho(datos: List[Double]): Double = {
  val logs = datos.map(Math.log)

  val promedioLog = logs.sum / logs.size

  val sumaCuadrados = logs.map(x => math.pow(x - promedioLog, 2)).sum

  math.sqrt(sumaCuadrados / logs.size)
}
//Segunda pregunta
def ajustarPrecios(precios: List[Double], politica: Double => Double): List[Double] = {
  precios.map(politica)
}
//Tercera pregunta
def generadorIncrementador(incremento: Int): Int => Int = {
  def incrementar(x: Int): Int = x + incremento
  incrementar
}
