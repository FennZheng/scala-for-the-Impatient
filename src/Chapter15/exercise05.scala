/**
 * 编写一个返回包含某文件所有行的字符串的方法。从Java调用该方法。
 */
import io.Source

class Test5{

  def read()={
    Source.fromFile("test.txt").mkString
  }
}
/*** Test2.java
public class Hello {
  public static void main(String[] args){
    Test5 t = new Test5();
    System.out.println(t.read());
  }
}
  ***/
