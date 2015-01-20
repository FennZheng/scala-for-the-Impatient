/**
 * Created by vernonzheng on 15/1/20.
 */
/**
 *  编写一个函数product(s:String), 计算前面习题中提到的乘积。
 */
def product(str:String):Long = {
  var result:Long = 1
  str.foreach( result *= _.toLong )
  result
}