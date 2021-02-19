fun main() {
    val peopleCount = 21

    val likes = if(peopleCount % 10 == 1) "cheloveku" else {
        "ludym"
    }
    println("Ponravilos $peopleCount $likes" )
}