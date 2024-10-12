package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    if (str.length > 100 || int > 100) {
        throw IllegalArgumentException("out of range, 1 - 100 only")
    }
    val digits = str.filter {
        it.isDigit()
    }.toIntOrNull() ?: 0
    val nonDigits = str.filter {
        !it.isDigit()
    }
    if (digits == 0) {
        val result = nonDigits + int
        return result
    } else {
        val result = nonDigits + (digits * int)
        return result
    }
}
