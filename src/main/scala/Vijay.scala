import scala.io.StdIn._
object Vijay {

  def main (args:Array[String]):Unit = {

    var num = readInt
    var number = num

    while(number!=1 && number!=4)
      {
        number = isHappy(number)
      }
      if (number==1)
        {
          println(number +" is Happy Number")
        }
      else
        {
          println(number+" is not Happy Number")
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
