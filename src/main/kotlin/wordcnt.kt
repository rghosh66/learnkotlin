
//This program find outs the frequency of letters in month of the year
fun main() {

    var months = arrayOf("January", "February", "March", "April", "May", "June",
        "July","September","October", "November", "December")
    var charCount = IntArray (26)

    var index = 0

    for( month in months){
        for(chr in month){

            when  (chr.code) {
                in 65..90 -> index = chr.code - 65
                in 97..122 -> index = chr.code - 97
                else -> println ("Error $month")

            }
            ++ charCount[index]
        }

    }
    println("Char distribution of letter in months")
    var j : Int = 0
    for (i in 'a'..'z'){
        println( "Char $i is -- ${charCount[j++]}")
    }


}

