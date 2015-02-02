/**
 * 提供一个CryptoLogger类，将日志消息以凯撒密码加密。缺省情况下密匙为3，不过使用者也可以重写它。提供缺省密匙和-3作为密匙是的使用示例
 */
trait Logger{
  def log(str:String,key:Int = 3):String
}

class CryptoLogger extends Logger{

  def log(str: String, key:Int): String = {
    for ( i <- str) yield if (key >= 0) (97 + ((i - 97 + key)%26)).toChar else (97 + ((i - 97 + 26 + key)%26)).toChar
  }
}

object Test extends App{
  val plain = "vernonzheng";
  println("明文为：" + plain);
  println("加密后为：" + new CryptoLogger().log(plain));
  println("加密后为：" + new CryptoLogger().log(plain,-3));
}