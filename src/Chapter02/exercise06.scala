/**
 * Created by vernonzheng on 15/1/20.
 */
/**
 * 编写一个for循环,计算字符串中所有字母的Unicode代码的乘积。举例来说，"Hello"中所有字符串的乘积为9415087488L
 */
def test(str:String):Long = {
  var result:Long = 1
  for(i <- str) result *= i
  result
}