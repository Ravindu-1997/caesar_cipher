package ciser

object FPmap {
   def main(args:Array[String])
  {
    val originalalphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val inputmsg = scala.io.StdIn.readLine("enter your secret massage : ")
    val shiftnumber = (scala.io.StdIn.readLine("Shifted by (positive shifted number)->encrypt, \n(negative shifted number)->descrypt :\n ").toInt + originalalphabet.size)%originalalphabet.size
    
    val outputmsg = inputmsg.map((letter: Char)=>
    {
      val x = originalalphabet.indexOf(letter.toUpper)
      
      if(x == -1)
      {
        letter
      }
      else
      {
        originalalphabet((x + shiftnumber) % originalalphabet.size)
      }
    });
    
    println(outputmsg)
  }
}
