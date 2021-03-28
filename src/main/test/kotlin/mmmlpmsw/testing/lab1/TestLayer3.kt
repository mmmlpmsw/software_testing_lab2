//package mmmlpmsw.testing.lab1
//
//import org.junit.jupiter.api.Assertions
//import org.junit.jupiter.api.Test
//
//class TestLayer3 {
//    @Test
//    fun test() { //todo move to separate tests + check on period and in 100 * period
//        val calculator = FunctionCalculator()
//        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(0.0))
//        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(Double.POSITIVE_INFINITY))
//        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(Double.NEGATIVE_INFINITY))
//
//        TestUtilities.assertBigDouble(-1.562500435646825E110, calculator.calculate(-1.0E-8))
//        TestUtilities.assertBigDouble(-7.199400495612413E12, calculator.calculate(-0.112))
//        TestUtilities.assertBigDouble(-210297.749052139, calculator.calculate(-0.5))
//        TestUtilities.assertBigDouble(-1757.8922042876907, calculator.calculate(-0.64))
//        TestUtilities.assertBigDouble(-1.869931113367555E7, calculator.calculate(-0.66))
//        TestUtilities.assertBigDouble(1.4542650843086908E7, calculator.calculate(-2.25))
//        TestUtilities.assertBigDouble(4756791.712747779, calculator.calculate(-2.2818))
//        TestUtilities.assertBigDouble(6892356.123178437, calculator.calculate(-2.303))
//        TestUtilities.assertBigDouble(4.661155269375071E7, calculator.calculate(-2.344))
//        Assertions.assertEquals(0.0, calculator.calculate(-3 * Math.PI / 4), 1E-4)
//        TestUtilities.assertBigDouble(-3.1853823000403974E7, calculator.calculate(-2.359))
//        TestUtilities.assertBigDouble(2.610368742533695E7, calculator.calculate(-2.422))
//        TestUtilities.assertBigDouble(-1206454.380274456, calculator.calculate(-2.42270101))
//        TestUtilities.assertBigDouble(-2.5475768135351714E8, calculator.calculate(-2.4381))
//        TestUtilities.assertBigDouble(-5500786.236013713, calculator.calculate(-2.509))
//        TestUtilities.assertBigDouble(-2191.8274562229167, calculator.calculate(-2.59999))
//        TestUtilities.assertBigDouble(-1937943.7119295588, calculator.calculate(-2.8))
//        TestUtilities.assertBigDouble(-9.586844837741198E19, calculator.calculate(-3.1123781))
//        TestUtilities.assertBigDouble(-1.220228680717506E21, calculator.calculate(-3.1637666))
//        TestUtilities.assertBigDouble(0.9059008627982679, calculator.calculate(-3.66))
//        TestUtilities.assertBigDouble(5594.949849617823, calculator.calculate(-3.685426))
//        TestUtilities.assertBigDouble(1.9619132113330196E16, calculator.calculate(-3.8))
//        TestUtilities.assertBigDouble(60720.80272095946, calculator.calculate(-5.889))
//        TestUtilities.assertBigDouble(-2.2904271349315795, calculator.calculate(-5.95))
//        TestUtilities.assertBigDouble(-9.314531252837875E9, calculator.calculate(-6.1789174))
//        TestUtilities.assertBigDouble(-1.2658054556539495E33, calculator.calculate(-6.28))
//
//        Assertions.assertEquals(5.633, calculator.calculate(0.35), 1E-3)
//        Assertions.assertEquals(2.132, calculator.calculate(4.339), 1E-3)
//        Assertions.assertEquals(2.517, calculator.calculate(10.0), 1E-3)
//        Assertions.assertEquals(57.865, calculator.calculate(100000.0), 1E-3)
//    }
//}