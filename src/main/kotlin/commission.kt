fun main() {
    val amount = 1000000
    val commission = if(amount < 466_666) {
        3500
    } else (amount/100) * 0.75

    println(commission)
}