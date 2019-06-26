package demo.example

import jdk.nashorn.internal.ir.WithNode
import java.util.ArrayList

trait Vehicle{
  
  def start= println("vehicle Started")
  def initialize
  
}

class Employee{
  
}

class Car extends Vehicle{
  
  @Override
  def initialize={
    println("Car Initialized")
  }
  
  
}
    

object Main extends App{
  

  //for loop
  
  for(i<- 1 to 5 if i%2==0) println(i)
  
  val v1= (1 to 20).toArray
  
  v1.foreach(println)
  
  val r=for(v2 <- v1
      if(v2%2 ==0) ) yield v2
  println(r.toList)
  
  val c=new Car()
  println(c.initialize)
   println(c.start)
  
  val formula1=(x:Int,y:Int) => x+y
  
   val formula2=(1 to 20).toArray
  
  println(formula2.min)
  
  def diffOfSquare(limit:Int)={
    
    val numberList = (1 to limit).toArray
    val square =(number:Int) =>  scala.math.pow(number, 2)
    val squareOfSum = square(numberList.sum)
    var y=0
    val sumOfSquare =  for(x <- numberList) yield square(x)
    println(s"$numberList")
    println(s"${(squareOfSum-sumOfSquare.sum).toInt}")
    println(s"${sumOfSquare.sum}")
    
  }
  diffOfSquare(10)
  val result = Strain.keep[Int](List(1, 2, 3), x => x % 2 != 0)
  println(result)
  Strain.isCorrectBraces("""{sdjf{,84}}""")
 
}

object Strain {
  def keep[T](list: Seq[T], function: T => Boolean): Seq[T] = for (elem <- list if function(elem)) yield elem
  


  def discard[T](list: Seq[T], function: T => Boolean): Seq[T] = for (elem <- list if !function(elem)) yield elem
  
  def isCorrectBraces( data:String):Boolean ={
    
    val word="""(\{\})+""".r
    val filteredData=word.findAllIn(data)
    println(filteredData.foreach(println))
    
    false
    
  }
  
  val isEven=(number:Int) => number % 2== 0
  
  def gotEven(data:Seq[Int]):Boolean={
    
    for(x <- data){
     if(isEven(x))   true
    }
     false
  }
  
 def getSum(data:Seq[Int]):Int={
   var result=0
   data.foreach(f => {
    if( f == 7)
     result+=14
    else
      result+=f
   })
   result
 }
  println(isEven(5))
println(isEven(4))

println(s"goteven : ${gotEven(Seq(1,3,6,7))}")
println(s"goteven : ${gotEven(Seq(2,3,5,7))}")
println(s"getSum : ${getSum(Seq(2,3,5,7))}")
println(s"getSum : ${getSum(Seq(2,3,5,6))}")


val isPalindrome=(data:String) => data == data.reverse

 println(s"isPalindrome:${isPalindrome("level")}")

val x: Option[String] = Some("hi")
val y: Option[String] = None
println(x.get)
//println(y.get)
println(y.getOrElse("default"))
var bb: Int = 10
bb = "funny"
println(bb)
  
}
