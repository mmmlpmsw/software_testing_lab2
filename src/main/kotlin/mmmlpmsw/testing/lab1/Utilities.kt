package mmmlpmsw.testing.lab1

import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter

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

    private val CSV_HEADER =
            "x,f(x),sin(x),cos(x),tan(x),cot(x),sec(x),csc(x),log_2(x),log_3(x),log_5(x),log_10(x),ln(x)\n"
    private val FILENAME = "out.csv"

    fun createSCV(from: Double, to: Double, step: Double) {
        try {
            PrintWriter(File("test.csv")).use { writer ->
                val sb = StringBuilder()
                var cur: Double = from
                sb.append("X, Y, sin(X), cos(X), tan(X), cot(X), sec(X), csc(X) \n")
                while (cur < to) {
                    sb.append(cur).append(", ").append(calculator.calculate(cur)).append(", ").append(sin(cur)).append(", ").append(cos(cur))
                            .append(", ").append(tan(cur)).append(", ").append(cot(cur)).append(", ").append(sec(cur)).append(", ")
                            .append(csc(cur)).append("\n")
                    cur += step
                }
                writer.write(sb.toString())
                writer.flush()
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }
}

fun main() {
    Utilities(FunctionCalculator()).createSCV(-2 * Math.PI, 0.0, 1.0)
}