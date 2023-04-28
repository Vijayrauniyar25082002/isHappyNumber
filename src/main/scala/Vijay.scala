import scala.io.StdIn._
object Vijay {

  def main (args:Array[String]):Unit = {

    var num = readInt
    var vijay = num

    while(vijay!=1 && vijay!=4)
      {
        vijay = isHappy(vijay)
      }
      if (vijay==1)
        {
          println(vijay +" is Happy Number")
        }
      else
        {
          println(vijay + " is not Happy Number")
          println("Hello File")
        }
  }

  def isHappy(n: Int):Int = {
    var numb = n
    var res = 0

    while (numb>0)
      {
        var rem = numb%10
            res = res+(rem*rem)
            numb = numb/10
      }
      res
  }

}
