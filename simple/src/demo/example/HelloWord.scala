package demo.example



object HelloWord {
  
  def main (arguments: Array[String]) ={
    
    println("hello")
    redFromURL("https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data")
  }
  
  def redFromURL(url :String)={
    val content=scala.io.Source.fromURL(url).mkString("")
    parse(content)
  }
  
 case class DataSchema(c1:Double,c2:Double,c3:Double,c4:Double)
  
  def parse(data: String) ={
    val dataArray=data.split("\n").map(_.split(",")).map(x => DataSchema(x(0).toDouble,x(1).toDouble,x(2).toDouble,x(3).toDouble))
    out(dataArray.map(_.c1))
    out(dataArray.map(_.c2))
    out(dataArray.map(_.c3))
    out(dataArray.map(_.c4))
   
  }
   def out(data:Array[Double]) = println(s"""      
     Sum: ${f"%%.1f".format(data.sum)}
     Min: ${data.min}
     Max: ${data.max}
     Ave: ${f"%%.1f".format(data.sum/data.length)}""")
}