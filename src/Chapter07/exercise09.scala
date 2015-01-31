/**
 * 编写一段程序，引入java.lang.System类，从user.name系统属性读取用户名，
 * 从Console对象读取一个密码,
 * 如果密码不是"secret"，则在标准错误流中打印一个消息；
 * 如果密码是"secret"，则在标准输出流中打印一个问候消息。
 * 不要使用任何其他引入，也不要使用任何限定词(带句点的那种)
 */
object Q9 extends App{
  import java.lang.System._
  var password = Console.readLine()

  if (password equals "secret")
    System.out.println("Hello " + getProperty("user.name"))
  else
    System.err.println("password error!")
}
