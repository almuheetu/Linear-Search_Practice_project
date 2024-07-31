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
    println(numbers.find { it == 35 })
    var target = 50
    var result = linearSearch(numbers, target)
    println(result)


    target = 20
    result = linearSearch(numbers, target)
    println(result)

    target = 76
    result = linearSearch(numbers, target)
    println(result)


    val array = intArrayOf(1,3,4,5,6,7,8,9,10,34,21,32,31,90)
    val arrayIndex = 90
    val foundIndex = linearSearch(array, arrayIndex)
    println(foundIndex)

}