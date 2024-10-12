package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val length = string.length
    return if (length % 2 == 0) {
        val middleIndex = length / 2
        string.substring(middleIndex - 1, middleIndex + 1)
    } else {
        val middleIndex = length / 2
        string[middleIndex].toString()
    }
}
