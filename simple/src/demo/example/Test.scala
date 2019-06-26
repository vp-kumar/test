package demo.example

import java.text.Normalizer.Form
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.ListMap

object Test  extends App{
  
  val dataList  =List(1,2,3,9,100,5)
  println(s"dataList:${dataList}")
  def print = println(dataList.foreach(println(_)))
  def printfor= {
    for (a <- dataList ) println(a)
    for((e,count) <- dataList.zipWithIndex) println(s"${count} ${e}")
    val v1=dataList.filter(p => p >5)
    println(s"v1=${v1}")
    println(s"dataList=${dataList.foreach(println)}")
    dataList.foreach(println)
    println("=================")
     println(dataList.foldRight(1)(_-_))
      println(dataList.foldLeft(1)(_-_))
      //println(dataList.fold(_+_))
  }
  val divide = (x:Double,y:Double) => {
    val result=x-y
    println(s"dived $x by $y to yield $result")
    result
  }
  def filterMe(data:Any)= for(a <- dataList if a>data.asInstanceOf[Int] ) yield (a)
  printfor
  println(filterMe(5))
  val v=Array(10.00,20.00,30.00)
 v.reduceLeft(divide)
  v.reduceRight(divide)
  val log =(x:Any) => println(s"data is $x")
  log("123")
  log(345)
(1 to 10).view.foreach(println)
log("--------------------")
  (1 to 10).view.map{
    x=> x*1
    println(x)
  }
  val mylist=(5 to 50).by(5).toList
  println(mylist)

  def isArmStrong(data:Int):Boolean={
    val v1=data.toString()
   val v2= v1.map(f => scala.math.pow(f.asDigit, v1.length())).sum
    
    println(s"v1=$v1")
     println(s"v2=$v2")
  v1==v2
    }
  println(isArmStrong(153))
  
  val dataArray= List(1,2,List(5,6))
  
def flatten(before: List[Any]): List[Int] = {
        val after = ListBuffer[Int]()
        for(ele <- before) {
            ele match {
                case e: Int => after += e
                case ls: List[Any] => after ++= flatten(ls)
                case _ => {}
            }
        }
        after.toList
    }
  
  println(flatten(dataArray))
  
  def isPangram(data:String):Boolean= {
    val letters= 'a' to 'z'
    val v1=data.toLowerCase().trim().toSet.filter(f => letters.contains(f))
     letters.toSet == v1
  }
  println(isPangram(" How razorback jumping frogs can level six piqued gymnasts !?."))
  
  def oneforme(data:String ="you"):String= s"one for $data, one for me"
    
  def isLeap(year:Int):Boolean= (year % 400 ==0) ||  (year % 4 ==0 && year % 10 !=0)
  
  println(oneforme("abbas"))
  println(oneforme())
  println(isLeap(2100))
  println(isLeap(2000))
  var counter:Int=0
  
  def conjecture (data :Int):Int={
    log("hh")
    data match {      
      case 1=> counter
      case x =>{
          counter=counter+1
        if(x % 2 !=0) 
          conjecture(3*x+1) 
          else conjecture(x/2)
        
      }
    }
    
    
  }
   println(conjecture(12))
  
  //function as variable
   
   val addThenDouble: (Int,Int) => Int=(x,y) =>  (x+y)*2
   
   log(addThenDouble(5,6))
   
   def addThenDoubleFun(i1:Int,i2:Int) = () => i1+i2
   
 
   
   def letterCounter(data : String) ={
       val word= """\w('\w)?|\d+""".r//"""(\w('\w)?!\d)+""".r
     println(word.findAllIn(data.toLowerCase).toString())
     val v=word.findAllIn(data.toLowerCase).toSeq.groupBy(identity).mapValues(_.length)
     
    println( v)
    println(v.size)
   }
  
 letterCounter("The quick brown fox jumps over a lazy dog")
 
 
 val processString= (x:String) => {
   log("processString")
    val word= """(\w('\w)?|\d)+""".r
    println(word.findFirstIn(x))
    println(word.findAllIn(x).toSeq.foreach(println))
 }
 processString("""myerewr haven't think "BIG".""")
 
 def demoArray(){
   val x= ArrayBuffer("one","two","three","four")
    val y= ArrayBuffer("one","two","three","four","five","six")
   x-=("one","two")
   y --=x
   println(s"x value is $x")
   println(s"y value is $y")
 }
 
 def demoMap{
   
   val myMap= Map("4"-> "d","1" -> "a","2"->"b","3"->"c")
   for((k,v) <-myMap) println(s"key is $k : value is $v")
   myMap.foreach(x => println(s"key is ${x._1} : value is ${x._2}"))
   val v1=for((k,v) <-myMap) yield (v,k)
   println(myMap.mapValues(_.toUpperCase()))
   println(myMap.max)
   println(ListMap(myMap.toSeq.sortBy(_._1):_*))
   println(ListMap(myMap.toSeq.sortWith(_._1 > _._1):_*))
 }
 
 def isIsoGram(word:String):Boolean={
   
  val v1= word.toLowerCase().toSeq.groupBy(identity).mapValues(_.length) 
   val v2=for((k,v) <-v1) yield (v,k)
  
  log(word.toLowerCase().filter(_.isLetter))
  log(word.toLowerCase().filter(_.isLetter).distinct.length)
   log(v2)
   false
   
  
 }
 
  val myNum=27
def convert(data:Int){
    
   if( myNum % 3 ==0) println("Plong")
   val myWord="listen"
   val v1=myWord.toLowerCase().permutations.seq
   v1.foreach(println)
  }
 
 demoArray
 demoMap
 isIsoGram("hello")
 convert(myNum)
}