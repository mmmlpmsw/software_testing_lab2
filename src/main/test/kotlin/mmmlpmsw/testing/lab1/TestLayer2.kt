package mmmlpmsw.testing.lab1

import Functions
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.mockito.Mockito

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestLayer2 {
    private lateinit var calculator: FunctionCalculator
    private val PERIOD = 2 * Math.PI
    private val EPS = 1e-10

    @BeforeAll
    fun initMock() {
        val mock = Mockito.mock(BasicFunctions::class.java)

        calculator = FunctionCalculator(Functions(mock))
    }


    @Test
    fun testAsymptotesAndCloserToThem() {
        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(-Math.PI / 2))
        TestUtilities.assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-Math.PI / 2 + EPS))
        TestUtilities.assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-Math.PI / 2 - EPS))
        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(-3 * Math.PI / 2))
        TestUtilities.assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 + EPS))
        TestUtilities.assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 - EPS))

        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(-Math.PI / 2 - PERIOD))
        TestUtilities.assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-Math.PI / 2 + EPS - PERIOD))
        TestUtilities.assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-Math.PI / 2 - EPS - PERIOD))
        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(-3 * Math.PI / 2 - PERIOD))
        TestUtilities.assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 + EPS - PERIOD))
        TestUtilities.assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 - EPS - PERIOD))

        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(-Math.PI / 2 - 100 * PERIOD))
        TestUtilities.assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-Math.PI / 2 + EPS - 100 * PERIOD))
        TestUtilities.assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-100 * PERIOD - Math.PI / 2 - EPS))
        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(-3 * Math.PI / 2 - 100 * PERIOD))
        TestUtilities.assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 + EPS - 100 * PERIOD))
        TestUtilities.assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 - EPS - 100 * PERIOD))
    }
}