package mmmlpmsw.testing.lab1

import kotlin.math.*
import kotlin.math.log10

fun main() {
    val vals = arrayListOf(0.0, -0.00000001, -0.112, -0.5, -0.64, -0.66, -2.25, -2.2818, -2.303, -2.344, -2.3561945, -2.359,
            -2.422, -2.42270101, -2.4381, -2.509, -2.59999, -2.8, -3.1123781, -3.1637666, -3.66, -3.685426, -3.8,
            -5.889, -5.95, -6.1789174, -6.28
    )

//    for (v in vals) {
//        val result = 1/ sin(v)
//        println("Mockito.`when`(mock.csc(-PERIOD + $v)).thenReturn($result)")
//    }

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
