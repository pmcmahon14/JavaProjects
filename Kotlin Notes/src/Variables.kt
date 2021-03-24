fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    var patrick = "Patrick McMahon"
    println(patrick)

    var patricksWeeklySalary = 32
    var patricksMonthlySalary = patricksWeeklySalary * 4
    println("Patrick's weekly salary is $$patricksWeeklySalary")
    println("Monthly, that comes to $$patricksMonthlySalary")

    println()

    val apples = 6
    val oranges = 5
    var fruit = apples - oranges
    println("$apples apples - $oranges oranges leaves $fruit piece(s) of fruit")

    println("A quarter of the apples is ${apples / 4}")

    println()
    val weeks = 234
    val years = weeks / 52.0
    println("$weeks weeks is $years years")

    println("My name is $patrick")
    println("I can print \$patrick")
}