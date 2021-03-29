package mmmlpmsw.testing.lab1

import kotlin.math.*
import kotlin.math.log10

fun generateMock1st() {
    val vals = arrayListOf(
            -0.19, -0.2, -0.642, //f(x) = 0
            -0.915, -0.9331,  // local min
            -0.9351, //f(x) = 0
            -1.0501, -1.0514, //local max
            -1.054,
            -2.284, -2.285, // local min
            -2.29, -2.344, //local max
            - 3 * Math.PI/4, -2.4,
            -2.4227, //f(x) = 0
            -2.4401, // local min
            -2.5, -2.668, //local max
            -3.0, -3.3, -3.38, //f(x) = 0
            -3.542, -3.597,
            -5.497, -5.498, //f(x) = 0
            -5.501, -5.535, -5.537, -6.045, //f(x) = 0
            -6.05
    )

    for (v in vals) {
        val result = sin(v)
        println("Mockito.`when`(mock.sin($v)).thenReturn($result)")
    }

    for (v in vals) {
        val result = cos(v)
        println("Mockito.`when`(mock.cos($v)).thenReturn($result)")
    }

    for (v in vals) {
        val result = tan(v)
        println("Mockito.`when`(mock.tan($v)).thenReturn($result)")
    }

    for (v in vals) {
        val result = 1/tan(v)
        println("Mockito.`when`(mock.cot($v)).thenReturn($result)")
    }

    for (v in vals) {
        val result = 1/ cos(v)
        println("Mockito.`when`(mock.sec($v)).thenReturn($result)")
    }

    for (v in vals) {
        val result = 1/ sin(v)
        println("Mockito.`when`(mock.csc($v)).thenReturn($result)")
    }

}

fun generateTests1st() {
    val vals = arrayListOf(
            -0.19, -0.2, -0.642, //f(x) = 0
            -0.915, -0.9331,  // local min
            -0.9351, //f(x) = 0
            -1.0501, -1.0514, //local max
            -1.054,
            -2.284, -2.285, // local min
            -2.29, -2.344, //local max
//            - 3 * Math.PI/4, -2.4,
            -2.4227, //f(x) = 0
            -2.4401, // local min
            -2.5, -2.668, //local max
            -3.0, -3.3, -3.38, //f(x) = 0
            -3.542, -3.597,
            -5.497, -5.498, //f(x) = 0
            -5.501, -5.535, -5.537, -6.045, //f(x) = 0
            -6.05
    )

    val originalMath = OriginalMath()
    for (v in vals) {
        val result = originalMath.calculateOrigin(v)
        println("assertBigDouble($result, calculator.calculate($v))")
    }

}

fun generateForAsymptotes1st() {
    val EPS = 1e-8
    val values = arrayListOf( 0.0, 0.0 - EPS, -Math.PI/2, -Math.PI/2 - EPS, -Math.PI/2 + EPS,
            -Math.PI, -Math.PI - EPS, -Math.PI + EPS,
            -3 * Math.PI/2, -3 * Math.PI/2 - EPS, -3 * Math.PI/2 + EPS,
            -2 * PI + EPS
    )

    val valuesStr = arrayListOf( "0.0", "0.0 - EPS", "-Math.PI/2", "-Math.PI/2 - EPS", "-Math.PI/2 + EPS",
            "-Math.PI", "-Math.PI - EPS", "-Math.PI + EPS",
            "-3 * Math.PI/2", "-3 * Math.PI/2 - EPS", "-3 * Math.PI/2 + EPS",
            "-2 * PI + EPS"
    )

    for ((i, v) in values.withIndex()) {
        val result = sin(v)
        println("Mockito.`when`(mock.sin(${valuesStr[i]})).thenReturn($result)")
    }

    for ((i, v) in values.withIndex()) {
        val result = cos(v)
        println("Mockito.`when`(mock.cos(${valuesStr[i]})).thenReturn($result)")
    }

    for ((i, v) in values.withIndex()) {
        val result = tan(v)
        println("Mockito.`when`(mock.tan(${valuesStr[i]})).thenReturn($result)")
    }

    for ((i, v) in values.withIndex()) {
        val result = 1/tan(v)
        println("Mockito.`when`(mock.cot(${valuesStr[i]})).thenReturn($result)")
    }

    for ((i, v) in values.withIndex()) {
        val result = 1/cos(v)
        println("Mockito.`when`(mock.sec(${valuesStr[i]})).thenReturn($result)")
    }

    for ((i, v) in values.withIndex()) {
        val result = 1/sin(v)
        println("Mockito.`when`(mock.csc(${valuesStr[i]})).thenReturn($result)")
    }

}

fun generateLogMock1st() {
    //    val expected = arrayListOf(Double.NaN, -1.562500435646825E110,
//            -7.199400495612413E12, -210297.749052139, -1757.8922042876907, -1.869931113367555E7, 1.4542650843086908E7,
//            4756791.712747779, 6892356.123178437, 4.661155269375071E7, -92.41824433050677, -3.1853823000403974E7,
//            2.610368742533695E7, -1206454.380274456, -2.5475768135351714E8, -5500786.236013713, -2191.8274562229167,
//            -1937943.7119295588, -9.586844837741198E19, -1.220228680717506E21, 0.9059008627982679, 5594.949849617823,
//            1.9619132113330196E16, 60720.80272095946, -2.2904271349315795, -9.314531252837875E9, -1.2658054556539495E33
//    )
//
//    for (i in vals.indices) {
//        println("assertBigDouble(" + expected[i] + ", calculator.calculate(" + vals[i] + "), 1E-3)")
//    }

//    val logVals = arrayListOf(0.35, 4.339 , 10.0, 100000.0)

//    for (v in logVals) {
//        val result = log(v, 5.0)
//        println("Mockito.`when`(mock.log5($v)).thenReturn($result)")
//    }

//    val logExpected = arrayListOf(5.633, 2.132, 2.517, 57.865)
//
//    for (i in logVals.indices) {
//        println("assertEquals(" + logExpected[i] + ", calculator.calculate(" + logVals[i] + "), 1E-3)")
//    }
}

fun main() {

}
