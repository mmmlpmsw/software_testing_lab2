package mmmlpmsw.testing.lab1

import mmmlpmsw.testing.lab1.TestUtilities.Companion.assertBigDouble
import org.junit.jupiter.api.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestLayer3 {
    private lateinit var calculator: FunctionCalculator
    private val PERIOD = 2 * Math.PI
    private val EPS = 1e-10

    @BeforeAll
    fun init() {
        calculator = FunctionCalculator()
    }

    @Test
    fun testNearZeros() {
        assertBigDouble(-3167.644140250528, calculator.calculate(-0.642))
        assertBigDouble(2.949913573275083E64, calculator.calculate(-0.9351))
        Assertions.assertEquals(0.0, calculator.calculate(-3 * Math.PI / 4), 1E-3)
        assertBigDouble(-1168534.0723719394, calculator.calculate(-2.4227))
        assertBigDouble(-8.094330766072657E-15, calculator.calculate(-3.38))
        assertBigDouble(1.2539732706036974E55, calculator.calculate(-5.498))
        assertBigDouble(-1.1804506174592054E-14, calculator.calculate(-6.045))
    }

    @Test
    fun testLocalExtremums() {
        assertBigDouble(-1.1456688939070263E66, calculator.calculate(-0.9331))
        assertBigDouble(-2.1586232559181542E95, calculator.calculate(-1.0514))
        assertBigDouble(4689757.264512879, calculator.calculate(-2.285))
        assertBigDouble(4.661155269375071E7, calculator.calculate(-2.344))
        assertBigDouble(-2.5692678883176365E8, calculator.calculate(-2.4401))
        assertBigDouble(-7572.567532493296, calculator.calculate(-2.668))
        assertBigDouble(7.617779751608887E55, calculator.calculate(-5.501))
    }

    @Test
    fun testEquivalentTilingsPoints() {
        assertBigDouble(Double.NaN, calculator.calculate(Double.NEGATIVE_INFINITY))
        assertBigDouble(-2.057854457790956E10, calculator.calculate(-0.19))
        assertBigDouble(-1.186570401096842E10, calculator.calculate(-0.2))
        assertBigDouble(-1.5832491308009597E63, calculator.calculate(-0.915))
        assertBigDouble(-3.459139462413303E95, calculator.calculate(-1.0501))
        assertBigDouble(-3.637595146522363E95, calculator.calculate(-1.054))
        assertBigDouble(4698531.583429447, calculator.calculate(-2.284))
        assertBigDouble(4818554.651139655, calculator.calculate(-2.29))
        assertBigDouble(-1.1820018502257984E7, calculator.calculate(-2.5))
        assertBigDouble(-1.6274110779708395E11, calculator.calculate(-3.0))
        assertBigDouble(-2138073.650667048, calculator.calculate(-3.3))
        assertBigDouble(-28.266518244731415, calculator.calculate(-3.542))
        assertBigDouble(-9.846278079315185, calculator.calculate(-3.597))
        assertBigDouble(-6.282401637852932E55, calculator.calculate(-5.497))
        assertBigDouble(3.140387178975765E52, calculator.calculate(-5.535))
        assertBigDouble(1.8176701451466236E52, calculator.calculate(-5.537))
        assertBigDouble(-5.929431390477587E-5, calculator.calculate(-6.05))

    }

    @Test
    fun testZeroAndCloseToIt() {
        Assertions.assertEquals(Double.NaN, calculator.calculate(0.0))
        assertBigDouble(-1.562500435646825E110, calculator.calculate(0 - 1.0E-8))
    }

    @Test
    fun testAsymptotesAndCloserToThem() {
        assertAll (
                { assertBigDouble(Double.NaN, calculator.calculate(-Math.PI / 2)) },
                { assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-Math.PI / 2 + EPS)) },
                { assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-Math.PI / 2 - EPS)) },
                { assertBigDouble(Double.NaN, calculator.calculate(-3 * Math.PI / 2)) },
                { assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 + EPS)) },
                { assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 - EPS)) },
                { assertBigDouble(Double.NaN, calculator.calculate(-2 * Math.PI)) },
                { assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-2 * Math.PI + EPS)) },

                {assertBigDouble(Double.NaN, calculator.calculate(-Math.PI / 2 - PERIOD))},
                {assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-Math.PI / 2 + EPS - PERIOD))},
                {assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-Math.PI / 2 - EPS - PERIOD))},
                {assertBigDouble(Double.NaN, calculator.calculate(-3 * Math.PI / 2 - PERIOD))},
                {assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 + EPS - PERIOD))},
                {assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 - EPS - PERIOD))},
                {assertBigDouble(Double.NaN, calculator.calculate(-2 * Math.PI - PERIOD))},
                {assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-2 * Math.PI + EPS - PERIOD))},

                {assertBigDouble(Double.NaN, calculator.calculate(-Math.PI / 2 - 100 * PERIOD))},
                {assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-Math.PI / 2 + EPS - 100 * PERIOD))},
                {assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-Math.PI / 2 - EPS - 100 * PERIOD))},
                {assertBigDouble(Double.NaN, calculator.calculate(-3 * Math.PI / 2 - 100 * PERIOD))},
                {assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 + EPS - 100 * PERIOD))},
                {assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 - EPS - 100 * PERIOD))},
                {assertBigDouble(Double.NaN, calculator.calculate(-2 * Math.PI - 100 * PERIOD))},
                {assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-2 * Math.PI + EPS - 100 * PERIOD))}

        )
    }

    @Test
    fun testOnPeriod() {
        assertBigDouble(Double.NaN, calculator.calculate(Double.NEGATIVE_INFINITY))
        assertBigDouble(-2.057854457790956E10, calculator.calculate(-PERIOD - 0.19))
        assertBigDouble(-1.186570401096842E10, calculator.calculate(-PERIOD - 0.2))
        assertBigDouble(-3167.644140250528, calculator.calculate(-PERIOD - 0.642))
        assertBigDouble(-1.5832491308009597E63, calculator.calculate(-PERIOD - 0.915))
        assertBigDouble(-1.1456688939070263E66, calculator.calculate(-PERIOD - 0.9331))
        assertBigDouble(2.949913573275083E64, calculator.calculate(-PERIOD - 0.9351))
        assertBigDouble(-3.459139462413303E95, calculator.calculate(-PERIOD - 1.0501))
        assertBigDouble(-2.1586232559181542E95, calculator.calculate(-PERIOD - 1.0514))
        assertBigDouble(-3.637595146522363E95, calculator.calculate(-PERIOD - 1.054))
        assertBigDouble(4698531.583429447, calculator.calculate(-PERIOD - 2.284))
        assertBigDouble(4689757.264512879, calculator.calculate(-PERIOD - 2.285))
        assertBigDouble(4818554.651139655, calculator.calculate(-PERIOD - 2.29))
        assertBigDouble(4.661155269375071E7, calculator.calculate(-PERIOD - 2.344))
        Assertions.assertEquals(0.0, calculator.calculate(-PERIOD - 3 * Math.PI / 4), 1E-3)
        assertBigDouble(-1168534.0723719394, calculator.calculate(-PERIOD - 2.4227))
        assertBigDouble(-2.5692678883176365E8, calculator.calculate(-PERIOD - 2.4401))
        assertBigDouble(-1.1820018502257984E7, calculator.calculate(-PERIOD - 2.5))
        assertBigDouble(-7572.567532493296, calculator.calculate(-PERIOD - 2.668))
        assertBigDouble(-1.6274110779708395E11, calculator.calculate(-PERIOD - 3.0))
        assertBigDouble(-2138073.650667048, calculator.calculate(-PERIOD - 3.3))
        assertBigDouble(-8.094330766072657E-15, calculator.calculate(-PERIOD - 3.38))
        assertBigDouble(-28.266518244731415, calculator.calculate(-PERIOD - 3.542))
        assertBigDouble(-9.846278079315185, calculator.calculate(-PERIOD - 3.597))
        assertBigDouble(-6.282401637852932E55, calculator.calculate(-PERIOD - 5.497))
        assertBigDouble(1.2539732706036974E55, calculator.calculate(-PERIOD - 5.498))
        assertBigDouble(7.617779751608887E55, calculator.calculate(-PERIOD - 5.501))
        assertBigDouble(3.140387178975765E52, calculator.calculate(-PERIOD - 5.535))
        assertBigDouble(1.8176701451466236E52, calculator.calculate(-PERIOD - 5.537))
        assertBigDouble(-1.1804506174592054E-14, calculator.calculate(-PERIOD - 6.045))
        assertBigDouble(-5.929431390477587E-5, calculator.calculate(-PERIOD - 6.05))
    }

    @Test
    fun testOn100thPeriod() {
        assertBigDouble(Double.NaN, calculator.calculate(Double.NEGATIVE_INFINITY))
        assertBigDouble(-2.057854457790956E10, calculator.calculate(-100 * PERIOD - 0.19))
        assertBigDouble(-1.186570401096842E10, calculator.calculate(-100 * PERIOD - 0.2))
        assertBigDouble(-3167.644140250528, calculator.calculate(-100 * PERIOD - 0.642))
        assertBigDouble(-1.5832491308009597E63, calculator.calculate(-100 * PERIOD - 0.915))
        assertBigDouble(-1.1456688939070263E66, calculator.calculate(-100 * PERIOD - 0.9331))
        assertBigDouble(2.949913573275083E64, calculator.calculate(-100 * PERIOD - 0.9351))
        assertBigDouble(-3.459139462413303E95, calculator.calculate(-100 * PERIOD - 1.0501))
        assertBigDouble(-2.1586232559181542E95, calculator.calculate(-100 * PERIOD - 1.0514))
        assertBigDouble(-3.637595146522363E95, calculator.calculate(-100 * PERIOD - 1.054))
        assertBigDouble(4698531.583429447, calculator.calculate(-100 * PERIOD - 2.284))
        assertBigDouble(4689757.264512879, calculator.calculate(-100 * PERIOD - 2.285))
        assertBigDouble(4818554.651139655, calculator.calculate(-100 * PERIOD - 2.29))
        assertBigDouble(4.661155269375071E7, calculator.calculate(-100 * PERIOD - 2.344))
        Assertions.assertEquals(0.0, calculator.calculate(-100 * PERIOD - 3 * Math.PI / 4), 1E-3)
        assertBigDouble(-1168534.0723719394, calculator.calculate(-100 * PERIOD - 2.4227))
        assertBigDouble(-2.5692678883176365E8, calculator.calculate(-100 * PERIOD - 2.4401))
        assertBigDouble(-1.1820018502257984E7, calculator.calculate(-100 * PERIOD - 2.5))
        assertBigDouble(-7572.567532493296, calculator.calculate(-100 * PERIOD - 2.668))
        assertBigDouble(-1.6274110779708395E11, calculator.calculate(-100 * PERIOD - 3.0))
        assertBigDouble(-2138073.650667048, calculator.calculate(-100 * PERIOD - 3.3))
        assertBigDouble(-8.094330766072657E-15, calculator.calculate(-100 * PERIOD - 3.38))
        assertBigDouble(-28.266518244731415, calculator.calculate(-100 * PERIOD - 3.542))
        assertBigDouble(-9.846278079315185, calculator.calculate(-100 * PERIOD - 3.597))
        assertBigDouble(-6.282401637852932E55, calculator.calculate(-100 * PERIOD - 5.497))
        assertBigDouble(1.2539732706036974E55, calculator.calculate(-100 * PERIOD - 5.498))
        assertBigDouble(7.617779751608887E55, calculator.calculate(-100 * PERIOD - 5.501))
        assertBigDouble(3.140387178975765E52, calculator.calculate(-100 * PERIOD - 5.535))
        assertBigDouble(1.8176701451466236E52, calculator.calculate(-100 * PERIOD - 5.537))
        assertBigDouble(-1.1804506174592054E-14, calculator.calculate(-100 * PERIOD - 6.045))
        assertBigDouble(-5.929431390477587E-5, calculator.calculate(-100 * PERIOD - 6.05))
    }

    @Test
    fun testLogFunction() {
        assertBigDouble(Double.NaN, calculator.calculate(Double.POSITIVE_INFINITY))
        Assertions.assertEquals(5.633, calculator.calculate(0.35), 1E-3)
        Assertions.assertEquals(2.132, calculator.calculate(4.339), 1E-3)
        Assertions.assertEquals(2.517, calculator.calculate(10.0), 1E-3)
        Assertions.assertEquals(57.865, calculator.calculate(100000.0), 1E-3)
    }
}