package mmmlpmsw.testing.lab1

import Functions
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.mockito.Mockito

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestLayer2 {
    private lateinit var mock: BasicFunctions
    private val PERIOD = 2 * Math.PI

    @BeforeAll
    fun initMock() {
        mock = Mockito.mock(BasicFunctions::class.java)

        Mockito.`when`(mock.sin(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN)
        Mockito.`when`(mock.sin(0.0)).thenReturn(0.0)
        Mockito.`when`(mock.sin(-1.0E-8)).thenReturn(-1.0E-8)
        Mockito.`when`(mock.sin(-0.112)).thenReturn(-0.11176599215128519)
        Mockito.`when`(mock.sin(-0.5)).thenReturn(-0.479425538604203)
        Mockito.`when`(mock.sin(-0.64)).thenReturn(-0.5971954413623921)
        Mockito.`when`(mock.sin(-0.66)).thenReturn(-0.6131168519734338)
        Mockito.`when`(mock.sin(-2.25)).thenReturn(-0.7780731968879212)
        Mockito.`when`(mock.sin(-2.2818)).thenReturn(-0.7577072660385521)
        Mockito.`when`(mock.sin(-2.303)).thenReturn(-0.7437030314401835)
        Mockito.`when`(mock.sin(-2.344)).thenReturn(-0.7156767994719299)
        Mockito.`when`(mock.sin(-2.3561945)).thenReturn(-0.7071067742514882)
        Mockito.`when`(mock.sin(-2.359)).thenReturn(-0.7051202060028859)
        Mockito.`when`(mock.sin(-2.422)).thenReturn(-0.6590783719087934)
        Mockito.`when`(mock.sin(-2.42270101)).thenReturn(-0.6585509984311501)
        Mockito.`when`(mock.sin(-2.4381)).thenReturn(-0.6468850813353291)
        Mockito.`when`(mock.sin(-2.509)).thenReturn(-0.59123771094436)
        Mockito.`when`(mock.sin(-2.59999)).thenReturn(-0.5155099406832226)
        Mockito.`when`(mock.sin(-2.8)).thenReturn(-0.3349881501559051)
        Mockito.`when`(mock.sin(-3.1123781)).thenReturn(-0.029210398044887145)
        Mockito.`when`(mock.sin(-3.1637666)).thenReturn(0.022172129359472253)
        Mockito.`when`(mock.sin(-3.66)).thenReturn(0.4954973729168449)
        Mockito.`when`(mock.sin(-3.685426)).thenReturn(0.5174201006029461)
        Mockito.`when`(mock.sin(-3.8)).thenReturn(0.6118578909427189)
        Mockito.`when`(mock.sin(-5.889)).thenReturn(0.3840561025138906)
        Mockito.`when`(mock.sin(-5.95)).thenReturn(0.32705481486974064)
        Mockito.`when`(mock.sin(-6.1789174)).thenReturn(0.10407907994255686)
        Mockito.`when`(mock.sin(-6.28)).thenReturn(0.0031853017931379904)

        Mockito.`when`(mock.sin(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN)
        Mockito.`when`(mock.sin(0.0 + Math.PI/2)).thenReturn(1.0)
        Mockito.`when`(mock.sin(-1.0E-8 + Math.PI/2)).thenReturn(1.0)
        Mockito.`when`(mock.sin(-0.112 + Math.PI/2)).thenReturn(0.9937345535898603)
        Mockito.`when`(mock.sin(-0.5 + Math.PI/2)).thenReturn(0.8775825618903728)
        Mockito.`when`(mock.sin(-0.64 + Math.PI/2)).thenReturn(0.8020957578842927)
        Mockito.`when`(mock.sin(-0.66 + Math.PI/2)).thenReturn(0.7899922314973651)
        Mockito.`when`(mock.sin(-2.25 + Math.PI/2)).thenReturn(-0.6281736227227391)
        Mockito.`when`(mock.sin(-2.2818 + Math.PI/2)).thenReturn(-0.6525945900728742)
        Mockito.`when`(mock.sin(-2.303 + Math.PI/2)).thenReturn(-0.6685101353208353)
        Mockito.`when`(mock.sin(-2.344 + Math.PI/2)).thenReturn(-0.6984316134723678)
        Mockito.`when`(mock.sin(-2.3561945 + Math.PI/2)).thenReturn(-0.7071067881216069)
        Mockito.`when`(mock.sin(-2.359 + Math.PI/2)).thenReturn(-0.7090877908175035)
        Mockito.`when`(mock.sin(-2.422 + Math.PI/2)).thenReturn(-0.7520742647385658)
        Mockito.`when`(mock.sin(-2.42270101 + Math.PI/2)).thenReturn(-0.7525361004399294)
        Mockito.`when`(mock.sin(-2.4381 + Math.PI/2)).thenReturn(-0.7625874976327535)
        Mockito.`when`(mock.sin(-2.509 + Math.PI/2)).thenReturn(-0.8064973460323807)
        Mockito.`when`(mock.sin(-2.59999 + Math.PI/2)).thenReturn(-0.8568835983123847)
        Mockito.`when`(mock.sin(-2.8 + Math.PI/2)).thenReturn(-0.9422223406686581)
        Mockito.`when`(mock.sin(-3.1123781 + Math.PI/2)).thenReturn(-0.9995732852803036)
        Mockito.`when`(mock.sin(-3.1637666 + Math.PI/2)).thenReturn(-0.9997541681231776)
        Mockito.`when`(mock.sin(-3.66 + Math.PI/2)).thenReturn(-0.8686094366471648)
        Mockito.`when`(mock.sin(-3.685426 + Math.PI/2)).thenReturn(-0.855731523021115)
        Mockito.`when`(mock.sin(-3.8 + Math.PI/2)).thenReturn(-0.7909677119144168)
        Mockito.`when`(mock.sin(-5.889 + Math.PI/2)).thenReturn(0.9233097584894464)
        Mockito.`when`(mock.sin(-5.95 + Math.PI/2)).thenReturn(0.9450053693342275)
        Mockito.`when`(mock.sin(-6.1789174 + Math.PI/2)).thenReturn(0.9945690248134168)
        Mockito.`when`(mock.sin(-6.28 + Math.PI/2)).thenReturn(0.9999949269133752)

//--------------------------------------------------------------------------

        Mockito.`when`(mock.sin(-PERIOD + 0.0)).thenReturn(0.0)
        Mockito.`when`(mock.sin(-PERIOD + -1.0E-8)).thenReturn(-1.0E-8)
        Mockito.`when`(mock.sin(-PERIOD + -0.112)).thenReturn(-0.11176599215128519)
        Mockito.`when`(mock.sin(-PERIOD + -0.5)).thenReturn(-0.479425538604203)
        Mockito.`when`(mock.sin(-PERIOD + -0.64)).thenReturn(-0.5971954413623921)
        Mockito.`when`(mock.sin(-PERIOD + -0.66)).thenReturn(-0.6131168519734338)
        Mockito.`when`(mock.sin(-PERIOD + -2.25)).thenReturn(-0.7780731968879212)
        Mockito.`when`(mock.sin(-PERIOD + -2.2818)).thenReturn(-0.7577072660385521)
        Mockito.`when`(mock.sin(-PERIOD + -2.303)).thenReturn(-0.7437030314401835)
        Mockito.`when`(mock.sin(-PERIOD + -2.344)).thenReturn(-0.7156767994719299)
        Mockito.`when`(mock.sin(-PERIOD + -2.3561945)).thenReturn(-0.7071067742514882)
        Mockito.`when`(mock.sin(-PERIOD + -2.359)).thenReturn(-0.7051202060028859)
        Mockito.`when`(mock.sin(-PERIOD + -2.422)).thenReturn(-0.6590783719087934)
        Mockito.`when`(mock.sin(-PERIOD + -2.42270101)).thenReturn(-0.6585509984311501)
        Mockito.`when`(mock.sin(-PERIOD + -2.4381)).thenReturn(-0.6468850813353291)
        Mockito.`when`(mock.sin(-PERIOD + -2.509)).thenReturn(-0.59123771094436)
        Mockito.`when`(mock.sin(-PERIOD + -2.59999)).thenReturn(-0.5155099406832226)
        Mockito.`when`(mock.sin(-PERIOD + -2.8)).thenReturn(-0.3349881501559051)
        Mockito.`when`(mock.sin(-PERIOD + -3.1123781)).thenReturn(-0.029210398044887145)
        Mockito.`when`(mock.sin(-PERIOD + -3.1637666)).thenReturn(0.022172129359472253)
        Mockito.`when`(mock.sin(-PERIOD + -3.66)).thenReturn(0.4954973729168449)
        Mockito.`when`(mock.sin(-PERIOD + -3.685426)).thenReturn(0.5174201006029461)
        Mockito.`when`(mock.sin(-PERIOD + -3.8)).thenReturn(0.6118578909427189)
        Mockito.`when`(mock.sin(-PERIOD + -5.889)).thenReturn(0.3840561025138906)
        Mockito.`when`(mock.sin(-PERIOD + -5.95)).thenReturn(0.32705481486974064)
        Mockito.`when`(mock.sin(-PERIOD + -6.1789174)).thenReturn(0.10407907994255686)
        Mockito.`when`(mock.sin(-PERIOD + -6.28)).thenReturn(0.0031853017931379904)

//--------------------------------------------------------------------------

        Mockito.`when`(mock.sin(- 100 * PERIOD + 0.0)).thenReturn(0.0)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -1.0E-8)).thenReturn(-1.0E-8)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -0.112)).thenReturn(-0.11176599215128519)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -0.5)).thenReturn(-0.479425538604203)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -0.64)).thenReturn(-0.5971954413623921)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -0.66)).thenReturn(-0.6131168519734338)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.25)).thenReturn(-0.7780731968879212)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.2818)).thenReturn(-0.7577072660385521)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.303)).thenReturn(-0.7437030314401835)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.344)).thenReturn(-0.7156767994719299)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.3561945)).thenReturn(-0.7071067742514882)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.359)).thenReturn(-0.7051202060028859)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.422)).thenReturn(-0.6590783719087934)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.42270101)).thenReturn(-0.6585509984311501)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.4381)).thenReturn(-0.6468850813353291)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.509)).thenReturn(-0.59123771094436)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.59999)).thenReturn(-0.5155099406832226)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -2.8)).thenReturn(-0.3349881501559051)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -3.1123781)).thenReturn(-0.029210398044887145)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -3.1637666)).thenReturn(0.022172129359472253)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -3.66)).thenReturn(0.4954973729168449)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -3.685426)).thenReturn(0.5174201006029461)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -3.8)).thenReturn(0.6118578909427189)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -5.889)).thenReturn(0.3840561025138906)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -5.95)).thenReturn(0.32705481486974064)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -6.1789174)).thenReturn(0.10407907994255686)
        Mockito.`when`(mock.sin(- 100 * PERIOD + -6.28)).thenReturn(0.0031853017931379904)

