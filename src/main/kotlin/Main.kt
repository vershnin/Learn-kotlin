fun main(args: Array<String>) {

    while (true) {
        println("Input hour from 0 to 24 or type \"exit\" to terminate the program:")
        var input = readLine()!!

        if (input == "exit"){
            break
        }

        if (input.toInt() <= 18) {
            println("Opened")
        } else {
            println("Closed")
        }

    }
}