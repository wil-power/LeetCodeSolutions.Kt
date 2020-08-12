package easy

import kotlin.system.measureTimeMillis

fun shuffle(nums: IntArray, n: Int): IntArray {
    val y = mutableListOf<Int>()
    val x = mutableListOf<Int>()
    nums.forEachIndexed { index, i ->
        if (index >= n) {
            y.add(i)
            return@forEachIndexed
        }
        x.add(i)
    }
    var yIndex = -1
    var xIndex = -1
    return IntArray(nums.size) {
        when (it % 2) {
            0 -> {
                x[++xIndex]
            }
            else -> {
                y[++yIndex]
            }
        }
    }
}

fun main() {
    println(measureTimeMillis {
        println(shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3).toList())
    })
}
