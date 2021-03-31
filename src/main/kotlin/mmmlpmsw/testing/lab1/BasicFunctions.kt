package mmmlpmsw.testing.lab1

import java.lang.IllegalArgumentException
import kotlin.math.abs

open class BasicFunctions {
    private val PRECISION = 1E-12

    open fun sin(x: Double): Double {
        if (x == Double.NEGATIVE_INFINITY)
            return Double.NaN
        val x1 = x % (2 * Math.PI)
        if (abs(abs(x1) - Math.PI) < PRECISION || abs(abs(x1) - 2 * Math.PI) < PRECISION || abs(abs(x1) - 0.0) < PRECISION) {
            return 0.0
        }
        return sin(x1, x1)
    }

    private fun sin(x: Double, cur: Double, n: Int = 1, res: Double = 0.0): Double {
        if (abs(cur) < PRECISION) return res
        return sin(x, cur * (-x * x / (2.0 * n * (2.0 * n + 1.0))), n + 1, res + cur)
    }

    open fun ln(x: Double): Double {
        if (x <= 0)
            throw IllegalArgumentException("Cannot pass negative value to log")
        val x1 = (x - 1) / (x + 1)
        var cur = x1
        var res = 0.0
        var n = 3
        while (abs(2 * cur) > PRECISION / 10) {
            res += 2 * cur
            cur *= x1 * x1 / n * (n - 2)
            n += 2
        }
        return res
    }
}