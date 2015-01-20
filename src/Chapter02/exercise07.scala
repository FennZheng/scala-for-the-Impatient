/**
 * Created by vernonzheng on 15/1/20.
 */
/**
 *  同样是解决前一个练习的问题，但这次不使用循环。（提示：在Scaladoc中查看StringOps）
 */
def test(str:String):Long = {
  var result:Long = 1
  str.foreach( ch => {result *= (ch.toLong)})
  result
}