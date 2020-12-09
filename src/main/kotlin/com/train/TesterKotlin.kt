package com.trainkt

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var numbers = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundTrip = scanner.nextInt()

    val t = Tickets(numbers, roundTrip)
    t.print()
}

class Tickets(var numbers : Int, var roundTrip : Int) {
    fun print() {
        var total = (numbers - roundTrip) * 1000 + (roundTrip * 2000 * 0.9f).toInt()
        println("Total tickets: $numbers\tRound-trip: $roundTrip\tTotal: $total")
    }
}