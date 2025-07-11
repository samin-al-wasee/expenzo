package com.saw.expenzo

fun toCamelCase(text: String) = text.split(Regex("[\\s_-]+"))
    .mapIndexed { index, word -> if (index == 0) word.lowercase() else word.replaceFirstChar { it.uppercaseChar() } }
    .joinToString("")
