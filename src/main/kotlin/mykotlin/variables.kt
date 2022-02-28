package mykotlin

import java.util.*

class Person(var id: Int, var name: String, val yob:Int){

    init{
        name = name.uppercase(Locale.getDefault())
    }
    val email: String
    get() = "$name"+ "@myco.com"

    var age : Int = 18
        get()= field
      set(v){

          if (v < 0)
    {
        field = Calendar.YEAR.toInt() - this.yob
    }else{
        field = v
      }

      }


}


fun main(args: Array<String>) {

   var  mydata = Person( 1, "Ranjan", 66)
    val mydata2 = Person(1,"Ranjan2", 70)

    println(mydata.name)
    println(mydata2.name)
    println(mydata.email)
    mydata2.age=8
    println(mydata2.age)

}