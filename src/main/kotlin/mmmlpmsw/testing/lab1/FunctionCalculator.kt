package mmmlpmsw.testing.lab1

import Functions
import kotlin.math.pow

open class FunctionCalculator(val f: Functions) {
    private val log2 = f::log2
    private val log5 = f::log5
    private val log10 = f::log10
    private val ln = f::ln
    private val sin = f::sin
    private val cos = f::cos
    private val tan = f::tan
    private val cot = f::cot
    private val sec = f::sec
    private val csc = f::csc

    fun calculate(x: Double) =
            if (x > 0) log2(x) / log10(x) / log2(x) * (log2(x) + (log5(x).pow(3))) - log5(x) - ln(x)
            else
                    ((((((((((((((((((tan(x) + sin(x)) + cos(x)) * (tan(x) + tan(x))) / cos(x)).pow(2)).pow(2)) / tan(x)) / cot(x)).pow(2)) - ((tan(x).pow(2)) / csc(x))).pow(3)) - cos(x)) + cot(x)) + (((((cot(x).pow(3)) - cot(x)).pow(3)) * ((((sec(x) - csc(x)) / tan(x)) / tan(x)) / (cot(x).pow(3)))) + (csc(x) * (sec(x) / cot(x))))) - tan(x)) + cot(x)).pow(3)) / ((((((tan(x) + (cot(x) + sec(x))) / ((tan(x) * (sin(x) / (tan(x) + tan(x)))) + ((cot(x) - ((csc(x) + sin(x)) / cos(x))) / cot(x)))).pow(2)) / sec(x)).pow(3)) * ((csc(x) / ((cot(x) * (sec(x) - (sin(x).pow(3)))) * (cot(x) - (sin(x) / sin(x))))) + (csc(x) / (sec(x) - (sin(x) - (tan(x).pow(3))))))))

}