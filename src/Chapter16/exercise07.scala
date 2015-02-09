/**
 * 编写一个函数，带一个类型为Map[String,String]的参数，返回一个dl元素，其中针对映射中每个键对应有一个dt，每个值对应有一个dd，例如：
    Map("A"->"1","B"->"2")
  应产出<dl><dt>A</dt><dd>1</dd><dt>B</dt><dd>2</dd></dl>
 */
def mapToHTML(map: Map[String, String]) = {
  <dl>{for ((k,v) <- map) yield <dt>{k}</dt><dd>{v}</dd>}</dl>
}

val x = Map("A" -> "1", "B" -> "2")

println(mapToHTML(x))