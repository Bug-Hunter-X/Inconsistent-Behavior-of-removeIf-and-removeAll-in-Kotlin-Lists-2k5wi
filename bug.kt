fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val list2 = mutableListOf<Int>(1,2,3,4,5)
    list2.removeAll { it > 2 }
    println(list2) // Output: [1,2]

    val list3 = mutableListOf<String>("a", "b", "c", "d", "e")
    list3.removeIf { it.length > 1 }
    println(list3) // Output: [a, b, c, d, e]

    val list4 = mutableListOf<String>("a","b","c","d","e")
    list4.removeAll {it.length > 1}
    println(list4) // Output: [a, b, c, d, e]
}