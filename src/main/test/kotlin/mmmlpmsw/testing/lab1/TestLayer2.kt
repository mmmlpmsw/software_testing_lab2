package mmmlpmsw.testing.lab1

import Functions
import mmmlpmsw.testing.lab1.TestUtilities.Companion.assertBigDouble
import org.junit.jupiter.api.*
import org.mockito.Mockito
import org.mockito.Mockito.`when`

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestLayer2 {
    private lateinit var calculator: FunctionCalculator
    private val PERIOD = 2 * Math.PI
    private val EPS = 1e-10

    @BeforeAll
    fun initMock() {
        val mock = Mockito.mock(BasicFunctions::class.java)
        calculator = FunctionCalculator(Functions(mock))

        `when`(mock.sin(0.0)).thenReturn(0.0)
        `when`(mock.sin(0.0 - EPS)).thenReturn(-1.0E-8)
        `when`(mock.sin(-Math.PI/2)).thenReturn(-1.0)
        `when`(mock.sin(-Math.PI/2 - EPS)).thenReturn(-1.0)
        `when`(mock.sin(-Math.PI/2 + EPS)).thenReturn(-1.0)
        `when`(mock.sin(-Math.PI)).thenReturn(-1.2246467991473532E-16)
        `when`(mock.sin(-Math.PI - EPS)).thenReturn(9.99999981676061E-9)
        `when`(mock.sin(-Math.PI + EPS)).thenReturn(-1.000000006168997E-8)
        `when`(mock.sin(-3 * Math.PI/2)).thenReturn(1.0)
        `when`(mock.sin(-3 * Math.PI/2 - EPS)).thenReturn(1.0)
        `when`(mock.sin(-3 * Math.PI/2 + EPS)).thenReturn(1.0)
        `when`(mock.sin(-2 * Math.PI + EPS)).thenReturn(1.000000018415465E-8)
        `when`(mock.sin(Math.PI/2 - 0.0)).thenReturn(1.0)
        `when`(mock.sin(Math.PI/2 - 0.0 - EPS)).thenReturn(1.0)
        `when`(mock.sin(Math.PI/2 -Math.PI/2)).thenReturn(6.123233995736766E-17)
        `when`(mock.sin(Math.PI/2 -Math.PI/2 - EPS)).thenReturn(-9.999999877992951E-9)
        `when`(mock.sin(Math.PI/2 -Math.PI/2 + EPS)).thenReturn(1.000000000045763E-8)
        `when`(mock.sin(Math.PI/2 -Math.PI)).thenReturn(-1.0)
        `when`(mock.sin(Math.PI/2 -Math.PI - EPS)).thenReturn(-1.0)
        `when`(mock.sin(Math.PI/2 -Math.PI + EPS)).thenReturn(-1.0)
        `when`(mock.sin(Math.PI/2 -3 * Math.PI/2)).thenReturn(-1.8369701987210297E-16)
        `when`(mock.sin(Math.PI/2 -3 * Math.PI/2 - EPS)).thenReturn(9.99999975552827E-9)
        `when`(mock.sin(Math.PI/2 -3 * Math.PI/2 + EPS)).thenReturn(-1.000000012292231E-8)
        `when`(mock.sin(Math.PI/2 -2 * Math.PI + EPS)).thenReturn(1.0)


        `when`(mock.sin(-0.19)).thenReturn(-0.18885889497650057)
        `when`(mock.sin(-0.2)).thenReturn(-0.19866933079506122)
        `when`(mock.sin(-0.642)).thenReturn(-0.5987984374182153)
        `when`(mock.sin(-0.915)).thenReturn(-0.7925625868748546)
        `when`(mock.sin(-0.9331)).thenReturn(-0.8034693714797926)
        `when`(mock.sin(-0.9351)).thenReturn(-0.8046584559315121)
        `when`(mock.sin(-1.0501)).thenReturn(-0.8674729783616071)
        `when`(mock.sin(-1.0514)).thenReturn(-0.8681189747588872)
        `when`(mock.sin(-1.054)).thenReturn(-0.8694065651016113)
        `when`(mock.sin(-2.284)).thenReturn(-0.7562697254476853)
        `when`(mock.sin(-2.285)).thenReturn(-0.755615087456462)
        `when`(mock.sin(-2.29)).thenReturn(-0.7523305763941707)
        `when`(mock.sin(-2.344)).thenReturn(-0.7156767994719299)
        `when`(mock.sin(-2.356194490192345)).thenReturn(-0.7071067811865476)
        `when`(mock.sin(-2.4)).thenReturn(-0.675463180551151)
        `when`(mock.sin(-2.4227)).thenReturn(-0.6585517584922757)
        `when`(mock.sin(-2.4401)).thenReturn(-0.6453586135871151)
        `when`(mock.sin(-2.5)).thenReturn(-0.5984721441039564)
        `when`(mock.sin(-2.668)).thenReturn(-0.45608645176503637)
        `when`(mock.sin(-3.0)).thenReturn(-0.1411200080598672)
        `when`(mock.sin(-3.3)).thenReturn(0.1577456941432482)
        `when`(mock.sin(-3.38)).thenReturn(0.236155320696897)
        `when`(mock.sin(-3.542)).thenReturn(0.3897935008794568)
        `when`(mock.sin(-3.597)).thenReturn(0.43982818074075963)
        `when`(mock.sin(-5.497)).thenReturn(0.7076631567751693)
        `when`(mock.sin(-5.498)).thenReturn(0.7069562530939006)
        `when`(mock.sin(-5.501)).thenReturn(0.7048313031440786)
        `when`(mock.sin(-5.535)).thenReturn(0.6803098478595606)
        `when`(mock.sin(-5.537)).thenReturn(0.6788426389607648)
        `when`(mock.sin(-6.045)).thenReturn(0.2359395559550809)
        `when`(mock.sin(-6.05)).thenReturn(0.23107778829939224)

        `when`(mock.sin(Math.PI/2 -0.19)).thenReturn(0.9820042351172703)
        `when`(mock.sin(Math.PI/2 -0.2)).thenReturn(0.9800665778412416)
        `when`(mock.sin(Math.PI/2 -0.642)).thenReturn(0.8008997636068472)
        `when`(mock.sin(Math.PI/2 -0.915)).thenReturn(0.6097905754324501)
        `when`(mock.sin(Math.PI/2 -0.9331)).thenReturn(0.5953460918607487)
        `when`(mock.sin(Math.PI/2 -0.9351)).thenReturn(0.5937379634972947)
        `when`(mock.sin(Math.PI/2 -1.0501)).thenReturn(0.4974843030814569)
        `when`(mock.sin(Math.PI/2 -1.0514)).thenReturn(0.49635616815304967)
        `when`(mock.sin(Math.PI/2 -1.054)).thenReturn(0.4940973836787822)
        `when`(mock.sin(-2.284 + Math.PI/2 )).thenReturn(-0.6542599654352104)
        `when`(mock.sin(Math.PI/2 -2.285)).thenReturn(-0.6550159079046579)
        `when`(mock.sin(Math.PI/2 -2.29)).thenReturn(-0.6587857799181878)
        `when`(mock.sin(Math.PI/2 -2.344)).thenReturn(-0.6984316134723678)
        `when`(mock.sin(Math.PI/2 -3 * Math.PI/4)).thenReturn(-0.7071067811865475)
        `when`(mock.sin(Math.PI/2 -2.4)).thenReturn(-0.7373937155412454)
        `when`(mock.sin(Math.PI/2 -2.4227)).thenReturn(-0.752535435303037)
        `when`(mock.sin(Math.PI/2 -2.4401)).thenReturn(-0.7638797417584241)
        `when`(mock.sin(Math.PI/2 -2.5)).thenReturn(-0.8011436155469337)
        `when`(mock.sin(Math.PI/2 -2.668)).thenReturn(-0.889935474355517)
        `when`(mock.sin(Math.PI/2 -3.0)).thenReturn(-0.9899924966004454)
        `when`(mock.sin(Math.PI/2 -3.3)).thenReturn(-0.9874797699088649)
        `when`(mock.sin(Math.PI/2 -3.38)).thenReturn(-0.9717153207120621)
        `when`(mock.sin(Math.PI/2 -3.542)).thenReturn(-0.920902289427134)
        `when`(mock.sin(Math.PI/2 -3.597)).thenReturn(-0.8980819402628435)
        `when`(mock.sin(Math.PI/2 -5.497)).thenReturn(0.7065499674778862)
        `when`(mock.sin(Math.PI/2 -5.498)).thenReturn(0.7072572772417635)
        `when`(mock.sin(Math.PI/2 -5.501)).thenReturn(0.709374960164383)
        `when`(mock.sin(Math.PI/2 -5.535)).thenReturn(0.7329246283931939)
        `when`(mock.sin(Math.PI/2 -5.537)).thenReturn(0.7342837813330652)
        `when`(mock.sin(Math.PI/2 -6.045)).thenReturn(0.9717677325038732)
        `when`(mock.sin(Math.PI/2 -6.05)).thenReturn(0.9729352782968974)

//=======================================================================================================

        `when`(mock.sin(-PERIOD - 0.0)).thenReturn(0.0)
        `when`(mock.sin(-PERIOD - 0.0 - EPS)).thenReturn(-1.0E-8)
        `when`(mock.sin(-PERIOD -Math.PI/2)).thenReturn(-1.0)
        `when`(mock.sin(-PERIOD -Math.PI/2 - EPS)).thenReturn(-1.0)
        `when`(mock.sin(-PERIOD -Math.PI/2 + EPS)).thenReturn(-1.0)
        `when`(mock.sin(-PERIOD -Math.PI)).thenReturn(-1.2246467991473532E-16)
        `when`(mock.sin(-PERIOD -Math.PI - EPS)).thenReturn(9.99999981676061E-9)
        `when`(mock.sin(-PERIOD -Math.PI + EPS)).thenReturn(-1.000000006168997E-8)
        `when`(mock.sin(-PERIOD -3 * Math.PI/2)).thenReturn(1.0)
        `when`(mock.sin(-PERIOD -3 * Math.PI/2 - EPS)).thenReturn(1.0)
        `when`(mock.sin(-PERIOD -3 * Math.PI/2 + EPS)).thenReturn(1.0)
        `when`(mock.sin(-PERIOD -2 * Math.PI + EPS)).thenReturn(1.000000018415465E-8)
        `when`(mock.sin(Math.PI/2 -PERIOD - 0.0)).thenReturn(1.0)
        `when`(mock.sin(Math.PI/2 -PERIOD - 0.0 - EPS)).thenReturn(1.0)
        `when`(mock.sin(Math.PI/2 -PERIOD -Math.PI/2)).thenReturn(6.123233995736766E-17)
        `when`(mock.sin(Math.PI/2 -PERIOD -Math.PI/2 - EPS)).thenReturn(-9.999999877992951E-9)
        `when`(mock.sin(Math.PI/2 -PERIOD -Math.PI/2 + EPS)).thenReturn(1.000000000045763E-8)
        `when`(mock.sin(Math.PI/2 -PERIOD -Math.PI)).thenReturn(-1.0)
        `when`(mock.sin(Math.PI/2 -PERIOD -Math.PI - EPS)).thenReturn(-1.0)
        `when`(mock.sin(Math.PI/2 -PERIOD -Math.PI + EPS)).thenReturn(-1.0)
        `when`(mock.sin(Math.PI/2 -PERIOD -3 * Math.PI/2)).thenReturn(-1.8369701987210297E-16)
        `when`(mock.sin(Math.PI/2 -PERIOD -3 * Math.PI/2 - EPS)).thenReturn(9.99999975552827E-9)
        `when`(mock.sin(Math.PI/2 -PERIOD -3 * Math.PI/2 + EPS)).thenReturn(-1.000000012292231E-8)
        `when`(mock.sin(Math.PI/2 -PERIOD -2 * Math.PI + EPS)).thenReturn(1.0)

        `when`(mock.sin(-PERIOD -0.19)).thenReturn(-0.18885889497650057)
        `when`(mock.sin(-PERIOD -0.2)).thenReturn(-0.19866933079506122)
        `when`(mock.sin(-PERIOD -0.642)).thenReturn(-0.5987984374182153)
        `when`(mock.sin(-PERIOD -0.915)).thenReturn(-0.7925625868748546)
        `when`(mock.sin(-PERIOD -0.9331)).thenReturn(-0.8034693714797926)
        `when`(mock.sin(-PERIOD -0.9351)).thenReturn(-0.8046584559315121)
        `when`(mock.sin(-PERIOD -1.0501)).thenReturn(-0.8674729783616071)
        `when`(mock.sin(-PERIOD -1.0514)).thenReturn(-0.8681189747588872)
        `when`(mock.sin(-PERIOD -1.054)).thenReturn(-0.8694065651016113)
        `when`(mock.sin(-PERIOD -2.284)).thenReturn(-0.7562697254476853)
        `when`(mock.sin(-PERIOD -2.285)).thenReturn(-0.755615087456462)
        `when`(mock.sin(-PERIOD -2.29)).thenReturn(-0.7523305763941707)
        `when`(mock.sin(-PERIOD -2.344)).thenReturn(-0.7156767994719299)
        `when`(mock.sin(-PERIOD -2.356194490192345)).thenReturn(-0.7071067811865476)
        `when`(mock.sin(-PERIOD -2.4)).thenReturn(-0.675463180551151)
        `when`(mock.sin(-PERIOD -2.4227)).thenReturn(-0.6585517584922757)
        `when`(mock.sin(-PERIOD -2.4401)).thenReturn(-0.6453586135871151)
        `when`(mock.sin(-PERIOD -2.5)).thenReturn(-0.5984721441039564)
        `when`(mock.sin(-PERIOD -2.668)).thenReturn(-0.45608645176503637)
        `when`(mock.sin(-PERIOD -3.0)).thenReturn(-0.1411200080598672)
        `when`(mock.sin(-PERIOD -3.3)).thenReturn(0.1577456941432482)
        `when`(mock.sin(-PERIOD -3.38)).thenReturn(0.236155320696897)
        `when`(mock.sin(-PERIOD -3.542)).thenReturn(0.3897935008794568)
        `when`(mock.sin(-PERIOD -3.597)).thenReturn(0.43982818074075963)
        `when`(mock.sin(-PERIOD -5.497)).thenReturn(0.7076631567751693)
        `when`(mock.sin(-PERIOD -5.498)).thenReturn(0.7069562530939006)
        `when`(mock.sin(-PERIOD -5.501)).thenReturn(0.7048313031440786)
        `when`(mock.sin(-PERIOD -5.535)).thenReturn(0.6803098478595606)
        `when`(mock.sin(-PERIOD -5.537)).thenReturn(0.6788426389607648)
        `when`(mock.sin(-PERIOD -6.045)).thenReturn(0.2359395559550809)
        `when`(mock.sin(-PERIOD -6.05)).thenReturn(0.23107778829939224)

        `when`(mock.sin(Math.PI/2 -PERIOD -0.19)).thenReturn(0.9820042351172703)
        `when`(mock.sin(Math.PI/2 -PERIOD -0.2)).thenReturn(0.9800665778412416)
        `when`(mock.sin(Math.PI/2 -PERIOD -0.642)).thenReturn(0.8008997636068472)
        `when`(mock.sin(Math.PI/2 -PERIOD -0.915)).thenReturn(0.6097905754324501)
        `when`(mock.sin(Math.PI/2 -PERIOD -0.9331)).thenReturn(0.5953460918607487)
        `when`(mock.sin(Math.PI/2 -PERIOD -0.9351)).thenReturn(0.5937379634972947)
        `when`(mock.sin(Math.PI/2 -PERIOD -1.0501)).thenReturn(0.4974843030814569)
        `when`(mock.sin(Math.PI/2 -PERIOD -1.0514)).thenReturn(0.49635616815304967)
        `when`(mock.sin(Math.PI/2 -PERIOD -1.054)).thenReturn(0.4940973836787822)
        `when`(mock.sin(-PERIOD -2.284 + Math.PI/2)).thenReturn(-0.6542599654352104)
        `when`(mock.sin(Math.PI/2 -PERIOD -2.285)).thenReturn(-0.6550159079046579)
        `when`(mock.sin(-PERIOD -2.29 + Math.PI/2)).thenReturn(-0.6587857799181878)
        `when`(mock.sin(-PERIOD -2.344 + Math.PI/2)).thenReturn(-0.6984316134723678)
        `when`(mock.sin(-PERIOD -3 * Math.PI/4 + Math.PI/2)).thenReturn(-0.7071067811865475)
        `when`(mock.sin( -PERIOD -2.4 + Math.PI/2)).thenReturn(-0.7373937155412454)
        `when`(mock.sin( -PERIOD -2.4227 + Math.PI/2)).thenReturn(-0.752535435303037)
        `when`(mock.sin( -PERIOD -2.4401 + Math.PI/2)).thenReturn(-0.7638797417584241)
        `when`(mock.sin( -PERIOD -2.5 + Math.PI/2)).thenReturn(-0.8011436155469337)
        `when`(mock.sin( -PERIOD -2.668 + Math.PI/2)).thenReturn(-0.889935474355517)
        `when`(mock.sin( -PERIOD -3.0 + Math.PI/2)).thenReturn(-0.9899924966004454)
        `when`(mock.sin( -PERIOD -3.3 + Math.PI/2)).thenReturn(-0.9874797699088649)
        `when`(mock.sin( -PERIOD -3.38 + Math.PI/2)).thenReturn(-0.9717153207120621)
        `when`(mock.sin( -PERIOD -3.542 + Math.PI/2)).thenReturn(-0.920902289427134)
        `when`(mock.sin( -PERIOD -3.597 + Math.PI/2)).thenReturn(-0.8980819402628435)
        `when`(mock.sin( -PERIOD -5.497 + Math.PI/2)).thenReturn(0.7065499674778862)
        `when`(mock.sin( -PERIOD -5.498 + Math.PI/2)).thenReturn(0.7072572772417635)
        `when`(mock.sin( -PERIOD -5.501 + Math.PI/2)).thenReturn(0.709374960164383)
        `when`(mock.sin( -PERIOD -5.535 + Math.PI/2)).thenReturn(0.7329246283931939)
        `when`(mock.sin( -PERIOD -5.537 + Math.PI/2)).thenReturn(0.7342837813330652)
        `when`(mock.sin( -PERIOD -6.045 + Math.PI/2)).thenReturn(0.9717677325038732)
        `when`(mock.sin( -PERIOD -6.05 + Math.PI/2)).thenReturn(0.9729352782968974)


//=======================================================================================================

        `when`(mock.sin(-100 * PERIOD - 0.0)).thenReturn(0.0)
        `when`(mock.sin(-100 * PERIOD - 0.0 - EPS)).thenReturn(-1.0E-8)
        `when`(mock.sin(-100 * PERIOD -Math.PI/2)).thenReturn(-1.0)
        `when`(mock.sin(-100 * PERIOD -Math.PI/2 - EPS)).thenReturn(-1.0)
        `when`(mock.sin(-100 * PERIOD -Math.PI/2 + EPS)).thenReturn(-1.0)
        `when`(mock.sin(-100 * PERIOD -Math.PI)).thenReturn(-1.2246467991473532E-16)
        `when`(mock.sin(-100 * PERIOD -Math.PI - EPS)).thenReturn(9.99999981676061E-9)
        `when`(mock.sin(-100 * PERIOD -Math.PI + EPS)).thenReturn(-1.000000006168997E-8)
        `when`(mock.sin(-100 * PERIOD -3 * Math.PI/2)).thenReturn(1.0)
        `when`(mock.sin(-100 * PERIOD -3 * Math.PI/2 - EPS)).thenReturn(1.0)
        `when`(mock.sin(-100 * PERIOD -3 * Math.PI/2 + EPS)).thenReturn(1.0)
        `when`(mock.sin(-100 * PERIOD -2 * Math.PI + EPS)).thenReturn(1.000000018415465E-8)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD - 0.0)).thenReturn(1.0)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD - 0.0 - EPS)).thenReturn(1.0)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -Math.PI/2)).thenReturn(6.123233995736766E-17)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -Math.PI/2 - EPS)).thenReturn(-9.999999877992951E-9)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -Math.PI/2 + EPS)).thenReturn(1.000000000045763E-8)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -Math.PI)).thenReturn(-1.0)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -Math.PI - EPS)).thenReturn(-1.0)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -Math.PI + EPS)).thenReturn(-1.0)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -3 * Math.PI/2)).thenReturn(-1.8369701987210297E-16)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -3 * Math.PI/2 - EPS)).thenReturn(9.99999975552827E-9)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -3 * Math.PI/2 + EPS)).thenReturn(-1.000000012292231E-8)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -2 * Math.PI + EPS)).thenReturn(1.0)

        `when`(mock.sin(-100 * PERIOD -0.19)).thenReturn(-0.18885889497650057)
        `when`(mock.sin(-100 * PERIOD -0.2)).thenReturn(-0.19866933079506122)
        `when`(mock.sin(-100 * PERIOD -0.642)).thenReturn(-0.5987984374182153)
        `when`(mock.sin(-100 * PERIOD -0.915)).thenReturn(-0.7925625868748546)
        `when`(mock.sin(-100 * PERIOD -0.9331)).thenReturn(-0.8034693714797926)
        `when`(mock.sin(-100 * PERIOD -0.9351)).thenReturn(-0.8046584559315121)
        `when`(mock.sin(-100 * PERIOD -1.0501)).thenReturn(-0.8674729783616071)
        `when`(mock.sin(-100 * PERIOD -1.0514)).thenReturn(-0.8681189747588872)
        `when`(mock.sin(-100 * PERIOD -1.054)).thenReturn(-0.8694065651016113)
        `when`(mock.sin(-100 * PERIOD -2.284)).thenReturn(-0.7562697254476853)
        `when`(mock.sin(-100 * PERIOD -2.285)).thenReturn(-0.755615087456462)
        `when`(mock.sin(-100 * PERIOD -2.29)).thenReturn(-0.7523305763941707)
        `when`(mock.sin(-100 * PERIOD -2.344)).thenReturn(-0.7156767994719299)
        `when`(mock.sin(-100 * PERIOD -2.356194490192345)).thenReturn(-0.7071067811865476)
        `when`(mock.sin(-100 * PERIOD -2.4)).thenReturn(-0.675463180551151)
        `when`(mock.sin(-100 * PERIOD -2.4227)).thenReturn(-0.6585517584922757)
        `when`(mock.sin(-100 * PERIOD -2.4401)).thenReturn(-0.6453586135871151)
        `when`(mock.sin(-100 * PERIOD -2.5)).thenReturn(-0.5984721441039564)
        `when`(mock.sin(-100 * PERIOD -2.668)).thenReturn(-0.45608645176503637)
        `when`(mock.sin(-100 * PERIOD -3.0)).thenReturn(-0.1411200080598672)
        `when`(mock.sin(-100 * PERIOD -3.3)).thenReturn(0.1577456941432482)
        `when`(mock.sin(-100 * PERIOD -3.38)).thenReturn(0.236155320696897)
        `when`(mock.sin(-100 * PERIOD -3.542)).thenReturn(0.3897935008794568)
        `when`(mock.sin(-100 * PERIOD -3.597)).thenReturn(0.43982818074075963)
        `when`(mock.sin(-100 * PERIOD -5.497)).thenReturn(0.7076631567751693)
        `when`(mock.sin(-100 * PERIOD -5.498)).thenReturn(0.7069562530939006)
        `when`(mock.sin(-100 * PERIOD -5.501)).thenReturn(0.7048313031440786)
        `when`(mock.sin(-100 * PERIOD -5.535)).thenReturn(0.6803098478595606)
        `when`(mock.sin(-100 * PERIOD -5.537)).thenReturn(0.6788426389607648)
        `when`(mock.sin(-100 * PERIOD -6.045)).thenReturn(0.2359395559550809)
        `when`(mock.sin(-100 * PERIOD -6.05)).thenReturn(0.23107778829939224)

        `when`(mock.sin(Math.PI/2 -100 * PERIOD -0.19)).thenReturn(0.9820042351172703)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -0.2)).thenReturn(0.9800665778412416)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -0.642)).thenReturn(0.8008997636068472)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -0.915)).thenReturn(0.6097905754324501)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -0.9331)).thenReturn(0.5953460918607487)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -0.9351)).thenReturn(0.5937379634972947)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -1.0501)).thenReturn(0.4974843030814569)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -1.0514)).thenReturn(0.49635616815304967)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -1.054)).thenReturn(0.4940973836787822)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -2.284)).thenReturn(-0.6542599654352104)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -2.285)).thenReturn(-0.6550159079046579)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -2.29)).thenReturn(-0.6587857799181878)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -2.344)).thenReturn(-0.6984316134723678)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -3 * Math.PI/4)).thenReturn(-0.7071067811865475)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -2.4)).thenReturn(-0.7373937155412454)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -2.4227)).thenReturn(-0.752535435303037)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -2.4401)).thenReturn(-0.7638797417584241)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -2.5)).thenReturn(-0.8011436155469337)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -2.668)).thenReturn(-0.889935474355517)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -3.0)).thenReturn(-0.9899924966004454)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -3.3)).thenReturn(-0.9874797699088649)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -3.38)).thenReturn(-0.9717153207120621)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -3.542)).thenReturn(-0.920902289427134)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -3.597)).thenReturn(-0.8980819402628435)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -5.497)).thenReturn(0.7065499674778862)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -5.498)).thenReturn(0.7072572772417635)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -5.501)).thenReturn(0.709374960164383)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -5.535)).thenReturn(0.7329246283931939)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -5.537)).thenReturn(0.7342837813330652)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -6.045)).thenReturn(0.9717677325038732)
        `when`(mock.sin(Math.PI/2 -100 * PERIOD -6.05)).thenReturn(0.9729352782968974)


