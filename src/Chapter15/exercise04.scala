
/**
  * 编写一个Scala方法sum,带有可变长度的整型参数，返回所有参数之和。从Java调用该方法。
 */
import scala.annotation.varargs
class Test4 {
  @varargs def sum(nums: Int*): Int = {
    nums.sum
  }
}
/** Test2.java
class Test2 {

  public static void main(String[] args){
    Test4 t = new Test4();
    System.out.println(t.sum(1,2,3));
  }
}
  **/