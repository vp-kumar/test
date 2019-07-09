package demo.example

import sun.security.util.Length

object Codility extends App {
  
  def solution(A: Array[Int]): Int = {
    def findMissing(in: Int, l: List[Int]): Int = {
      if (l.isEmpty || l.head != in) in
      else findMissing(in + 1, l.tail)
    }
    findMissing(1, A.toList.filter(_ > 0).distinct.sorted)
  }
  
  println(solution(Array(1,3,6,4,1,2)))
  println(solution(Array(1)))
  println(solution(Array(3)))
  println(solution(Array(0)))
  println(solution(Array(-2)))
  println(solution(Array(-5, 0, -2, 1)))
  println(solution(Array(-2147483648, 21836487)))
  println(s"--------------------------")
  println(findOddElement(Array(1,3,3,4,1,2,4)))
  println(findOddElement(Array(1)))
  println(findOddElement(Array(1,3,3,1)))
  println(isLeapYear(2000))
  println(isLeapYear(2100))
  
  def findOddElement(a: Array[Int]): Int={
   
      a.groupBy(identity).
      mapValues(_.size)
      .collectFirst { case i if (i._2 % 2 == 1) => i._1 } match {
      case Some(i) => i
      case None => -1
    }
    
   
  }
  
  def isLeapYear(year:Int):Boolean ={
    
    (year % 4 == 0)
  }
  
  def isArmStrong(number:Int):Boolean={
   
   number==number.toString.map(f => scala.math.pow(f.asDigit,number.toString.length)).sum
 
  }
  
   
  def isPangram(data:String):Boolean= {
    val letters= 'a' to 'z'
    val v1=data.toLowerCase().trim().toSet.filter(f => letters.contains(f))
    println(s"v1:$v1")
    letters.toSet == v1

  }
  
   println(isArmStrong(371))
   println(isArmStrong(372))
   isPangram("welcome ball")
   
 val myList=List(1,2,3,4)
 myList.foreach(println)
 
 val powerList=(y:List[Int]) => for(x <- myList) yield x*x
  
println(s"powerList= ${powerList(myList)}")
 
 def myOpt(x:String):Option[String]=x match { case "hello" => None;  case "HELLO" => Some("Big")}
 println(myOpt("hello"))
 println(myOpt("HELLO").get)
  
}