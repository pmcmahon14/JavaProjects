fun main(args: Array<String>) {
    val patrick = Player("Patrick")
//    println(tim.name)
//    println(tim.lives)
//    println(tim.level)
//    println(tim.score)
    patrick.show()

    val dawn = Player("Dawn", 5)
    dawn.show()

    val gr8 = Player("gr8", 4, 8)
    val one2watch = Player("Ace",2, 5, 1000)
    gr8.show()
    one2watch.show()
}