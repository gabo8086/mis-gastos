package com.gabo8086.misgastos.domain.money

import org.junit.Assert.assertEquals
import org.junit.Test

class MoneyFormatterTest {

    @Test
    fun `monto menor a mil no lleva separador`() {
        assertEquals("₡871", formatColones(871))
    }

    @Test
    fun `monto de cuatro cifras agrupa con espacio`() {
        assertEquals("₡7 200", formatColones(7200))
        assertEquals("₡12 200", formatColones(12200))
    }

    @Test
    fun `monto de seis cifras agrupa cada tres digitos`() {
        assertEquals("₡1 250 000", formatColones(1250000))
    }

    @Test
    fun `cero se muestra sin signo`() {
        assertEquals("₡0", formatColones(0))
    }

    @Test
    fun `monto negativo conserva el signo`() {
        assertEquals("-₡500", formatColones(-500))
    }
}
