fun linearSearch(array: IntArray, target: Int): Int {
    for (index in array.indices) {
        if (array[index] == target) {
            return index
        }
    }
    return -1
}

fun main() {
    val numbers = intArrayOf(10, 20, 30, 40, 50)
    var target = 50
    var result = linearSearch(numbers, target)
    println(result)


    target = 20
    result = linearSearch(numbers, target)
    println(result)

    target = 76
    result = linearSearch(numbers, target)
    println(result)


}