package mmmlpmsw.testing.lab1

import org.junit.jupiter.api.Assertions
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow

class TestUtilities {
    companion object {
        const val PRECISION = 1E-4

        fun assertBigDouble(expected: Double, actual: Double) {
            Assertions.assertEquals(expected.getMantissa(), actual.getMantissa(), PRECISION)
            Assertions.assertEquals(expected.getOrder(), actual.getOrder())
        }

        private fun Double.getMantissa() = this / (10.0.pow(floor(log10(this))))

        private fun Double.getOrder() = log10(this).toInt()
    }
}