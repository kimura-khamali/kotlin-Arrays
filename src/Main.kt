//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*fun main() {
   var animals = arrayOf("dog", "cat", "parrot", "hen", "cow")//size 5 fixed add sth else create another array
   println(animals[2])
   println(animals[4])
}*//*
  fun main() {
   var panini = arrayOf("Mary", 22, 5.2, "Mombasa", false)
   println(panini.contentToString())//[Mary, 22, 5.2, Mombasa, false]
   println(panini)//[Ljava.lang.String;@2ff4acd0
   println(panini[0])
   println(panini[1])
   println(panini[2])
   println(panini[3])
   println(panini[4])//Not these
}*/
   /*fun main() {
var animals= arrayOf("dog","cat", "parrot", "hen","cow")//size 5 fixed add sth else create another array
   println(animals[2])
   println(animals.get(3))//get can be used instead of  a []
   println(animals)//[Ljava.lang.String;@2ff4acd0  a string representation
   println(animals.set(2, "goat"))//or//replace
   animals[2] = "goat"//another set replace
   println(animals.contentToString())//it takes two parameter Int  &  string
//contentToString- reads through array and converts them into one string
}*/

/*fun main() {
   var x: Int? = 5//possible of holding both Int and null, so it is null-able
   x = null
}*/
/*fun main() {
   var animals: Array<String?> = arrayOf("dog", "cat", "parrot", "hen", "cow")//size 5 fixed add sth else create another array
   println(animals[2])
   println(animals.get(3))
   animals[2] = "goat"
   animals[4] = "sheep"
   animals[1] = null
   animals[4] = null
   println(animals.contentToString())
}*/
/*
fun main() {

   var animals1 = arrayOf("rat", "monkey", "donkey")
   animals1.plus("horse")
   animals1.plus(arrayOf("rat", "monkey", "donkey"))
   println(animals1.contentToString())//don't change the previous array
   var animals = arrayOf("dog", "cat", "parrot", "hen", "cow")
   print(animals.indexOf("hen"))
   animals.slice(1..3)//
   animals.sortedArray()//original copy
   animals = animals.sortedArray()//sorts alphabetically
   println(animals.contentToString())
   animals = animals.sortedArrayDescending()//in descending order
   println(animals.contentToString())
    val sortedanimals = animals.sortedArray()//sorts alphabetically
   println(sortedanimals.contentToString())
}
*/
/*

fun main() {
   var statistics = arrayOf(23, 567, 43, 213, 56, 6, 7788, 4, 332)
   println(statistics.count())//tells how many element fun things done
   println(statistics.size)//property related
   println(statistics.sum())//sum of all
   println(statistics.minOrNull())//
   println(statistics.maxOrNull())
   println(statistics.sum() / statistics.size)//not that correct
   println(statistics.sum() / statistics.size.toDouble())
   println(statistics.average())
   statistics = statistics.sortedArray()
   println(statistics.contentToString())
}
*/
/*
fun main() {
   var animals1 = arrayOf("rat", "monkey", "donkey")
   animals1 =animals1.plus("horse")
  animals1.plus(arrayOf("rat", "monkey", "donkey"))
   println(animals1.contentToString())
}*/


/*fun main(){
   var animals= arrayOf("dog","cat", "parrot", "hen","cow")
   animals.forEach { animal -> //block var  step-wise new line each
      println(animal)
   }
   for(x in animals) {
      println(x)
   }

   var statistics = arrayOf(23,567,43,213,56,6,7788,4,332)
   statistics.forEach { data ->
      println(data * data)
   }
   for(data in statistics) {
      println(data * data)
   }
}*/