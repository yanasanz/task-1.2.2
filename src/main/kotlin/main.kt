fun main() {
    val likes = 1
    val message = if (likes%100 != 11 && likes%10 == 1) "Понравилось $likes человеку" else "Понравилось $likes людям"
    println(message)
}