
import java.io.File
import java.util.*

class Idea(_nounFile: String, _verbFile: String, _ideaFile: String) {
    val nounFile = _nounFile
    val verbFile = _verbFile
    val ideaFile = _ideaFile
    fun randomLine(fileName: String): String {
        return File(fileName).readLines().random()
    }

    fun randomIdea(): String = if (Math.random() >= 0.25) "${randomLine(verbFile)} the ${randomLine(nounFile)}" else "${randomLine(ideaFile)}"
    /*{
        val noun = randomLine(nounFile)
        val verb = randomLine(verbFile)
        val idea = randomLine(ideaFile)

        return Math.random() > 0.5 ?
    }*/
}

fun main() {
    var i: Int = 1
    println("Hello, welcome to the coding project idea generator!")
    while (i < 2) {

        val idea = Idea("src/nouns.txt", "src/verbs.txt", "src/listOfIdeas.txt")
        val ideaPick = idea.randomIdea()


        // Creates an instance which takes input from standard input (keyboard)
        val reader = Scanner(System.`in`)

        println("(1) - New idea")
        println("(2) - quit")
        // nextInt() reads the next integer from the keyboard
        i = reader.nextInt()
        if (i < 2) {
            println(ideaPick)
        }


    }

}