package easy

import kotlin.system.measureTimeMillis

fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
    var max = candies[0]
    for (i in 1..candies.lastIndex) {
        val e = candies[i]
        if (e > max)
            max = e
    }
    return BooleanArray(candies.size) {
        candies[it] + extraCandies >= max
    }
}

fun main() {
    println(measureTimeMillis {
        println(kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3).toList())
    })
}
