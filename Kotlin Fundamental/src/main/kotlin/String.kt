/*fun main(){
    val text = "Kotlin"
    val firstChar = text[0]
    print("First character of $text is $firstChar")
}

 */
/*fun main(){
    val text = "Kotlin"
    for (char in text){
        print("$char ")
    }
}
 */
/*fun main() {
    val name = "Unicode test: \u0394"
    print(name)
}*/
/*fun main() {
    val line = """ 
    Line 1 
    Line 2 
    Line 3 
    Line 4 
     """.trimIndent()
    print(line)  }*/
fun main(){
    val wordOne = "Modern"
    val wordTwo = "Concise"
    val wordThree = "Pragmatic"
    val wordFOur = "Safe"

    val row ="""
        kotlin is $wordOne
        kotlin is $wordTwo
        kotlin is $wordThree
        kotlin is $wordFOur
    """.trimIndent()
    print(row)

}