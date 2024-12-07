fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val list2 = mutableListOf<Int>(1,2,3,4,5)
    list2.removeAll { it > 2 }
    println(list2) // Output: [1,2]

    // Workaround for String list - Using filter to create a new list. 
    val list3 = mutableListOf<String>("a", "b", "c", "d", "e")
    val filteredList3 = list3.filter { it.length <= 1 }
    println(filteredList3) // Output: [a,b,c,d,e]

    // Workaround for String list - Using filter to create a new list. 
    val list4 = mutableListOf<String>("a","b","c","d","e")
    val filteredList4 = list4.filter { it.length <=1 }
    println(filteredList4) // Output: [a, b, c, d, e]
} 