//===========================================================================================
//                        positive values
//===========================================================================================

        `when`(mock.ln(0.35)).thenReturn(-1.0498221244986778)
        `when`(mock.ln(4.339)).thenReturn(1.4676439068162137)
        `when`(mock.ln(10.0)).thenReturn(2.302585092994046)
        `when`(mock.ln(100000.0)).thenReturn(11.512925464970229)
        `when`(mock.ln(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN)
        `when`(mock.ln(10.0)).thenReturn(2.302585092994)
        `when`(mock.ln(5.0)).thenReturn(1.6094379124341)
        `when`(mock.ln(2.0)).thenReturn(0.6931471805599)
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
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, calculator.calculate(0.0))
        TestUtilities.assertBigDouble(-1.562500435646825E110, calculator.calculate(0 - 1.0E-8))
    }

    @Test
    fun testAsymptotesAndCloserToThem() {
        assertAll (
                { assertBigDouble(Double.NaN, calculator.calculate(-Math.PI / 2)) },
                { assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-Math.PI / 2 + EPS)) },
                { assertBigDouble(Double.NaN, calculator.calculate(-Math.PI / 2 - EPS)) },
                { assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2)) },
                { assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 + EPS)) },
                { assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 - EPS)) },
                { assertBigDouble(Double.NaN, calculator.calculate(-2 * Math.PI)) },
                { assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-2 * Math.PI + EPS)) },

                {assertBigDouble(Double.NaN, calculator.calculate(-Math.PI / 2 - PERIOD))},
                {assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-Math.PI / 2 + EPS - PERIOD))},
                {assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-Math.PI / 2 - EPS - PERIOD))},
                {assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 - PERIOD))},
                {assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 + EPS - PERIOD))},
                {assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 - EPS - PERIOD))},
                {assertBigDouble(Double.NaN, calculator.calculate(-2 * Math.PI - PERIOD))},
                {assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-2 * Math.PI + EPS - PERIOD))},

                {assertBigDouble(Double.NaN, calculator.calculate(-Math.PI / 2 - 100 * PERIOD))},
                {assertBigDouble(Double.NEGATIVE_INFINITY, calculator.calculate(-Math.PI / 2 + EPS - 100 * PERIOD))},
                {assertBigDouble(Double.NaN, calculator.calculate(-Math.PI / 2 - EPS - 100 * PERIOD))},
                {assertBigDouble(Double.POSITIVE_INFINITY, calculator.calculate(-3 * Math.PI / 2 - 100 * PERIOD))},
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