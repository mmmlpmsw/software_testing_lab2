package mmmlpmsw.testing.lab1

import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter
import kotlin.math.abs

class Utilities(private val calculator: FunctionCalculator) {

    private val log2 = calculator.f::log2
    private val log5 = calculator.f::log5
    private val log10 = calculator.f::log10
    private val ln = calculator.f::ln
    private val sin = calculator.f::sin
    private val cos = calculator.f::cos
    private val tan = calculator.f::tan
    private val cot = calculator.f::cot
    private val sec = calculator.f::sec
    private val csc = calculator.f::csc

    fun createSCV(from: Double, to: Double, step: Double) {
        try {
            PrintWriter(File("out.csv")).use { writer ->
                writer.println("x,f(x),sin(x),cos(x),tan(x),cot(x),sec(x),csc(x),log(x),log2(x),log5(x),log10(x)")
                var x: Double = from
                while (x < to) {
                    writer.print("$x, ${calculator.calculate(x)}, " +
                            "${sin(x)}, ${cos(x)}, ${tan(x)}, ${cot(x)}, ${sec(x)}, " +
                            "${csc(x)}, ")
                    writer.println(
                            if (x > 0)  "${ln(x)}, ${log2(x)}, ${log5(x)}, ${log10(x)}"
                            else        "NaN, NaN, NaN, NaN, NaN"
                    )
                    x += step
                    if (abs(x) <= 1e-6)
                        x = 0.0
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }
}

fun main() {
    Utilities(FunctionCalculator()).createSCV(-8.0, 10.0, 0.1)
}