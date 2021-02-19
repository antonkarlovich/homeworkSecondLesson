fun main() {
    val itemPrice = 100
    val itemCount = 11

    val discountStart = 1_000
    val musicLover = false

    val totalPrice = itemPrice * itemCount
    val discount = totalPrice/100 * 5
    val mediumResult = if(totalPrice > discountStart) totalPrice - discount else totalPrice
    val discountForMusiclover = mediumResult/100 * 1

    val result = if(musicLover) mediumResult - discountForMusiclover else mediumResult

    println("the amount of purchases with discount: $result")


}