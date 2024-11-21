package com.qomunal.opensource.androidresearch.common.ext

import java.text.NumberFormat
import java.util.Locale

/**
 * Created by faisalamircs on 13/01/2024
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */

fun Number.toLocaleCurrency(country: String = "ID", lang: String = "id"): String {
    return NumberFormat.getCurrencyInstance(Locale(lang, country)).format(this).removeSuffix(",00")
}
