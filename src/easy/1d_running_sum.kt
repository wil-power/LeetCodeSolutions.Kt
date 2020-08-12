package easy

import kotlin.system.measureTimeMillis

fun runningSum(nums: IntArray): IntArray {
    val reversed = nums.reversed()
    return reversed.mapIndexed { index, i ->
        if (index == reversed.size) return@mapIndexed i
        var num = i
        for (j in index..reversed.size)
            num += reversed.getOrElse(j + 1) { 0 }
        num
    }.reversed().toIntArray()
}

fun main() {
    println(measureTimeMillis {
        println(runningSum(intArrayOf(1, 2, 3, 4)).toList())
    })
}