//===========================================================================================
//                        positive values
//===========================================================================================

        Mockito.`when`(mock.ln(0.35)).thenReturn(-1.0498221244986778)
        Mockito.`when`(mock.ln(4.339)).thenReturn(1.4676439068162137)
        Mockito.`when`(mock.ln(10.0)).thenReturn(2.302585092994046)
        Mockito.`when`(mock.ln(100000.0)).thenReturn(11.512925464970229)
        Mockito.`when`(mock.ln(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN)

        Mockito.`when`(mock.ln(10.0)).thenReturn(2.302585092994)
        Mockito.`when`(mock.ln(5.0)).thenReturn(1.6094379124341)
        Mockito.`when`(mock.ln(2.0)).thenReturn(0.6931471805599)
    }

    @Test
    fun aaaaa() { //todo move to different tests
        val calculator = FunctionCalculator(Functions(mock))

        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(0.0))
        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(Double.POSITIVE_INFINITY))
        TestUtilities.assertBigDouble(Double.NaN, calculator.calculate(Double.NEGATIVE_INFINITY))

        TestUtilities.assertBigDouble(-1.562500435646825E110, calculator.calculate(-1.0E-8))
        TestUtilities.assertBigDouble(-7.199400495612413E12, calculator.calculate(-0.112))
        TestUtilities.assertBigDouble(-210297.749052139, calculator.calculate(-0.5))
        TestUtilities.assertBigDouble(-1757.8922042876907, calculator.calculate(-0.64))
        TestUtilities.assertBigDouble(-1.869931113367555E7, calculator.calculate(-0.66))
        TestUtilities.assertBigDouble(1.4542650843086908E7, calculator.calculate(-2.25))
        TestUtilities.assertBigDouble(4756791.712747779, calculator.calculate(-2.2818))
        TestUtilities.assertBigDouble(6892356.123178437, calculator.calculate(-2.303))
        TestUtilities.assertBigDouble(4.661155269375071E7, calculator.calculate(-2.344))
        TestUtilities.assertBigDouble(-92.41824433050677, calculator.calculate(-2.3561945))
        TestUtilities.assertBigDouble(-3.1853823000403974E7, calculator.calculate(-2.359))
        TestUtilities.assertBigDouble(2.610368742533695E7, calculator.calculate(-2.422))
        TestUtilities.assertBigDouble(-1206454.380274456, calculator.calculate(-2.42270101))
        TestUtilities.assertBigDouble(-2.5475768135351714E8, calculator.calculate(-2.4381))
        TestUtilities.assertBigDouble(-5500786.236013713, calculator.calculate(-2.509))
        TestUtilities.assertBigDouble(-2191.8274562229167, calculator.calculate(-2.59999))
        TestUtilities.assertBigDouble(-1937943.7119295588, calculator.calculate(-2.8))
        TestUtilities.assertBigDouble(-9.586844837741198E19, calculator.calculate(-3.1123781))
        TestUtilities.assertBigDouble(-1.220228680717506E21, calculator.calculate(-3.1637666))
        TestUtilities.assertBigDouble(0.9059008627982679, calculator.calculate(-3.66))
        TestUtilities.assertBigDouble(5594.949849617823, calculator.calculate(-3.685426))
        TestUtilities.assertBigDouble(1.9619132113330196E16, calculator.calculate(-3.8))
        TestUtilities.assertBigDouble(60720.80272095946, calculator.calculate(-5.889))
        TestUtilities.assertBigDouble(-2.2904271349315795, calculator.calculate(-5.95))
        TestUtilities.assertBigDouble(-9.314531252837875E9, calculator.calculate(-6.1789174))
        TestUtilities.assertBigDouble(-1.2658054556539495E33, calculator.calculate(-6.28))

        Assertions.assertEquals(5.633, calculator.calculate(0.35), 1E-3)
        Assertions.assertEquals(2.132, calculator.calculate(4.339), 1E-3)
        Assertions.assertEquals(2.517, calculator.calculate(10.0), 1E-3)
        Assertions.assertEquals(57.865, calculator.calculate(100000.0), 1E-3)
    }


}