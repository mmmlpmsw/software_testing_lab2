package mmmlpmsw.testing.lab1

import kotlin.math.*

class OriginalMath {

    private fun log5(x: Double) = ln(x) / ln(5.0)
    private fun csc(x: Double) = 1/sin(x)
    private fun sec(x: Double) = 1/cos(x)
    private fun cot(x: Double) = 1/tan(x)

    fun calculateOrigin(x: Double): Double {
        return if (x > 0) log2(x) / log10(x) / log2(x) * (log2(x) + (log5(x).pow(3))) - log5(x) - ln(x)
        else
            ((((((((((((((((((tan(x) + sin(x)) + cos(x)) * (tan(x) + tan(x))) /
                    cos(x)).pow(2)).pow(2)) / tan(x)) / cot(x)).pow(2)) -
                    ((tan(x).pow(2)) / csc(x))).pow(3)) - cos(x)) + cot(x)) +
                    (((((cot(x).pow(3)) - cot(x)).pow(3)) * ((((sec(x) - csc(x)) /
                            tan(x)) / tan(x)) / (cot(x).pow(3)))) + (csc(x) * (sec(x) /
                            cot(x))))) - tan(x)) + cot(x)).pow(3)) / ((((((tan(x) + (cot(x)
                    + sec(x))) / ((tan(x) * (sin(x) / (tan(x) + tan(x)))) + ((cot(x) -
                    ((csc(x) + sin(x)) / cos(x))) / cot(x)))).pow(2)) / sec(x)).pow(3)) *
                    ((csc(x) / ((cot(x) * (sec(x) - (sin(x).pow(3)))) * (cot(x) -
                            (sin(x) / sin(x))))) + (csc(x) / (sec(x) - (sin(x) - (tan(x).pow(3))))))))

    }
}