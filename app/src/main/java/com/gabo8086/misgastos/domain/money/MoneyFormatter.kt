package com.gabo8086.misgastos.domain.money

/**
 * Formatea un monto en colones enteros para mostrarlo en la UI.
 * Ejemplo: 12200 -> "₡12 200".
 */
fun formatColones(amount: Long): String {
    val sign = if (amount < 0) "-" else ""
    val grouped = amount.toString()
        .trimStart('-')
        .reversed()
        .chunked(3)
        .joinToString(" ")
        .reversed()
    return "$sign₡$grouped"
}
