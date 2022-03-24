package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    val fooBarMap = mapOf(3 to "Foo", 5 to "Bar")

    /**
     *Convert number to String if exist
     *@param inputNumber
     * @return String result
     */
    fun convertNumber(inputNumber: Int): String {
        val result = StringBuilder()
        fooBarMap.forEach { (k, v) ->
            if (inputNumber % k == 0) {
                result.append(v)
            }
        }
        getStringFromNumber(inputNumber, fooBarMap, result)
        return result.toString().ifEmpty {
            inputNumber.toString() }

    }

    /**
     * Update result if inputNumber exist in Map
     *@param inputNumber
     *@param fooBarMap
     *@param result
     */
    private fun getStringFromNumber(inputNumber: Int, fooBarMap: Map<Int, String>, result: StringBuilder) {
        val fooBarQuixMap = fooBarMap + Pair(7,"Quix")
        for(digit in inputNumber.toString()){
            val number = Integer.valueOf(digit.toString())
            if(fooBarQuixMap.keys.contains(number)){
                result.append(fooBarQuixMap[number])
            }
        }
    }
}