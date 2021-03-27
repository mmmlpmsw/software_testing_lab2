package mmmlpmsw.testing.lab1

import java.io.File
import java.io.FileNotFoundException
import java.io.FileWriter

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
    private val FILENAME = "out/out.csv"

    fun createSCV(from: Double, to: Double, step: Double) {
        var fileWriter: FileWriter?
        try {
            fileWriter = FileWriter(FILENAME)
        } catch (e: FileNotFoundException) {
            File(FILENAME).createNewFile()
            fileWriter = FileWriter(FILENAME)
        }
        fileWriter!!.append(CSV_HEADER)
        var cur = from
        while (cur < to) {
            fileWriter.append(
                    "$cur,${calculator.calculate(cur)},${sin(cur)},${cos(cur)}," +
                            "${tan(cur)},${cot(cur)},${sec(cur)},${csc(cur)},${log2(cur)}," +
                            "${log5(cur)},${log10(cur)},${ln(cur)}\n"
            )
            cur += step
        }
        fileWriter.flush()
        fileWriter.close()
    }
}