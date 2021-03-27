import mmmlpmsw.testing.lab1.BasicFunctions
import java.lang.Math.PI

class Functions(private val basicFunctions: BasicFunctions) {

    open fun sin(x: Double): Double = basicFunctions.sin(x)

    open fun cos(x: Double) = basicFunctions.sin(x - PI/2)

    open fun tan(x: Double) = sin(x)/cos(x)

    open fun cot(x: Double) = cos(x)/sin(x)

    open fun sec(x: Double) = 1/cos(x)

    open fun csc(x: Double) = 1/sin(x)

    open fun ln(x: Double) = basicFunctions.ln(x)

    open fun log2(x: Double): Double {
        return ln(x) / ln(2.0)
    }

    open fun log5(x: Double): Double {
        return ln(x) / ln(5.0)
    }

    open fun log10(x: Double): Double {
        return ln(x) / ln(10.0)
    }

}
//
//fun main() {
//    val function = Function()
//    var x = -2 * Math.PI
//    while (x <= 0) {
//        if (abs(function.calculate(x)) <= 1e-8)
//            println(x)
//        x+= 1e-12
//    }
//}