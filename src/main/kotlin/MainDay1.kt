import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {

     //Part 1
    var firstElf = 0
    var current = 0

    val inputStream: InputStream = File("/Users/aft07/IdeaProjects/AdventOfCode2022/src/main/kotlin/Day1_Input.txt").inputStream()

    inputStream.bufferedReader().forEachLine { inputLine ->

        if (inputLine.isEmpty()) {

            if (current > firstElf) {
                firstElf = current
            }

            current = 0
        }
        else {
            current += inputLine.toInt()
        }

    }

    // Part 1 Answer
    println("highest elf = $firstElf")

    var secondElf = 0
    current = 0

    val inputStream2: InputStream = File("/Users/aft07/IdeaProjects/AdventOfCode2022/src/main/kotlin/Day1_Input.txt").inputStream()

    inputStream2.bufferedReader().forEachLine { inputLine ->

        if (inputLine.isEmpty()) {

            if (current < firstElf && current > secondElf) {
                secondElf = current
            }

            current = 0
        }
        else {
            current += inputLine.toInt()
        }
    }

    println("second elf = $secondElf")

    var thirdElf = 0
    current = 0

    val inputStream3: InputStream = File("/Users/aft07/IdeaProjects/AdventOfCode2022/src/main/kotlin/Day1_Input.txt").inputStream()

    inputStream3.bufferedReader().forEachLine { inputLine ->

        if (inputLine.isEmpty()) {

            if (current < secondElf && current > thirdElf) {
                thirdElf = current
            }

            current = 0
        }
        else {
            current += inputLine.toInt()
        }
    }

    println("third elf = $thirdElf")

    // Part 2 Answer
    println("Total 3 elves = ${firstElf + secondElf + thirdElf}")
}